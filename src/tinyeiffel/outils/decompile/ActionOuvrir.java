package tinyeiffel.outils.decompile;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;

import javax.swing.AbstractAction;
import javax.swing.JFileChooser;

import org.apache.bcel.Repository;
import org.apache.bcel.classfile.ClassFormatException;
import org.apache.bcel.classfile.ClassParser;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.util.BCELifier;

import tinyeiffel.genere_java.JasminVisitor;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

public class ActionOuvrir extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 287287401414090197L;
	private Decompile d;
	private JFileChooser chooser; 

	public ActionOuvrir(Decompile d)
	{
		super("Ouvrir");
		this.d=d;
		chooser=new JFileChooser();
		File f;
		f=new File("e:/projet/eiffel/resultat");
		if(f.exists())
		{
			chooser.setCurrentDirectory(f);
		}
	}
	
	public void actionPerformed(ActionEvent arg0) {
		String jasmin;
		String bcel;
		File f=null;
		int res;
		res=chooser.showOpenDialog(d);
		if(res==JFileChooser.APPROVE_OPTION)
		{
			f=chooser.getSelectedFile();
		}
		if(f!=null&&f.exists())
		{
			jasmin=construit_jasmin(f);
			bcel=construit_bcel(f);
			if(jasmin!=null)
			{
				d.setTexteJasmin(jasmin);
			}
			if(bcel!=null)
			{
				d.setTexteBcel(bcel);
			}
		}
	}

	private String construit_bcel(File f) {
		String res=null;
		JavaClass java_class;
	    String name ;

	    if(f!=null&&f.exists())
	    {
	    	ByteOutputStream out;
	    	try {
	    		name=f.getAbsolutePath();
	    		if((java_class = Repository.lookupClass(name)) == null)
					java_class = new ClassParser(name).parse();
	    		out=new ByteOutputStream();
			    BCELifier bcelifier = new BCELifier(java_class, out);
			    bcelifier.start();
			    res=out.toString();
	    	} catch (ClassFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	    }
		return res;
	}

	private String construit_jasmin(File f2) {
		ClassParser parser = null;
		JavaClass java_class;
		//ClassPath class_path = new ClassPath();
		String res=null;

		try {
			if (f2==null||!f2.exists()) {
				System.err.println("disassemble: No input files specified");
			} else {
				//for (int i = 0; i < argv.length; i++) {
					/*if (argv[i].endsWith(".class"))
						parser = new ClassParser(argv[i]); // Create parser
															// object
					else {
						InputStream is = class_path.getInputStream(argv[i]);
						String name = argv[i].replace('.', '/') + ".class";

						parser = new ClassParser(is, name);
					}*/
					parser=new ClassParser(f2.getAbsolutePath());

					java_class = parser.parse();

					String class_name = java_class.getClassName();
					int index = class_name.lastIndexOf('.');
					String path = class_name.substring(0, index + 1).replace(
							'.', File.separatorChar);
					class_name = class_name.substring(index + 1);

					if (!path.equals("")) {
						File f = new File(path);
						f.mkdirs();
					}

					//FileOutputStream out = new FileOutputStream(path
					//		+ class_name + ".j");
					ByteOutputStream out;
					out=new ByteOutputStream();
					new JasminVisitor(java_class, out).disassemble();
					//System.out.println("Génération du fichier "+path
					//		+ class_name + ".j réussi");
					res=out.toString();
				//}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}
	
	

}
