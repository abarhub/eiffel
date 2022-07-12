package tinyeiffel.genere_java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.logging.Logger;

import org.apache.bcel.Constants;
import org.apache.bcel.generic.ALOAD;
import org.apache.bcel.generic.ASTORE;
import org.apache.bcel.generic.ArrayType;
import org.apache.bcel.generic.BranchInstruction;
import org.apache.bcel.generic.ClassGen;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.FieldGen;
import org.apache.bcel.generic.GOTO;
import org.apache.bcel.generic.Instruction;
import org.apache.bcel.generic.InstructionConstants;
import org.apache.bcel.generic.InstructionFactory;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.LocalVariableGen;
import org.apache.bcel.generic.MethodGen;
import org.apache.bcel.generic.ObjectType;
import org.apache.bcel.generic.PUSH;
import org.apache.bcel.generic.Type;

import tinyeiffel.compiler.Logging;
import tinyeiffel.genere_java.generation.GenereBcel;
import tinyeiffel.genere_java.generation.GenereJvm;
import tinyeiffel.intermediaire.CIAttribut;
import tinyeiffel.intermediaire.CICanonisation;
import tinyeiffel.intermediaire.CIClasse;
import tinyeiffel.intermediaire.CIDeclare_Var;
import tinyeiffel.intermediaire.CIExpr;
import tinyeiffel.intermediaire.CIExpr_Appel;
import tinyeiffel.intermediaire.CIExpr_Binaire;
import tinyeiffel.intermediaire.CIExpr_Bool;
import tinyeiffel.intermediaire.CIExpr_Char;
import tinyeiffel.intermediaire.CIExpr_Creation;
import tinyeiffel.intermediaire.CIExpr_Double;
import tinyeiffel.intermediaire.CIExpr_Entier;
import tinyeiffel.intermediaire.CIExpr_Extern;
import tinyeiffel.intermediaire.CIExpr_Real;
import tinyeiffel.intermediaire.CIExpr_Scalaire;
import tinyeiffel.intermediaire.CIExpr_String;
import tinyeiffel.intermediaire.CIExpr_Type;
import tinyeiffel.intermediaire.CIExpr_Unaire;
import tinyeiffel.intermediaire.CIExpr_Var;
import tinyeiffel.intermediaire.CIExpr_Var_Syst;
import tinyeiffel.intermediaire.CIExpr_Void;
import tinyeiffel.intermediaire.CIInstruction;
import tinyeiffel.intermediaire.CIInstruction_Affect;
import tinyeiffel.intermediaire.CIInstruction_Appel;
import tinyeiffel.intermediaire.CIInstruction_Extern;
import tinyeiffel.intermediaire.CIInstruction_Goto;
import tinyeiffel.intermediaire.CIInstruction_Label;
import tinyeiffel.intermediaire.CIInstruction_Raise;
import tinyeiffel.intermediaire.CIInstruction_Return;
import tinyeiffel.intermediaire.CIInstruction_Si;
import tinyeiffel.intermediaire.CIInstruction_Si_Non;
import tinyeiffel.intermediaire.CIListe_Instr;
import tinyeiffel.intermediaire.CIListe_Var;
import tinyeiffel.intermediaire.CINom_Attribut;
import tinyeiffel.intermediaire.CIProgramme;
import tinyeiffel.intermediaire.CIRoutine;
import tinyeiffel.intermediaire.CIType;
import tinyeiffel.intermediaire.CITypeSimple;

public class ConvertieJava {

	private CIProgramme programme;
	private Logger logger;
	private Logging logging;
	
	public ConvertieJava(CIProgramme p, Logger logger, Logging logging) {
		assert(p!=null);
		assert(logger!=null);
		programme=p;
		this.logger=logger;
		this.logging=logging;
		CICanonisation c;
		c=new CICanonisation(p,logger);
		p=c.simplifie();
		System.out.flush();
		System.err.flush();
	}

	public void generation() {
		ClassGen cg;
		CIClasse cl;
		int i;
		List liste;
		GenereJvm genere;
		String rep="e:\\projet\\eiffel\\resultat\\";//genere.sauve(new File("e:\\projet\\eiffel\\resultat\\"+genere.getEnv().nom_classe(cl)+".class"));
		//EnvironementGlobal env;
		//test();
		System.out.println("Generation des classes ...");
		//env=new EnvironementGlobal(programme);
		genere=new GenereBcel(programme);
		for(i=0;i<programme.liste_classe.length;i++)
		{
			cl=programme.liste_classe[i];
			construit_classe(cl,i==0,genere,rep);
			
			construit_interface(cl,genere,rep);
			/*try {
			    cg.getJavaClass().dump("e:\\projet\\eiffel\\resultat\\"+env.nom_interface(cl)+".class");
			    System.out.println("Classe generé avec succes !"); 
			} catch (java.io.IOException e) {
				System.err.println(e);
			}
			liste.add(cg.getJavaClass());*/
		}
		if(!genere.verification(rep))
			logging.erreurMsg("Erreur pendant la génération des classes");
	}

	private void construit_interface(CIClasse cl, GenereJvm genere, String rep) {
		String nom_classe;
		//ClassGen cg;
		//ConstantPoolGen cp;
		//InstructionList il;
		CIAttribut attr;
		int i;
		InstructionFactory factory;
		String inter[];
		Type type_retour;
		CIType type;
		if(cl.nom.nom.equals("TEST1"))
		{
			System.out.println("Trouve !");
		}
		nom_classe=genere.getEnv().nom_interface(cl);
		if(cl.heritage!=null&&cl.heritage.length>0)
		{
			inter=new String[cl.heritage.length];
			for(i=0;i<cl.heritage.length;i++)
			{
				inter[i]=genere.getEnv().nom_interface(cl.heritage[i]);
			}
		}
		else
		{
			inter=null;
		}
		genere.nouvelle_interface(nom_classe, null, inter);
		/*cg = new ClassGen(nom_classe, "java.lang.Object",
				nom_classe+".java", Constants.ACC_PUBLIC | Constants.ACC_INTERFACE
				| Constants.ACC_ABSTRACT,inter);
		cp = cg.getConstantPool(); // cg creates constant pool
		il = new InstructionList();
		MethodGen  mg;
		factory = new InstructionFactory(cg);*/
		
		//cg.addEmptyConstructor(Constants.ACC_PUBLIC);
		if(cl.liste_attribut!=null)
		{
			CIType param[];
			for(i=0;i<cl.liste_attribut.length;i++)
			{
				attr=cl.liste_attribut[i];
				if(attr.routine!=null)
				{
					if(attr.routine.parametre!=null&&attr.routine.parametre.size()>0)
					{
						param=new CIType[attr.routine.parametre.size()];
						for(int j=0;j<param.length;j++)
						{
							param[j]=attr.routine.parametre.elt(j).type;
						}
					}
					else
					{
						param=null;
					}
				}
				else
				{
					param=null;
				}
				genere.nouvelle_methode(conv_nom_attribut(attr.nom), attr.retour, param, true);
				genere.fin_methode();
					//type_retour=envg.conv_type(attr.retour);
				/*il = new InstructionList();
				mg = new MethodGen(Constants.ACC_PUBLIC|Constants.ACC_ABSTRACT, // access flags
					type_retour,               // return type
					null,
					null, // arg names
					conv_nom_attribut(attr.nom), nom_classe,    // method, class
					il, cp);
				//il.append(InstructionConstants.NOP);
				//il.append(InstructionConstants.RETURN);
				//mg.setMaxStack();
				cg.addMethod(mg.getMethod());*/
				//il.dispose();
				if(!attr.est_routine()&&attr.cst==null&&attr.retour!=null)
				{// generation de la methode set
					genere.nouvelle_methode(conv_nom_attribut(attr.nom), null, new CIType[]{attr.retour}, true);
					genere.fin_methode();
					/*type_retour=envg.conv_type(attr.retour);
					il = new InstructionList();
					mg = new MethodGen(Constants.ACC_PUBLIC|Constants.ACC_ABSTRACT, // access flags
						Type.VOID,               // return type
						new Type[]{type_retour},
						new String[]{"val"}, // arg names
						conv_nom_attribut(attr.nom), nom_classe,    // method, class
						il, cp);
					//il.append(InstructionConstants.NOP);
					//il.append(InstructionConstants.RETURN);
					//mg.setMaxStack();
					cg.addMethod(mg.getMethod());*/
				}
			}
		}
		try {
			Object tmp;
		    //cg.getJavaClass().dump("e:\\projet\\eiffel\\resultat\\"+env.nom_classe(cl)+".class");
		    //System.out.println("Classe generé avec succes !");
			genere.sauve(new File(rep,genere.getEnv().nom_interface(cl)+".class"));
		} catch (java.io.IOException e) {
			System.err.println(e);
		}
		//return cg;
	}

	private void construit_main(CIClasse cl, GenereJvm genere) {
		genere.construit_main(cl);
	}

	private void construit_classe(CIClasse cl, boolean main,
			GenereJvm genere, String rep) {
		String nom_classe;
		CIAttribut attr;
		int i,no_heritage_fort;
		CITypeSimple heritage_fort;
		CIAttribut attr2;
		boolean methode_herite;
		String nom_classe_ancetre;
		nom_classe=genere.getEnv().nom_classe(cl);
		if(cl.heritage!=null&&cl.heritage.length>0)
		{
			no_heritage_fort=0;
			heritage_fort=cl.heritage[no_heritage_fort];
		}
		else
		{
			//if(cl.nom.nom.equalsIgnoreCase("general")||cl.nom.nom.equalsIgnoreCase("any"))
			{
				no_heritage_fort=-1;
				heritage_fort=null;
			}
			/*else
			{// on ajoute any
				heritage_fort=new CITypeSimple(false,"ANY",null,null,null);
				no_heritage_fort=0;
				cl.heritage=new CITypeSimple[1];
				cl.heritage[0]=heritage_fort;
			}*/
		}
		nom_classe_ancetre=(no_heritage_fort>=0)?genere.getEnv().nom_classe(heritage_fort):"java.lang.Object";
		genere.nouvelle_classe(nom_classe, nom_classe_ancetre, new String[]{genere.getEnv().nom_interface(cl)});
		if(cl.heritage!=null)
		{
			for(i=0;i<cl.heritage.length;i++)
			{
				if(no_heritage_fort!=i)
				{
					genere.ajoute_champs("ancetre"+i, cl.heritage[i], false);
					// TODO :creation de la classe cl.nom+"$"+cl.heritage[i].nom+i
					// qui herite de la classe cl.heritage[i].nom
					// TODO: pour chaque attribut qui est un attribut, 
					// les redefinir pour qu'ils pointent vers la classe actuelle
					// TODO:ajouter au constructeur un parametre est mettre ce parametre
					// en attribut prive
				}
			}
		}
		// TODO: créer un constructeur sans parametre 
		// qui va initialiser les attributs de l'heritage
		genere.nouvelle_methode("<init>",null,null,false);
	    if(cl.heritage!=null)
		{
	    	String n;
	    	boolean trouve=false;
			for(i=0;i<cl.heritage.length;i++)
			{
				if(no_heritage_fort==i&&!cl.heritage[i].nom.equalsIgnoreCase(cl.nom.nom))
				{
					Type type_retour;
					FieldGen fg;
					//type_retour=envg.conv_type(cl.heritage[i]);
					//fg=new FieldGen(Constants.ACC_PUBLIC,
					//	type_retour,"ancetre"+i,cp);
					//cg.addField(fg.getField());
					// TODO :creation de la classe cl.nom+"$"+cl.heritage[i].nom+i
					// qui herite de la classe cl.heritage[i].nom
					// TODO: pour chaque attribut qui est un attribut, 
					// les redefinir pour qu'ils pointent vers la classe actuelle
					// TODO:ajouter au constructeur un parametre est mettre ce parametre
					// en attribut prive
					n=genere.getEnv().nom_classe(cl.heritage[i]);
					genere.instr_new(n);
					genere.instr_expr(GenereJvm.DUP);
					genere.instr_invoke_special(n, "<init>", null, null);
					//genere.instr_aload(0);
					//genere.instr_aload(0);
					//genere.instr_expr(GenereJvm.DUP);
					//genere.instr_put_field(n, "$this", cl.heritage[i]);
//					genere.instr_aload(0);
//					genere.instr_invoke_special(n, "<init>", null, null);
					trouve=true;
				}
			}
			if(!trouve)
			{
				genere.instr_load(type("ANY"),0);
		    	genere.instr_invoke_special("java.lang.Object", "<init>", null, null);
		    	genere.instr_expr(GenereJvm.RETURN);
			}
			else
			{
				genere.instr_expr(GenereJvm.RETURN);
			}
		}
	    else
	    {
	    	genere.instr_load(type("ANY"),0);
	    	genere.instr_invoke_special("java.lang.Object", "<init>", null, null);
	    	genere.instr_expr(GenereJvm.RETURN);
	    }
	    genere.fin_methode();
		genere.ajoute_champs("$this", cl.nom, false);
		if(cl.liste_attribut!=null)
		{
			for(i=0;i<cl.liste_attribut.length;i++)
			{
				attr=cl.liste_attribut[i];
				methode_herite=false;
				if(!genere.getEnv().types_egaux(attr.type,cl.nom))
				{
					if(attr.attribut_ascendant!=null&&
						attr.attribut_ascendant.length>=1)
					{
						if(attr.attribut_ascendant[0].no==no_heritage_fort)
						{
							methode_herite=true;
						}
					}
					else
					{
						assert(attr.attribut_ascendant!=null):"attribut herité sans ancetre";
						assert(attr.attribut_ascendant.length==1):"attribut "+attr.nom+" herité avec plusieurs " +
							"ancetres dans la classe "+cl.nom+"("+attr.attribut_ascendant[0].no+","+
							attr.attribut_ascendant[1].no+")";
						assert(false);
					}
				}
				System.out.println("Methode "+nom_classe+"."+attr.nom.nom+" "+((methode_herite)?"herite":"non herite"));
				if(!methode_herite)
				{
					if(attr.est_descendant())
					{// l'attribut est hérité
						CIAttribut attr3;
						attr3=genere.getEnv().donne_attribut(cl,attr);
						// TODO: les attributs herités doivent appeler les attributs corespondant
						if(attr3.routine!=null)
						{
							genere_routine_herite(cl, nom_classe,
								genere, attr3,attr);
						}
					}
					else
					{// l'attribut est directe
						int acces;
						Type type_retour,parametres_types[];
						String nom_parametres[];
						Environement env;
						if(attr.routine!=null)
						{
							genere_routine(cl, nom_classe, genere, attr);
						}
						else if(attr.cst==null)
						{// c'est une variable
							genere_variable(nom_classe, genere, attr);
						}
						else if(attr.cst!=null)
						{// c'est une constante
							genere_constante(cl, nom_classe, genere, attr);
						}
					}
				}
			}
		}
		if(main)
		{
			construit_main(cl,genere);
		}
		try {
			Object tmp;
			genere.sauve(new File(rep,genere.getEnv().nom_classe(cl)+".class"));
		} catch (java.io.IOException e) {
			System.err.println(e);
		}
	}

	private void genere_routine_herite(CIClasse cl, 
			String nom_classe, GenereJvm genere, CIAttribut attr,
			CIAttribut attr_classe) {
		int no_heritage;
		int acces;
		CIType type_retour;
		CIType param[];
		Environement env;
		CIRoutine r;
		CITypeSimple classe_herite;
		no_heritage=attr_classe.attribut_ascendant[0].no;
		classe_herite=cl.heritage[no_heritage];
		r=attr.routine;
		acces=Constants.ACC_PUBLIC;
		if(r.retour==null)
		{
			type_retour=null;
		}
		else
		{
			type_retour=r.retour.type;
		}
		if(r.parametre==null||r.parametre.size()==0)
		{
			param=null;
		}
		else
		{
			int j;
			CIDeclare_Var d;
			param=new CIType[r.parametre.size()];
			for(j=0;j<param.length;j++)
			{
				d=r.parametre.elt(j);
				param[j]=d.type;
			}
		}
		genere.nouvelle_methode(conv_nom_attribut(attr.nom), type_retour, param,false);
		{
			Type paramt[]=new Type[0];
			CITypeSimple classe_appel;
			{
				CIDeclare_Var d;
				classe_appel=cl.nom;
				genere.instr_get_field(classe_appel, "ancetre"+no_heritage, classe_herite);
			}
			genere.instr_invoke_virtual(cl.nom.nom, attr.nom.nom, type_retour, param);
			if(r.retour!=null)
			{
				genere.instr_expr(GenereJvm.ARETURN);
			}
			else
			{
				genere.instr_expr(GenereJvm.RETURN);
			}
		}
		genere.fin_methode();
		
	}

	private void genere_constante(CIClasse cl, String nom_classe, GenereJvm genere, CIAttribut attr) {
		Environement env;
		genere.nouvelle_methode(conv_nom_attribut(attr.nom), attr.retour, null,false);
		env=new Environement(null,genere,cl,attr);
		genere_expression(attr.cst,genere,env);
		genere.instr_return(attr.retour);
		genere.fin_methode();
	}

	private void genere_variable(String nom_classe, GenereJvm genere, CIAttribut attr) {
		InstructionList il;
		MethodGen mg;
		Type type_retour;
		FieldGen fg;
		if(attr.est_static())
		{
			genere.ajoute_champs(attr.nom.nom, attr.retour, true);
		}
		else
		{
			genere.ajoute_champs(attr.nom.nom, attr.retour, false);
			// la methode get
			if(attr.nom!=null&&attr.nom.nom!=null&&attr.nom.nom.equals("$val_int"))
			{
				System.out.println("Trouve !");
			}
			genere.nouvelle_methode(conv_nom_attribut(attr.nom), attr.retour, null,false);
			test_var_desc(nom_classe, genere,attr,  true);
			genere.fin_methode();
			
			genere.nouvelle_methode(conv_nom_attribut(attr.nom), null, new CIType[]{attr.retour},false);
			test_var_desc(nom_classe, genere,attr,  false);
			genere.fin_methode();
		}
	}

	private void genere_routine(CIClasse cl, 
			String nom_classe, GenereJvm genere, CIAttribut attr) {
		int acces;
		String[] nom_parametres;
		Environement env;
		CIRoutine r;
		CIType t,param[];
		r=attr.routine;
		if(r.retour==null)
		{
			t=null;
		}
		else
		{
			t=r.retour.type;
		}
		if(r.parametre==null||r.parametre.size()==0)
		{
			param=null;
		}
		else
		{
			int j;
			CIDeclare_Var d;
			param=new CIType[r.parametre.size()];
			for(j=0;j<param.length;j++)
			{
				d=r.parametre.elt(j);
				param[j]=d.type;
			}
		}
		genere.nouvelle_methode(conv_nom_attribut(attr.nom), t, param,false);
		genere_instruction(genere,cl,attr);
		if(r.retour==null)
		{
			genere.instr_expr(GenereJvm.RETURN);
		}
		else
		{
			genere.instr_expr(GenereJvm.ACONSTNULL);
			genere.instr_expr(GenereJvm.ARETURN);
		}
		genere.fin_methode();
	}
	
	// retourne soit this, si $this est null, ou $this sinon
	private void test_var_desc(String nom_classe, 
			GenereJvm genere,CIAttribut attr, boolean get) {
		String nom_herite;
		int src1,src2,dest1,dest2;
		nom_herite=nom_classe.substring(0,nom_classe.length()-4);
		genere.instr_aload(0);
		genere.instr_get_field(type(nom_herite), "$this", type(nom_herite));
		genere.instr_expr(GenereJvm.ACONSTNULL);
		src1=genere.instr_expr(GenereJvm.IF_ACMPNE);
		
		// pas de descendant
		if(get)
		{
			genere.instr_aload(0);
			genere.instr_get_field(type(nom_herite), attr.nom.nom, attr.retour);
		}
		else
		{
			genere.instr_aload(0);
			genere.instr_load(attr.retour, 1);
			genere.instr_put_field(nom_classe, attr.nom.nom, attr.retour);
		}
		src2=genere.instr_expr(GenereJvm.GOTO);
		
		// il y a des descendants
		dest1=genere.instr_aload(0);
		genere.instr_get_field(type(nom_herite), "$this", type(nom_herite));
		if(get)
		{
			genere.instr_invoke_interface(nom_herite, attr.nom.nom, attr.retour, null);
		}
		else
		{
			genere.instr_load(attr.retour, 1);
			genere.instr_invoke_interface(nom_herite, attr.nom.nom, null,new CIType[]{attr.retour});
		}
		dest2=genere.instr_expr(GenereJvm.NOP);
		if(get)
		{
			genere.instr_return(attr.retour);
		}
		else
		{
			genere.instr_expr(GenereJvm.RETURN);
		}
		
		genere.set_cible(src1, dest1);
		genere.set_cible(src2, dest2);
	}

	private CITypeSimple type(String nom_classe) {
		return new CITypeSimple(false,nom_classe,null,null,null);
	}

	private String conv_nom_attribut(CINom_Attribut nom) {
		String res;
		res=nom.nom;
		if(res.startsWith("\""))
			res=res.substring(1);
		if(res.endsWith("\""))
			res=res.substring(0,res.length()-1);
		if(res.equals("^"))
		{
			res="$puiss";
		}
		else if(res.equals("+"))
		{
			res="$plus";
		}
		else if(res.equals("-"))
		{
			res="$moins";
		}
		else if(res.equals("*"))
		{
			res="$fois";
		}
		else if(res.equals("/"))
		{
			res="$div";
		}
		else if(res.equals("<"))
		{
			res="$inf";
		}
		else if(res.equals("<="))
		{
			res="$infe";
		}
		else if(res.equals(">"))
		{
			res="$sup";
		}
		else if(res.equals(">="))
		{
			res="$supe";
		}
		return res;
	}

	
	private void genere_instruction(GenereJvm genere, CIClasse cl, CIAttribut attr) {
		CIListe_Instr liste;
		int i;
		CIInstruction instr;
		CIListe_Var local;
		CIDeclare_Var v;
		LocalVariableGen lg;
		List liste_local;
		InstructionHandle debut;
		Environement env;
		//InstructionFactory factory;
		Map liste_goto,liste_label;
		liste_goto=new HashMap();
		liste_label=new HashMap();
		//factory=env.factory;
		genere.instr_expr(GenereJvm.NOP);
		//debut=il.append(InstructionConstants.NOP);
		liste=attr.routine.liste_instruction;
		env=new Environement(attr.routine,genere,cl,attr);
		env.contrsuit_local();
		if(liste!=null&&liste.size()>0)
		{
			for(i=0;i<liste.size();i++)
			{
				instr=liste.elt(i);
				if(instr instanceof CIInstruction_Affect)
				{
					CIInstruction_Affect ins=(CIInstruction_Affect)instr;
					CIExpr_Var var;
					int type_var,no_local;
					CIDeclare_Var d;
					CIType t;
					var=ins.nom;
					type_var=env.type_var(var.nom);
					switch(type_var)
					{
					case Environement.VAR_ATTR:
						if(ins.nom.src==null)
						{
							//il.append(InstructionConstants.ALOAD_0);
							genere.instr_aload(0);
						}
						else
						{// TODO: a faire
							genere_var(genere, null,ins.nom.src,env);
						}
						t=genere_expression(ins.expr,genere,env);
						/*il.append(factory.createPutField(
							((ObjectType)(env.envg.conv_type(env.routine.classe.nom))).getClassName(),
							var.nom,Type.OBJECT));*/
						/*il.append(factory.createInvoke(((ObjectType)(
								env.envg.conv_type(env.routine.classe.nom))).getClassName(),
								var.nom,Type.VOID,new Type[]{t},Constants.INVOKEVIRTUAL));*/
						genere.instr_invoke_virtual(attr.routine.classe.nom.nom, var.nom, null, new CIType[]{t});
						break;
					case Environement.VAR_LOCAL:
					case Environement.VAR_PARAM:
					case Environement.VAR_RETOUR:
						d=env.donne_var(var.nom);
						no_local=env.donne_no(var.nom);
						if(no_local==-1)
						{
							System.out.println("Trouve");
						}
						assert(no_local>0):"no de variable local invalide:"+no_local;
						genere_expression(ins.expr,genere,env);
						//il.append(factory.createStore(env.envg.conv_type(d.type),no_local));
						genere.instr_store(d.type,no_local);
						break;
					default:
						assert(false):"instruction:"+ins;
						break;
					}
				}
				else if(instr instanceof CIInstruction_Appel)
				{
					CIInstruction_Appel ins=(CIInstruction_Appel)instr;
					//Type paramt[]=new Type[0];
					CIType paramt[]=null;
					CITypeSimple classe_appel;
					if(ins.cible==null)
					{
						//il.append(InstructionConstants.ALOAD_0);
						genere.instr_aload(0);
						classe_appel=env.cl.nom;
					}
					else
					{
						CIDeclare_Var d;
						genere_expression(ins.cible,genere,env);
						d=env.donne_var(ins.cible.nom);
						classe_appel=genere.getEnv().simplifie_type(d.type);
					}
					if(ins.param!=null&&ins.param.length>0)
					{
						CIExpr_Scalaire param[];
						int j;
						param=ins.param;
						//paramt=new Type[param.length];
						paramt=new CIType[param.length];
						for(j=0;j<param.length;j++)
						{
							genere_expression(param[j],genere,env);
							//paramt[j]=env.envg.conv_type(param[j].type);
						}
						CIClasse cl2;
						CIAttribut attr2;
						cl2=genere.getEnv().programme.donne_classe(classe_appel);
						attr2=cl2.donne_attribut(ins.nom.nom);
						assert(attr2!=null);
						assert(attr2.routine.parametre!=null);
						assert(attr2.routine.parametre.size()==paramt.length);
						for(j=0;j<paramt.length;j++)
						{
							//paramt[j]=env.envg.conv_type(attr2.routine.parametre.elt(j).type);
							paramt[j]=attr2.routine.parametre.elt(j).type;
						}
					}
					/*il.append(factory.createInvoke(env.class_gen.getClassName(),
						ins.nom.nom,Type.VOID,paramt,Constants.INVOKEVIRTUAL));*/
					genere.instr_invoke_interface(classe_appel.nom, ins.nom.nom, (CIType)null, paramt);
				}
				else if(instr instanceof CIInstruction_Extern)
				{
					CIInstruction_Extern ins=(CIInstruction_Extern)instr;
					assert(ins.langage.substring(0,3).equalsIgnoreCase("jvm"));
					CIType paramt[]=null;
					String nom_classe,nom_methode;
					boolean est_static=false;
					CITypeSimple classe_appel;
					if(ins.opt!=null&&ins.opt.length()>0)
					{
						nom_methode=ins.opt;
					}
					else
					{
						nom_methode=ins.nom.nom;
					}
					if(ins.langage.indexOf(":")>-1)
					{
						String tab[];
						tab=ins.langage.split(":");
						assert(tab!=null&&tab.length>=2):" langage incorrecte :"+ins.langage;
						nom_classe=tab[1];
						if(tab.length>=3)
						{
							if(tab[2].equalsIgnoreCase("static"))
								est_static=true;
						}
					}
					else
					{
						//nom_classe=env.class_gen.getClassName();
						nom_classe=env.cl.nom.nom;
					}
					if(!est_static)
					{
						if(ins.cible==null)
						{
							//il.append(InstructionConstants.ALOAD_0);
							genere.instr_aload(0);
						}
						else
						{
							genere_expression(ins.cible,genere,env);
						}
					}
					if(ins.param!=null&&ins.param.length>0)
					{
						CIExpr_Scalaire param[];
						int j;
						CIType t;
						param=ins.param;
						paramt=new CIType[param.length];
						for(j=0;j<param.length;j++)
						{
							assert(param[j]!=null);
							t=genere_expression(param[j],genere,env);
							assert(t!=null);
							//paramt[j]=env.envg.conv_type(param[j].type);
							paramt[j]=t;
						}
						/*CIClasse cl;
						CIAttribut attr;
						cl=env.envg.programme.donne_classe(new CITypeSimple(false,
							nom_classe,null,null,null));
						attr=cl.donne_attribut(ins.nom.nom);
						assert(attr!=null);
						assert(attr.routine.parametre!=null);
						assert(attr.routine.parametre.size()==paramt.length);
						for(j=0;j<paramt.length;j++)
						{
							paramt[j]=env.envg.conv_type(attr.routine.parametre.elt(j).type);
						}*/
					}
					/*il.append(factory.createInvoke(nom_classe,
						nom_methode,Type.VOID,paramt,
						(!est_static)?Constants.INVOKEVIRTUAL:
						Constants.INVOKESTATIC));*/
					if(est_static)
					{
						genere.instr_invoke_static(nom_classe, nom_methode, null, paramt);
					}
					else
					{
						genere.instr_invoke_virtual(nom_classe, nom_methode, null, paramt);
					}
				}
				else if(instr instanceof CIInstruction_Goto)
				{
					CIInstruction_Goto ins=(CIInstruction_Goto)instr;
					int no_instr;
					//GOTO g = new GOTO(null);
					//il.append(g);
					no_instr=genere.instr_expr(GenereJvm.GOTO);
					ajoute_goto(liste_goto,no_instr,ins.nom);
				}
				else if(instr instanceof CIInstruction_Label)
				{
					CIInstruction_Label ins=(CIInstruction_Label)instr;
					//InstructionHandle ih;
					int no_instr;
					//ih=il.append(InstructionConstants.NOP );
					no_instr=genere.instr_expr(GenereJvm.NOP);
					ajoute_label(liste_label,no_instr,ins.nom);
				}
				else if(instr instanceof CIInstruction_Raise)
				{
					CIInstruction_Raise ins=(CIInstruction_Raise)instr;
					
				}
				else if(instr instanceof CIInstruction_Return)
				{
					CIInstruction_Return ins=(CIInstruction_Return)instr;
					String nom2="Result";
					int no_local;
					CIDeclare_Var d;
					//Type t;
					d=env.donne_var(nom2);
					if(d!=null)
					{
						assert(d!=null):"Impossible de trouver la varieble "+nom2;
						//t=env.envg.conv_type(d.type);
						no_local=env.donne_no(nom2);
						if(no_local==-1)
						{
							System.out.println("Trouve");
						}
						assert(no_local>0):"no de variable local invalide:"+no_local;
						//il.append(env.factory.createLoad(t,no_local));
						//il.append(env.envg.conv_retour(d.type));
						genere.instr_load(d.type, no_local);
						genere.instr_return(d.type);
					}
					else
					{
						//il.append(InstructionConstants.RETURN);
						genere.instr_expr(GenereJvm.RETURN);
					}
					break;
				}
				else if(instr instanceof CIInstruction_Si)
				{
					CIInstruction_Si ins=(CIInstruction_Si)instr;
					//IfInstruction ifeq;
					int no_instr;
					genere_expression(ins.expr,genere,env);
					boolean2p(genere);
					//ifeq=new IFNE(null);
					//il.append(ifeq);
					no_instr=genere.instr_expr(GenereJvm.IFNE);
					ajoute_goto(liste_goto,no_instr,ins.label);
				}
				else if(instr instanceof CIInstruction_Si_Non)
				{
					CIInstruction_Si_Non ins=(CIInstruction_Si_Non)instr;
					//IfInstruction ifeq;
					int no_instr;
					genere_expression(ins.expr,genere,env);
					boolean2p(genere);
					//ifeq=new IFEQ(null);
					//il.append(ifeq);
					no_instr=genere.instr_expr(GenereJvm.IFEQ);
					ajoute_goto(liste_goto,no_instr,ins.label);
				}
				else
				{
					assert(false):"Instruction inconnue";	
				}
			}
			liaison_goto_label(liste_goto, liste_label);
		}
	}

	private void liaison_goto_label(Map liste_goto, Map liste_label) {
		int i;
		Set set;
		Iterator iter;
		String s;
		List liste2;
		InstructionHandle ih;
		BranchInstruction branche;
		set=liste_goto.keySet();
		iter=set.iterator();
		while(iter.hasNext())
		{
			s=(String)iter.next();
			liste2=(List) liste_goto.get(s);
			assert(liste_label.containsKey(s));
			ih=(InstructionHandle) liste_label.get(s);
			for(i=0;i<liste2.size();i++)
			{
				branche=(BranchInstruction) liste2.get(i);
				branche.setTarget(ih);
			}
		}
	}

	private void ajoute_goto(Map liste_goto, int no_instr, String nom) {
		assert(liste_goto!=null);
		assert(no_instr>=0);
		assert(nom!=null);
		Object o;
		List tmp;
		if(liste_goto.containsKey(nom))
		{
			tmp=(List) liste_goto.get(nom);
			tmp.add(new Integer(no_instr));
		}
		else
		{
			tmp=new Vector();
			tmp.add(new Integer(no_instr));
			liste_goto.put(nom,tmp);
		}
	}
	
	private void ajoute_label(Map liste_label, int no_instr, String nom) {
		assert(liste_label!=null);
		assert(no_instr>=0);
		assert(nom!=null);
		assert(!liste_label.containsKey(nom));
		liste_label.put(nom,new Integer(no_instr));
	}

	private CIType genere_expression(CIExpr expr,GenereJvm genere,Environement env)
	{
		//InstructionHandle debut;
		//LocalVariableGen lg;
		//Type type;
		//ObjectType type2;
		EnvironementGlobal envg;
		CIType res=null;
		assert(expr!=null);
		envg=genere.getEnv();
		//envg=env.envg;
		//factory = new InstructionFactory(mg.cg);
		if(expr instanceof CIExpr_Appel)
		{
			CIExpr_Appel e=(CIExpr_Appel)expr;
		}
		else if(expr instanceof CIExpr_Binaire)
		{
			CIExpr_Binaire e=(CIExpr_Binaire)expr;
			int var_local;
			genere_expression(e.expr1,genere,env);
			genere_expression(e.expr2,genere,env);
			switch(e.op)
			{
			case CIExpr_Binaire.Plus:
				if(envg.simplifie_type(e.expr1.type).nom.equalsIgnoreCase("$integer"))
				{
					//il.append(InstructionConstants.IADD);
					genere.instr_expr(GenereJvm.IADD);
					//conv_top_stack_int(mg, il, env);
					conv_top_stack_int(genere);
					res=type("INTEGER");
					
				}
				else if(envg.simplifie_type(e.expr1.type).nom.equalsIgnoreCase("$real"))
				{
					//il.append(InstructionConstants.FADD);
					genere.instr_expr(GenereJvm.FADD);
					//conv_top_stack_real(mg, il, env);
					conv_top_stack_real(genere);
					res=type("REAL");
				}
				else if(envg.simplifie_type(e.expr1.type).nom.equalsIgnoreCase("$double"))
				{
					//il.append(InstructionConstants.DADD);
					genere.instr_expr(GenereJvm.DADD);
					//conv_top_stack_double(mg, il, env);
					conv_top_stack_double(genere);
					res=type("DOUBLE");
				}
				else
				{
					assert(false);
				}
				break;
			case CIExpr_Binaire.Moins:
				if(envg.simplifie_type(e.expr1.type).nom.equalsIgnoreCase("$integer"))
				{
					//il.append(InstructionConstants.ISUB);
					genere.instr_expr(GenereJvm.ISUB);
					conv_top_stack_int(genere);
					res=type("INTEGER");
				}
				else if(envg.simplifie_type(e.expr1.type).nom.equalsIgnoreCase("$real"))
				{
					//il.append(InstructionConstants.FSUB);
					genere.instr_expr(GenereJvm.FSUB);
					conv_top_stack_real(genere);
					res=type("REAL");
				}
				else if(envg.simplifie_type(e.expr1.type).nom.equalsIgnoreCase("$double"))
				{
					//il.append(InstructionConstants.DSUB);
					genere.instr_expr(GenereJvm.DSUB);
					conv_top_stack_double(genere);
					res=type("DOUBLE");
				}
				else
				{
					assert(false);
				}
				break;
			case CIExpr_Binaire.Fois:
				if(envg.simplifie_type(e.expr1.type).nom.equalsIgnoreCase("$integer"))
				{
					//il.append(InstructionConstants.IMUL);
					genere.instr_expr(GenereJvm.IMUL);
					conv_top_stack_int(genere);
					res=type("INTEGER");
				}
				else if(envg.simplifie_type(e.expr1.type).nom.equalsIgnoreCase("$real"))
				{
					//il.append(InstructionConstants.FMUL);
					genere.instr_expr(GenereJvm.FMUL);
					conv_top_stack_real(genere);
					res=type("REAL");
				}
				else if(envg.simplifie_type(e.expr1.type).nom.equalsIgnoreCase("$double"))
				{
					//il.append(InstructionConstants.DMUL);
					genere.instr_expr(GenereJvm.DMUL);
					conv_top_stack_double(genere);
					res=type("DOUBLE");
				}
				else
				{
					assert(false);
				}
				break;
			case CIExpr_Binaire.Div_entier:
				if(envg.simplifie_type(e.expr1.type).nom.equalsIgnoreCase("$integer"))
				{
					//il.append(InstructionConstants.IDIV);
					genere.instr_expr(GenereJvm.IDIV);
					conv_top_stack_int(genere);
					res=type("INTEGER");
				}
				else if(envg.simplifie_type(e.expr1.type).nom.equalsIgnoreCase("$real"))
				{
					//il.append(InstructionConstants.FDIV);
					genere.instr_expr(GenereJvm.FDIV);
					//il.append(InstructionConstants.F2I);
					genere.instr_expr(GenereJvm.F2I);
					conv_top_stack_int(genere);
					res=type("INTEGER");
				}
				else if(envg.simplifie_type(e.expr1.type).nom.equalsIgnoreCase("$double"))
				{
					//il.append(InstructionConstants.DDIV);
					//il.append(InstructionConstants.D2I);
					genere.instr_expr(GenereJvm.DDIV);
					genere.instr_expr(GenereJvm.D2I);
					conv_top_stack_int(genere);
					res=type("INTEGER");
				}
				else
				{
					assert(false);
				}
				break;
			case CIExpr_Binaire.Div_reel:
				if(envg.simplifie_type(e.expr1.type).nom.equalsIgnoreCase("$integer"))
				{
					//il.append(InstructionConstants.IDIV);
					//il.append(InstructionConstants.I2D);
					genere.instr_expr(GenereJvm.IDIV);
					genere.instr_expr(GenereJvm.I2D);
					conv_top_stack_double(genere);
					res=type("DOUBLE");
				}
				else if(envg.simplifie_type(e.expr1.type).nom.equalsIgnoreCase("$real"))
				{
					//il.append(InstructionConstants.FDIV);
					genere.instr_expr(GenereJvm.FDIV);
					conv_top_stack_double(genere);
					res=type("DOUBLE");
				}
				else if(envg.simplifie_type(e.expr1.type).nom.equalsIgnoreCase("$double"))
				{
					//il.append(InstructionConstants.DDIV);
					genere.instr_expr(GenereJvm.DDIV);
					conv_top_stack_double(genere);
					res=type("DOUBLE");
				}
				else
				{
					assert(false);
				}
				break;
			case CIExpr_Binaire.Puiss:
				break;
			case CIExpr_Binaire.Mod:
				if(envg.simplifie_type(e.expr1.type).nom.equalsIgnoreCase("$integer"))
				{
					//il.append(InstructionConstants.IREM);
					genere.instr_expr(GenereJvm.IREM);
					conv_top_stack_int(genere);
					res=type("INTEGER");
				}
				else
				{
					assert(false);
				}
				break;
			case CIExpr_Binaire.Sup:
				{
					//InstructionHandle h1,h2,h3;
					//IfInstruction ifeq=null;
					//GOTO g;
					int src1,dest1;
					int src2,dest2;
					//Instruction ins1;
					if(envg.simplifie_type(e.expr1.type).nom.equalsIgnoreCase("$integer"))
					{
						
					}
					else if(envg.simplifie_type(e.expr1.type).nom.equalsIgnoreCase("$real"))
					{
						//ins1=new FCMPG();
						//il.append(ins1);
						//il.append(InstructionConstants.ICONST_0);
						genere.instr_expr(GenereJvm.FCMPG);
						genere.instr_expr(GenereJvm.ICONST_0);
					}
					else if(envg.simplifie_type(e.expr1.type).nom.equalsIgnoreCase("$double"))
					{
						//ins1=new DCMPG();
						//il.append(ins1);
						//il.append(InstructionConstants.ICONST_0);
						genere.instr_expr(GenereJvm.DCMPG);
						genere.instr_expr(GenereJvm.ICONST_0);
					}
					else
					{
						assert(false);
					}
					/*ifeq=new IF_ICMPGE(null);
					il.append(ifeq);
					il.append(InstructionConstants.ICONST_0);
					g=new GOTO(null);
					il.append(g);
					h1=il.append(InstructionConstants.ICONST_1);
					ifeq.setTarget(h1);
					h2=il.append(InstructionConstants.NOP);
					g.setTarget(h2);*/
					test(genere,GenereJvm.IF_ICMPGE);
					conv_top_stack_bool(genere);
					res=type("BOOLEAN");
				}
				break;
			case CIExpr_Binaire.SupS:
				{
					//InstructionHandle h1,h2,h3;
					//IfInstruction ifeq=null;
					//GOTO g;
					//Instruction ins1;
					int src1,dest1;
					int src2,dest2;
					if(envg.simplifie_type(e.expr1.type).nom.equalsIgnoreCase("$integer"))
					{
						
					}
					else if(envg.simplifie_type(e.expr1.type).nom.equalsIgnoreCase("$real"))
					{
						//ins1=new FCMPG();
						//il.append(ins1);
						//il.append(InstructionConstants.ICONST_0);
						genere.instr_expr(GenereJvm.FCMPG);
						genere.instr_expr(GenereJvm.ICONST_0);
					}
					else if(envg.simplifie_type(e.expr1.type).nom.equalsIgnoreCase("$double"))
					{
						//ins1=new DCMPG();
						//il.append(ins1);
						//il.append(InstructionConstants.ICONST_0);
						genere.instr_expr(GenereJvm.DCMPG);
						genere.instr_expr(GenereJvm.ICONST_0);
					}
					else
					{
						assert(false);
					}
					/*ifeq=new IF_ICMPGT(null);
					il.append(ifeq);
					il.append(InstructionConstants.ICONST_0);
					g=new GOTO(null);
					il.append(g);
					h1=il.append(InstructionConstants.ICONST_1);
					ifeq.setTarget(h1);
					h2=il.append(InstructionConstants.NOP);
					g.setTarget(h2);*/
					test(genere,GenereJvm.IF_ICMPGT);
					conv_top_stack_bool(genere);
					res=type("BOOLEAN");
				}
				break;
			case CIExpr_Binaire.Egal:
				{
					//InstructionHandle h1,h2,h3;
					//IfInstruction ifeq=null;
					//GOTO g;
					//Instruction ins1;
					int src1,dest1;
					int src2,dest2;
					if(envg.simplifie_type(e.expr1.type).nom.equalsIgnoreCase("$integer"))
					{
						
					}
					else if(envg.simplifie_type(e.expr1.type).nom.equalsIgnoreCase("$real"))
					{
						//ins1=new FCMPG();
						//il.append(ins1);
						//il.append(InstructionConstants.ICONST_0);
						genere.instr_expr(GenereJvm.FCMPG);
						genere.instr_expr(GenereJvm.ICONST_0);
					}
					else if(envg.simplifie_type(e.expr1.type).nom.equalsIgnoreCase("$double"))
					{
						//ins1=new DCMPG();
						//il.append(ins1);
						//il.append(InstructionConstants.ICONST_0);
						genere.instr_expr(GenereJvm.DCMPG);
						genere.instr_expr(GenereJvm.ICONST_0);
					}
					else
					{
						assert(false);
					}
					/*ifeq=new IF_ICMPEQ(null);
					il.append(ifeq);
					il.append(InstructionConstants.ICONST_0);
					g=new GOTO(null);
					il.append(g);
					h1=il.append(InstructionConstants.ICONST_1);
					ifeq.setTarget(h1);
					h2=il.append(InstructionConstants.NOP);
					g.setTarget(h2);*/
					test(genere,GenereJvm.IF_ICMPEQ);
					conv_top_stack_bool(genere);
					res=type("BOOLEAN");
				}
				break;
			case CIExpr_Binaire.Inf:
				{
					//InstructionHandle h1,h2,h3;
					//IfInstruction ifeq=null;
					//GOTO g;
					//Instruction ins1;
					int src1,dest1;
					int src2,dest2;
					if(envg.simplifie_type(e.expr1.type).nom.equalsIgnoreCase("$integer"))
					{
						
					}
					else if(envg.simplifie_type(e.expr1.type).nom.equalsIgnoreCase("$real"))
					{
						//ins1=new FCMPG();
						//il.append(ins1);
						//il.append(InstructionConstants.ICONST_0);
						genere.instr_expr(GenereJvm.FCMPG);
						genere.instr_expr(GenereJvm.ICONST_0);
					}
					else if(envg.simplifie_type(e.expr1.type).nom.equalsIgnoreCase("$double"))
					{
						//ins1=new DCMPG();
						//il.append(ins1);
						//il.append(InstructionConstants.ICONST_0);
						genere.instr_expr(GenereJvm.DCMPG);
						genere.instr_expr(GenereJvm.ICONST_0);
					}
					else
					{
						assert(false);
					}
					/*ifeq=new IF_ICMPLE(null);
					il.append(ifeq);
					il.append(InstructionConstants.ICONST_0);
					g=new GOTO(null);
					il.append(g);
					h1=il.append(InstructionConstants.ICONST_1);
					ifeq.setTarget(h1);
					h2=il.append(InstructionConstants.NOP);
					g.setTarget(h2);*/
					test(genere,GenereJvm.IF_ICMPLE);
					conv_top_stack_bool(genere);
					res=type("BOOLEAN");
				}
				break;
			case CIExpr_Binaire.InfS:
				{
					int src1,dest1;
					int src2,dest2;
					if(envg.simplifie_type(e.expr1.type).nom.equalsIgnoreCase("$integer"))
					{
						
					}
					else if(envg.simplifie_type(e.expr1.type).nom.equalsIgnoreCase("$real"))
					{
						genere.instr_expr(GenereJvm.FCMPG);
						genere.instr_expr(GenereJvm.ICONST_0);
					}
					else if(envg.simplifie_type(e.expr1.type).nom.equalsIgnoreCase("$double"))
					{
						genere.instr_expr(GenereJvm.DCMPG);
						genere.instr_expr(GenereJvm.ICONST_0);
					}
					else
					{
						assert(false);
					}
					test(genere,GenereJvm.IF_ICMPGT);
					conv_top_stack_bool(genere);
					res=type("BOOLEAN");
				}
				break;
			case CIExpr_Binaire.Diff:
				{
					Instruction ins1;
					int src1,dest1;
					int src2,dest2;
					if(envg.simplifie_type(e.expr1.type).nom.equalsIgnoreCase("$integer"))
					{
						
					}
					else if(envg.simplifie_type(e.expr1.type).nom.equalsIgnoreCase("$real"))
					{
						genere.instr_expr(GenereJvm.FCMPG);
						genere.instr_expr(GenereJvm.ICONST_0);
					}
					else if(envg.simplifie_type(e.expr1.type).nom.equalsIgnoreCase("$double"))
					{
						genere.instr_expr(GenereJvm.DCMPG);
						genere.instr_expr(GenereJvm.ICONST_0);
					}
					else
					{
						assert(false);
					}
					test(genere,GenereJvm.IF_ICMPNE);
					conv_top_stack_bool(genere);
					res=type("BOOLEAN");
				}
				break;
			case CIExpr_Binaire.And:
				if(envg.simplifie_type(e.expr1.type).nom.equalsIgnoreCase("$boolean"))
				{
					//il.append(InstructionConstants.IAND);
					genere.instr_expr(GenereJvm.IAND);
					conv_top_stack_bool(genere);
					res=type("BOOLEAN");
				}
				else
				{
					assert(false);
				}
				break;
			case CIExpr_Binaire.Or:
				if(envg.simplifie_type(e.expr1.type).nom.equalsIgnoreCase("$boolean"))
				{
					//il.append(InstructionConstants.IOR);
					genere.instr_expr(GenereJvm.IOR);
					conv_top_stack_bool(genere);
					res=type("BOOLEAN");
				}
				else
				{
					assert(false);
				}
				break;
			case CIExpr_Binaire.Xor:
				if(envg.simplifie_type(e.expr1.type).nom.equalsIgnoreCase("$boolean"))
				{
					//il.append(InstructionConstants.IXOR);
					genere.instr_expr(GenereJvm.IXOR);
					conv_top_stack_bool(genere);
					res=type("BOOLEAN");
				}
				else
				{
					assert(false);
				}
				break;
			case CIExpr_Binaire.Implies:
				assert(false);
				break;
			case CIExpr_Binaire.And_Then:
				if(envg.simplifie_type(e.expr1.type).nom.equalsIgnoreCase("$boolean"))
				{
					//il.append(InstructionConstants.IAND);
					genere.instr_expr(GenereJvm.IAND);
					conv_top_stack_bool(genere);
					res=type("BOOLEAN");
				}
				else
				{
					assert(false);
				}
				break;
			case CIExpr_Binaire.Or_Else:
				if(envg.simplifie_type(e.expr1.type).nom.equalsIgnoreCase("$boolean"))
				{
					//il.append(InstructionConstants.IOR);
					genere.instr_expr(GenereJvm.IOR);
					conv_top_stack_bool(genere);
					res=type("BOOLEAN");
				}
				else
				{
					assert(false);
				}
				break;
			default:
				assert(false):"operation binaire "+e.op+" inconnue";
			}
		}
		else if(expr instanceof CIExpr_Bool)
		{
			CIExpr_Bool e=(CIExpr_Bool)expr;
			p2bool(genere,e.bool,0,true);
			res=type("BOOLEAN");
		}
		else if(expr instanceof CIExpr_Char)
		{
			CIExpr_Char e=(CIExpr_Char)expr;
			p2char(genere,e.car,0,true);
			res=type("CHARACTER");
		}
		else if(expr instanceof CIExpr_Creation)
		{
			CIExpr_Creation e=(CIExpr_Creation)expr;
			String type3;
			type3=genere.getEnv().simplifie_type(e.type).nom+"_Imp";
			genere.instr_new(type3);
			genere.instr_expr(GenereJvm.DUP);
			genere.instr_invoke_special(type3, "<init>", null, null);
			if(e.appel!=null)
			{
				genere.instr_expr(GenereJvm.DUP);
				res=genere_expression(e.appel,genere,env);
			}
			else
			{
				res=type(type3);
			}
		}
		else if(expr instanceof CIExpr_Double)
		{
			CIExpr_Double e=(CIExpr_Double)expr;
			p2double(genere,e.dbl,0,true);
			res=type("DOUBLE");
		}
		else if(expr instanceof CIExpr_Entier)
		{
			CIExpr_Entier e=(CIExpr_Entier)expr;
			p2int(genere,e.entier,true);
			res=type("INTEGER");
		}
		else if(expr instanceof CIExpr_Extern)
		{
			CIExpr_Extern e=(CIExpr_Extern)expr;
		}
		else if(expr instanceof CIExpr_Real)
		{
			CIExpr_Real e=(CIExpr_Real)expr;
			p2real(genere,(float)e.real,0,true);
			res=type("REAL");
		}
		else if(expr instanceof CIExpr_String)
		{
			CIExpr_String e=(CIExpr_String)expr;
			String s;
			s=e.str;
			p2string(genere,s,0,true);
			res=type("STRING");
		}
		else if(expr instanceof CIExpr_Type)
		{
			CIExpr_Type e=(CIExpr_Type)expr;
			int var_local;
			genere_expression(e.var,genere,env);
			genere.instr_instanceof(e.type);
			conv_top_stack_bool(genere);
			res=type("BOOLEAN");
		}
		else if(expr instanceof CIExpr_Unaire)
		{
			CIExpr_Unaire e=(CIExpr_Unaire)expr;
			genere_expression(e.expr,genere,env);
			int var_local;
			switch(e.op)
			{
			case CIExpr_Unaire.Plus:
				conv_top_stack_int(genere);
				res=type("INTEGER");
				break;
			case CIExpr_Unaire.Moins:
				genere.instr_expr(GenereJvm.INEG);
				conv_top_stack_int(genere);
				res=type("INTEGER");
				break;
			case CIExpr_Unaire.Conv_E2R:
				genere.instr_expr(GenereJvm.I2F);
				conv_top_stack_real(genere);
				res=type("REAL");
				break;
			case CIExpr_Unaire.Conv_E2D:
				genere.instr_expr(GenereJvm.I2D);
				conv_top_stack_double(genere);
				res=type("DOUBLE");
				break;
			case CIExpr_Unaire.Conv_R2D:
				genere.instr_expr(GenereJvm.F2D);
				conv_top_stack_double(genere);
				res=type("DOUBLE");
				break;
			case CIExpr_Unaire.Not:
				{
				CIType t;
				t=genere_expression(e.expr,genere,env);
				boolean2p(genere);
				test(genere,GenereJvm.IFEQ);
				conv_top_stack_bool(genere);
				res=type("BOOLEAN");
				}
				break;
			case CIExpr_Unaire.Old:
				assert(false):"operation unaire "+e.op+" invalide";
				break;
			case CIExpr_Unaire.Dollard:
				assert(false):"operation unaire "+e.op+" invalide";
				break;
			case CIExpr_Unaire.Conv_D2R:
				genere.instr_expr(GenereJvm.D2F);
				conv_top_stack_real(genere);
				res=type("REAL");
				break;
			case CIExpr_Unaire.Conv_D2E:
				genere.instr_expr(GenereJvm.D2I);
				conv_top_stack_int(genere);
				res=type("INTEGER");
				break;
			case CIExpr_Unaire.Conv_R2E:
				genere.instr_expr(GenereJvm.F2I);
				conv_top_stack_int(genere);
				res=type("INTEGER");
				break;
			case CIExpr_Unaire.Conv_E2C:
				genere.instr_expr(GenereJvm.I2C);
				conv_top_stack_int(genere);
				res=type("CHARACTER");
				break;
			case CIExpr_Unaire.Conv_C2E:
				assert(false):"operation unaire "+e.op+" invalide";
				break;
			default:
				assert(false):"operation unaire "+e.op+" inconnue";
			}
		}
		else if(expr instanceof CIExpr_Var)
		{
			CIExpr_Var e=(CIExpr_Var)expr;
			if(e.nom.equalsIgnoreCase("void")&&false)
			{
				genere.instr_expr(GenereJvm.ACONSTNULL);
				res=type("ANY");
			}
			else
			{
				res=genere_var(genere, e.src,e.nom,env);
				assert(res!=null);
			}
			assert(res!=null);
		}
		else if(expr instanceof CIExpr_Var_Syst)
		{
			CIExpr_Var_Syst e=(CIExpr_Var_Syst)expr;
		}
		else if(expr instanceof CIExpr_Void)
		{
			CIExpr_Void e=(CIExpr_Void)expr;
			genere.instr_expr(GenereJvm.ACONSTNULL);
			res=type("ANY");
		}
		else
		{
			assert(false):"expression inconnue";
		}
		assert(res!=null):expr;
		return res;
	}

	private void test(GenereJvm genere, int op) {
		int src1;
		int dest1;
		int src2;
		int dest2;
		src1=genere.instr_expr(op);
		genere.instr_expr(GenereJvm.ICONST_0);
		src2=genere.instr_expr(GenereJvm.GOTO);
		dest1=genere.instr_expr(GenereJvm.ICONST_1);
		dest2=genere.instr_expr(GenereJvm.NOP);
		genere.set_cible(src1, dest1);
		genere.set_cible(src2, dest2);
	}

	private void conv_top_stack_int(GenereJvm genere) {
		int var_local;
		var_local=genere.ajoute_var_local("res", type("$integer"));
		p2int(genere,var_local,false);
	}

	private void conv_top_stack_real(GenereJvm genere) {
		int var_local;
		var_local=genere.ajoute_var_local("res", type("$real"));
		p2real(genere,0.0f,var_local,false);
	}

	private void conv_top_stack_double(GenereJvm genere) {
		int var_local;
		var_local=genere.ajoute_var_local("res", type("$double"));
		p2double(genere,0.0,var_local,false);
	}

	private void conv_top_stack_bool(GenereJvm genere) {
		int var_local;
		var_local=genere.ajoute_var_local("res", type("$boolean"));
		p2bool(genere,false,var_local,false);
	}

	private void conv_top_stack_char(GenereJvm genere) {
		int var_local;
		var_local=genere.ajoute_var_local("res", type("$character"));
		p2char(genere,' ',var_local,false);
	}

	private void conv_top_stack_string(GenereJvm genere) {
		int var_local;
		var_local=genere.ajoute_var_local("res", type("$string"));
		p2string(genere,"",var_local,false);
	}

	private void p2bool(GenereJvm genere,boolean b,int val,boolean valeur) {
		String type="BOOLEAN_Imp";
		genere.instr_new(type);
		genere.instr_expr(GenereJvm.DUP);
		genere.instr_invoke_special(type, "<init>", null, null);
		genere.instr_expr(GenereJvm.DUP);
		if(valeur)
		{
			genere.instr_iconst((b)?1:0);
		}
		else
		{
			genere.instr_iload(val);
		}
		genere.instr_put_field(type, "$val_bool", type("$boolean"));
	}
	
	private void p2int(GenereJvm genere,int val,boolean valeur) {
		ObjectType type2;
		String type="INTEGER_Imp";
		genere.instr_new(type);
		genere.instr_expr(GenereJvm.DUP);
		genere.instr_invoke_special(type, "<init>", null, null);
		genere.instr_expr(GenereJvm.DUP);
		if(valeur)
		{
			genere.instr_iconst(val);
		}
		else
		{
			genere.instr_iload(val);
		}
		genere.instr_put_field(type, "$val_int", type("$integer"));
	}

	private void p2double(GenereJvm genere,double d,int val,boolean valeur) {
		String type="DOUBLE_Imp";
		genere.instr_new(type);
		genere.instr_expr(GenereJvm.DUP);
		genere.instr_invoke_special(type, "<init>", null, null);
		genere.instr_expr(GenereJvm.DUP);
		if(valeur)
		{
			genere.instr_dconst(d);
		}
		else
		{
			genere.instr_dload(val);
		}
		genere.instr_put_field(type, "$val_double", type("$double"));
	}

	private void p2real(GenereJvm genere,float d,int val,boolean valeur) {
		String type="REAL_Imp";
		genere.instr_new(type);
		genere.instr_expr(GenereJvm.DUP);
		genere.instr_invoke_special(type, "<init>", null, null);
		genere.instr_expr(GenereJvm.DUP);
		if(valeur)
		{
			genere.instr_fconst(d);
		}
		else
		{
			genere.instr_fload(val);
		}
		genere.instr_put_field(type, "$val_real", type("$real"));
	}
	
	private void p2char(GenereJvm genere,char c,int val,boolean valeur) {
		String type="CHARACTER_Imp";
		genere.instr_new(type);
		genere.instr_expr(GenereJvm.DUP);
		genere.instr_invoke_special(type, "<init>", null, null);
		genere.instr_expr(GenereJvm.DUP);
		if(valeur)
		{
			genere.instr_iconst(c);
		}
		else
		{
			genere.instr_iload(val);
		}
		genere.instr_put_field(type, "$val_char", type("$character"));
	}

	private void p2string(GenereJvm genere,String s,int val,boolean valeur) {
		String type="STRING_Imp";
		genere.instr_new(type);
		genere.instr_expr(GenereJvm.DUP);
		genere.instr_invoke_special(type, "<init>", null, null);
		genere.instr_expr(GenereJvm.DUP);
		if(valeur)
		{
			genere.instr_sconst(s);
		}
		else
		{
			genere.instr_aload(val);
		}
		genere.instr_put_field(type, "$val_string", type("$string"));
	}
	
	private void int2p(GenereJvm genere) {
		genere.instr_invoke_interface("INTEGER", "$val_int", type("$integer"), null);
		
	}

	private void boolean2p(GenereJvm genere) {
		genere.instr_cast(type("BOOLEAN"), type("BOOLEAN_Imp"));
		genere.instr_get_field(type("BOOLEAN"), "$val_bool", type("$boolean"));
	}

	private void real2p(GenereJvm genere) {
		genere.instr_invoke_interface("REAL", "$val_real", type("$real"), null);
	}

	private void double2p(GenereJvm genere) {
		genere.instr_invoke_interface("DOUBLE", "$val_double", type("$double"), null);
	}

	private void char2p(GenereJvm genere) {
		genere.instr_invoke_interface("BOOLEAN", "$val_char", type("$character"), null);
	}
	
	private CIType genere_var(GenereJvm genere,
			String source,String nom,Environement env) {
		int type_var,no_local;
		CIDeclare_Var d,d2;
		CITypeSimple classe_appel;
		CIType res=null,res3;
		CITypeSimple res2=null;
		CIClasse cl;
		CIAttribut attr;
		if(source!=null)
			type_var=env.type_var(source);
		else
			type_var=env.type_var(nom);
		switch(type_var)
		{
		case Environement.VAR_ATTR:
			if(source==null)
			{
				//il.append(InstructionConstants.ALOAD_0);
				genere.instr_aload(0);
				classe_appel=env.routine.classe.nom;
				d=env.donne_var(nom);
			}
			else
			{
				d=env.donne_var(source);
				classe_appel=genere.getEnv().simplifie_type(d.type);
			}
			res=d.type;
			genere.instr_invoke_interface(classe_appel.nom, nom, res, null);
			assert(res!=null);
			break;
		case Environement.VAR_LOCAL:
		case Environement.VAR_PARAM:
		case Environement.VAR_RETOUR:
			if(source==null)
			{
				d=env.donne_var(nom);
				no_local=env.donne_no(nom);
				assert(no_local>0):"no de variable local invalide:"+no_local;
				res=d.type;
				genere.instr_load(res, no_local);
				assert(res!=null);
			}
			else
			{
				d=env.donne_var(source);
				no_local=env.donne_no(source);
				if(no_local<=0)
				{
					System.out.println("Trouve");
				}
				assert(no_local>0):"no de variable local source invalide:"+no_local+":"+source+"("+env.cl.nom+")";
				cl=genere.getEnv().donne_classe(d.type);
				attr=cl.donne_attribut(nom);
				res=attr.retour;
				genere.instr_load(d.type, no_local);
				res2=type(genere.getEnv().nom_classe(genere.getEnv().simplifie_type(d.type)));
				genere.instr_cast(d.type, res2);
				d2=env.donne_var(source);
				if(attr.est_routine())
				{
					genere.instr_invoke_interface(res2.nom, nom, attr.retour, null);
				}
				else
				{// c'est une variable
					genere.instr_get_field(res2, nom, attr.retour);
				}
				assert(res!=null);
			}
			break;
		default:
			assert(false):"type de variable inconnue pour la varieble "+nom+" dans l'environnement "+env;
			break;
		}
		assert(res!=null);
		return res;
	}

	//************************************************
	

	
	//**************************************************************
	
	private void test()
	{
		ClassGen cg = new ClassGen("HelloWorld", "java.lang.Object",
				"<generated>", Constants.ACC_PUBLIC | Constants.ACC_SUPER,
				null);
		ConstantPoolGen cp = cg.getConstantPool(); // cg creates constant pool
		InstructionList il = new InstructionList();
		
		MethodGen  mg = new MethodGen(Constants.ACC_STATIC | Constants.ACC_PUBLIC, // access flags
				Type.VOID,               // return type
				new Type[] {             // argument types
					new ArrayType(Type.STRING, 1) },
				new String[] { "argv" }, // arg names
				"main", "HelloWorld",    // method, class
				il, cp);
		InstructionFactory factory = new InstructionFactory(cg);
		ObjectType i_stream = new ObjectType("java.io.InputStream");
		ObjectType p_stream = new ObjectType("java.io.PrintStream");
		il.append(factory.createNew("java.io.BufferedReader"));
		il.append(InstructionConstants.DUP); // Use predefined constant
		il.append(factory.createNew("java.io.InputStreamReader"));
		il.append(InstructionConstants.DUP);
		il.append(factory.createFieldAccess("java.lang.System", "in", i_stream,
				Constants.GETSTATIC));
		il.append(factory.createInvoke("java.io.InputStreamReader", "<init>",
				Type.VOID, new Type[] { i_stream }, Constants.INVOKESPECIAL));
		il.append(factory.createInvoke("java.io.BufferedReader", "<init>",
				Type.VOID, new Type[] { new ObjectType("java.io.Reader") },
				Constants.INVOKESPECIAL));

		LocalVariableGen lg = mg.addLocalVariable("in", new ObjectType(
				"java.io.BufferedReader"), null, null);
		int in = lg.getIndex();
		lg.setStart(il.append(new ASTORE(in))); // "i" valid from here
		lg = mg.addLocalVariable("name", Type.STRING, null, null);
		int name = lg.getIndex();
		il.append(InstructionConstants.ACONST_NULL);
		lg.setStart(il.append(new ASTORE(name))); // "name" valid from here
		InstructionHandle try_start =
			il.append(factory.createFieldAccess(
				"java.lang.System", "out", p_stream, Constants.GETSTATIC));

		il.append(new PUSH(cp, "Please enter your name> "));
		il.append(factory.createInvoke("java.io.PrintStream", "print",
			Type.VOID, new Type[] { Type.STRING },
			Constants.INVOKEVIRTUAL));
		il.append(new ALOAD(in));
		il.append(factory.createInvoke("java.io.BufferedReader", "readLine",
				Type.STRING, Type.NO_ARGS, Constants.INVOKEVIRTUAL));
		il.append(new ASTORE(name));
		GOTO g = new GOTO(null);
		InstructionHandle try_end = il.append(g);
		InstructionHandle handler = il.append(InstructionConstants.RETURN);
		mg.addExceptionHandler(try_start, try_end, handler, new ObjectType("java.io.IOException"));
		InstructionHandle ih =
			il.append(factory.createFieldAccess(
				"java.lang.System", "out", p_stream, Constants.GETSTATIC));
		g.setTarget(ih);
		
		il.append(factory.createNew(Type.STRINGBUFFER));
		  il.append(InstructionConstants.DUP);
		il.append(new PUSH(cp, "Hello, "));
		il
				.append(factory.createInvoke("java.lang.StringBuffer",
						"<init>", Type.VOID, new Type[] { Type.STRING },
						Constants.INVOKESPECIAL));
		il.append(new ALOAD(name));
		il.append(factory.createInvoke("java.lang.StringBuffer", "append",
				Type.STRINGBUFFER, new Type[] { Type.STRING },
				Constants.INVOKEVIRTUAL));
		il.append(factory.createInvoke("java.lang.StringBuffer", "toString",
				Type.STRING, Type.NO_ARGS, Constants.INVOKEVIRTUAL));

		il.append(factory.createInvoke("java.io.PrintStream", "println",
						Type.VOID, new Type[] { Type.STRING },
						Constants.INVOKEVIRTUAL));
		il.append(InstructionConstants.RETURN);
		
		mg.setMaxStack();
		cg.addMethod(mg.getMethod());
		il.dispose(); // Allow instruction handles to be reused
		cg.addEmptyConstructor(Constants.ACC_PUBLIC);
		try {
		    cg.getJavaClass().dump("e:\\projet\\eiffel\\resultat\\HelloWorld.class");
		    System.out.println("Classe generé avec succes !"); 
		} catch (java.io.IOException e) {
			System.err.println(e);
		}
		logger.info("Traitement fait");
	}
	
	public void test2()
	{
		ClassGen cg = new ClassGen("toto/HelloWorld", "java.lang.Object",
				"<generated>", Constants.ACC_PUBLIC | Constants.ACC_SUPER,
				null);
		ConstantPoolGen cp = cg.getConstantPool(); // cg creates constant pool
		InstructionList il = new InstructionList();
		
		MethodGen  mg = new MethodGen(Constants.ACC_STATIC | Constants.ACC_PUBLIC, // access flags
				Type.VOID,               // return type
				new Type[] {             // argument types
					new ArrayType(Type.STRING, 1) },
				new String[] { "argv" }, // arg names
				"main", "HelloWorld",    // method, class
				il, cp);
		InstructionFactory factory = new InstructionFactory(cg);
		//InstructionList il = new InstructionList();

		il.append(new PUSH(cp, "Hello, world"));
		il.append(new PUSH(cp, 4711));

		il.append(factory.createPrintln("Hello World"));

		il.append(InstructionConstants.RETURN);
		
		mg.setMaxStack();
		cg.addMethod(mg.getMethod());
		il.dispose(); // Allow instruction handles to be reused
		cg.addEmptyConstructor(Constants.ACC_PUBLIC);
		try {
			cg.getJavaClass().dump("e:\\projet\\eiffel\\resultat\\HelloWorld.class");
		    //cg.getJavaClass().
			System.out.println("Classe generé avec succes 2 !"); 
		} catch (java.io.IOException e) {
			System.err.println(e);
		}
		logger.info("Traitement fait2");
	}
	
	public void test3()
	{
		//File f;
		//FileOutputStream f2;
		PrintWriter p;
		//f=new File("e:\\projet\\eiffel\\resultat\\HelloWorld2.jsm");
		try {
			p=new PrintWriter("e:\\projet\\eiffel\\resultat\\HelloWorld2.j");
			p.println("; --- Copyright Jonathan Meyer 1996. All rights reserved. -----------------\n"+
				"; File:      jasmin/examples/HelloWorld.j\n"+
				"; Author:    Jonathan Meyer, 10 July 1996\n"+
				"; Purpose:   Prints out \"Hello World!\"\n"+
				"; -------------------------------------------------------------------------\n"+


				".class public test/HelloWorld2\n"+
				".super java/lang/Object\n"+

				";\n"+
				"; standard initializer\n"+
				".method public <init>()V\n"+
				   "aload_0\n"+
				 
				   "invokenonvirtual java/lang/Object/<init>()V\n"+
				   "return\n"+
				".end method\n"+

				".method public static main([Ljava/lang/String;)V\n"+
				   ".limit stack 2\n"+
				   ".limit locals 2\n"+
				   
				   "bipush 2\n"+
				   "astore 0\n"+
				   "bipush 3\n"+
				   "astore 1\n"+

				   "aload 0\n"+
				   "aload 1\n"+
				   "astore 0\n"+
				   "astore 1\n"+

				  "return\n"+
				".end method\n");
			p.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * .class public HelloWorld
    .super java/lang/Object

    ;
    ; standard initializer (calls java.lang.Object's initializer)
    ;
    .method public <init>()V
       aload_0
       invokenonvirtual java/lang/Object/<init>()V
       return
    .end method

    ;
    ; main() - prints out Hello World
    ;
    .method public static main([Ljava/lang/String;)V
       .limit stack 2   ; up to two items can be pushed

       ; push System.out onto the stack
       getstatic java/lang/System/out Ljava/io/PrintStream;

       ; push a string onto the stack
       ldc "Hello World!"

       ; call the PrintStream.println() method.
       invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

       ; done
       return
    .end method
	 */
	
	public void test4()
	{
		PrintWriter p;
		try {
			p=new PrintWriter("e:\\projet\\eiffel\\resultat\\HelloWorld.j");
			p.println(".class public HelloWorld\n"+
			    ".super java/lang/Object\n"+
			
			    ";\n"+
			    "; standard initializer (calls java.lang.Object's initializer)\n"+
			    ";\n"+
			    ".method public <init>()V\n"+
			       "aload_0\n"+
			       "invokenonvirtual java/lang/Object/<init>()V\n"+
			       "return\n"+
			    ".end method\n"+
			
			    ";\n"+
			    "; main() - prints out Hello World\n"+
			    ";\n"+
			    ".method public static main([Ljava/lang/String;)V\n"+
			       ".limit stack 2   ; up to two items can be pushed\n"+
			
			       "; push System.out onto the stack\n"+
			       "getstatic java/lang/System/out Ljava/io/PrintStream;\n"+
			
			       "; push a string onto the stack\n"+
			       "ldc \"Hello World!\"\n"+
			
			       "; call the PrintStream.println() method.\n"+
			       "invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V\n"+
			
			       "; done\n"+
			       "return\n"+
			    ".end method");
			p.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
