/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ */package tinyeiffel.eiffelviewer;

import org.eclipse.swt.*;
import org.eclipse.swt.custom.*;
//import org.eclipse.swt.events.*;
//import org.eclipse.swt.graphics.*;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.widgets.*;
//import java.util.*;
import java.io.*;
import java.text.*;

public class Fichier
{static class __CLOVER_84_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}
	public Fichier(String nom,String textString,TabFolder tab2,String path)
	{__CLOVER_84_0.cloverRec.M[776]++;
		__CLOVER_84_0.cloverRec.S[14169]++;tab=new TabItem(tab2,0);
		__CLOVER_84_0.cloverRec.S[14170]++;final StyledText text1=create_text(tab2/*shell/*t[0]*/);
		__CLOVER_84_0.cloverRec.S[14171]++;tab.setControl(text1);
		__CLOVER_84_0.cloverRec.S[14172]++;text=text1;
		__CLOVER_84_0.cloverRec.S[14173]++;if((((nom==null) && (++__CLOVER_84_0.cloverRec.CT[3138]!=0|true)) || (++__CLOVER_84_0.cloverRec.CF[3138]==0&false)))
		{{
			__CLOVER_84_0.cloverRec.S[14174]++;est_fichier=false;
			__CLOVER_84_0.cloverRec.S[14175]++;this.nom="Sans titre";
		}
		}else
		{{
			__CLOVER_84_0.cloverRec.S[14176]++;this.nom=nom;
			__CLOVER_84_0.cloverRec.S[14177]++;est_fichier=true;
			__CLOVER_84_0.cloverRec.S[14178]++;open(path,nom);
		}
		}__CLOVER_84_0.cloverRec.S[14179]++;tab.setText(this.nom);
		//final String txt=textString;
		
		/*if(txt!=null)
		{
			// Guard against superfluous mouse move events -- defer action until later
			Display display = text1.getDisplay();
			display.asyncExec(new Runnable() {
				public void run() {
					text1.setText(txt);
				}
			});
			
			// parse the block comments up front since block comments can go across
			// lines - inefficient way of doing this
			//lineStyler.parseBlockComments(textString);
		}*/
	}

	private StyledText create_text(Composite/*Shell*/ win)
	{__CLOVER_84_0.cloverRec.M[777]++;
		__CLOVER_84_0.cloverRec.S[14180]++;StyledText t = new StyledText (win, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL | SWT.H_SCROLL);
		__CLOVER_84_0.cloverRec.S[14181]++;GridData spec = new GridData();
		__CLOVER_84_0.cloverRec.S[14182]++;spec.horizontalAlignment = GridData.FILL;
		__CLOVER_84_0.cloverRec.S[14183]++;spec.grabExcessHorizontalSpace = true;
		__CLOVER_84_0.cloverRec.S[14184]++;spec.verticalAlignment = GridData.FILL;
		__CLOVER_84_0.cloverRec.S[14185]++;spec.grabExcessVerticalSpace = true;
		__CLOVER_84_0.cloverRec.S[14186]++;t.setLayoutData(spec);
		__CLOVER_84_0.cloverRec.S[14187]++;lineStyler=new JavaLineStyler();
		__CLOVER_84_0.cloverRec.S[14188]++;t.addLineStyleListener(lineStyler);
		//lineStyler_fichier.add(l);
		//text_fichier.add(t);
		__CLOVER_84_0.cloverRec.S[14189]++;return t;
	}

	public void disposeRessource()
	{__CLOVER_84_0.cloverRec.M[778]++;
		__CLOVER_84_0.cloverRec.S[14190]++;lineStyler.disposeColors();
		__CLOVER_84_0.cloverRec.S[14191]++;text.removeLineStyleListener(lineStyler);
	}

	public void open(String path,String name)
	{__CLOVER_84_0.cloverRec.M[779]++;
		__CLOVER_84_0.cloverRec.S[14192]++;final String textString;
		__CLOVER_84_0.cloverRec.S[14193]++;File file = new File(/*fileDialog.getFilterPath()*/path, name);
		__CLOVER_84_0.cloverRec.S[14194]++;if ((((!file.exists()) && (++__CLOVER_84_0.cloverRec.CT[3139]!=0|true)) || (++__CLOVER_84_0.cloverRec.CF[3139]==0&false))) {{
			__CLOVER_84_0.cloverRec.S[14195]++;String message = MessageFormat.format("Err_file_no_exist", new String[] {file.getName()});
			//displayError(message);
			__CLOVER_84_0.cloverRec.S[14196]++;System.out.println("Erreur:"+message);
			__CLOVER_84_0.cloverRec.S[14197]++;return;
		}

		}__CLOVER_84_0.cloverRec.S[14198]++;try {
			__CLOVER_84_0.cloverRec.S[14199]++;FileInputStream stream= new FileInputStream(file.getPath());
			__CLOVER_84_0.cloverRec.S[14200]++;try {
				__CLOVER_84_0.cloverRec.S[14201]++;Reader in = new BufferedReader(new InputStreamReader(stream));
				__CLOVER_84_0.cloverRec.S[14202]++;char[] readBuffer= new char[2048];
				__CLOVER_84_0.cloverRec.S[14203]++;StringBuffer buffer= new StringBuffer((int) file.length());
				__CLOVER_84_0.cloverRec.S[14204]++;int n;
				__CLOVER_84_0.cloverRec.S[14205]++;while (((((n = in.read(readBuffer)) > 0)))) {{
					__CLOVER_84_0.cloverRec.S[14206]++;buffer.append(readBuffer, 0, n);
				}
				}__CLOVER_84_0.cloverRec.S[14207]++;textString = buffer.toString();
				__CLOVER_84_0.cloverRec.S[14208]++;stream.close();
			}
			catch (IOException e) {
				// Err_file_io
				__CLOVER_84_0.cloverRec.S[14209]++;String message = MessageFormat.format("Err_file_io", new String[] {file.getName()});
				//displayError(message);
				__CLOVER_84_0.cloverRec.S[14210]++;System.out.println("Erreur:"+message);
				__CLOVER_84_0.cloverRec.S[14211]++;return;
			}
		}
		catch (FileNotFoundException e) {
			__CLOVER_84_0.cloverRec.S[14212]++;String message = MessageFormat.format("Err_not_found", new String[] {file.getName()});
			//displayError(message);
			__CLOVER_84_0.cloverRec.S[14213]++;System.out.println("Erreur:"+message);
			__CLOVER_84_0.cloverRec.S[14214]++;return;
		}
		//if(txt!=null)
		{
			// Guard against superfluous mouse move events -- defer action until later
			__CLOVER_84_0.cloverRec.S[14215]++;Display display = text.getDisplay();
			__CLOVER_84_0.cloverRec.S[14216]++;display.asyncExec(new Runnable() {
				public void run() {__CLOVER_84_0.cloverRec.M[780]++;
					__CLOVER_84_0.cloverRec.S[14217]++;text.setText(textString);
				}
			});
			
			// parse the block comments up front since block comments can go across
			// lines - inefficient way of doing this
			//lineStyler.parseBlockComments(textString);
		}
	}

	public String nom;
	public TabItem tab;
	public StyledText text;
	public JavaLineStyler lineStyler;
	public boolean est_fichier;
}