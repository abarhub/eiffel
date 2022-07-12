/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ */package tinyeiffel.eiffelviewer;

import org.eclipse.swt.*;
//import org.eclipse.swt.custom.*;
import org.eclipse.swt.events.*;
//import org.eclipse.swt.graphics.*;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.widgets.*;
//import java.util.*;
//import java.io.*;
//import java.text.*;

public class ListeFichier implements MouseListener
{static class __CLOVER_86_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}
	public ListeFichier(Shell shell)
	{__CLOVER_86_0.cloverRec.M[796]++;
		//TabFolder
	__CLOVER_86_0.cloverRec.S[14402]++;win_file=new Shell(shell,/*SWT.SHELL_TRIM*/
			SWT.TITLE|SWT.BORDER|SWT.RESIZE|SWT.ON_TOP);
	__CLOVER_86_0.cloverRec.S[14403]++;win_file.setText("fichiers");
	__CLOVER_86_0.cloverRec.S[14404]++;GridLayout layout = new GridLayout();
	__CLOVER_86_0.cloverRec.S[14405]++;layout.numColumns = 1;
	__CLOVER_86_0.cloverRec.S[14406]++;win_file.setLayout(layout);	
	__CLOVER_86_0.cloverRec.S[14407]++;win_file.setSize(100, 100);
	/*tab=new TabFolder(win_file,0);
	TabItem[] t= new TabItem[2];
	t[0]=new TabItem(tab,0);
	t[0].setText("test 1");
	t[1]=new TabItem(tab,0);
	t[1].setText("test 2");*/
	
	__CLOVER_86_0.cloverRec.S[14408]++;tab=new TabFolder(win_file,SWT.BORDER | SWT.MULTI | SWT.V_SCROLL | SWT.H_SCROLL);
	__CLOVER_86_0.cloverRec.S[14409]++;GridData spec = new GridData();
	__CLOVER_86_0.cloverRec.S[14410]++;spec.horizontalAlignment = GridData.FILL;
	__CLOVER_86_0.cloverRec.S[14411]++;spec.grabExcessHorizontalSpace = true;
	__CLOVER_86_0.cloverRec.S[14412]++;spec.verticalAlignment = GridData.FILL;
	__CLOVER_86_0.cloverRec.S[14413]++;spec.grabExcessVerticalSpace = true;
	__CLOVER_86_0.cloverRec.S[14414]++;tab.setLayoutData(spec);

	__CLOVER_86_0.cloverRec.S[14415]++;TabItem t=new TabItem(tab,0);
	__CLOVER_86_0.cloverRec.S[14416]++;t.setText("sans titre");
	__CLOVER_86_0.cloverRec.S[14417]++;liste=new org.eclipse.swt.widgets.List(tab,SWT.SINGLE);
	__CLOVER_86_0.cloverRec.S[14418]++;t.setControl(liste);
	//liste.add("a");
	//liste.add("b");
	//tab.setTabList(t);
	__CLOVER_86_0.cloverRec.S[14419]++;spec = new GridData();
	__CLOVER_86_0.cloverRec.S[14420]++;spec.horizontalAlignment = GridData.FILL;
	__CLOVER_86_0.cloverRec.S[14421]++;spec.grabExcessHorizontalSpace = true;
	__CLOVER_86_0.cloverRec.S[14422]++;spec.verticalAlignment = GridData.FILL;
	__CLOVER_86_0.cloverRec.S[14423]++;spec.grabExcessVerticalSpace = true;
	__CLOVER_86_0.cloverRec.S[14424]++;liste.setLayoutData(spec);
	__CLOVER_86_0.cloverRec.S[14425]++;liste.addMouseListener(this);
	__CLOVER_86_0.cloverRec.S[14426]++;win_file.open ();
		/*tab=new TabItem(tab2,0);
		final StyledText text1=create_text(tab2/*shell/*t[0]*//*);
		tab.setControl(text1);
		text=text1;
		if(nom==null)
			this.nom="Sans titre";
		else
			this.nom=nom;
		tab.setText(this.nom);
		final String txt=textString;
		
		if(txt!=null)
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

	public void ajoute_fichier(String nom)
	{__CLOVER_86_0.cloverRec.M[797]++;
		__CLOVER_86_0.cloverRec.S[14427]++;liste.add(nom);
	}

	public void disposeRessource()
	{__CLOVER_86_0.cloverRec.M[798]++;
		/*lineStyler.disposeColors();
		text.removeLineStyleListener(lineStyler);*/
	}

	public void mouseDoubleClick(MouseEvent e)
	{__CLOVER_86_0.cloverRec.M[799]++;
		__CLOVER_86_0.cloverRec.S[14428]++;if((((e==null) && (++__CLOVER_86_0.cloverRec.CT[3173]!=0|true)) || (++__CLOVER_86_0.cloverRec.CF[3173]==0&false)))
			{__CLOVER_86_0.cloverRec.S[14429]++;return;
		}__CLOVER_86_0.cloverRec.S[14430]++;if((((e.getSource()==liste) && (++__CLOVER_86_0.cloverRec.CT[3174]!=0|true)) || (++__CLOVER_86_0.cloverRec.CF[3174]==0&false)))
		{{
			__CLOVER_86_0.cloverRec.S[14431]++;int i=liste.getSelectionIndex();
			__CLOVER_86_0.cloverRec.S[14432]++;if((((i==-1) && (++__CLOVER_86_0.cloverRec.CT[3175]!=0|true)) || (++__CLOVER_86_0.cloverRec.CF[3175]==0&false)))
				{__CLOVER_86_0.cloverRec.S[14433]++;return;
			}__CLOVER_86_0.cloverRec.S[14434]++;String s=liste.getItem(i);
			__CLOVER_86_0.cloverRec.S[14435]++;System.out.println("double click:"+s);
			__CLOVER_86_0.cloverRec.S[14436]++;EiffelViewer.principal.tab2.setSelection(i);
		}
	}}

	public void mouseDown(MouseEvent e)
	{__CLOVER_86_0.cloverRec.M[800]++;

	}

	public void mouseUp(MouseEvent e)
	{__CLOVER_86_0.cloverRec.M[801]++;

	}

	public void show(boolean aff)
	{__CLOVER_86_0.cloverRec.M[802]++;
		__CLOVER_86_0.cloverRec.S[14437]++;if((((aff!=win_file.getVisible()) && (++__CLOVER_86_0.cloverRec.CT[3176]!=0|true)) || (++__CLOVER_86_0.cloverRec.CF[3176]==0&false)))
		{{
			__CLOVER_86_0.cloverRec.S[14438]++;win_file.setVisible(aff);
		}
	}}

	public void ferme_fichier(int i)
	{__CLOVER_86_0.cloverRec.M[803]++;
		assert((((i>=0)) && (++__CLOVER_86_0.cloverRec.CT[3177]!=0|true)) || (++__CLOVER_86_0.cloverRec.CF[3177]==0&false));
		assert((((i<liste.getItemCount())) && (++__CLOVER_86_0.cloverRec.CT[3178]!=0|true)) || (++__CLOVER_86_0.cloverRec.CF[3178]==0&false)):"i="+i;
		//assert(i<tab.getItems().length):"i="+i+";len="+tab.getItems().length;
		__CLOVER_86_0.cloverRec.S[14439]++;liste.remove(i);
		//TabItem ti=tab.getItem(i);
		//ti.dispose();
	}

	/*public String nom;
	public TabItem tab;
	public StyledText text;
	public JavaLineStyler lineStyler;*/
	org.eclipse.swt.widgets.List liste;
	Shell win_file;
	TabFolder tab;
}