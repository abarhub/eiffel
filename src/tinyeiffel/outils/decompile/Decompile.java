package tinyeiffel.outils.decompile;


import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class Decompile extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1575666772917537427L;
	
	private JTabbedPane tab;
	private JTextArea texte1,texte2;
	private JMenuBar menuBar;
	
	public Decompile()
	{
		JMenu fichier;
		JMenuItem ouvrir;
		setTitle("Decompile");
		setSize(300,300);
		
		menuBar=new JMenuBar();
		fichier=new JMenu("Fichier");
		ouvrir=new JMenuItem(new ActionOuvrir(this));
		fichier.add(ouvrir);
		fichier.addSeparator();
		fichier.add(new ActionQuitter());
		menuBar.add(fichier);
		
		setJMenuBar(menuBar);
		
		tab=new JTabbedPane();
		texte1=new JTextArea(8,40);
		tab.add("Jasmin", new JScrollPane(texte1));
		texte2=new JTextArea(8,40);
		tab.add("BCEL", new JScrollPane(texte2));
		add(tab);
	}
	
	public void setTexteJasmin(String texte)
	{
		texte1.setText(texte);
	}
	
	public void setTexteBcel(String texte)
	{
		texte2.setText(texte);
	}

	public static void main(String arg[])
	{
		Decompile frame=new Decompile();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
