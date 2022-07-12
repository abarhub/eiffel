/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ */package tinyeiffel.eiffelviewer;
//package org.eclipse.swt.examples.javaviewer;


import org.eclipse.swt.*;
//import org.eclipse.swt.custom.*;
import org.eclipse.swt.events.*;
//import org.eclipse.swt.graphics.*;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.widgets.*;
import java.util.*;
//import java.io.*;
//import java.text.*;

/**
 */
public class EiffelViewer {static class __CLOVER_83_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}  
	Shell shell/*,win_file*/;
	//StyledText text;
	//JavaLineStyler lineStyler = new JavaLineStyler();
	FileDialog fileDialog;
	//static ResourceBundle resources = ResourceBundle.getBundle("examples_javaviewer");
	public TabFolder /*tab,*/tab2;
	Vector /*nom_fichier=new Vector(),tab_fichier=new Vector(),
		text_fichier=new Vector(),lineStyler_fichier=new Vector(),*/
		fichier=new Vector();
	//org.eclipse.swt.widgets.List liste;
	ListeFichier liste_fichier;

Menu createFileMenu() {__CLOVER_83_0.cloverRec.M[750]++;
	__CLOVER_83_0.cloverRec.S[14016]++;Menu bar = shell.getMenuBar ();
	__CLOVER_83_0.cloverRec.S[14017]++;Menu menu = new Menu (bar);
	__CLOVER_83_0.cloverRec.S[14018]++;MenuItem item;

	// New 
	__CLOVER_83_0.cloverRec.S[14019]++;item = new MenuItem (menu, SWT.CASCADE);
	__CLOVER_83_0.cloverRec.S[14020]++;item.setText ("New");
	__CLOVER_83_0.cloverRec.S[14021]++;item.setAccelerator(SWT.MOD1 + 'N');
	__CLOVER_83_0.cloverRec.S[14022]++;item.addSelectionListener(new SelectionAdapter() {
		public void widgetSelected(SelectionEvent event) {__CLOVER_83_0.cloverRec.M[751]++;
			__CLOVER_83_0.cloverRec.S[14023]++;add_fichier("");
		}
	});

	// Open 
	__CLOVER_83_0.cloverRec.S[14024]++;item = new MenuItem (menu, SWT.CASCADE);
	__CLOVER_83_0.cloverRec.S[14025]++;item.setText ("Open");
	__CLOVER_83_0.cloverRec.S[14026]++;item.setAccelerator(SWT.MOD1 + 'O');
	__CLOVER_83_0.cloverRec.S[14027]++;item.addSelectionListener(new SelectionAdapter() {
		public void widgetSelected(SelectionEvent event) {__CLOVER_83_0.cloverRec.M[752]++;
			__CLOVER_83_0.cloverRec.S[14028]++;openFile();
		}
	});

	__CLOVER_83_0.cloverRec.S[14029]++;item=new MenuItem (menu, SWT.PUSH);
	__CLOVER_83_0.cloverRec.S[14030]++;item.setText ("Save");
	__CLOVER_83_0.cloverRec.S[14031]++;item.addSelectionListener (new SelectionAdapter () {
		public void widgetSelected (SelectionEvent e) {__CLOVER_83_0.cloverRec.M[753]++;
			__CLOVER_83_0.cloverRec.S[14032]++;menuSave();
		}
	});

	// Exit
	__CLOVER_83_0.cloverRec.S[14033]++;item = new MenuItem (menu, SWT.PUSH);
	__CLOVER_83_0.cloverRec.S[14034]++;item.setText ("Exit");
	__CLOVER_83_0.cloverRec.S[14035]++;item.addSelectionListener (new SelectionAdapter () {
		public void widgetSelected (SelectionEvent e) {__CLOVER_83_0.cloverRec.M[754]++;
			__CLOVER_83_0.cloverRec.S[14036]++;menuFileExit ();
		}
	});
	__CLOVER_83_0.cloverRec.S[14037]++;return menu;
}

Menu createEditMenu() {__CLOVER_83_0.cloverRec.M[755]++;
	__CLOVER_83_0.cloverRec.S[14038]++;Menu bar = shell.getMenuBar ();
	__CLOVER_83_0.cloverRec.S[14039]++;Menu menu = new Menu (bar);
	__CLOVER_83_0.cloverRec.S[14040]++;MenuItem item;

	// New 
	__CLOVER_83_0.cloverRec.S[14041]++;item = new MenuItem (menu, SWT.CASCADE);
	__CLOVER_83_0.cloverRec.S[14042]++;item.setText ("Copie");
	__CLOVER_83_0.cloverRec.S[14043]++;item.setAccelerator(SWT.MOD1 + 'C');
	/*item.addSelectionListener(new SelectionAdapter() {
		public void widgetSelected(SelectionEvent event) {
			add_fichier("");
		}
	});*/

	// Open 
	__CLOVER_83_0.cloverRec.S[14044]++;item = new MenuItem (menu, SWT.CASCADE);
	__CLOVER_83_0.cloverRec.S[14045]++;item.setText ("Coupe");
	__CLOVER_83_0.cloverRec.S[14046]++;item.setAccelerator(SWT.MOD1 + 'O');
	/*item.addSelectionListener(new SelectionAdapter() {
		public void widgetSelected(SelectionEvent event) {
			openFile();
		}
	});*/

	__CLOVER_83_0.cloverRec.S[14047]++;item=new MenuItem (menu, SWT.PUSH);
	__CLOVER_83_0.cloverRec.S[14048]++;item.setText ("Colle");
	/*item.addSelectionListener (new SelectionAdapter () {
		public void widgetSelected (SelectionEvent e) {
			menuSave();
		}
	});*/

	// Exit
	/*item = new MenuItem (menu, SWT.PUSH);
	item.setText ("Exit");
	item.addSelectionListener (new SelectionAdapter () {
		public void widgetSelected (SelectionEvent e) {
			menuFileExit ();
		}
	});*/
	__CLOVER_83_0.cloverRec.S[14049]++;return menu;
}

Menu createProjetMenu() {__CLOVER_83_0.cloverRec.M[756]++;
	__CLOVER_83_0.cloverRec.S[14050]++;Menu bar = shell.getMenuBar ();
	__CLOVER_83_0.cloverRec.S[14051]++;Menu menu = new Menu (bar);
	__CLOVER_83_0.cloverRec.S[14052]++;MenuItem item;

	// New 
	__CLOVER_83_0.cloverRec.S[14053]++;item = new MenuItem (menu, SWT.CASCADE);
	__CLOVER_83_0.cloverRec.S[14054]++;item.setText ("Nouveau");
	__CLOVER_83_0.cloverRec.S[14055]++;item.setAccelerator(SWT.MOD1 + 'N');
	/*item.addSelectionListener(new SelectionAdapter() {
		public void widgetSelected(SelectionEvent event) {
			add_fichier("");
		}
	});*/

	// Open 
	__CLOVER_83_0.cloverRec.S[14056]++;item = new MenuItem (menu, SWT.CASCADE);
	__CLOVER_83_0.cloverRec.S[14057]++;item.setText ("Configure");
	__CLOVER_83_0.cloverRec.S[14058]++;item.setAccelerator(SWT.MOD1 + 'O');
	/*item.addSelectionListener(new SelectionAdapter() {
		public void widgetSelected(SelectionEvent event) {
			openFile();
		}
	});*/

/*	item=new MenuItem (menu, SWT.PUSH);
	item.setText ("Save");
	item.addSelectionListener (new SelectionAdapter () {
		public void widgetSelected (SelectionEvent e) {
			menuSave();
		}
	});

	// Exit
	item = new MenuItem (menu, SWT.PUSH);
	item.setText ("Exit");
	item.addSelectionListener (new SelectionAdapter () {
		public void widgetSelected (SelectionEvent e) {
			menuFileExit ();
		}
	});*/
	__CLOVER_83_0.cloverRec.S[14059]++;return menu;
}

static MenuItem fenetre_liste_fichier;

Menu createWindowMenu() {__CLOVER_83_0.cloverRec.M[757]++;
	__CLOVER_83_0.cloverRec.S[14060]++;Menu bar = shell.getMenuBar ();
	__CLOVER_83_0.cloverRec.S[14061]++;Menu menu = new Menu (bar);
	__CLOVER_83_0.cloverRec.S[14062]++;MenuItem item;

	// New 
	__CLOVER_83_0.cloverRec.S[14063]++;item = new MenuItem (menu, SWT.CASCADE);
	__CLOVER_83_0.cloverRec.S[14064]++;item.setText ("Fermer");
	__CLOVER_83_0.cloverRec.S[14065]++;item.setAccelerator(SWT.MOD1 + 'N');
	__CLOVER_83_0.cloverRec.S[14066]++;item.addSelectionListener(new SelectionAdapter() {
		public void widgetSelected(SelectionEvent event) {__CLOVER_83_0.cloverRec.M[758]++;
			__CLOVER_83_0.cloverRec.S[14067]++;fermer_fichier();
		}
	});

	// Open 
	__CLOVER_83_0.cloverRec.S[14068]++;item = new MenuItem (menu, SWT.CHECK);
	__CLOVER_83_0.cloverRec.S[14069]++;fenetre_liste_fichier=item;
	__CLOVER_83_0.cloverRec.S[14070]++;item.setText ("Liste fichiers");
	__CLOVER_83_0.cloverRec.S[14071]++;item.setAccelerator(SWT.MOD1 + 'L');
	__CLOVER_83_0.cloverRec.S[14072]++;fenetre_liste_fichier.setSelection(true);
	__CLOVER_83_0.cloverRec.S[14073]++;item.addSelectionListener(new SelectionAdapter() {
		public void widgetSelected(SelectionEvent event) {__CLOVER_83_0.cloverRec.M[759]++;
			__CLOVER_83_0.cloverRec.S[14074]++;if((((fenetre_liste_fichier.getSelection()) && (++__CLOVER_83_0.cloverRec.CT[3124]!=0|true)) || (++__CLOVER_83_0.cloverRec.CF[3124]==0&false)))
			{{
				//System.out.println("1");
				__CLOVER_83_0.cloverRec.S[14075]++;liste_fichier.show(true);
			}
			}else
			{{
				//System.out.println("0");
				__CLOVER_83_0.cloverRec.S[14076]++;liste_fichier.show(false);
			}
		}}
	});

/*	item=new MenuItem (menu, SWT.PUSH);
	item.setText ("Save");
	item.addSelectionListener (new SelectionAdapter () {
		public void widgetSelected (SelectionEvent e) {
			menuSave();
		}
	});

	// Exit
	item = new MenuItem (menu, SWT.PUSH);
	item.setText ("Exit");
	item.addSelectionListener (new SelectionAdapter () {
		public void widgetSelected (SelectionEvent e) {
			menuFileExit ();
		}
	});*/
	__CLOVER_83_0.cloverRec.S[14077]++;return menu;
}

void createMenuBar () {__CLOVER_83_0.cloverRec.M[760]++;
	__CLOVER_83_0.cloverRec.S[14078]++;Menu bar = new Menu (shell, SWT.BAR);
	__CLOVER_83_0.cloverRec.S[14079]++;shell.setMenuBar (bar);

	__CLOVER_83_0.cloverRec.S[14080]++;MenuItem fileItem = new MenuItem (bar, SWT.CASCADE);
	__CLOVER_83_0.cloverRec.S[14081]++;fileItem.setText ("File");
	__CLOVER_83_0.cloverRec.S[14082]++;fileItem.setMenu (createFileMenu ());

	__CLOVER_83_0.cloverRec.S[14083]++;fileItem = new MenuItem (bar, SWT.CASCADE);
	__CLOVER_83_0.cloverRec.S[14084]++;fileItem.setText ("Edit");
	__CLOVER_83_0.cloverRec.S[14085]++;fileItem.setMenu (createEditMenu ());
	
	__CLOVER_83_0.cloverRec.S[14086]++;fileItem = new MenuItem (bar, SWT.CASCADE);
	__CLOVER_83_0.cloverRec.S[14087]++;fileItem.setText ("Projet");
	__CLOVER_83_0.cloverRec.S[14088]++;fileItem.setMenu (createProjetMenu ());
	
	__CLOVER_83_0.cloverRec.S[14089]++;fileItem = new MenuItem (bar, SWT.CASCADE);
	__CLOVER_83_0.cloverRec.S[14090]++;fileItem.setText ("Windows");
	__CLOVER_83_0.cloverRec.S[14091]++;fileItem.setMenu (createWindowMenu ());
}

void createShell (Display display) {__CLOVER_83_0.cloverRec.M[761]++;
	__CLOVER_83_0.cloverRec.S[14092]++;shell = new Shell (display);
	__CLOVER_83_0.cloverRec.S[14093]++;shell.setText ("Edit");	
	__CLOVER_83_0.cloverRec.S[14094]++;GridLayout layout = new GridLayout();
	__CLOVER_83_0.cloverRec.S[14095]++;layout.numColumns = 1;
	__CLOVER_83_0.cloverRec.S[14096]++;shell.setLayout(layout);
	__CLOVER_83_0.cloverRec.S[14097]++;shell.addShellListener (new ShellAdapter () {
		public void shellClosed (ShellEvent e) {__CLOVER_83_0.cloverRec.M[762]++;
			//lineStyler.disposeColors();
			//text.removeLineStyleListener(lineStyler);
			__CLOVER_83_0.cloverRec.S[14098]++;int i;
			__CLOVER_83_0.cloverRec.S[14099]++;i=0;
			/*while(i<text_fichier.size())
			{
				((JavaLineStyler)lineStyler_fichier.elementAt(i)).disposeColors();
				((StyledText)text_fichier.elementAt(i)).removeLineStyleListener((JavaLineStyler)lineStyler_fichier.elementAt(i));
				i++;
			}*/
			__CLOVER_83_0.cloverRec.S[14100]++;for(i=0;(((i<fichier.size()) && (++__CLOVER_83_0.cloverRec.CT[3125]!=0|true)) || (++__CLOVER_83_0.cloverRec.CF[3125]==0&false));i++)
			{{
				__CLOVER_83_0.cloverRec.S[14101]++;((Fichier)fichier.elementAt(i)).disposeRessource();
			}
		}}
	});
}

void displayError(String msg) {__CLOVER_83_0.cloverRec.M[763]++;
	__CLOVER_83_0.cloverRec.S[14102]++;MessageBox box = new MessageBox(shell, SWT.ICON_ERROR);
	__CLOVER_83_0.cloverRec.S[14103]++;box.setMessage(msg);
	__CLOVER_83_0.cloverRec.S[14104]++;box.open();
}

public static void main (String [] args) {__CLOVER_83_0.cloverRec.M[764]++;
	__CLOVER_83_0.cloverRec.S[14105]++;Display display = new Display();
	__CLOVER_83_0.cloverRec.S[14106]++;EiffelViewer example = new EiffelViewer ();
	__CLOVER_83_0.cloverRec.S[14107]++;EiffelViewer.principal=example;
	__CLOVER_83_0.cloverRec.S[14108]++;Shell shell = example.open (display);
	__CLOVER_83_0.cloverRec.S[14109]++;while ((((!shell.isDisposed ()) && (++__CLOVER_83_0.cloverRec.CT[3126]!=0|true)) || (++__CLOVER_83_0.cloverRec.CF[3126]==0&false)))
		{__CLOVER_83_0.cloverRec.S[14110]++;if ((((!display.readAndDispatch ()) && (++__CLOVER_83_0.cloverRec.CT[3127]!=0|true)) || (++__CLOVER_83_0.cloverRec.CF[3127]==0&false))) {__CLOVER_83_0.cloverRec.S[14111]++;display.sleep ();
	}}__CLOVER_83_0.cloverRec.S[14112]++;display.dispose ();
}


public void add_fichier(String nom)
{__CLOVER_83_0.cloverRec.M[765]++;
	__CLOVER_83_0.cloverRec.S[14113]++;add_fichier(nom,null,null);
}

public void add_fichier(String nom,String textString,String path)
{__CLOVER_83_0.cloverRec.M[766]++;
	__CLOVER_83_0.cloverRec.S[14114]++;Fichier f;
	__CLOVER_83_0.cloverRec.S[14115]++;if((((nom==null||nom=="") && (++__CLOVER_83_0.cloverRec.CT[3128]!=0|true)) || (++__CLOVER_83_0.cloverRec.CF[3128]==0&false)))
	{{
		/*TabItem t=new TabItem(tab2,0);
		t.setText("sans titre");
		StyledText text1=create_text(tab2/*shell/*t[0]*//*);
		t.setControl(text1);
		nom_fichier.add("sans titre");*/
		__CLOVER_83_0.cloverRec.S[14116]++;f=new Fichier(null,null,tab2,null);
	}
	}else
	{{
		/*TabItem t=new TabItem(tab2,0);
		t.setText(nom);
		final StyledText text1=create_text(tab2/*shell/*t[0]*//*);
		t.setControl(text1);
		nom_fichier.add(nom);
		final String txt=textString;
		
		if(textString!=null)
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
		__CLOVER_83_0.cloverRec.S[14117]++;f=new Fichier(nom,textString,tab2,path);
	}
	}__CLOVER_83_0.cloverRec.S[14118]++;fichier.add(f);
	/*if(f.nom==null)
	{
		System.out.println("Erreur:nom null");
		liste.add("Sans nom");
	}
	else
		liste.add(f.nom);*/
	__CLOVER_83_0.cloverRec.S[14119]++;liste_fichier.ajoute_fichier(f.nom);
	__CLOVER_83_0.cloverRec.S[14120]++;TabItem[] t=new TabItem[1];
	__CLOVER_83_0.cloverRec.S[14121]++;t[0]=f.tab;
	__CLOVER_83_0.cloverRec.S[14122]++;tab2.setSelection(t);
}

public void fermer_fichier()
{__CLOVER_83_0.cloverRec.M[767]++;
	__CLOVER_83_0.cloverRec.S[14123]++;int i=tab2.getSelectionIndex(),j;
	__CLOVER_83_0.cloverRec.S[14124]++;if((((i+1<tab2.getItemCount()) && (++__CLOVER_83_0.cloverRec.CT[3129]!=0|true)) || (++__CLOVER_83_0.cloverRec.CF[3129]==0&false)))
		{__CLOVER_83_0.cloverRec.S[14125]++;j=i+1;
	}else {__CLOVER_83_0.cloverRec.S[14126]++;if((((i-1>=0) && (++__CLOVER_83_0.cloverRec.CT[3130]!=0|true)) || (++__CLOVER_83_0.cloverRec.CF[3130]==0&false)))
		{__CLOVER_83_0.cloverRec.S[14127]++;j=i-1;
	}else
		{__CLOVER_83_0.cloverRec.S[14128]++;j=-1;
	}}__CLOVER_83_0.cloverRec.S[14129]++;tab2.setSelection(j);
	__CLOVER_83_0.cloverRec.S[14130]++;fermer_fichier(i);
}

public void fermer_fichier(int no)
{__CLOVER_83_0.cloverRec.M[768]++;
	assert((((no>=0)) && (++__CLOVER_83_0.cloverRec.CT[3131]!=0|true)) || (++__CLOVER_83_0.cloverRec.CF[3131]==0&false));
	assert((((no<fichier.size())) && (++__CLOVER_83_0.cloverRec.CT[3132]!=0|true)) || (++__CLOVER_83_0.cloverRec.CF[3132]==0&false));
	//assert(no<liste_fichier.liste.ge)
	assert((((no<tab2.getItemCount())) && (++__CLOVER_83_0.cloverRec.CT[3133]!=0|true)) || (++__CLOVER_83_0.cloverRec.CF[3133]==0&false));
	__CLOVER_83_0.cloverRec.S[14131]++;fichier.remove(no);
	__CLOVER_83_0.cloverRec.S[14132]++;liste_fichier.ferme_fichier(no);
	__CLOVER_83_0.cloverRec.S[14133]++;tab2.getItem(no).dispose();
}

public static EiffelViewer principal;

public void createTab()
{__CLOVER_83_0.cloverRec.M[769]++;
	__CLOVER_83_0.cloverRec.S[14134]++;tab2=new TabFolder(shell,SWT.BORDER | SWT.MULTI | SWT.V_SCROLL | SWT.H_SCROLL);
	__CLOVER_83_0.cloverRec.S[14135]++;GridData spec = new GridData();
	__CLOVER_83_0.cloverRec.S[14136]++;spec.horizontalAlignment = GridData.FILL;
	__CLOVER_83_0.cloverRec.S[14137]++;spec.grabExcessHorizontalSpace = true;
	__CLOVER_83_0.cloverRec.S[14138]++;spec.verticalAlignment = GridData.FILL;
	__CLOVER_83_0.cloverRec.S[14139]++;spec.grabExcessVerticalSpace = true;
	__CLOVER_83_0.cloverRec.S[14140]++;tab2.setLayoutData(spec);
	/*TabItem[] t= new TabItem[2];
	t[0]=new TabItem(tab2,0);
	t[0].setText("test 3");
	StyledText text1=create_text(tab2/*shell/*t[0]*//*);
	t[0].setControl(text1);
	t[1]=new TabItem(tab2,0);
	t[1].setText("test 4");*/
	__CLOVER_83_0.cloverRec.S[14141]++;add_fichier("");
	//add_fichier("salut");
}

public Shell open (Display display) {__CLOVER_83_0.cloverRec.M[770]++;
	__CLOVER_83_0.cloverRec.S[14142]++;createShell (display);
	__CLOVER_83_0.cloverRec.S[14143]++;createMenuBar ();
	//createStyledText ();
	__CLOVER_83_0.cloverRec.S[14144]++;open_win_file();
	__CLOVER_83_0.cloverRec.S[14145]++;createTab();
	__CLOVER_83_0.cloverRec.S[14146]++;shell.setSize(500, 400);
	__CLOVER_83_0.cloverRec.S[14147]++;shell.open ();
	__CLOVER_83_0.cloverRec.S[14148]++;return shell;
}

public void open_win_file()
{__CLOVER_83_0.cloverRec.M[771]++;
	//TabFolder
/*	win_file=new Shell(shell,SWT.SHELL_TRIM);
	win_file.setText("fichiers");
	GridLayout layout = new GridLayout();
	layout.numColumns = 1;
	win_file.setLayout(layout);	
	win_file.setSize(100, 100);
	/*tab=new TabFolder(win_file,0);
	TabItem[] t= new TabItem[2];
	t[0]=new TabItem(tab,0);
	t[0].setText("test 1");
	t[1]=new TabItem(tab,0);
	t[1].setText("test 2");*/
/*	liste=new org.eclipse.swt.widgets.List(win_file,SWT.SINGLE);
	//liste.add("a");
	//liste.add("b");
	//tab.setTabList(t);
	GridData spec = new GridData();
	spec.horizontalAlignment = GridData.FILL;
	spec.grabExcessHorizontalSpace = true;
	spec.verticalAlignment = GridData.FILL;
	spec.grabExcessVerticalSpace = true;
	liste.setLayoutData(spec);
	win_file.open ();*/
	__CLOVER_83_0.cloverRec.S[14149]++;liste_fichier=new ListeFichier(shell);
}

void openFile() {__CLOVER_83_0.cloverRec.M[772]++;	
	__CLOVER_83_0.cloverRec.S[14150]++;final String textString;
	__CLOVER_83_0.cloverRec.S[14151]++;if ((((fileDialog == null) && (++__CLOVER_83_0.cloverRec.CT[3134]!=0|true)) || (++__CLOVER_83_0.cloverRec.CF[3134]==0&false))) {{
		__CLOVER_83_0.cloverRec.S[14152]++;fileDialog = new FileDialog(shell, SWT.OPEN);
	}

	}__CLOVER_83_0.cloverRec.S[14153]++;fileDialog.setFilterExtensions(new String[] {"*.e","*.java", "*.*"});
	__CLOVER_83_0.cloverRec.S[14154]++;fileDialog.open();
	__CLOVER_83_0.cloverRec.S[14155]++;String name = fileDialog.getFileName();
	
	__CLOVER_83_0.cloverRec.S[14156]++;if (((((name == null) || (name.length() == 0)) && (++__CLOVER_83_0.cloverRec.CT[3135]!=0|true)) || (++__CLOVER_83_0.cloverRec.CF[3135]==0&false))) {__CLOVER_83_0.cloverRec.S[14157]++;return;

	/*File file = new File(fileDialog.getFilterPath(), name);
	if (!file.exists()) {
		String message = MessageFormat.format("Err_file_no_exist", new String[] {file.getName()});
		displayError(message);
		return;
	}

	try {
		FileInputStream stream= new FileInputStream(file.getPath());
		try {
			Reader in = new BufferedReader(new InputStreamReader(stream));
			char[] readBuffer= new char[2048];
			StringBuffer buffer= new StringBuffer((int) file.length());
			int n;
			while ((n = in.read(readBuffer)) > 0) {
				buffer.append(readBuffer, 0, n);
			}
			textString = buffer.toString();
			stream.close();
		}
		catch (IOException e) {
			// Err_file_io
			String message = MessageFormat.format("Err_file_io", new String[] {file.getName()});
			displayError(message);
			return;
		}
	}
	catch (FileNotFoundException e) {
		String message = MessageFormat.format("Err_not_found", new String[] {file.getName()});
		displayError(message);
		return;
	}
	// Guard against superfluous mouse move events -- defer action until later
	/*Display display = text.getDisplay();
	display.asyncExec(new Runnable() {
		public void run() {
			text.setText(textString);
		}
	});
	
	// parse the block comments up front since block comments can go across
	// lines - inefficient way of doing this
	lineStyler.parseBlockComments(textString);*/
	}__CLOVER_83_0.cloverRec.S[14158]++;add_fichier(name,null/*textString*/,fileDialog.getFilterPath());
}

void newFile() {__CLOVER_83_0.cloverRec.M[773]++;	
	__CLOVER_83_0.cloverRec.S[14159]++;final String textString;
	

	__CLOVER_83_0.cloverRec.S[14160]++;String name = "Sans nom";
	
	__CLOVER_83_0.cloverRec.S[14161]++;if (((((name == null) || (name.length() == 0)) && (++__CLOVER_83_0.cloverRec.CT[3136]!=0|true)) || (++__CLOVER_83_0.cloverRec.CF[3136]==0&false))) {__CLOVER_83_0.cloverRec.S[14162]++;return;

	}__CLOVER_83_0.cloverRec.S[14163]++;add_fichier(name);
}

void menuFileExit () {__CLOVER_83_0.cloverRec.M[774]++;
	__CLOVER_83_0.cloverRec.S[14164]++;shell.close ();
}

void menuSave () {__CLOVER_83_0.cloverRec.M[775]++;
	//shell.close ();
	__CLOVER_83_0.cloverRec.S[14165]++;int i=tab2.getSelectionIndex();
	__CLOVER_83_0.cloverRec.S[14166]++;if((((i>-1) && (++__CLOVER_83_0.cloverRec.CT[3137]!=0|true)) || (++__CLOVER_83_0.cloverRec.CF[3137]==0&false)))
	{{
		__CLOVER_83_0.cloverRec.S[14167]++;String n=((Fichier)fichier.elementAt(i)).nom;
		__CLOVER_83_0.cloverRec.S[14168]++;System.out.println("nom="+n);
	}
}}

}
