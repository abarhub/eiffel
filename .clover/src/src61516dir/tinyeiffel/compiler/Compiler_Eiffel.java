/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ */package tinyeiffel.compiler;

import java.io.*;

import antlr.RecognitionException;
import antlr.TokenStreamException;
import antlr.TokenStreamRecognitionException;
import tinyeiffel.ast.*;

import java.util.*;
import tinyeiffel.erreur.*;
import tinyeiffel.lace.*;
import tinyeiffel.middle.Convertion;

import java.util.logging.*;
import tinyeiffel.interpreteur.*;
import tinyeiffel.genere_c.*;
import tinyeiffel.verification.*;
import tinyeiffel.intermediaire.*;

/*
 * a faire: - Loggin
 * - CVS
 */

//coucou
public class Compiler_Eiffel {static class __CLOVER_59_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}
	public Vector liste_classe = new Vector();

	public Vector liste_type = new Vector();

	public boolean table_heritage_directe[][], table_heritage[][];

	public int classes_traite = -1;

	public Logging logging;

	public Context context;

	public Type entier, tab_entier, bool, car, reel, dbl, str;

	public Logger logger,profiler;

	public FileHandler fh,fh2;

	protected boolean initialise;

	public tinyeiffel.intermediaire.CIProgramme programme;
	
	public Vector verifications_classe;
	
	public VerificationsGlobales verif_globale;
		
	private final boolean incremental;

	public Compiler_Eiffel() {__CLOVER_59_0.cloverRec.M[325]++;
		__CLOVER_59_0.cloverRec.S[1796]++;incremental=false;
		__CLOVER_59_0.cloverRec.S[1797]++;logging = new Logging();
		__CLOVER_59_0.cloverRec.S[1798]++;init();
	}

	public Compiler_Eiffel(String nom_fichier) {__CLOVER_59_0.cloverRec.M[326]++;
		__CLOVER_59_0.cloverRec.S[1799]++;incremental=false;
		__CLOVER_59_0.cloverRec.S[1800]++;logging = new Logging();
		__CLOVER_59_0.cloverRec.S[1801]++;init();
		__CLOVER_59_0.cloverRec.S[1802]++;compile(nom_fichier);
	}

	public Compiler_Eiffel(String nom_fichier, int no) {__CLOVER_59_0.cloverRec.M[327]++;
		__CLOVER_59_0.cloverRec.S[1803]++;incremental=false;
		__CLOVER_59_0.cloverRec.S[1804]++;logging = new Logging();
		__CLOVER_59_0.cloverRec.S[1805]++;stop = no;
		__CLOVER_59_0.cloverRec.S[1806]++;init();
		__CLOVER_59_0.cloverRec.S[1807]++;compile(nom_fichier);
	}


	public Compiler_Eiffel(String nom_fichier, int no,boolean incremental) {__CLOVER_59_0.cloverRec.M[328]++;
		__CLOVER_59_0.cloverRec.S[1808]++;this.incremental=incremental;
		__CLOVER_59_0.cloverRec.S[1809]++;logging = new Logging();
		__CLOVER_59_0.cloverRec.S[1810]++;stop = no;
		__CLOVER_59_0.cloverRec.S[1811]++;init();
		__CLOVER_59_0.cloverRec.S[1812]++;compile(nom_fichier);
	}
	
	public Compiler_Eiffel(int no) {__CLOVER_59_0.cloverRec.M[329]++;
		__CLOVER_59_0.cloverRec.S[1813]++;logging = new Logging();
		__CLOVER_59_0.cloverRec.S[1814]++;stop = no;
		__CLOVER_59_0.cloverRec.S[1815]++;incremental=false;
		__CLOVER_59_0.cloverRec.S[1816]++;init();
	}

	//protected boolean no_file=true;
	protected void init() {__CLOVER_59_0.cloverRec.M[330]++;
		assert ((((!initialise)) && (++__CLOVER_59_0.cloverRec.CT[738]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[738]==0&false));
		__CLOVER_59_0.cloverRec.S[1817]++;init_profile();
		__CLOVER_59_0.cloverRec.S[1818]++;init_logger();
		__CLOVER_59_0.cloverRec.S[1819]++;initialise = true;
	}

	/**
	 * 
	 */
	protected void init_logger() {__CLOVER_59_0.cloverRec.M[331]++;
		__CLOVER_59_0.cloverRec.S[1820]++;boolean trouve;
		__CLOVER_59_0.cloverRec.S[1821]++;boolean no_file = false, nouv_tent;
		__CLOVER_59_0.cloverRec.S[1822]++;int nb_tent = -1;
		__CLOVER_59_0.cloverRec.S[1823]++;int nb_tent_max = 2;
		__CLOVER_59_0.cloverRec.S[1824]++;do {{
			__CLOVER_59_0.cloverRec.S[1825]++;nouv_tent = false;
			//no_file=false;
			__CLOVER_59_0.cloverRec.S[1826]++;nb_tent++;
			__CLOVER_59_0.cloverRec.S[1827]++;try {
				__CLOVER_59_0.cloverRec.S[1828]++;logger = Logger.getLogger("tinyeiffel.compiler");
				__CLOVER_59_0.cloverRec.S[1829]++;if ((((!no_file) && (++__CLOVER_59_0.cloverRec.CT[739]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[739]==0&false))) {{
					__CLOVER_59_0.cloverRec.S[1830]++;Handler liste[]=logger.getHandlers();
					__CLOVER_59_0.cloverRec.S[1831]++;trouve=false;
					__CLOVER_59_0.cloverRec.S[1832]++;if((((liste!=null&&liste.length>0) && (++__CLOVER_59_0.cloverRec.CT[740]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[740]==0&false)))
					{{
						__CLOVER_59_0.cloverRec.S[1833]++;int i;
						__CLOVER_59_0.cloverRec.S[1834]++;for(i=0;(((i<liste.length) && (++__CLOVER_59_0.cloverRec.CT[741]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[741]==0&false));i++)
						{{
							__CLOVER_59_0.cloverRec.S[1835]++;if((((liste[i]==fh) && (++__CLOVER_59_0.cloverRec.CT[742]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[742]==0&false)))
							{{
								__CLOVER_59_0.cloverRec.S[1836]++;trouve=true;
								__CLOVER_59_0.cloverRec.S[1837]++;break;
							}
						}}
					}}
					//System.out.println("coucou");
					//assert(false);
					}__CLOVER_59_0.cloverRec.S[1838]++;if((((!trouve) && (++__CLOVER_59_0.cloverRec.CT[743]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[743]==0&false)))
					{{
						__CLOVER_59_0.cloverRec.S[1839]++;if ((((nb_tent < nb_tent_max - 1) && (++__CLOVER_59_0.cloverRec.CT[744]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[744]==0&false)))
						{{
							//fh = new FileHandler("compiler_eiffel_log.xml",);
							__CLOVER_59_0.cloverRec.S[1840]++;fh = new FileHandler("compiler_eiffel_log.xml",0,1);
						}
						}else
						{{
							assert((((false)) && (++__CLOVER_59_0.cloverRec.CT[745]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[745]==0&false));
							__CLOVER_59_0.cloverRec.S[1841]++;fh = new FileHandler();
						}
						}__CLOVER_59_0.cloverRec.S[1842]++;logger.addHandler(fh);
					}
				}}
				// Request that every detail gets logged.
				}__CLOVER_59_0.cloverRec.S[1843]++;logger.setLevel(Level.ALL);
				// Log a simple INFO message.
				__CLOVER_59_0.cloverRec.S[1844]++;logger.info("Logger initialis\u00e9");
			} catch (SecurityException e) {
				__CLOVER_59_0.cloverRec.S[1845]++;e.printStackTrace();
				assert ((((false)) && (++__CLOVER_59_0.cloverRec.CT[746]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[746]==0&false));
			} catch (IOException e) {
				__CLOVER_59_0.cloverRec.S[1846]++;long debut, fin;
				__CLOVER_59_0.cloverRec.S[1847]++;Handler liste[], h;
				__CLOVER_59_0.cloverRec.S[1848]++;e.printStackTrace();
				assert((((false)) && (++__CLOVER_59_0.cloverRec.CT[747]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[747]==0&false)):e;
				assert ((((nb_tent < nb_tent_max)) && (++__CLOVER_59_0.cloverRec.CT[748]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[748]==0&false));
				__CLOVER_59_0.cloverRec.S[1849]++;nouv_tent = true;
				__CLOVER_59_0.cloverRec.S[1850]++;no_file = true;
				__CLOVER_59_0.cloverRec.S[1851]++;liste = logger.getHandlers();
				__CLOVER_59_0.cloverRec.S[1852]++;if ((((liste != null) && (++__CLOVER_59_0.cloverRec.CT[749]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[749]==0&false))) {{
					__CLOVER_59_0.cloverRec.S[1853]++;for (int i = 0; (((i < liste.length) && (++__CLOVER_59_0.cloverRec.CT[750]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[750]==0&false)); i++) {{
						__CLOVER_59_0.cloverRec.S[1854]++;h = liste[i];
						assert ((((h != null)) && (++__CLOVER_59_0.cloverRec.CT[751]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[751]==0&false));
						__CLOVER_59_0.cloverRec.S[1855]++;logger.removeHandler(h);
						__CLOVER_59_0.cloverRec.S[1856]++;h.close();
					}
				}}
				}__CLOVER_59_0.cloverRec.S[1857]++;debut = System.currentTimeMillis();
				__CLOVER_59_0.cloverRec.S[1858]++;do {{
					__CLOVER_59_0.cloverRec.S[1859]++;fin = System.currentTimeMillis();
				} }while ((((debut + 1 * 100 > fin) && (++__CLOVER_59_0.cloverRec.CT[752]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[752]==0&false)));
			}
		} }while ((((nouv_tent && nb_tent < nb_tent_max - 1) && (++__CLOVER_59_0.cloverRec.CT[753]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[753]==0&false)));
		assert ((((nb_tent < nb_tent_max && !nouv_tent) ) && (++__CLOVER_59_0.cloverRec.CT[754]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[754]==0&false)): "nb_tent=" + nb_tent
				+ ";nouv_tent=" + nouv_tent;
	}

	protected void init_profile()
	{__CLOVER_59_0.cloverRec.M[332]++;
		__CLOVER_59_0.cloverRec.S[1860]++;try{
			__CLOVER_59_0.cloverRec.S[1861]++;profiler=Logger.getLogger("tinyeiffel.profiler");
			__CLOVER_59_0.cloverRec.S[1862]++;fh2 = new FileHandler("compiler_eiffel_prof.xml",0,1);
			__CLOVER_59_0.cloverRec.S[1863]++;profiler.addHandler(fh2);
			//profiler.setLevel(Level.OFF);
		} catch(IOException e)
		{
			__CLOVER_59_0.cloverRec.S[1864]++;System.err.println("Exception:"+e);
			__CLOVER_59_0.cloverRec.S[1865]++;e.printStackTrace();
			assert((((false)) && (++__CLOVER_59_0.cloverRec.CT[755]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[755]==0&false)):e;
		}
	}
	
	public void termine() {__CLOVER_59_0.cloverRec.M[333]++;
		assert ((((initialise)) && (++__CLOVER_59_0.cloverRec.CT[756]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[756]==0&false));
		__CLOVER_59_0.cloverRec.S[1866]++;termine_logger();
		__CLOVER_59_0.cloverRec.S[1867]++;termine_profile();
		__CLOVER_59_0.cloverRec.S[1868]++;initialise = false;
		assert ((((!initialise)) && (++__CLOVER_59_0.cloverRec.CT[757]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[757]==0&false));
	}

	/**
	 * 
	 */
	protected void termine_logger() {__CLOVER_59_0.cloverRec.M[334]++;
		__CLOVER_59_0.cloverRec.S[1869]++;if ((((fh != null) && (++__CLOVER_59_0.cloverRec.CT[758]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[758]==0&false))) {{
			__CLOVER_59_0.cloverRec.S[1870]++;logger.removeHandler(fh);
			__CLOVER_59_0.cloverRec.S[1871]++;fh.close();
		}
		}__CLOVER_59_0.cloverRec.S[1872]++;logger = null;
		__CLOVER_59_0.cloverRec.S[1873]++;fh = null;
	}

	protected void termine_profile()
	{__CLOVER_59_0.cloverRec.M[335]++;
		__CLOVER_59_0.cloverRec.S[1874]++;if ((((fh2 != null) && (++__CLOVER_59_0.cloverRec.CT[759]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[759]==0&false))) {{
			__CLOVER_59_0.cloverRec.S[1875]++;profiler.info("fin "+info_mem());
			__CLOVER_59_0.cloverRec.S[1876]++;profiler.removeHandler(fh2);
			__CLOVER_59_0.cloverRec.S[1877]++;fh2.close();
		}
		}__CLOVER_59_0.cloverRec.S[1878]++;profiler = null;
		__CLOVER_59_0.cloverRec.S[1879]++;fh2 = null;
	}
	
	protected int stop;

	public static final int apres_context = 1, code_interm = 2, exec_prog = 3,
			genere_c = 4,convert=5;

	public int compile(String nom_fichier) {__CLOVER_59_0.cloverRec.M[336]++;
		__CLOVER_59_0.cloverRec.S[1880]++;Type t;
		__CLOVER_59_0.cloverRec.S[1881]++;Classe c;

		__CLOVER_59_0.cloverRec.S[1882]++;try {
			//assert(false);
			__CLOVER_59_0.cloverRec.S[1883]++;profiler.info("Compilation de "+nom_fichier+" "+info_mem());
			__CLOVER_59_0.cloverRec.S[1884]++;verif_globale=new VerificationsGlobales(logging);
			__CLOVER_59_0.cloverRec.S[1885]++;System.out.println("Compilation de " + nom_fichier);
			__CLOVER_59_0.cloverRec.S[1886]++;logger.info("Compilation de " + nom_fichier);
			__CLOVER_59_0.cloverRec.S[1887]++;configure(nom_fichier);
			__CLOVER_59_0.cloverRec.S[1888]++;profiler.info("configuration lue "+info_mem());
			__CLOVER_59_0.cloverRec.S[1889]++;if((((configuration==null) && (++__CLOVER_59_0.cloverRec.CT[760]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[760]==0&false)))
			{{
				__CLOVER_59_0.cloverRec.S[1890]++;logging.erreur(new ErreurSource("Erreur dans le fichier Ace",1,1,nom_fichier));
			}
			}__CLOVER_59_0.cloverRec.S[1891]++;if ((((nb_erreur() > 0) && (++__CLOVER_59_0.cloverRec.CT[761]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[761]==0&false))) {{
				__CLOVER_59_0.cloverRec.S[1892]++;logging.affiche();
				__CLOVER_59_0.cloverRec.S[1893]++;termine();
				//if(c==null)
				__CLOVER_59_0.cloverRec.S[1894]++;return nb_erreur();
			}
			}__CLOVER_59_0.cloverRec.S[1895]++;entier = new TypeSimple(false, "integer", new Vector());
			{
				__CLOVER_59_0.cloverRec.S[1896]++;Vector v = new Vector();
				__CLOVER_59_0.cloverRec.S[1897]++;v.add(new TypeSimple(false, "integer", new Vector()));
				__CLOVER_59_0.cloverRec.S[1898]++;tab_entier = new TypeSimple(false, "array", v);
			}
			__CLOVER_59_0.cloverRec.S[1899]++;bool = new TypeSimple(false, "boolean", new Vector());
			__CLOVER_59_0.cloverRec.S[1900]++;car = new TypeSimple(false, "character", new Vector());
			__CLOVER_59_0.cloverRec.S[1901]++;reel = new TypeSimple(false, "real", new Vector());
			__CLOVER_59_0.cloverRec.S[1902]++;dbl = new TypeSimple(false, "double", new Vector());
			__CLOVER_59_0.cloverRec.S[1903]++;str = new TypeSimple(false, "string", new Vector());
			__CLOVER_59_0.cloverRec.S[1904]++;verifications_classe=new Vector();
			// parsing de la classe racine
			__CLOVER_59_0.cloverRec.S[1905]++;profiler.info("Parsing de "+configuration.nom_classe.nom+" ...");
			__CLOVER_59_0.cloverRec.S[1906]++;c = parse_file(/* nom_fichier */configuration.nom_classe.nom + ".e");
			__CLOVER_59_0.cloverRec.S[1907]++;profiler.info("parsing fait "+info_mem());
			//System.out.println("Suite");
			__CLOVER_59_0.cloverRec.S[1908]++;if ((((nb_erreur() > 0) && (++__CLOVER_59_0.cloverRec.CT[762]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[762]==0&false))) {{
				__CLOVER_59_0.cloverRec.S[1909]++;logging.affiche();
				__CLOVER_59_0.cloverRec.S[1910]++;termine();
				//if(c==null)
				__CLOVER_59_0.cloverRec.S[1911]++;return nb_erreur();
			}
			}__CLOVER_59_0.cloverRec.S[1912]++;liste_classe.addElement(c);
			__CLOVER_59_0.cloverRec.S[1913]++;ajoute_type(c.liste_classe);
			__CLOVER_59_0.cloverRec.S[1914]++;verifie_classe(c);
			// parsing de ANY
			__CLOVER_59_0.cloverRec.S[1915]++;profiler.info("Parsing de any ...");
			__CLOVER_59_0.cloverRec.S[1916]++;c = parse_file("any.e");
			__CLOVER_59_0.cloverRec.S[1917]++;profiler.info("parsing fait "+info_mem());
			__CLOVER_59_0.cloverRec.S[1918]++;if ((((c == null) && (++__CLOVER_59_0.cloverRec.CT[763]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[763]==0&false))) {{
				__CLOVER_59_0.cloverRec.S[1919]++;logging.erreur(new ErreurVHAY());
			}
			}__CLOVER_59_0.cloverRec.S[1920]++;if ((((nb_erreur() > 0) && (++__CLOVER_59_0.cloverRec.CT[764]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[764]==0&false))) {{
				__CLOVER_59_0.cloverRec.S[1921]++;logging.affiche();
				__CLOVER_59_0.cloverRec.S[1922]++;termine();
				//if(c==null)
				__CLOVER_59_0.cloverRec.S[1923]++;return nb_erreur();
			}
			}__CLOVER_59_0.cloverRec.S[1924]++;liste_classe.addElement(c);
			__CLOVER_59_0.cloverRec.S[1925]++;ajoute_type(c.liste_classe);
			__CLOVER_59_0.cloverRec.S[1926]++;verifie_classe(c);
			// creation de NONE
			__CLOVER_59_0.cloverRec.S[1927]++;c = new Classe(false, false, new TypeSimple(false, "NONE", null),
					new Vector(), null, null, null, null, null, null);
			__CLOVER_59_0.cloverRec.S[1928]++;liste_classe.addElement(c);
	
			// parsing de toutes les classes de l'univers
			__CLOVER_59_0.cloverRec.S[1929]++;int i;
			__CLOVER_59_0.cloverRec.S[1930]++;for (i = 0; (((i < liste_type.size()) && (++__CLOVER_59_0.cloverRec.CT[765]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[765]==0&false)); i++) {{
				__CLOVER_59_0.cloverRec.S[1931]++;t = (Type) liste_type.elementAt(i);
				__CLOVER_59_0.cloverRec.S[1932]++;if ((((t.nom.compareToIgnoreCase("any") != 0
						&& t.nom.compareToIgnoreCase("none") != 0) && (++__CLOVER_59_0.cloverRec.CT[766]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[766]==0&false))) {{
					__CLOVER_59_0.cloverRec.S[1933]++;boolean trouve = false;
					__CLOVER_59_0.cloverRec.S[1934]++;for (int j = 0; (((j < liste_classe.size() && !trouve) && (++__CLOVER_59_0.cloverRec.CT[767]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[767]==0&false)); j++) {{
						__CLOVER_59_0.cloverRec.S[1935]++;Classe c1 = (Classe) liste_classe.elementAt(j);
						assert ((((c1 != null)) && (++__CLOVER_59_0.cloverRec.CT[768]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[768]==0&false));
						__CLOVER_59_0.cloverRec.S[1936]++;if ((((c1.nom.compareToIgnoreCase(t.nom) == 0) && (++__CLOVER_59_0.cloverRec.CT[769]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[769]==0&false)))
							{__CLOVER_59_0.cloverRec.S[1937]++;trouve = true;
					}}
					}__CLOVER_59_0.cloverRec.S[1938]++;if ((((!trouve) && (++__CLOVER_59_0.cloverRec.CT[770]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[770]==0&false))) {{
						__CLOVER_59_0.cloverRec.S[1939]++;profiler.info("Parsing de "+t.nom+" ...");
						__CLOVER_59_0.cloverRec.S[1940]++;c = parse_file(t.nom + ".e");
						__CLOVER_59_0.cloverRec.S[1941]++;profiler.info("parsing fait "+info_mem());
						__CLOVER_59_0.cloverRec.S[1942]++;System.out.println("fin du parsing");
						__CLOVER_59_0.cloverRec.S[1943]++;if ((((nb_erreur() > 0) && (++__CLOVER_59_0.cloverRec.CT[771]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[771]==0&false))) {{
							__CLOVER_59_0.cloverRec.S[1944]++;logging.affiche();
							//if(c==null)
							__CLOVER_59_0.cloverRec.S[1945]++;termine();
							__CLOVER_59_0.cloverRec.S[1946]++;return nb_erreur();
						}
						}__CLOVER_59_0.cloverRec.S[1947]++;if ((((c != null) && (++__CLOVER_59_0.cloverRec.CT[772]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[772]==0&false))) {{
							__CLOVER_59_0.cloverRec.S[1948]++;liste_classe.addElement(c);
							__CLOVER_59_0.cloverRec.S[1949]++;ajoute_type(c.liste_classe);
							__CLOVER_59_0.cloverRec.S[1950]++;verifie_classe(c);
						}
					}}
				}}
			}}
			}__CLOVER_59_0.cloverRec.S[1951]++;profiler.info("Fin des parsing "+info_mem());
			// affichage de toutes les classes
			__CLOVER_59_0.cloverRec.S[1952]++;profiler.info("affichage des classes");
			__CLOVER_59_0.cloverRec.S[1953]++;System.out.println("Classes chargees:");
			__CLOVER_59_0.cloverRec.S[1954]++;logger.info("Classes chargees:");
			__CLOVER_59_0.cloverRec.S[1955]++;affiche_classe();
			__CLOVER_59_0.cloverRec.S[1956]++;if ((((nb_erreur() > 0) && (++__CLOVER_59_0.cloverRec.CT[773]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[773]==0&false))) {{
				__CLOVER_59_0.cloverRec.S[1957]++;logging.affiche();
				__CLOVER_59_0.cloverRec.S[1958]++;termine();
				//if(c==null)
				__CLOVER_59_0.cloverRec.S[1959]++;return nb_erreur();
			}
			}__CLOVER_59_0.cloverRec.S[1960]++;profiler.info("Affichage r\u00e9alis\u00e9 "+info_mem());
			__CLOVER_59_0.cloverRec.S[1961]++;if((((incremental) && (++__CLOVER_59_0.cloverRec.CT[774]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[774]==0&false)))
			{{// V\u00e9rifications globales
				__CLOVER_59_0.cloverRec.S[1962]++;profiler.info("V\u00e9rifications Globales...");
				__CLOVER_59_0.cloverRec.S[1963]++;boolean res=complete_verifications();
				__CLOVER_59_0.cloverRec.S[1964]++;profiler.info("Fin des v\u00e9rifications");
				__CLOVER_59_0.cloverRec.S[1965]++;if((((!res) && (++__CLOVER_59_0.cloverRec.CT[775]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[775]==0&false)))
				{{
					__CLOVER_59_0.cloverRec.S[1966]++;if((((nb_erreur() > 0) && (++__CLOVER_59_0.cloverRec.CT[776]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[776]==0&false)))
						{__CLOVER_59_0.cloverRec.S[1967]++;logging.affiche();
					}__CLOVER_59_0.cloverRec.S[1968]++;termine();
					__CLOVER_59_0.cloverRec.S[1969]++;System.out.println("Il y a des erreurs contextuelles.");
					__CLOVER_59_0.cloverRec.S[1970]++;return 1;
				}
				}else
				{{
					__CLOVER_59_0.cloverRec.S[1971]++;System.out.println("Il n'y a pas d'erreur.");
					__CLOVER_59_0.cloverRec.S[1972]++;if((((1==0) && (++__CLOVER_59_0.cloverRec.CT[777]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[777]==0&false)))
					{{
						
					}
					}else
					{{
						__CLOVER_59_0.cloverRec.S[1973]++;return 0;
					}
				}}
			}}
			}__CLOVER_59_0.cloverRec.S[1974]++;profiler.info("1ere annalyse contextuelle ...");
			__CLOVER_59_0.cloverRec.S[1975]++;context = new Context(logging, this);
			__CLOVER_59_0.cloverRec.S[1976]++;env = new Environnement(context);
			// 1ere verification contextuelle des classes :
			// heritage
			__CLOVER_59_0.cloverRec.S[1977]++;context.construit_classes(liste_classe, liste_type);
			__CLOVER_59_0.cloverRec.S[1978]++;table_heritage_directe = context.table_heritage_directe;
			__CLOVER_59_0.cloverRec.S[1979]++;table_heritage = context.table_heritage;
			__CLOVER_59_0.cloverRec.S[1980]++;profiler.info("1ere analyse r\u00e9alis\u00e9e "+info_mem());
			__CLOVER_59_0.cloverRec.S[1981]++;profiler.info("affichage des heritages");
			__CLOVER_59_0.cloverRec.S[1982]++;affiche_heritage_directe();
			__CLOVER_59_0.cloverRec.S[1983]++;affiche_heritage();
			__CLOVER_59_0.cloverRec.S[1984]++;profiler.info("Affichage fait "+info_mem());
	
			__CLOVER_59_0.cloverRec.S[1985]++;if ((((stop == apres_context) && (++__CLOVER_59_0.cloverRec.CT[778]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[778]==0&false))) {{
				__CLOVER_59_0.cloverRec.S[1986]++;termine();
				__CLOVER_59_0.cloverRec.S[1987]++;return nb_erreur();
			}
	
			// 2eme verification contextuelle des classes
			// contenu des features
			}__CLOVER_59_0.cloverRec.S[1988]++;profiler.info("2eme annalyse contextuelle ...");
			__CLOVER_59_0.cloverRec.S[1989]++;int j, k;
			__CLOVER_59_0.cloverRec.S[1990]++;for (i = 0; (((i < liste_classe.size()) && (++__CLOVER_59_0.cloverRec.CT[779]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[779]==0&false)); i++) {{
				__CLOVER_59_0.cloverRec.S[1991]++;c = (Classe) liste_classe.elementAt(i);
				__CLOVER_59_0.cloverRec.S[1992]++;Feature f;
				//context.classe_courante = c;
				__CLOVER_59_0.cloverRec.S[1993]++;Table_Symbol table = context.donne_table_symbol(c);
				__CLOVER_59_0.cloverRec.S[1994]++;env.entre_classe(c, table);
				__CLOVER_59_0.cloverRec.S[1995]++;if ((((i == 0) && (++__CLOVER_59_0.cloverRec.CT[780]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[780]==0&false))) {{// La classe Racine
					__CLOVER_59_0.cloverRec.S[1996]++;if ((((c.type.generique != null && c.type.generique.length > 0) && (++__CLOVER_59_0.cloverRec.CT[781]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[781]==0&false))) {{
						__CLOVER_59_0.cloverRec.S[1997]++;context.erreur(new ErreurVSRC1(c));
					}
					//if()
				}}
				}__CLOVER_59_0.cloverRec.S[1998]++;if ((((c.creation != null && c.creation.length > 0) && (++__CLOVER_59_0.cloverRec.CT[782]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[782]==0&false))) {{
					__CLOVER_59_0.cloverRec.S[1999]++;Creation c1, c2;
					__CLOVER_59_0.cloverRec.S[2000]++;NomFeature nom1, nom2;
					__CLOVER_59_0.cloverRec.S[2001]++;Vector liste = new Vector();
					__CLOVER_59_0.cloverRec.S[2002]++;if ((((c.deferred) && (++__CLOVER_59_0.cloverRec.CT[783]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[783]==0&false))) {{// Erreur VGCP1
						__CLOVER_59_0.cloverRec.S[2003]++;context.erreur(new ErreurVGCP1(c));
					}
					}__CLOVER_59_0.cloverRec.S[2004]++;for (j = 0; (((j < c.creation.length) && (++__CLOVER_59_0.cloverRec.CT[784]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[784]==0&false)); j++) {{
						__CLOVER_59_0.cloverRec.S[2005]++;c1 = c.creation[j];
						__CLOVER_59_0.cloverRec.S[2006]++;if ((((c1.nom_fonction != null) && (++__CLOVER_59_0.cloverRec.CT[785]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[785]==0&false))) {{
							__CLOVER_59_0.cloverRec.S[2007]++;for (k = 0; (((k < c1.nom_fonction.length) && (++__CLOVER_59_0.cloverRec.CT[786]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[786]==0&false)); k++) {{
								__CLOVER_59_0.cloverRec.S[2008]++;nom1 = c1.nom_fonction[k];
								__CLOVER_59_0.cloverRec.S[2009]++;if ((((liste.contains(nom1)) && (++__CLOVER_59_0.cloverRec.CT[787]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[787]==0&false))) {{// erreur VGCP2
									__CLOVER_59_0.cloverRec.S[2010]++;int no = liste.indexOf(nom1);
									__CLOVER_59_0.cloverRec.S[2011]++;context.erreur(new ErreurVGCP2(c, nom1,
											(NomFeature) liste.elementAt(no)));
								} }else {{
									__CLOVER_59_0.cloverRec.S[2012]++;Attribut_Complet ac;
									__CLOVER_59_0.cloverRec.S[2013]++;ac = table.donne_attribut(nom1);
									__CLOVER_59_0.cloverRec.S[2014]++;if ((((ac == null) && (++__CLOVER_59_0.cloverRec.CT[788]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[788]==0&false))) {{// Erreur VGCP3
										__CLOVER_59_0.cloverRec.S[2015]++;context.erreur(new ErreurVGCP3(c, nom1));
									} }else {{
										__CLOVER_59_0.cloverRec.S[2016]++;Feature ft = ac.getFeature();
										__CLOVER_59_0.cloverRec.S[2017]++;if ((((ft instanceof FeatureRoutine
												&& ((FeatureRoutine) ft).once) && (++__CLOVER_59_0.cloverRec.CT[789]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[789]==0&false))) {{
											// Erreur VGCP4
											__CLOVER_59_0.cloverRec.S[2018]++;context.erreur(new ErreurVGCP4(c, nom1,
													ac.getFeature()));
										}
										//Vector v=new Vector();
										//v.add(new Type(false,"integer",new
										// Vector()));
										//Type t1=new Type(false,"array",v);
										}__CLOVER_59_0.cloverRec.S[2019]++;if ((((i == 0
												&& (ft.param != null && (ft.param.length > 1 || (ft.param.length == 1 && !ft.param[0].type
														.egaux(tab_entier))))) && (++__CLOVER_59_0.cloverRec.CT[790]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[790]==0&false))) {{// Erreur
																				// VSRC2
											__CLOVER_59_0.cloverRec.S[2020]++;context.erreur(new ErreurVSRC2(c, nom1,
													ft));
										}
									}}
									}__CLOVER_59_0.cloverRec.S[2021]++;liste.addElement(nom1);
								}
							}}
						}}
					}}
					}__CLOVER_59_0.cloverRec.S[2022]++;if ((((c.expanded) && (++__CLOVER_59_0.cloverRec.CT[791]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[791]==0&false))) {{
						__CLOVER_59_0.cloverRec.S[2023]++;if ((((liste.size() > 1) && (++__CLOVER_59_0.cloverRec.CT[792]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[792]==0&false))) {{// Erreur VGCP5
							__CLOVER_59_0.cloverRec.S[2024]++;context.erreur(new ErreurVGCP5(c));
						} }else {{
							__CLOVER_59_0.cloverRec.S[2025]++;Attribut_Complet ac = table
									.donne_attribut(c.creation[0].nom_fonction[0]);
							__CLOVER_59_0.cloverRec.S[2026]++;Feature ft = ac.getFeature();
							__CLOVER_59_0.cloverRec.S[2027]++;if ((((ft.param != null && ft.param.length > 0) && (++__CLOVER_59_0.cloverRec.CT[793]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[793]==0&false))) {{// Erreur
																		  // VGCP5
								__CLOVER_59_0.cloverRec.S[2028]++;context.erreur(new ErreurVGCP5(c,
										c.creation[0].nom_fonction[0], ft));
							}
						}}
					}}
				}}
				}__CLOVER_59_0.cloverRec.S[2029]++;if ((((c.feature != null) && (++__CLOVER_59_0.cloverRec.CT[794]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[794]==0&false))) {{
					__CLOVER_59_0.cloverRec.S[2030]++;for (j = 0; (((j < c.feature.length) && (++__CLOVER_59_0.cloverRec.CT[795]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[795]==0&false)); j++) {{
						__CLOVER_59_0.cloverRec.S[2031]++;f = c.feature[j];
						//context.feature_courante = f;
						__CLOVER_59_0.cloverRec.S[2032]++;env.entre_feature(f);
						__CLOVER_59_0.cloverRec.S[2033]++;verifie_feature(context);
						__CLOVER_59_0.cloverRec.S[2034]++;env.sort_feature();
					}
				}}
				}__CLOVER_59_0.cloverRec.S[2035]++;env.entre_invariant();
				__CLOVER_59_0.cloverRec.S[2036]++;verifie_liste_assertion(c, null, c.invariant, dans_invariant);
				__CLOVER_59_0.cloverRec.S[2037]++;env.sort_invariant();
				__CLOVER_59_0.cloverRec.S[2038]++;env.sort_classe();
			}
			}__CLOVER_59_0.cloverRec.S[2039]++;profiler.info("2eme analyse r\u00e9alis\u00e9e "+info_mem());
			__CLOVER_59_0.cloverRec.S[2040]++;profiler.info("Affichage de la table des symbols");
			__CLOVER_59_0.cloverRec.S[2041]++;context.affiche_table_symbol();
			__CLOVER_59_0.cloverRec.S[2042]++;profiler.info("Affichage fait "+info_mem());
	
			__CLOVER_59_0.cloverRec.S[2043]++;System.out.println("Compilation du fichier " + nom_fichier);
			__CLOVER_59_0.cloverRec.S[2044]++;logger.info("Compilation du fichier " + nom_fichier);
			__CLOVER_59_0.cloverRec.S[2045]++;if ((((nb_erreur() > 0) && (++__CLOVER_59_0.cloverRec.CT[796]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[796]==0&false))) {{
				__CLOVER_59_0.cloverRec.S[2046]++;logging.affiche();
			} }else {{
				//logging.affiche();
				__CLOVER_59_0.cloverRec.S[2047]++;if ((((stop == code_interm) && (++__CLOVER_59_0.cloverRec.CT[797]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[797]==0&false))) {{// generation du code intermediaire
					__CLOVER_59_0.cloverRec.S[2048]++;tinyeiffel.intermediaire.CIProgramme p;
					__CLOVER_59_0.cloverRec.S[2049]++;Convertie_Interm conv;
					__CLOVER_59_0.cloverRec.S[2050]++;profiler.info("conversion code intermediaire..."+info_mem());
					__CLOVER_59_0.cloverRec.S[2051]++;conv = new Convertie_Interm(this);
					__CLOVER_59_0.cloverRec.S[2052]++;p = conv.convertie();
					__CLOVER_59_0.cloverRec.S[2053]++;profiler.info("Conversion faite "+info_mem());
					__CLOVER_59_0.cloverRec.S[2054]++;conv=null;
					__CLOVER_59_0.cloverRec.S[2055]++;System.gc();
					__CLOVER_59_0.cloverRec.S[2056]++;profiler.info("Liberation de l'objet conversion fait "+info_mem());
					__CLOVER_59_0.cloverRec.S[2057]++;System.out.println("coucou");
					__CLOVER_59_0.cloverRec.S[2058]++;System.out.println("R\u00e9sultat:");
					__CLOVER_59_0.cloverRec.S[2059]++;logger.info("R\u00e9sultat:");
					//p.affiche(System.out);
					__CLOVER_59_0.cloverRec.S[2060]++;try {
						__CLOVER_59_0.cloverRec.S[2061]++;profiler.info("generation du fichier de code intermediaire...");
						__CLOVER_59_0.cloverRec.S[2062]++;FileOutputStream out;
						__CLOVER_59_0.cloverRec.S[2063]++;out = new FileOutputStream("resultat.txt");
						__CLOVER_59_0.cloverRec.S[2064]++;PrintStream stream = new PrintStream(out);
						__CLOVER_59_0.cloverRec.S[2065]++;p.affiche(stream);
						__CLOVER_59_0.cloverRec.S[2066]++;stream.close();
						__CLOVER_59_0.cloverRec.S[2067]++;String nom_sortie = get_nom_sortie();
						__CLOVER_59_0.cloverRec.S[2068]++;out = new FileOutputStream(nom_sortie);
						__CLOVER_59_0.cloverRec.S[2069]++;stream = new PrintStream(out);
						__CLOVER_59_0.cloverRec.S[2070]++;p.toXML(stream);
						__CLOVER_59_0.cloverRec.S[2071]++;stream.close();
						__CLOVER_59_0.cloverRec.S[2072]++;profiler.info("G\u00e9n\u00e9ration faite "+info_mem());
						//System.gc();
						__CLOVER_59_0.cloverRec.S[2073]++;programme = p;
						__CLOVER_59_0.cloverRec.S[2074]++;if(true)
						{{
							__CLOVER_59_0.cloverRec.S[2075]++;CIVerification v;
							__CLOVER_59_0.cloverRec.S[2076]++;v=new CIVerification(programme);
							__CLOVER_59_0.cloverRec.S[2077]++;if((((v.verification()) && (++__CLOVER_59_0.cloverRec.CT[798]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[798]==0&false)))
							{{
								__CLOVER_59_0.cloverRec.S[2078]++;logger.info("Code intermediaire Ok");
								__CLOVER_59_0.cloverRec.S[2079]++;System.out.println("Code intermediaire Ok");
							}
							}else
							{{
								__CLOVER_59_0.cloverRec.S[2080]++;logger.info("Erreur dans le code intermediaire !!!");
								__CLOVER_59_0.cloverRec.S[2081]++;System.out.println("Erreur dans le code intermediaire !!!");
								__CLOVER_59_0.cloverRec.S[2082]++;context.erreur(new ErreurIntermediaire(
										"Erreur dans le code intermediaire:"+
										v.message_erreur()));
							}
						}}
						}__CLOVER_59_0.cloverRec.S[2083]++;if(false)
						{{// test du code g\u00e9n\u00e9r\u00e9
							// Attention : OutOfMemory avec GenereClassTest
							__CLOVER_59_0.cloverRec.S[2084]++;File f;
							__CLOVER_59_0.cloverRec.S[2085]++;f=new File(nom_sortie);
							assert((((f.exists())) && (++__CLOVER_59_0.cloverRec.CT[799]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[799]==0&false));
							assert((((f.length()>0)) && (++__CLOVER_59_0.cloverRec.CT[800]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[800]==0&false));
							// liberation de la memoire
							__CLOVER_59_0.cloverRec.S[2086]++;profiler.info("Vidage memoire avant tests... "+info_mem());
							__CLOVER_59_0.cloverRec.S[2087]++;stream=null;
							__CLOVER_59_0.cloverRec.S[2088]++;out=null;
							__CLOVER_59_0.cloverRec.S[2089]++;liste_classe=null;
							__CLOVER_59_0.cloverRec.S[2090]++;context=null;
							__CLOVER_59_0.cloverRec.S[2091]++;this.env=null;
							__CLOVER_59_0.cloverRec.S[2092]++;this.liste_type=null;
							__CLOVER_59_0.cloverRec.S[2093]++;this.table_heritage=null;
							__CLOVER_59_0.cloverRec.S[2094]++;this.table_heritage_directe=null;
							__CLOVER_59_0.cloverRec.S[2095]++;conv=null;
							//p=null;  // le programme sous forme intermediaire
							__CLOVER_59_0.cloverRec.S[2096]++;System.gc();
							__CLOVER_59_0.cloverRec.S[2097]++;profiler.info("Vidage memoire avant tests fait "+info_mem());
							// test
							__CLOVER_59_0.cloverRec.S[2098]++;System.gc();
							__CLOVER_59_0.cloverRec.S[2099]++;profiler.info("test du fichier g\u00e9n\u00e9r\u00e9...");
							__CLOVER_59_0.cloverRec.S[2100]++;tinyeiffel.intermediaire.CIInputXML inp;
							__CLOVER_59_0.cloverRec.S[2101]++;profiler.info("Parsing XML de "+nom_sortie+" ... "+info_mem());
							__CLOVER_59_0.cloverRec.S[2102]++;inp = new /*tinyeiffel.intermediaire.*/CIInputXML(nom_sortie);
							__CLOVER_59_0.cloverRec.S[2103]++;profiler.info("Fin du parsing "+info_mem());
							__CLOVER_59_0.cloverRec.S[2104]++;System.gc();
							__CLOVER_59_0.cloverRec.S[2105]++;profiler.info("Analyse 1 ... "+info_mem());
							__CLOVER_59_0.cloverRec.S[2106]++;out = new FileOutputStream("salut.xml");
							__CLOVER_59_0.cloverRec.S[2107]++;stream = new PrintStream(out);
							__CLOVER_59_0.cloverRec.S[2108]++;inp.programme.toXML(stream);
							__CLOVER_59_0.cloverRec.S[2109]++;stream.close();
							__CLOVER_59_0.cloverRec.S[2110]++;System.out.println("Analyse 1 ...");
							__CLOVER_59_0.cloverRec.S[2111]++;profiler.info("Analyse 1 ... "+info_mem());
							__CLOVER_59_0.cloverRec.S[2112]++;p.check_egal(p);
							__CLOVER_59_0.cloverRec.S[2113]++;System.out.println("Analyse 2 ...");
							__CLOVER_59_0.cloverRec.S[2114]++;profiler.info("Analyse 2 ... "+info_mem());
							__CLOVER_59_0.cloverRec.S[2115]++;inp.programme.check_egal(inp.programme);
							__CLOVER_59_0.cloverRec.S[2116]++;System.out.println("Analyse 3 ...");
							__CLOVER_59_0.cloverRec.S[2117]++;profiler.info("Analyse 3 ... "+info_mem());
							__CLOVER_59_0.cloverRec.S[2118]++;inp.programme.check_egal(p);
							__CLOVER_59_0.cloverRec.S[2119]++;System.out.println("Analyse 4 ...");
							__CLOVER_59_0.cloverRec.S[2120]++;profiler.info("Analyse 4 ... "+info_mem());
							__CLOVER_59_0.cloverRec.S[2121]++;p.check_egal(inp.programme);
							__CLOVER_59_0.cloverRec.S[2122]++;if ((((stop >= exec_prog) && (++__CLOVER_59_0.cloverRec.CT[801]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[801]==0&false))) {{
								__CLOVER_59_0.cloverRec.S[2123]++;System.out.println("Execution du programme");
								assert ((((false)) && (++__CLOVER_59_0.cloverRec.CT[802]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[802]==0&false));
								__CLOVER_59_0.cloverRec.S[2124]++;p.run(null, null);
							}
							}__CLOVER_59_0.cloverRec.S[2125]++;profiler.info("tests faits "+info_mem());
						}
						}__CLOVER_59_0.cloverRec.S[2126]++;if(false)
						{{// vidage de la memoire
							__CLOVER_59_0.cloverRec.S[2127]++;Table_Symbol ts[],ts2;
							__CLOVER_59_0.cloverRec.S[2128]++;Attribut_Complet ac;
							__CLOVER_59_0.cloverRec.S[2129]++;Attribut_Heritage ah;
							__CLOVER_59_0.cloverRec.S[2130]++;profiler.info("Memoire avant GC : "+info_mem());
							__CLOVER_59_0.cloverRec.S[2131]++;stream=null;
							__CLOVER_59_0.cloverRec.S[2132]++;out=null;
							__CLOVER_59_0.cloverRec.S[2133]++;liste_classe=null;
							__CLOVER_59_0.cloverRec.S[2134]++;ts=context.table_symbol;
							__CLOVER_59_0.cloverRec.S[2135]++;for(i=0;(((i<ts.length) && (++__CLOVER_59_0.cloverRec.CT[803]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[803]==0&false));i++)
							{{
								__CLOVER_59_0.cloverRec.S[2136]++;ts2=ts[i];
								__CLOVER_59_0.cloverRec.S[2137]++;ts2.classe=null;
								__CLOVER_59_0.cloverRec.S[2138]++;ts2.context=null;
								__CLOVER_59_0.cloverRec.S[2139]++;ts2.log=null;
								__CLOVER_59_0.cloverRec.S[2140]++;ts2.heritage=null;
								__CLOVER_59_0.cloverRec.S[2141]++;if((((ts2.liste_attribut!=null) && (++__CLOVER_59_0.cloverRec.CT[804]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[804]==0&false)))
								{{
									__CLOVER_59_0.cloverRec.S[2142]++;for(j=0;(((j<ts2.liste_attribut.length) && (++__CLOVER_59_0.cloverRec.CT[805]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[805]==0&false));j++)
									{{
										__CLOVER_59_0.cloverRec.S[2143]++;ac=ts2.liste_attribut[j];
										__CLOVER_59_0.cloverRec.S[2144]++;if((((ac.feature_directe!=null) && (++__CLOVER_59_0.cloverRec.CT[806]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[806]==0&false)))
										{{
											__CLOVER_59_0.cloverRec.S[2145]++;ac.feature_directe.classe=null;
											__CLOVER_59_0.cloverRec.S[2146]++;if((((ac.feature_directe.type_retour!=null) && (++__CLOVER_59_0.cloverRec.CT[807]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[807]==0&false)))
											{{
												//assert(ac.feature_directe.type_retour.classe_env==null);
											}
											}__CLOVER_59_0.cloverRec.S[2147]++;ac.feature_directe=null;
										}
										}__CLOVER_59_0.cloverRec.S[2148]++;if((((ac.feature_reel!=null) && (++__CLOVER_59_0.cloverRec.CT[808]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[808]==0&false)))
										{{
											__CLOVER_59_0.cloverRec.S[2149]++;ac.feature_reel.classe=null;
											__CLOVER_59_0.cloverRec.S[2150]++;if((((ac.feature_reel.type_retour!=null) && (++__CLOVER_59_0.cloverRec.CT[809]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[809]==0&false)))
											{{
												//assert(ac.feature_reel.type_retour.classe_env==null);
											}
											}__CLOVER_59_0.cloverRec.S[2151]++;ac.feature_reel=null;
										}
										}__CLOVER_59_0.cloverRec.S[2152]++;if((((ac.attribut_directe!=null) && (++__CLOVER_59_0.cloverRec.CT[810]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[810]==0&false)))
										{{
											__CLOVER_59_0.cloverRec.S[2153]++;ac.attribut_directe.classe=null;
											__CLOVER_59_0.cloverRec.S[2154]++;ac.attribut_directe=null;
										}
										}__CLOVER_59_0.cloverRec.S[2155]++;if((((ac.attribut_ancetre!=null) && (++__CLOVER_59_0.cloverRec.CT[811]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[811]==0&false)))
										{{
											__CLOVER_59_0.cloverRec.S[2156]++;for(k=0;(((k<ac.attribut_ancetre.length) && (++__CLOVER_59_0.cloverRec.CT[812]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[812]==0&false));k++)
											{{
												__CLOVER_59_0.cloverRec.S[2157]++;ah=ac.attribut_ancetre[k];
												__CLOVER_59_0.cloverRec.S[2158]++;ah.classe=null;
											}
										}}
										}__CLOVER_59_0.cloverRec.S[2159]++;ac.classe=null;
									}
								}}
							}}
							}__CLOVER_59_0.cloverRec.S[2160]++;context=null;
							__CLOVER_59_0.cloverRec.S[2161]++;this.env=null;
							__CLOVER_59_0.cloverRec.S[2162]++;this.liste_type=null;
							__CLOVER_59_0.cloverRec.S[2163]++;this.table_heritage=null;
							__CLOVER_59_0.cloverRec.S[2164]++;this.table_heritage_directe=null;
							__CLOVER_59_0.cloverRec.S[2165]++;conv=null;
							__CLOVER_59_0.cloverRec.S[2166]++;p=null;  // le programme sous forme intermediaire
							__CLOVER_59_0.cloverRec.S[2167]++;System.gc();
							__CLOVER_59_0.cloverRec.S[2168]++;profiler.info("Memoire apres GC : "+info_mem());
						}
					}} catch (SecurityException e) {
						__CLOVER_59_0.cloverRec.S[2169]++;e.printStackTrace();
						assert ((((false)) && (++__CLOVER_59_0.cloverRec.CT[813]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[813]==0&false));
					} catch (FileNotFoundException e) {
						__CLOVER_59_0.cloverRec.S[2170]++;e.printStackTrace();
						assert ((((false)) && (++__CLOVER_59_0.cloverRec.CT[814]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[814]==0&false));
					}
					
					//test_gc(true);
				} }else {__CLOVER_59_0.cloverRec.S[2171]++;if ((((stop == exec_prog) && (++__CLOVER_59_0.cloverRec.CT[815]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[815]==0&false))) {{// interpretation
					__CLOVER_59_0.cloverRec.S[2172]++;Interpreteur inter;
					__CLOVER_59_0.cloverRec.S[2173]++;inter = new Interpreteur(this);
				} }else {__CLOVER_59_0.cloverRec.S[2174]++;if ((((stop == genere_c) && (++__CLOVER_59_0.cloverRec.CT[816]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[816]==0&false))) {{
					__CLOVER_59_0.cloverRec.S[2175]++;GenC genc;
					__CLOVER_59_0.cloverRec.S[2176]++;genc = new GenC(this);
				} }else {__CLOVER_59_0.cloverRec.S[2177]++;if ((((stop == convert) && (++__CLOVER_59_0.cloverRec.CT[817]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[817]==0&false))) {{
					__CLOVER_59_0.cloverRec.S[2178]++;Convertion conv;
					__CLOVER_59_0.cloverRec.S[2179]++;conv = new Convertion(this);
				}
			}}}}}
			}__CLOVER_59_0.cloverRec.S[2180]++;System.out.println("Fin de la compilation");
			__CLOVER_59_0.cloverRec.S[2181]++;logger.info("Fin de la compilation");
			//test_gc(true);
			__CLOVER_59_0.cloverRec.S[2182]++;test_gc(false);
		} finally {
			__CLOVER_59_0.cloverRec.S[2183]++;if((((initialise) && (++__CLOVER_59_0.cloverRec.CT[818]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[818]==0&false)))
			{{
				__CLOVER_59_0.cloverRec.S[2184]++;profiler.info("Fin de la compilation "+info_mem());
				__CLOVER_59_0.cloverRec.S[2185]++;termine();
			}
			}else
			{{
				//assert(false);
			}
		}}
		__CLOVER_59_0.cloverRec.S[2186]++;return nb_erreur();
	}

	public void verifie_classe(Classe c)
	{__CLOVER_59_0.cloverRec.M[337]++;
		__CLOVER_59_0.cloverRec.S[2187]++;Verifications v;
		//Convertie_Interm conv;
		__CLOVER_59_0.cloverRec.S[2188]++;CIClasse cl;
		__CLOVER_59_0.cloverRec.S[2189]++;Attribut_Complet ac;
		__CLOVER_59_0.cloverRec.S[2190]++;String chemin_fichier;
		assert((((c!=null)) && (++__CLOVER_59_0.cloverRec.CT[819]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[819]==0&false));
		__CLOVER_59_0.cloverRec.S[2191]++;if((((!incremental) && (++__CLOVER_59_0.cloverRec.CT[820]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[820]==0&false)))
			{__CLOVER_59_0.cloverRec.S[2192]++;return;
		}__CLOVER_59_0.cloverRec.S[2193]++;profiler.info("verification de "+c.nom+" ..."+info_mem());
		
		__CLOVER_59_0.cloverRec.S[2194]++;v=new Verifications(c.type,c.heritage,logging);
		//conv=new Convertie_Interm(this);
		__CLOVER_59_0.cloverRec.S[2195]++;cl=new CIClasse();
		__CLOVER_59_0.cloverRec.S[2196]++;if((((c.feature!=null) && (++__CLOVER_59_0.cloverRec.CT[821]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[821]==0&false)))
		{{
			__CLOVER_59_0.cloverRec.S[2197]++;Feature f;
			__CLOVER_59_0.cloverRec.S[2198]++;NomFeature nf;
			__CLOVER_59_0.cloverRec.S[2199]++;int i,j;
			__CLOVER_59_0.cloverRec.S[2200]++;boolean est_once;
			__CLOVER_59_0.cloverRec.S[2201]++;CIRoutine routine;
			__CLOVER_59_0.cloverRec.S[2202]++;CIAttribut attr;
			__CLOVER_59_0.cloverRec.S[2203]++;tinyeiffel.ast.Attribut attr2;
			__CLOVER_59_0.cloverRec.S[2204]++;for(i=0;(((i<c.feature.length) && (++__CLOVER_59_0.cloverRec.CT[822]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[822]==0&false));i++)
			{{
				__CLOVER_59_0.cloverRec.S[2205]++;f=c.feature[i];
				__CLOVER_59_0.cloverRec.S[2206]++;if((((f instanceof FeatureRoutine&&
						((FeatureRoutine)f).once) && (++__CLOVER_59_0.cloverRec.CT[823]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[823]==0&false)))
				{{
					__CLOVER_59_0.cloverRec.S[2207]++;est_once=true;
				}
				}else
				{{
					__CLOVER_59_0.cloverRec.S[2208]++;est_once=false;
				}
				/*attr2=new tinyeiffel.ast.Attribut(f.liste_nom[0],c,f);
				ac=new Attribut_Complet(f.liste_nom[0],null);
				ac.attribut_directe=attr2;
				ac.no_attribut_reel=-1;
				ac.feature_directe=f;
				ac.verifie=true;
				attr=conv.convertie_attribut(ac,false,cl,new Vector());*/
				}__CLOVER_59_0.cloverRec.S[2209]++;profiler.info("ajout attribut local "+f.liste_nom[0]+"..."+info_mem());
				__CLOVER_59_0.cloverRec.S[2210]++;v.ajoute_attribut(f);
				__CLOVER_59_0.cloverRec.S[2211]++;profiler.info("ajout attribut local fait"+info_mem());
				/*for(j=0;j<f.liste_nom.length;j++)
				{
					nf=f.liste_nom[j];
					v.ajoute_attribut(nf,f.param,f.type_retour,est_once);
				}*/
			}
		}}
		}__CLOVER_59_0.cloverRec.S[2212]++;chemin_fichier=donne_nom(c.nom+".e");
		assert((((chemin_fichier!=null)) && (++__CLOVER_59_0.cloverRec.CT[824]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[824]==0&false));
		assert((((chemin_fichier.length()>0)) && (++__CLOVER_59_0.cloverRec.CT[825]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[825]==0&false));
		__CLOVER_59_0.cloverRec.S[2213]++;v.genere_xml(chemin_fichier);
		//verifications_classe.addElement(v);
		__CLOVER_59_0.cloverRec.S[2214]++;profiler.info("ajout global ... "+info_mem());
		__CLOVER_59_0.cloverRec.S[2215]++;verif_globale.ajoute(v);
		__CLOVER_59_0.cloverRec.S[2216]++;profiler.info("ajout global fait "+info_mem());
		__CLOVER_59_0.cloverRec.S[2217]++;profiler.info("verif fait "+info_mem());
	}
	
	public boolean complete_verifications()
	{__CLOVER_59_0.cloverRec.M[338]++;
		//VerificationsGlobales vg;
		//vg=new VerificationsGlobales(verifications_classe);
		//return vg.traitement();
		__CLOVER_59_0.cloverRec.S[2218]++;return verif_globale.traitement()&&nb_erreur()==0;
	}
	
	public String get_nom_sortie() {__CLOVER_59_0.cloverRec.M[339]++;
		__CLOVER_59_0.cloverRec.S[2219]++;String res = "", rep;
		__CLOVER_59_0.cloverRec.S[2220]++;NomGrappe nom_grappe;
		__CLOVER_59_0.cloverRec.S[2221]++;Grappe grappe;
		__CLOVER_59_0.cloverRec.S[2222]++;int i;
		assert ((((configuration != null)) && (++__CLOVER_59_0.cloverRec.CT[826]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[826]==0&false));
		__CLOVER_59_0.cloverRec.S[2223]++;grappe = configuration.donne_grappe_racine();
		assert ((((grappe != null)) && (++__CLOVER_59_0.cloverRec.CT[827]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[827]==0&false));
		__CLOVER_59_0.cloverRec.S[2224]++;res += grappe.donne_repertoire();
		__CLOVER_59_0.cloverRec.S[2225]++;res += "resultat.xml";
		__CLOVER_59_0.cloverRec.S[2226]++;return res;
	}

	public static String info_mem()
	{__CLOVER_59_0.cloverRec.M[340]++;
		__CLOVER_59_0.cloverRec.S[2227]++;Runtime r;
		__CLOVER_59_0.cloverRec.S[2228]++;long free, total, max,used;
		__CLOVER_59_0.cloverRec.S[2229]++;r = Runtime.getRuntime();
		__CLOVER_59_0.cloverRec.S[2230]++;free = r.freeMemory();
		__CLOVER_59_0.cloverRec.S[2231]++;total = r.totalMemory();
		__CLOVER_59_0.cloverRec.S[2232]++;max = r.maxMemory();
		__CLOVER_59_0.cloverRec.S[2233]++;used=total-free;
		__CLOVER_59_0.cloverRec.S[2234]++;return "(mem utilis\u00e9e="+affiche_mem(used)+
			" ; total="+affiche_mem(total)+")";
		//return "(free mem=" + free + " ; total mem=" + total + " ; max mem="
		//		+ max+")";
	}
	
	public static String affiche_mem(long m)
	{__CLOVER_59_0.cloverRec.M[341]++;
		__CLOVER_59_0.cloverRec.S[2235]++;long kilo=1024;
		__CLOVER_59_0.cloverRec.S[2236]++;if((((m>kilo) && (++__CLOVER_59_0.cloverRec.CT[828]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[828]==0&false)))
		{{
			__CLOVER_59_0.cloverRec.S[2237]++;if((((m>kilo*kilo) && (++__CLOVER_59_0.cloverRec.CT[829]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[829]==0&false)))
			{{
				__CLOVER_59_0.cloverRec.S[2238]++;return (m/(kilo*kilo))+" Mo";
			}
			}else
			{{
				__CLOVER_59_0.cloverRec.S[2239]++;return (m/kilo)+" Ko";
			}
		}}
		}else
		{{
			__CLOVER_59_0.cloverRec.S[2240]++;return m+" octets";
		}
	}}
	
	public void test_gc(boolean vidage) {__CLOVER_59_0.cloverRec.M[342]++;
		__CLOVER_59_0.cloverRec.S[2241]++;long fm1, fm2, tm1, tm2, mm1, mm2;
		__CLOVER_59_0.cloverRec.S[2242]++;long dfm, dtm, dmm;
		__CLOVER_59_0.cloverRec.S[2243]++;long d1, d2, dd;
		__CLOVER_59_0.cloverRec.S[2244]++;Runtime r;
		__CLOVER_59_0.cloverRec.S[2245]++;d1 = System.currentTimeMillis();
		__CLOVER_59_0.cloverRec.S[2246]++;r = Runtime.getRuntime();
		__CLOVER_59_0.cloverRec.S[2247]++;fm1 = r.freeMemory();
		__CLOVER_59_0.cloverRec.S[2248]++;tm1 = r.totalMemory();
		__CLOVER_59_0.cloverRec.S[2249]++;mm1 = r.maxMemory();
		__CLOVER_59_0.cloverRec.S[2250]++;logger.info("free mem=" + fm1 + " ; total mem=" + tm1 + " ; max mem="
				+ mm1);
		__CLOVER_59_0.cloverRec.S[2251]++;if ((((vidage) && (++__CLOVER_59_0.cloverRec.CT[830]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[830]==0&false))) {{
			__CLOVER_59_0.cloverRec.S[2252]++;this.context = null;
			__CLOVER_59_0.cloverRec.S[2253]++;this.env = null;
			__CLOVER_59_0.cloverRec.S[2254]++;this.configuration = null;
			__CLOVER_59_0.cloverRec.S[2255]++;this.liste_classe = null;
			//this.logger=null;
			__CLOVER_59_0.cloverRec.S[2256]++;this.logging = null;
			__CLOVER_59_0.cloverRec.S[2257]++;this.table_heritage = null;
			__CLOVER_59_0.cloverRec.S[2258]++;this.table_heritage_directe = null;
		}
		}__CLOVER_59_0.cloverRec.S[2259]++;logger.info("GC ...");
		__CLOVER_59_0.cloverRec.S[2260]++;r.gc();
		__CLOVER_59_0.cloverRec.S[2261]++;fm2 = r.freeMemory();
		__CLOVER_59_0.cloverRec.S[2262]++;tm2 = r.totalMemory();
		__CLOVER_59_0.cloverRec.S[2263]++;mm2 = r.maxMemory();
		__CLOVER_59_0.cloverRec.S[2264]++;dfm = fm2 - fm1;
		__CLOVER_59_0.cloverRec.S[2265]++;dtm = tm2 - tm1;
		__CLOVER_59_0.cloverRec.S[2266]++;dmm = mm2 - mm1;
		__CLOVER_59_0.cloverRec.S[2267]++;logger.info("free mem=" + fm2 + " ; total mem=" + tm2 + " ; max mem="
				+ mm2);
		__CLOVER_59_0.cloverRec.S[2268]++;logger.info("diff free mem=" + dfm + " ; diff total mem=" + dtm
				+ " ; diff max mem=" + dmm);
		__CLOVER_59_0.cloverRec.S[2269]++;d2 = System.currentTimeMillis();
		__CLOVER_59_0.cloverRec.S[2270]++;dd = d2 - d1;
		__CLOVER_59_0.cloverRec.S[2271]++;logger.info("duree total : " + dd + " ms = " + (dd / 1000) + " s");
	}

	public Environnement env;

	public void affiche_erreur() {__CLOVER_59_0.cloverRec.M[343]++;
		__CLOVER_59_0.cloverRec.S[2272]++;logging.affiche();
	}

	public int nb_erreur() {__CLOVER_59_0.cloverRec.M[344]++;
		__CLOVER_59_0.cloverRec.S[2273]++;return logging.nb_erreur();
	}

	public void erreur(String t) {__CLOVER_59_0.cloverRec.M[345]++;
		__CLOVER_59_0.cloverRec.S[2274]++;logging.erreurMsg(t);
	}

	public void erreur(Erreur e) {__CLOVER_59_0.cloverRec.M[346]++;
		assert ((((e != null)) && (++__CLOVER_59_0.cloverRec.CT[831]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[831]==0&false));
		__CLOVER_59_0.cloverRec.S[2275]++;logging.erreur(e);
	}

	public void erreur(String t, Position p) {__CLOVER_59_0.cloverRec.M[347]++;
		__CLOVER_59_0.cloverRec.S[2276]++;if ((((p == null) && (++__CLOVER_59_0.cloverRec.CT[832]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[832]==0&false))) {{
			__CLOVER_59_0.cloverRec.S[2277]++;System.out.println("t=" + t);
			assert ((((p != null)) && (++__CLOVER_59_0.cloverRec.CT[833]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[833]==0&false));
		}
		}__CLOVER_59_0.cloverRec.S[2278]++;logging.erreurMsg(t + p);
	}

	public void warning(String t) {__CLOVER_59_0.cloverRec.M[348]++;
		__CLOVER_59_0.cloverRec.S[2279]++;logging.warningMsg(t);
	}

	public void warning(String t, Position p) {__CLOVER_59_0.cloverRec.M[349]++;
		__CLOVER_59_0.cloverRec.S[2280]++;logging.warningMsg(t + p);
	}

	public void info(String t) {__CLOVER_59_0.cloverRec.M[350]++;
		__CLOVER_59_0.cloverRec.S[2281]++;logging.infoMsg(t);
	}

	public void info(String t, Position p) {__CLOVER_59_0.cloverRec.M[351]++;
		__CLOVER_59_0.cloverRec.S[2282]++;logging.infoMsg(t + p);
	}

	public void fatal(String t) {__CLOVER_59_0.cloverRec.M[352]++;
		__CLOVER_59_0.cloverRec.S[2283]++;logging.fatalMsg(t);
	}

	public void fatal(String t, Position p) {__CLOVER_59_0.cloverRec.M[353]++;
		__CLOVER_59_0.cloverRec.S[2284]++;logging.fatalMsg(t + p);
	}

	public void verifie_feature(Context context) {__CLOVER_59_0.cloverRec.M[354]++;
		__CLOVER_59_0.cloverRec.S[2285]++;int i, j;
		__CLOVER_59_0.cloverRec.S[2286]++;Instr instr;
		__CLOVER_59_0.cloverRec.S[2287]++;Classe c = env.classe;//context.classe_courante;
		__CLOVER_59_0.cloverRec.S[2288]++;Feature f = env.feature;//context.feature_courante;
		__CLOVER_59_0.cloverRec.S[2289]++;Table_Symbol table = context.donne_table_symbol(c);
		__CLOVER_59_0.cloverRec.S[2290]++;DeclareVar param[] = f.param, var1, var2;
		__CLOVER_59_0.cloverRec.S[2291]++;Attribut_Complet liste_attr[], ac;

		__CLOVER_59_0.cloverRec.S[2292]++;if ((((param != null) && (++__CLOVER_59_0.cloverRec.CT[834]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[834]==0&false))) {{
			__CLOVER_59_0.cloverRec.S[2293]++;for (i = 0; (((i < param.length) && (++__CLOVER_59_0.cloverRec.CT[835]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[835]==0&false)); i++) {{
				__CLOVER_59_0.cloverRec.S[2294]++;var1 = param[i];
				assert ((((var1 != null)) && (++__CLOVER_59_0.cloverRec.CT[836]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[836]==0&false));
				__CLOVER_59_0.cloverRec.S[2295]++;for (j = 0; (((j < i) && (++__CLOVER_59_0.cloverRec.CT[837]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[837]==0&false)); j++) {{
					__CLOVER_59_0.cloverRec.S[2296]++;var2 = param[j];
					assert ((((var1 != var2)) && (++__CLOVER_59_0.cloverRec.CT[838]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[838]==0&false));
					assert ((((var2 != null)) && (++__CLOVER_59_0.cloverRec.CT[839]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[839]==0&false));
					__CLOVER_59_0.cloverRec.S[2297]++;if ((((var1.nom.compareToIgnoreCase(var2.nom) == 0) && (++__CLOVER_59_0.cloverRec.CT[840]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[840]==0&false))) {{// Erreur
																	  // VREG
						__CLOVER_59_0.cloverRec.S[2298]++;context.erreur(new ErreurVREG(c, f, var2, var1, true));
					}
				}}
				}__CLOVER_59_0.cloverRec.S[2299]++;ac = table.trouve_attribut(var1.nom);
				__CLOVER_59_0.cloverRec.S[2300]++;if ((((ac != null) && (++__CLOVER_59_0.cloverRec.CT[841]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[841]==0&false))) {{// Erreur VRFA
					__CLOVER_59_0.cloverRec.S[2301]++;context.erreur(new ErreurVRFA(c, f, ac.nom, var1));
				}
			}}
		}}
		}__CLOVER_59_0.cloverRec.S[2302]++;if ((((f instanceof FeatureRoutine) && (++__CLOVER_59_0.cloverRec.CT[842]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[842]==0&false))) {{
			__CLOVER_59_0.cloverRec.S[2303]++;FeatureRoutine f1 = (FeatureRoutine) f;
			__CLOVER_59_0.cloverRec.S[2304]++;DeclareVar local[] = f1.local;

			__CLOVER_59_0.cloverRec.S[2305]++;System.out.println("feature0:" + f1.liste_nom[0]);
			__CLOVER_59_0.cloverRec.S[2306]++;if ((((f.require != null) && (++__CLOVER_59_0.cloverRec.CT[843]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[843]==0&false))) {{
				__CLOVER_59_0.cloverRec.S[2307]++;env.entre_require();
				__CLOVER_59_0.cloverRec.S[2308]++;verifie_liste_assertion(c, f, f.require, dans_require);
				__CLOVER_59_0.cloverRec.S[2309]++;env.sort_require();
			}
			}__CLOVER_59_0.cloverRec.S[2310]++;if ((((local != null) && (++__CLOVER_59_0.cloverRec.CT[844]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[844]==0&false))) {{
				__CLOVER_59_0.cloverRec.S[2311]++;for (i = 0; (((i < local.length) && (++__CLOVER_59_0.cloverRec.CT[845]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[845]==0&false)); i++) {{
					__CLOVER_59_0.cloverRec.S[2312]++;var1 = local[i];
					assert ((((var1 != null)) && (++__CLOVER_59_0.cloverRec.CT[846]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[846]==0&false));
					__CLOVER_59_0.cloverRec.S[2313]++;for (j = 0; (((j < i) && (++__CLOVER_59_0.cloverRec.CT[847]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[847]==0&false)); j++) {{
						__CLOVER_59_0.cloverRec.S[2314]++;var2 = local[j];
						assert ((((var1 != var2)) && (++__CLOVER_59_0.cloverRec.CT[848]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[848]==0&false));
						assert ((((var2 != null)) && (++__CLOVER_59_0.cloverRec.CT[849]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[849]==0&false));
						__CLOVER_59_0.cloverRec.S[2315]++;if ((((var1.nom.compareToIgnoreCase(var2.nom) == 0) && (++__CLOVER_59_0.cloverRec.CT[850]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[850]==0&false))) {{// Erreur
																		  // VREG
							__CLOVER_59_0.cloverRec.S[2316]++;context.erreur(new ErreurVREG(c, f, var2, var1,
									false));
						}
					}}
					}__CLOVER_59_0.cloverRec.S[2317]++;if ((((param != null) && (++__CLOVER_59_0.cloverRec.CT[851]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[851]==0&false))) {{
						__CLOVER_59_0.cloverRec.S[2318]++;for (j = 0; (((j < param.length) && (++__CLOVER_59_0.cloverRec.CT[852]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[852]==0&false)); j++) {{
							__CLOVER_59_0.cloverRec.S[2319]++;var2 = param[j];
							assert ((((var1 != var2)) && (++__CLOVER_59_0.cloverRec.CT[853]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[853]==0&false));
							assert ((((var2 != null)) && (++__CLOVER_59_0.cloverRec.CT[854]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[854]==0&false));
							__CLOVER_59_0.cloverRec.S[2320]++;if ((((var1.nom.compareToIgnoreCase(var2.nom) == 0) && (++__CLOVER_59_0.cloverRec.CT[855]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[855]==0&false))) {{// Erreur
																			  // VREG2
								__CLOVER_59_0.cloverRec.S[2321]++;context
										.erreur(new ErreurVRLE2(c, f, var2,
												var1));
							}
						}}
					}}
					}__CLOVER_59_0.cloverRec.S[2322]++;ac = table.trouve_attribut(var1.nom);
					__CLOVER_59_0.cloverRec.S[2323]++;if ((((ac != null) && (++__CLOVER_59_0.cloverRec.CT[856]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[856]==0&false))) {{// Erreur VRLE1
						__CLOVER_59_0.cloverRec.S[2324]++;context.erreur(new ErreurVRLE1(c, f, ac.nom, var1));
					}
					}__CLOVER_59_0.cloverRec.S[2325]++;context.type_valide(table, var1.type);
				}
			}}
			}__CLOVER_59_0.cloverRec.S[2326]++;env.entre_do();
			__CLOVER_59_0.cloverRec.S[2327]++;verifie_liste_instr(context, f1.liste_instr);
			__CLOVER_59_0.cloverRec.S[2328]++;env.sort_do();
			__CLOVER_59_0.cloverRec.S[2329]++;if ((((f1.rescue != null) && (++__CLOVER_59_0.cloverRec.CT[857]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[857]==0&false))) {{
				__CLOVER_59_0.cloverRec.S[2330]++;env.entre_rescue();
				__CLOVER_59_0.cloverRec.S[2331]++;context.dans_rescue = true;
				__CLOVER_59_0.cloverRec.S[2332]++;verifie_liste_instr(context, f1.rescue);
				__CLOVER_59_0.cloverRec.S[2333]++;context.dans_rescue = false;
				__CLOVER_59_0.cloverRec.S[2334]++;env.sort_rescue();
			}
			}__CLOVER_59_0.cloverRec.S[2335]++;if ((((f.ensure != null) && (++__CLOVER_59_0.cloverRec.CT[858]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[858]==0&false))) {{
				__CLOVER_59_0.cloverRec.S[2336]++;env.entre_ensure();
				__CLOVER_59_0.cloverRec.S[2337]++;verifie_liste_assertion(c, f, f.ensure, dans_ensure);
				__CLOVER_59_0.cloverRec.S[2338]++;env.sort_ensure();
			}
			/*
			 * if(f1.liste_instr!=null) { /*for(i=0;i
			 * <f1.liste_instr.length;i++) { instr=f1.liste_instr[i];
			 * verifie_instr(c,f,instr); }
			 */
			//}t=verifie_expr(c,f,ins.expr);
		}} }else {__CLOVER_59_0.cloverRec.S[2339]++;if ((((f instanceof FeatureUnique) && (++__CLOVER_59_0.cloverRec.CT[859]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[859]==0&false))) {{
			__CLOVER_59_0.cloverRec.S[2340]++;FeatureUnique f1 = (FeatureUnique) f;
			__CLOVER_59_0.cloverRec.S[2341]++;if ((((f1 != null) && (++__CLOVER_59_0.cloverRec.CT[860]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[860]==0&false))) {{
				__CLOVER_59_0.cloverRec.S[2342]++;if ((((f1.type_retour == null
						|| !f1.type_retour.egaux(new TypeSimple(false, "integer",
								new Vector()))) && (++__CLOVER_59_0.cloverRec.CT[861]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[861]==0&false))) {{// Erreur VQUI
					__CLOVER_59_0.cloverRec.S[2343]++;erreur(
					//"une feature unique doit avoir un type"
					//	+ " de retour integer",
					//f1.debut()
					new ErreurVQUI(c, f1));
				}
			}}
		}} }else {__CLOVER_59_0.cloverRec.S[2344]++;if ((((f instanceof FeatureExternal) && (++__CLOVER_59_0.cloverRec.CT[862]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[862]==0&false))) {{
			__CLOVER_59_0.cloverRec.S[2345]++;if ((((f.require != null) && (++__CLOVER_59_0.cloverRec.CT[863]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[863]==0&false))) {{
				__CLOVER_59_0.cloverRec.S[2346]++;env.entre_require();
				__CLOVER_59_0.cloverRec.S[2347]++;verifie_liste_assertion(c, f, f.require, dans_require);
				__CLOVER_59_0.cloverRec.S[2348]++;env.sort_require();
			}
			}__CLOVER_59_0.cloverRec.S[2349]++;FeatureExternal f1 = (FeatureExternal) f;
			__CLOVER_59_0.cloverRec.S[2350]++;if ((((f.ensure != null) && (++__CLOVER_59_0.cloverRec.CT[864]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[864]==0&false))) {{
				__CLOVER_59_0.cloverRec.S[2351]++;env.entre_ensure();
				__CLOVER_59_0.cloverRec.S[2352]++;verifie_liste_assertion(c, f, f.ensure, dans_ensure);
				__CLOVER_59_0.cloverRec.S[2353]++;env.sort_ensure();
			}
		}} }else {__CLOVER_59_0.cloverRec.S[2354]++;if ((((f instanceof FeatureDeferred) && (++__CLOVER_59_0.cloverRec.CT[865]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[865]==0&false))) {{
			__CLOVER_59_0.cloverRec.S[2355]++;if ((((f.require != null) && (++__CLOVER_59_0.cloverRec.CT[866]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[866]==0&false))) {{
				__CLOVER_59_0.cloverRec.S[2356]++;env.entre_require();
				__CLOVER_59_0.cloverRec.S[2357]++;verifie_liste_assertion(c, f, f.require, dans_require);
				__CLOVER_59_0.cloverRec.S[2358]++;env.sort_require();
			}
			}__CLOVER_59_0.cloverRec.S[2359]++;FeatureDeferred f1 = (FeatureDeferred) f;
			__CLOVER_59_0.cloverRec.S[2360]++;if ((((f.ensure != null) && (++__CLOVER_59_0.cloverRec.CT[867]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[867]==0&false))) {{
				__CLOVER_59_0.cloverRec.S[2361]++;env.entre_ensure();
				__CLOVER_59_0.cloverRec.S[2362]++;verifie_liste_assertion(c, f, f.ensure, dans_ensure);
				__CLOVER_59_0.cloverRec.S[2363]++;env.sort_ensure();
			}
		}} }else {__CLOVER_59_0.cloverRec.S[2364]++;if ((((f instanceof FeatureAttr) && (++__CLOVER_59_0.cloverRec.CT[868]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[868]==0&false))) {{
			__CLOVER_59_0.cloverRec.S[2365]++;FeatureAttr f1 = (FeatureAttr) f;
		} }else {__CLOVER_59_0.cloverRec.S[2366]++;if ((((f instanceof FeatureExpr) && (++__CLOVER_59_0.cloverRec.CT[869]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[869]==0&false))) {{
			__CLOVER_59_0.cloverRec.S[2367]++;FeatureExpr f1 = (FeatureExpr) f;
			__CLOVER_59_0.cloverRec.S[2368]++;Type t;
			__CLOVER_59_0.cloverRec.S[2369]++;Expr expr = f1.expr;
			__CLOVER_59_0.cloverRec.S[2370]++;if ((((expr.op == Expr.MoinsU || expr.op == Expr.PlusU) && (++__CLOVER_59_0.cloverRec.CT[870]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[870]==0&false))) {{
				__CLOVER_59_0.cloverRec.S[2371]++;Expr e = ((Expr_Unaire) f1.expr).expr1;
				__CLOVER_59_0.cloverRec.S[2372]++;if ((((e != null) && (++__CLOVER_59_0.cloverRec.CT[871]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[871]==0&false))) {{
					__CLOVER_59_0.cloverRec.S[2373]++;if ((((e.op == Expr.Entier || e.op == Expr.Reel) && (++__CLOVER_59_0.cloverRec.CT[872]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[872]==0&false)))
						{__CLOVER_59_0.cloverRec.S[2374]++;expr = e;
				}}
			}}
			}__CLOVER_59_0.cloverRec.S[2375]++;boolean __CLOVER_bool0=false;switch (expr.op) {
			case Expr.Chaine:if (!__CLOVER_bool0) {__CLOVER_59_0.cloverRec.S[2376]++;__CLOVER_bool0=true;}
				__CLOVER_59_0.cloverRec.S[2377]++;if ((((f1.type_retour == null
						|| !f1.type_retour.egaux(new TypeSimple(false, "string",
								new Vector()))) && (++__CLOVER_59_0.cloverRec.CT[873]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[873]==0&false))) {{// Erreur VQMC5
					__CLOVER_59_0.cloverRec.S[2378]++;context.erreur(new ErreurVQMC5(c, f1));
				}
				}__CLOVER_59_0.cloverRec.S[2379]++;break;
			case Expr.Char:if (!__CLOVER_bool0) {__CLOVER_59_0.cloverRec.S[2380]++;__CLOVER_bool0=true;}
				__CLOVER_59_0.cloverRec.S[2381]++;if ((((f1.type_retour == null
						|| !f1.type_retour.egaux(new TypeSimple(false, "character",
								new Vector()))) && (++__CLOVER_59_0.cloverRec.CT[874]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[874]==0&false))) {{// Erreur VQMC2
					__CLOVER_59_0.cloverRec.S[2382]++;context.erreur(new ErreurVQMC2(c, f1));
				}
				}__CLOVER_59_0.cloverRec.S[2383]++;break;
			case Expr.Entier:if (!__CLOVER_bool0) {__CLOVER_59_0.cloverRec.S[2384]++;__CLOVER_bool0=true;}
				__CLOVER_59_0.cloverRec.S[2385]++;if ((((f1.type_retour == null
						|| !f1.type_retour.egaux(new TypeSimple(false, "integer",
								new Vector()))) && (++__CLOVER_59_0.cloverRec.CT[875]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[875]==0&false))) {{// Erreur VQMC3
					__CLOVER_59_0.cloverRec.S[2386]++;context.erreur(new ErreurVQMC3(c, f1));
				}
				}__CLOVER_59_0.cloverRec.S[2387]++;break;
			case Expr.Reel:if (!__CLOVER_bool0) {__CLOVER_59_0.cloverRec.S[2388]++;__CLOVER_bool0=true;}
				__CLOVER_59_0.cloverRec.S[2389]++;if ((((f1.type_retour == null
						|| !(f1.type_retour.egaux(new TypeSimple(false, "real",
								new Vector())) || f1.type_retour
								.egaux(new TypeSimple(false, "double", new Vector())))) && (++__CLOVER_59_0.cloverRec.CT[876]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[876]==0&false))) {{// Erreur
																				   // VQMC4
					__CLOVER_59_0.cloverRec.S[2390]++;context.erreur(new ErreurVQMC4(c, f1));
				}
				}__CLOVER_59_0.cloverRec.S[2391]++;break;
			case Expr.Vrai:if (!__CLOVER_bool0) {__CLOVER_59_0.cloverRec.S[2392]++;__CLOVER_bool0=true;}
			case Expr.Faux:if (!__CLOVER_bool0) {__CLOVER_59_0.cloverRec.S[2393]++;__CLOVER_bool0=true;}
				__CLOVER_59_0.cloverRec.S[2394]++;if ((((f1.type_retour == null
						|| !f1.type_retour.egaux(new TypeSimple(false, "boolean",
								new Vector()))) && (++__CLOVER_59_0.cloverRec.CT[877]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[877]==0&false))) {{// Erreur VQMC1
					__CLOVER_59_0.cloverRec.S[2395]++;context.erreur(new ErreurVQMC1(c, f1));
				}
				}__CLOVER_59_0.cloverRec.S[2396]++;break;
			//case Expr.Var:
			//	break;
			default:if (!__CLOVER_bool0) {__CLOVER_59_0.cloverRec.S[2397]++;__CLOVER_bool0=true;}//	Erreur VQMC5
				//assert(false);
				__CLOVER_59_0.cloverRec.S[2398]++;context.erreur(new ErreurVQMC(c, f1));
				__CLOVER_59_0.cloverRec.S[2399]++;break;
			}
			__CLOVER_59_0.cloverRec.S[2400]++;t = verifie_expr(context, f1.expr, true);
			/*
			 * if (!context.type_compatible(t,table, f1.type_retour,table)) {
			 * erreur( "la constante n'est pas du type des attributs",
			 * f.debut()); }
			 */
		} }else {{
			__CLOVER_59_0.cloverRec.S[2401]++;erreur("feature inconnue", f.debut());
		}
	}}}}}}}

	public void verifie_liste_instr(Context context, Instr liste_instr[]) {__CLOVER_59_0.cloverRec.M[355]++;
		__CLOVER_59_0.cloverRec.S[2402]++;Instr instr;
		__CLOVER_59_0.cloverRec.S[2403]++;int i;
		__CLOVER_59_0.cloverRec.S[2404]++;Classe c = env.classe;//context.classe_courante;
		__CLOVER_59_0.cloverRec.S[2405]++;Feature f = env.feature;//context.feature_courante;

		__CLOVER_59_0.cloverRec.S[2406]++;if ((((liste_instr == null) && (++__CLOVER_59_0.cloverRec.CT[878]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[878]==0&false))) {{
			__CLOVER_59_0.cloverRec.S[2407]++;return;
		}
		}__CLOVER_59_0.cloverRec.S[2408]++;for (i = 0; (((i < liste_instr.length) && (++__CLOVER_59_0.cloverRec.CT[879]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[879]==0&false)); i++) {{
			__CLOVER_59_0.cloverRec.S[2409]++;instr = liste_instr[i];
			__CLOVER_59_0.cloverRec.S[2410]++;verifie_instr(context, instr);
		}
	}}

	protected static final int dans_invariant = 1;

	protected static final int dans_require = 2;

	protected static final int dans_ensure = 3;

	protected static final int dans_invariant_boucle = 4;

	protected static final int dans_check = 5;

	//protected static final int dans_require=5;

	public void verifie_instr(Context context, Instr instr) {__CLOVER_59_0.cloverRec.M[356]++;
		__CLOVER_59_0.cloverRec.S[2411]++;Type t;
		__CLOVER_59_0.cloverRec.S[2412]++;Classe c = env.classe;//context.classe_courante;
		__CLOVER_59_0.cloverRec.S[2413]++;Feature f = env.feature;//context.feature_courante;
		__CLOVER_59_0.cloverRec.S[2414]++;Table_Symbol table = context.donne_table_symbol(c);

		__CLOVER_59_0.cloverRec.S[2415]++;if ((((instr instanceof Instr_If) && (++__CLOVER_59_0.cloverRec.CT[880]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[880]==0&false))) {{
			__CLOVER_59_0.cloverRec.S[2416]++;Instr_If ins = (Instr_If) instr;
			__CLOVER_59_0.cloverRec.S[2417]++;Instr ins2;
			__CLOVER_59_0.cloverRec.S[2418]++;Instr_ElseIf ins3;
			__CLOVER_59_0.cloverRec.S[2419]++;Instr_Else ins4;

			__CLOVER_59_0.cloverRec.S[2420]++;t = verifie_expr(context, ins.expr, true);
			__CLOVER_59_0.cloverRec.S[2421]++;if ((((t == null) && (++__CLOVER_59_0.cloverRec.CT[881]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[881]==0&false))) {{
				__CLOVER_59_0.cloverRec.S[2422]++;erreur("Erreur1:expression sans type" + ins.expr.op, ins.expr
						.debut());
				__CLOVER_59_0.cloverRec.S[2423]++;return;
			}
			}__CLOVER_59_0.cloverRec.S[2424]++;if ((((!t.egaux(bool)) && (++__CLOVER_59_0.cloverRec.CT[882]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[882]==0&false))) //(t.nom.compareToIgnoreCase("boolean") != 0)
			{{
				__CLOVER_59_0.cloverRec.S[2425]++;erreur(new ErreurVWBE(c, ins.expr, ErreurVWBE.type_if));
				//"Erreur:Le test dans le if doit etre un booleen",
				//ins.debut());
			}
			}__CLOVER_59_0.cloverRec.S[2426]++;verifie_liste_instr(context, ins.liste_instr);
			__CLOVER_59_0.cloverRec.S[2427]++;ins2 = ins.getSuivant();
			__CLOVER_59_0.cloverRec.S[2428]++;while ((((ins2 instanceof Instr_ElseIf) && (++__CLOVER_59_0.cloverRec.CT[883]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[883]==0&false))) {{
				__CLOVER_59_0.cloverRec.S[2429]++;ins3 = (Instr_ElseIf) ins2;
				__CLOVER_59_0.cloverRec.S[2430]++;t = verifie_expr(context, ins3.expr, true);
				__CLOVER_59_0.cloverRec.S[2431]++;if ((((t == null) && (++__CLOVER_59_0.cloverRec.CT[884]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[884]==0&false))) {{
					__CLOVER_59_0.cloverRec.S[2432]++;erreur("Erreur2:expression sans type", ins3.expr.debut());
					__CLOVER_59_0.cloverRec.S[2433]++;return;
				}
				}__CLOVER_59_0.cloverRec.S[2434]++;if ((((!t.egaux(bool)) && (++__CLOVER_59_0.cloverRec.CT[885]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[885]==0&false))) {{
					__CLOVER_59_0.cloverRec.S[2435]++;erreur(new ErreurVWBE(c, ins3.expr, ErreurVWBE.type_elseif));
				}
				/*
				 * if (t.nom.compareToIgnoreCase("boolean") != 0) { erreur(
				 * "Erreur:Le test dans le elseif doit etre un booleen",
				 * ins3.expr.debut()); }
				 */
				}__CLOVER_59_0.cloverRec.S[2436]++;verifie_liste_instr(context, ins3.liste_instr);
				__CLOVER_59_0.cloverRec.S[2437]++;ins2 = ins3.getSuivant();
			}
			}__CLOVER_59_0.cloverRec.S[2438]++;if ((((ins2 instanceof Instr_Else) && (++__CLOVER_59_0.cloverRec.CT[886]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[886]==0&false))) {{
				__CLOVER_59_0.cloverRec.S[2439]++;ins4 = (Instr_Else) ins2;
				__CLOVER_59_0.cloverRec.S[2440]++;verifie_liste_instr(context, ins4.liste_instr);
			}
		}} }else {__CLOVER_59_0.cloverRec.S[2441]++;if ((((instr instanceof Instr_Affect) && (++__CLOVER_59_0.cloverRec.CT[887]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[887]==0&false))) {{
			__CLOVER_59_0.cloverRec.S[2442]++;Instr_Affect ins = (Instr_Affect) instr;
			__CLOVER_59_0.cloverRec.S[2443]++;Type t1, t2, t3, t4 = null;

			__CLOVER_59_0.cloverRec.S[2444]++;if ((((!context.var_existe(ins.nom)) && (++__CLOVER_59_0.cloverRec.CT[888]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[888]==0&false))) {{
				__CLOVER_59_0.cloverRec.S[2445]++;logging.erreur(new ErreurVEEN(c, ins.nom, ins.tid));
			} }else {__CLOVER_59_0.cloverRec.S[2446]++;if ((((!context.variable_assignable(ins.nom, ins.tid.debut())) && (++__CLOVER_59_0.cloverRec.CT[889]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[889]==0&false))) {{
				__CLOVER_59_0.cloverRec.S[2447]++;logging.erreur(new ErreurAffect(c, ins, ins.nom));
			} }else {{
				__CLOVER_59_0.cloverRec.S[2448]++;t1 = context.donne_type_var(ins.nom, ins.tid.debut());
				__CLOVER_59_0.cloverRec.S[2449]++;if ((((t1 != null) && (++__CLOVER_59_0.cloverRec.CT[890]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[890]==0&false))) {{
					__CLOVER_59_0.cloverRec.S[2450]++;Table_Symbol table2;
					//t3=table.trouve_vrai_type(t1);
					//assert(!t3.is_like);
					__CLOVER_59_0.cloverRec.S[2451]++;t2 = verifie_expr(context, ins.expr, true);
					__CLOVER_59_0.cloverRec.S[2452]++;t2 = ins.expr.type;
					//assert(t2!=null):"expr="+ins.expr+"=:"+ins.nom;
					//if(t2!=null)
					//	t4=table.trouve_vrai_type(t2);
					__CLOVER_59_0.cloverRec.S[2453]++;Declare_entite entite = context.donne_entite(ins.nom,
							ins.tid.debut());
					/*
					 * if(ins.expr.classe!=null) {
					 * table2=context.donne_table_symbol(ins.expr.classe); }
					 * else
					 */
					{
						__CLOVER_59_0.cloverRec.S[2454]++;table2 = table;
					}
					__CLOVER_59_0.cloverRec.S[2455]++;if ((((!ins.expr.erreur
							&& t1 != null
							&& t2 != null
							&& entite != null
							&& !context.type_compatible(ins.expr, table,
									entite, table2)) && (++__CLOVER_59_0.cloverRec.CT[891]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[891]==0&false))) {{
						//erreur("Type incompatible dans l'affectation",
						// instr.debut());
						/*
						 * assert(!t4.is_like); assert(ins.expr instanceof
						 * Expr_Unaire); assert(((Expr_Unaire)ins.expr).expr1
						 * instanceof Expr_Entier);
						 * assert(verifie_expr(context,((Expr_Unaire)ins.expr).expr1).nom.compareToIgnoreCase("integer")==0);
						 * assert(t4.nom.compareToIgnoreCase("integer")==0):
						 * "t4="+t4+",t2="+t2+",expr="+
						 * ((Expr_Unaire)ins.expr).expr1+
						 * ",debut="+ins.expr.debut();
						 */
						//logging.erreur(new ErreurVBAR());
						__CLOVER_59_0.cloverRec.S[2456]++;logging.erreur(new ErreurVJAR(c, ins, t2, t1));
					}
				}}
			}}
		}}} }else {__CLOVER_59_0.cloverRec.S[2457]++;if ((((instr instanceof Instr_TentAffect) && (++__CLOVER_59_0.cloverRec.CT[892]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[892]==0&false))) {{
			__CLOVER_59_0.cloverRec.S[2458]++;Instr_TentAffect ins = (Instr_TentAffect) instr;
			__CLOVER_59_0.cloverRec.S[2459]++;Type t1, t2;

			__CLOVER_59_0.cloverRec.S[2460]++;if ((((!context.var_existe(ins.nom)) && (++__CLOVER_59_0.cloverRec.CT[893]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[893]==0&false))) {{
				__CLOVER_59_0.cloverRec.S[2461]++;logging.erreur(new ErreurVEEN(c, ins.nom, ins.tid));
			} }else {__CLOVER_59_0.cloverRec.S[2462]++;if ((((!context.variable_assignable(ins.nom, ins.tid.debut())) && (++__CLOVER_59_0.cloverRec.CT[894]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[894]==0&false))) {{
				__CLOVER_59_0.cloverRec.S[2463]++;logging.erreur(new ErreurAffect(c, ins, ins.nom));
			} }else {{
				__CLOVER_59_0.cloverRec.S[2464]++;t1 = context.donne_type_var(ins.nom, ins.tid.debut());
				__CLOVER_59_0.cloverRec.S[2465]++;t2 = verifie_expr(context, ins.expr, true);
				__CLOVER_59_0.cloverRec.S[2466]++;if ((((t1 != null && t2 != null) && (++__CLOVER_59_0.cloverRec.CT[895]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[895]==0&false))) {{
					__CLOVER_59_0.cloverRec.S[2467]++;if ((((context.type_expanded(t1, table)) && (++__CLOVER_59_0.cloverRec.CT[896]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[896]==0&false))) {{
						__CLOVER_59_0.cloverRec.S[2468]++;erreur(new ErreurVJRV(c, ins, t1, t2));
					} }else
					//if(t1!=null&&t2!=null&&!type_compatible(t2,t1))
					{{
						//	erreur("Type incompatible dans l'affectation");
					}
				}}
			}}
		}}} }else {__CLOVER_59_0.cloverRec.S[2469]++;if ((((instr instanceof Instr_Retry) && (++__CLOVER_59_0.cloverRec.CT[897]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[897]==0&false))) {{
			__CLOVER_59_0.cloverRec.S[2470]++;if ((((!env.dans_rescue()) && (++__CLOVER_59_0.cloverRec.CT[898]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[898]==0&false)))//(!context.dans_rescue)
			{{// Erreur VXRT
				__CLOVER_59_0.cloverRec.S[2471]++;erreur(new ErreurVXRT(c, f, (Instr_Retry) instr));
			}
		}} }else {__CLOVER_59_0.cloverRec.S[2472]++;if ((((instr instanceof Instr_Debug) && (++__CLOVER_59_0.cloverRec.CT[899]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[899]==0&false))) {{
			__CLOVER_59_0.cloverRec.S[2473]++;Instr_Debug ins = (Instr_Debug) instr;
			__CLOVER_59_0.cloverRec.S[2474]++;verifie_liste_instr(context, ins.instr);
		} }else {__CLOVER_59_0.cloverRec.S[2475]++;if ((((instr instanceof Instr_Loop) && (++__CLOVER_59_0.cloverRec.CT[900]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[900]==0&false))) {{
			__CLOVER_59_0.cloverRec.S[2476]++;Instr_Loop ins = (Instr_Loop) instr;
			__CLOVER_59_0.cloverRec.S[2477]++;t = verifie_expr(context, ins.expr, true);
			__CLOVER_59_0.cloverRec.S[2478]++;if ((((t != null && !t.egaux(bool) /*
											 * t.nom.compareToIgnoreCase("boolean") !=
											 * 0
											 */) && (++__CLOVER_59_0.cloverRec.CT[901]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[901]==0&false))) {{
				__CLOVER_59_0.cloverRec.S[2479]++;erreur(new ErreurVWBE(c, ins.expr, ErreurVWBE.type_loop));
				//"le test dans le loop doit etre un booleen",
				//ins.expr.debut());
			}//&\u00e9"'(-\u00e8
			}__CLOVER_59_0.cloverRec.S[2480]++;if ((((ins.variant != null) && (++__CLOVER_59_0.cloverRec.CT[902]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[902]==0&false))) {{
				__CLOVER_59_0.cloverRec.S[2481]++;t = verifie_expr(context, ins.variant, true);
				__CLOVER_59_0.cloverRec.S[2482]++;if ((((t != null && !t.egaux(entier)) && (++__CLOVER_59_0.cloverRec.CT[903]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[903]==0&false))) {{// t.nom.compareToIgnoreCase("integer")
													// != 0) {
					__CLOVER_59_0.cloverRec.S[2483]++;erreur(new ErreurVAVE(c, ins));
					//"l'invariant dans le loop doit etre un entier",
					//ins.variant.debut());
				}
			}}
			}__CLOVER_59_0.cloverRec.S[2484]++;verifie_liste_instr(context, ins.from);
			__CLOVER_59_0.cloverRec.S[2485]++;verifie_liste_instr(context, ins.loop);
			__CLOVER_59_0.cloverRec.S[2486]++;verifie_liste_assertion(c, f, ins.invariant, dans_invariant_boucle);
		} }else {__CLOVER_59_0.cloverRec.S[2487]++;if ((((instr instanceof Instr_Check) && (++__CLOVER_59_0.cloverRec.CT[904]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[904]==0&false))) {{
			__CLOVER_59_0.cloverRec.S[2488]++;Instr_Check ins = (Instr_Check) instr;
			__CLOVER_59_0.cloverRec.S[2489]++;verifie_liste_assertion(c, f, ins.liste_expr, dans_check);
		} }else {__CLOVER_59_0.cloverRec.S[2490]++;if ((((instr instanceof Instr_Inspect) && (++__CLOVER_59_0.cloverRec.CT[905]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[905]==0&false))) {{
			__CLOVER_59_0.cloverRec.S[2491]++;Instr_Inspect ins = (Instr_Inspect) instr;
			__CLOVER_59_0.cloverRec.S[2492]++;t = verifie_expr(context, ins.expr, true);
			assert ((((t != null)) && (++__CLOVER_59_0.cloverRec.CT[906]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[906]==0&false));
			__CLOVER_59_0.cloverRec.S[2493]++;if ((((!t.egaux(this.entier) && !t.egaux(this.car)) && (++__CLOVER_59_0.cloverRec.CT[907]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[907]==0&false))) {{
				__CLOVER_59_0.cloverRec.S[2494]++;erreur(new ErreurVOMB1(c, ins, t));
				//"l'expression dans l'inspect n'etre pas un type admis",
				//ins.expr.debut());
			} }else {{
				__CLOVER_59_0.cloverRec.S[2495]++;Expr e;
				__CLOVER_59_0.cloverRec.S[2496]++;Vector v;
				__CLOVER_59_0.cloverRec.S[2497]++;Type t2;
				__CLOVER_59_0.cloverRec.S[2498]++;Ensemble ens;
				__CLOVER_59_0.cloverRec.S[2499]++;boolean type_car = false;
				__CLOVER_59_0.cloverRec.S[2500]++;if ((((t.egaux(this.car)) && (++__CLOVER_59_0.cloverRec.CT[908]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[908]==0&false))) {{
					__CLOVER_59_0.cloverRec.S[2501]++;ens = new EnsembleCar(context, c, ins);
					__CLOVER_59_0.cloverRec.S[2502]++;type_car = true;
				} }else {{
					__CLOVER_59_0.cloverRec.S[2503]++;ens = new EnsembleInt(context, c, ins);
					__CLOVER_59_0.cloverRec.S[2504]++;type_car = false;
				}
				}__CLOVER_59_0.cloverRec.S[2505]++;while ((((ins != null) && (++__CLOVER_59_0.cloverRec.CT[909]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[909]==0&false))) {{
					__CLOVER_59_0.cloverRec.S[2506]++;int i;
					__CLOVER_59_0.cloverRec.S[2507]++;for (i = 0; (((i < ins.when.size()) && (++__CLOVER_59_0.cloverRec.CT[910]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[910]==0&false)); i++) {{
						__CLOVER_59_0.cloverRec.S[2508]++;v = (Vector) ins.when.elementAt(i);
						__CLOVER_59_0.cloverRec.S[2509]++;if ((((v.size() == 1) && (++__CLOVER_59_0.cloverRec.CT[911]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[911]==0&false))) {{
							__CLOVER_59_0.cloverRec.S[2510]++;e = (Expr) v.elementAt(0);
							__CLOVER_59_0.cloverRec.S[2511]++;t2 = verifie_expr(context, e, true);
							__CLOVER_59_0.cloverRec.S[2512]++;if ((((!context.est_constant(table, e)) && (++__CLOVER_59_0.cloverRec.CT[912]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[912]==0&false))) {{
								__CLOVER_59_0.cloverRec.S[2513]++;erreur(new ErreurVOMB2(c, e));
							} }else {__CLOVER_59_0.cloverRec.S[2514]++;if ((((!context.type_compatible(t2, table, t,
									table)) && (++__CLOVER_59_0.cloverRec.CT[913]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[913]==0&false))) {{
								__CLOVER_59_0.cloverRec.S[2515]++;erreur(new ErreurVOMB2(c, e, t.egaux(entier)));
								//"type incompatible pour la constante",
								//e.debut());
							} }else {{
								__CLOVER_59_0.cloverRec.S[2516]++;if ((((type_car) && (++__CLOVER_59_0.cloverRec.CT[914]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[914]==0&false))) {{
									__CLOVER_59_0.cloverRec.S[2517]++;ElementCar elt;
									__CLOVER_59_0.cloverRec.S[2518]++;char c1 = donne_valeur_char(e, table);
									__CLOVER_59_0.cloverRec.S[2519]++;elt = new ElementCar(e, c1);
									//if(!ens.contient(elt))
									__CLOVER_59_0.cloverRec.S[2520]++;ens.ajoute(elt);
									//else
									{
										//context.erreur(new
										// ErreurVOMB3(c,ins,elt,ens.elt));
									}
								} }else {{
									__CLOVER_59_0.cloverRec.S[2521]++;ElementInt elt;
									//int c1=donne_valeur_int(e,table);
									//elt=new ElementInt(e,c1);
									__CLOVER_59_0.cloverRec.S[2522]++;elt = donne_valeur_int(e, table);
									//if(!ens.contient(elt))
									__CLOVER_59_0.cloverRec.S[2523]++;ens.ajoute(elt);
								}
							}}
						}}} }else {__CLOVER_59_0.cloverRec.S[2524]++;if ((((v.size() == 2) && (++__CLOVER_59_0.cloverRec.CT[915]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[915]==0&false))) {{
							__CLOVER_59_0.cloverRec.S[2525]++;int nb_ok = 0;
							__CLOVER_59_0.cloverRec.S[2526]++;Expr e1, e2;
							__CLOVER_59_0.cloverRec.S[2527]++;e1 = e = (Expr) v.elementAt(0);
							__CLOVER_59_0.cloverRec.S[2528]++;t2 = verifie_expr(context, e, true);
							__CLOVER_59_0.cloverRec.S[2529]++;if ((((!context.est_constant(table, e)) && (++__CLOVER_59_0.cloverRec.CT[916]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[916]==0&false))) {{
								__CLOVER_59_0.cloverRec.S[2530]++;erreur(new ErreurVOMB2(c, e));
							} }else {__CLOVER_59_0.cloverRec.S[2531]++;if ((((!context.type_compatible(t2, table, t,
									table)) && (++__CLOVER_59_0.cloverRec.CT[917]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[917]==0&false))) {{
								__CLOVER_59_0.cloverRec.S[2532]++;erreur(new ErreurVOMB2(c, e, t.egaux(entier)));
								//"type incompatible pour la constante",
								//e.debut());
							} }else
								{__CLOVER_59_0.cloverRec.S[2533]++;nb_ok++;
							}}__CLOVER_59_0.cloverRec.S[2534]++;e2 = e = (Expr) v.elementAt(1);
							__CLOVER_59_0.cloverRec.S[2535]++;t2 = verifie_expr(context, e, true);
							__CLOVER_59_0.cloverRec.S[2536]++;if ((((!context.est_constant(table, e)) && (++__CLOVER_59_0.cloverRec.CT[918]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[918]==0&false))) {{
								__CLOVER_59_0.cloverRec.S[2537]++;erreur(new ErreurVOMB2(c, e));
							} }else {__CLOVER_59_0.cloverRec.S[2538]++;if ((((!context.type_compatible(t2, table, t,
									table)) && (++__CLOVER_59_0.cloverRec.CT[919]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[919]==0&false))) {{
								__CLOVER_59_0.cloverRec.S[2539]++;erreur(new ErreurVOMB2(c, e, t.egaux(entier)));
								//"type incompatible pour la constante",
								//e.debut());
							} }else
								{__CLOVER_59_0.cloverRec.S[2540]++;nb_ok++;
							}}{
								__CLOVER_59_0.cloverRec.S[2541]++;if ((((nb_ok == 2) && (++__CLOVER_59_0.cloverRec.CT[920]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[920]==0&false))) {{
									__CLOVER_59_0.cloverRec.S[2542]++;if ((((type_car) && (++__CLOVER_59_0.cloverRec.CT[921]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[921]==0&false))) {{
										__CLOVER_59_0.cloverRec.S[2543]++;ElementCar elt, elt2;
										__CLOVER_59_0.cloverRec.S[2544]++;char c1 = donne_valeur_char(e1, table);
										__CLOVER_59_0.cloverRec.S[2545]++;char c2 = donne_valeur_char(e2, table);
										__CLOVER_59_0.cloverRec.S[2546]++;elt = new ElementCar(e1, c1);
										__CLOVER_59_0.cloverRec.S[2547]++;elt2 = new ElementCar(e2, c2);
										__CLOVER_59_0.cloverRec.S[2548]++;ens.ajoute(elt, elt2);
									} }else {{
										__CLOVER_59_0.cloverRec.S[2549]++;ElementInt elt, elt2;
										__CLOVER_59_0.cloverRec.S[2550]++;elt = donne_valeur_int(e1, table);
										__CLOVER_59_0.cloverRec.S[2551]++;elt2 = donne_valeur_int(e2, table);
										__CLOVER_59_0.cloverRec.S[2552]++;ens.ajoute(elt, elt2);
									}
								}}
							}}
						} }else {{
							__CLOVER_59_0.cloverRec.S[2553]++;erreur("plus de 2 suites de constante", ins.debut());
						}
					}}}
					}__CLOVER_59_0.cloverRec.S[2554]++;verifie_liste_instr(context, ins.liste_instr);
					__CLOVER_59_0.cloverRec.S[2555]++;ins = (Instr_Inspect) ins.getSuivant();
				}
			}}
		}} }else {__CLOVER_59_0.cloverRec.S[2556]++;if ((((instr instanceof Instr_Appel) && (++__CLOVER_59_0.cloverRec.CT[922]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[922]==0&false))) {{
			__CLOVER_59_0.cloverRec.S[2557]++;Instr_Appel ins = (Instr_Appel) instr;
			__CLOVER_59_0.cloverRec.S[2558]++;int i;
			__CLOVER_59_0.cloverRec.S[2559]++;boolean erreur = false;
			__CLOVER_59_0.cloverRec.S[2560]++;if ((((ins.nom != null) && (++__CLOVER_59_0.cloverRec.CT[923]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[923]==0&false))) {{
				__CLOVER_59_0.cloverRec.S[2561]++;Vector v = new Vector();
				__CLOVER_59_0.cloverRec.S[2562]++;if ((((ins.parametre != null) && (++__CLOVER_59_0.cloverRec.CT[924]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[924]==0&false))) {{
					__CLOVER_59_0.cloverRec.S[2563]++;for (i = 0; (((i < ins.parametre.length) && (++__CLOVER_59_0.cloverRec.CT[925]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[925]==0&false)); i++) {{
						__CLOVER_59_0.cloverRec.S[2564]++;v.addElement(ins.parametre[i]);
					}
				}}
				}__CLOVER_59_0.cloverRec.S[2565]++;t = verifie_appel(context, new NomFeature(ins.nom), v, null,
						ins.debut(), true);
			} }else {{
				__CLOVER_59_0.cloverRec.S[2566]++;t = verifie_expr(context, ins.expr, true);
			}
			//assert(t!=null);
			}__CLOVER_59_0.cloverRec.S[2567]++;if ((((t == null && ins.getSuivant() != null) && (++__CLOVER_59_0.cloverRec.CT[926]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[926]==0&false))) {{// Erreur VKCN2
				__CLOVER_59_0.cloverRec.S[2568]++;erreur(new ErreurVKCN2(c, ins));
			} }else {{
				__CLOVER_59_0.cloverRec.S[2569]++;ins = (Instr_Appel) ins.getSuivant();
				__CLOVER_59_0.cloverRec.S[2570]++;while ((((ins != null) && (++__CLOVER_59_0.cloverRec.CT[927]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[927]==0&false))) {{
					//assert(!ins.nom.equalsIgnoreCase("tata2"));
					assert ((((t != null)) && (++__CLOVER_59_0.cloverRec.CT[928]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[928]==0&false));
					__CLOVER_59_0.cloverRec.S[2571]++;Classe cl = context.cherche_classe(t);
					__CLOVER_59_0.cloverRec.S[2572]++;System.out.println("debut1:" + ins.nom + "type=" + t);
					__CLOVER_59_0.cloverRec.S[2573]++;if ((((cl != null) && (++__CLOVER_59_0.cloverRec.CT[929]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[929]==0&false))) {{
						//context.classe_courante=cl;
						__CLOVER_59_0.cloverRec.S[2574]++;System.out.println("debut2");
						__CLOVER_59_0.cloverRec.S[2575]++;Attribut_Complet a1 = context.donne_attribut(
								new NomFeature(ins.nom), cl);
						__CLOVER_59_0.cloverRec.S[2576]++;if ((((a1 == null) && (++__CLOVER_59_0.cloverRec.CT[930]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[930]==0&false))) {{
							__CLOVER_59_0.cloverRec.S[2577]++;erreur(new ErreurVUEX2(cl, new NomFeature(ins.nom),
									ins.debut())
							/*
							 * "la fonction " + ins.nom + " n'existe pas dans la
							 * classe " + cl.nom, ins.debut()
							 */);
							__CLOVER_59_0.cloverRec.S[2578]++;erreur = true;
						} }else {{
							__CLOVER_59_0.cloverRec.S[2579]++;System.out.println("debut3");
							__CLOVER_59_0.cloverRec.S[2580]++;Vector v = new Vector();
							__CLOVER_59_0.cloverRec.S[2581]++;if ((((ins.parametre != null) && (++__CLOVER_59_0.cloverRec.CT[931]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[931]==0&false))) {{
								__CLOVER_59_0.cloverRec.S[2582]++;for (i = 0; (((i < ins.parametre.length) && (++__CLOVER_59_0.cloverRec.CT[932]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[932]==0&false)); i++) {{
									__CLOVER_59_0.cloverRec.S[2583]++;v.addElement(ins.parametre[i]);
								}
							}}
							}__CLOVER_59_0.cloverRec.S[2584]++;t = verifie_appel(context, new NomFeature(ins.nom),
									v, cl, ins.debut(), false);
							__CLOVER_59_0.cloverRec.S[2585]++;System.out.println("debut4");
						}
						//context.classe_courante=c;
					}} }else {{
						__CLOVER_59_0.cloverRec.S[2586]++;erreur = true;
						__CLOVER_59_0.cloverRec.S[2587]++;break;
					}
					//assert(!ins.nom.equalsIgnoreCase("tata2"));
					}__CLOVER_59_0.cloverRec.S[2588]++;ins = (Instr_Appel) ins.getSuivant();
				}
				}__CLOVER_59_0.cloverRec.S[2589]++;if ((((!erreur && t != null) && (++__CLOVER_59_0.cloverRec.CT[933]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[933]==0&false))) {{// Erreur VKCN2
					//a1 = context.donne_attribut(nom, c);
					__CLOVER_59_0.cloverRec.S[2590]++;Instr_Appel ins2 = (Instr_Appel) instr;
					__CLOVER_59_0.cloverRec.S[2591]++;while ((((ins2.getSuivant() != null) && (++__CLOVER_59_0.cloverRec.CT[934]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[934]==0&false)))
						{__CLOVER_59_0.cloverRec.S[2592]++;ins2 = (Instr_Appel) ins2.getSuivant();
					}__CLOVER_59_0.cloverRec.S[2593]++;erreur(new ErreurVKCN2(c, ins2));
				}
			}}
		}} }else {__CLOVER_59_0.cloverRec.S[2594]++;if ((((instr instanceof Instr_Creation) && (++__CLOVER_59_0.cloverRec.CT[935]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[935]==0&false))) {{
			__CLOVER_59_0.cloverRec.S[2595]++;Instr_Creation ins = (Instr_Creation) instr;
			__CLOVER_59_0.cloverRec.S[2596]++;Vector v = new Vector();
			__CLOVER_59_0.cloverRec.S[2597]++;int i;
			__CLOVER_59_0.cloverRec.S[2598]++;String n;
			__CLOVER_59_0.cloverRec.S[2599]++;Type type_creation = null;
			__CLOVER_59_0.cloverRec.S[2600]++;Classe cl, cl_creation;
			/*
			 * if(ins.type!=null) cl=context.cherche_classe(ins.type); else {
			 */
			__CLOVER_59_0.cloverRec.S[2601]++;if ((((!context.var_existe(ins.nom)) && (++__CLOVER_59_0.cloverRec.CT[936]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[936]==0&false))) {{
				__CLOVER_59_0.cloverRec.S[2602]++;logging.erreur(new ErreurVEEN(c, ins.nom, ins.tid));
			} }else {__CLOVER_59_0.cloverRec.S[2603]++;if ((((!context.variable_assignable(ins.nom, ins.tid.debut())) && (++__CLOVER_59_0.cloverRec.CT[937]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[937]==0&false))) {{
				__CLOVER_59_0.cloverRec.S[2604]++;logging.erreur(new ErreurAffect(c, ins, ins.nom));
			} }else {{
				__CLOVER_59_0.cloverRec.S[2605]++;t = context.donne_type_var(ins.nom, ins.tid.debut());
				__CLOVER_59_0.cloverRec.S[2606]++;if ((((t == null) && (++__CLOVER_59_0.cloverRec.CT[938]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[938]==0&false))) {{
					//erreur();
					//erreur("attribut " + ins.nom + " inconnue", ins.debut());
					__CLOVER_59_0.cloverRec.S[2607]++;return;
				}
				}__CLOVER_59_0.cloverRec.S[2608]++;type_creation = t;
				__CLOVER_59_0.cloverRec.S[2609]++;cl = context.cherche_classe(t);
				__CLOVER_59_0.cloverRec.S[2610]++;cl_creation = cl;
				//assert(cl!=null);
				//}
				__CLOVER_59_0.cloverRec.S[2611]++;if ((((ins.type != null) && (++__CLOVER_59_0.cloverRec.CT[939]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[939]==0&false))) {{
					__CLOVER_59_0.cloverRec.S[2612]++;Classe cl0 = context.cherche_classe(ins.type);
					__CLOVER_59_0.cloverRec.S[2613]++;if ((((!context.type_compatible(ins.type, table, t, table)) && (++__CLOVER_59_0.cloverRec.CT[940]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[940]==0&false))) {{
						//erreur(
						//	"le type de creation est incompatible avec la
						// variable",
						//	ins.debut());
						__CLOVER_59_0.cloverRec.S[2614]++;erreur(new ErreurVGCC3(c, ins, ins.type, t));
					}
					}__CLOVER_59_0.cloverRec.S[2615]++;type_creation = ins.type;
					__CLOVER_59_0.cloverRec.S[2616]++;cl_creation = cl0;
				}
				}assert ((((type_creation != null)) && (++__CLOVER_59_0.cloverRec.CT[941]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[941]==0&false));
				__CLOVER_59_0.cloverRec.S[2617]++;if ((((table.type_generique(type_creation)) && (++__CLOVER_59_0.cloverRec.CT[942]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[942]==0&false))) {{// Erreur VGCC1
					__CLOVER_59_0.cloverRec.S[2618]++;erreur(new ErreurVGCC1(c, ins, type_creation));
				} }else {__CLOVER_59_0.cloverRec.S[2619]++;if ((((cl_creation.deferred) && (++__CLOVER_59_0.cloverRec.CT[943]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[943]==0&false))) {{// Erreur VGCC2
					__CLOVER_59_0.cloverRec.S[2620]++;erreur(new ErreurVGCC2(c, ins, type_creation));
				} }else {{
					__CLOVER_59_0.cloverRec.S[2621]++;if ((((ins.parametre != null) && (++__CLOVER_59_0.cloverRec.CT[944]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[944]==0&false))) {{
						__CLOVER_59_0.cloverRec.S[2622]++;for (i = 0; (((i < ins.parametre.length) && (++__CLOVER_59_0.cloverRec.CT[945]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[945]==0&false)); i++) {{
							__CLOVER_59_0.cloverRec.S[2623]++;v.addElement(ins.parametre[i]);
						}
					}}
					}__CLOVER_59_0.cloverRec.S[2624]++;if ((((cl_creation.creation == null
							|| cl_creation.creation.length == 0) && (++__CLOVER_59_0.cloverRec.CT[946]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[946]==0&false))) {{
						__CLOVER_59_0.cloverRec.S[2625]++;if ((((ins.nom2 != null) && (++__CLOVER_59_0.cloverRec.CT[947]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[947]==0&false))) {{
							__CLOVER_59_0.cloverRec.S[2626]++;erreur(new ErreurVGCC4(c, ins, type_creation));
						}
					}} }else {{
						__CLOVER_59_0.cloverRec.S[2627]++;if ((((ins.nom2 == null) && (++__CLOVER_59_0.cloverRec.CT[948]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[948]==0&false))) {{
							__CLOVER_59_0.cloverRec.S[2628]++;erreur(new ErreurVGCC5(c, ins, type_creation,
									ErreurVGCC5.pas_appel));
						} }else {{
							__CLOVER_59_0.cloverRec.S[2629]++;Creation cr;
							__CLOVER_59_0.cloverRec.S[2630]++;NomFeature n1, n2;
							__CLOVER_59_0.cloverRec.S[2631]++;boolean trouve = false;
							__CLOVER_59_0.cloverRec.S[2632]++;n1 = new NomFeature(ins.nom2);
							__CLOVER_59_0.cloverRec.S[2633]++;for (int j = 0; (((!trouve
									&& j < cl_creation.creation.length) && (++__CLOVER_59_0.cloverRec.CT[949]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[949]==0&false)); j++) {{
								__CLOVER_59_0.cloverRec.S[2634]++;cr = cl_creation.creation[j];
								assert ((((cr != null)) && (++__CLOVER_59_0.cloverRec.CT[950]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[950]==0&false));
								__CLOVER_59_0.cloverRec.S[2635]++;if ((((cr.nom_fonction != null) && (++__CLOVER_59_0.cloverRec.CT[951]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[951]==0&false))) {{
									__CLOVER_59_0.cloverRec.S[2636]++;for (int k = 0; (((!trouve
											&& k < cr.nom_fonction.length) && (++__CLOVER_59_0.cloverRec.CT[952]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[952]==0&false)); k++) {{
										__CLOVER_59_0.cloverRec.S[2637]++;n2 = cr.nom_fonction[k];
										assert ((((n2 != null)) && (++__CLOVER_59_0.cloverRec.CT[953]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[953]==0&false));
										__CLOVER_59_0.cloverRec.S[2638]++;if ((((n2.equals(n1)) && (++__CLOVER_59_0.cloverRec.CT[954]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[954]==0&false))) {{
											__CLOVER_59_0.cloverRec.S[2639]++;trouve = true;
											__CLOVER_59_0.cloverRec.S[2640]++;if ((((cr.liste_type != null
													&& cr.liste_type.length > 0) && (++__CLOVER_59_0.cloverRec.CT[955]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[955]==0&false))) {{// recherche
																				  // si
																				  // incompatibilite
																				  // d'exportation
												__CLOVER_59_0.cloverRec.S[2641]++;boolean t0 = false;
												__CLOVER_59_0.cloverRec.S[2642]++;Type t1 = null;
												__CLOVER_59_0.cloverRec.S[2643]++;Table_Symbol table2;
												__CLOVER_59_0.cloverRec.S[2644]++;for (int m = 0; (((m < cr.liste_type.length) && (++__CLOVER_59_0.cloverRec.CT[956]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[956]==0&false)); m++) {{
													__CLOVER_59_0.cloverRec.S[2645]++;t1 = cr.liste_type[m];
													__CLOVER_59_0.cloverRec.S[2646]++;if ((((t1 != null) && (++__CLOVER_59_0.cloverRec.CT[957]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[957]==0&false))) {{
														__CLOVER_59_0.cloverRec.S[2647]++;table2 = context
																.donne_table_symbol(t1);
														__CLOVER_59_0.cloverRec.S[2648]++;if ((((t1 != null
																&& table2 != null
																&& context
																		.type_compatible(
																				c.type,
																				table,
																				t1,
																				table2)) && (++__CLOVER_59_0.cloverRec.CT[958]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[958]==0&false))) {{// trouver
																						  // un
																						  // type
																						  // compatible
															__CLOVER_59_0.cloverRec.S[2649]++;t0 = true;
															__CLOVER_59_0.cloverRec.S[2650]++;break;
														}
													}}
												}}
												}__CLOVER_59_0.cloverRec.S[2651]++;if ((((!t0) && (++__CLOVER_59_0.cloverRec.CT[959]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[959]==0&false))) {{// Aucun type n'est
														  // compatible
													//assert(t1!=null);
													__CLOVER_59_0.cloverRec.S[2652]++;erreur(new ErreurVGCC6(c,
															ins));
												}
											}}
											}__CLOVER_59_0.cloverRec.S[2653]++;break;
										}
									}}
								}}
							}}
							}__CLOVER_59_0.cloverRec.S[2654]++;if ((((!trouve) && (++__CLOVER_59_0.cloverRec.CT[960]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[960]==0&false))) {{
								__CLOVER_59_0.cloverRec.S[2655]++;erreur(new ErreurVGCC5(c, ins, type_creation,
										ErreurVGCC5.pas_fonction));
							}
						}}
					}}
					}__CLOVER_59_0.cloverRec.S[2656]++;if ((((ins.nom2 != null && !ins.nom2.equalsIgnoreCase("")) && (++__CLOVER_59_0.cloverRec.CT[961]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[961]==0&false))) {{
						__CLOVER_59_0.cloverRec.S[2657]++;n = ins.nom2;
					} }else {{
						__CLOVER_59_0.cloverRec.S[2658]++;n = ins.nom;
						//context.classe_courante=cl;
					}
					}__CLOVER_59_0.cloverRec.S[2659]++;if ((((!context.var_existe(ins.nom)) && (++__CLOVER_59_0.cloverRec.CT[962]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[962]==0&false))) {{// variable inexistante
						__CLOVER_59_0.cloverRec.S[2660]++;erreur(new ErreurVEEN(c, ins.nom, ins.tid));
					} }else {{
						__CLOVER_59_0.cloverRec.S[2661]++;Type t1 = context.donne_type_var(ins.nom, ins.tid
								.debut());
						__CLOVER_59_0.cloverRec.S[2662]++;if ((((t1 == null) && (++__CLOVER_59_0.cloverRec.CT[963]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[963]==0&false))) {{
							__CLOVER_59_0.cloverRec.S[2663]++;erreur("la variable " + ins.nom
									+ " n'est pas declar\u00e9e", ins.debut());
						} }else {{
							__CLOVER_59_0.cloverRec.S[2664]++;if ((((ins.type != null
									&& !context.type_compatible(t1, table,
											ins.type, table)) && (++__CLOVER_59_0.cloverRec.CT[964]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[964]==0&false))) {{
								/*
								 * erreur( "type incompatible pour l'instruction
								 * de cr\u00e9ation:" + t1.nom, ins.debut());
								 */
								__CLOVER_59_0.cloverRec.S[2665]++;erreur(new ErreurVGCC3(c, ins, type_creation, t));
							} }else {__CLOVER_59_0.cloverRec.S[2666]++;if ((((context.type_expanded(type_creation,
									table)) && (++__CLOVER_59_0.cloverRec.CT[965]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[965]==0&false))) {{
								__CLOVER_59_0.cloverRec.S[2667]++;erreur(new ErreurVGCC3(c, ins, type_creation));
							} }else {{
								__CLOVER_59_0.cloverRec.S[2668]++;if ((((ins.nom2 != null
										&& !ins.nom2.equalsIgnoreCase("")) && (++__CLOVER_59_0.cloverRec.CT[966]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[966]==0&false))) {{
									__CLOVER_59_0.cloverRec.S[2669]++;System.out.println("classe0:" + c.nom);
									//verifie_appel(context, ins.nom2, v,
									// cl,ins.debut(),false);
									__CLOVER_59_0.cloverRec.S[2670]++;Attribut_Complet a1 = context
											.donne_attribut(new NomFeature(
													ins.nom2), cl);
									__CLOVER_59_0.cloverRec.S[2671]++;if ((((a1 != null) && (++__CLOVER_59_0.cloverRec.CT[967]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[967]==0&false))) {{
										__CLOVER_59_0.cloverRec.S[2672]++;Feature f1;
										__CLOVER_59_0.cloverRec.S[2673]++;verifie_a_valide(context,
												new NomFeature(ins.nom2), v,
												cl, ins.debut(), a1);
										__CLOVER_59_0.cloverRec.S[2674]++;f1 = a1.getFeature();
										__CLOVER_59_0.cloverRec.S[2675]++;if ((((f1.type_retour != null) && (++__CLOVER_59_0.cloverRec.CT[968]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[968]==0&false))) {{
											__CLOVER_59_0.cloverRec.S[2676]++;erreur(new ErreurVGCC6(c, ins, f1,
													ErreurVGCC6.retour));
										} }else {__CLOVER_59_0.cloverRec.S[2677]++;if ((((f1 instanceof FeatureRoutine
												&& ((FeatureRoutine) f1).once) && (++__CLOVER_59_0.cloverRec.CT[969]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[969]==0&false))) {{
											__CLOVER_59_0.cloverRec.S[2678]++;erreur(new ErreurVGCC6(c, ins, f1,
													ErreurVGCC6.once));
										}
									}}}
								}}
							}}
						}}}
					}}
				}}
			}}}
			//context.classe_courante=c;
		}}} }else {{
			__CLOVER_59_0.cloverRec.S[2679]++;erreur("Instruction inconnue", instr.debut());
		}
	}}}}}}}}}}}

	public static Properties prop = null;

	public char donne_valeur_char(Expr e, Table_Symbol table) {__CLOVER_59_0.cloverRec.M[357]++;
		assert ((((e != null)) && (++__CLOVER_59_0.cloverRec.CT[970]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[970]==0&false));
		assert ((((table != null)) && (++__CLOVER_59_0.cloverRec.CT[971]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[971]==0&false));
		__CLOVER_59_0.cloverRec.S[2680]++;boolean __CLOVER_bool1=false;switch (e.op) {
		case Expr.Char:if (!__CLOVER_bool1) {__CLOVER_59_0.cloverRec.S[2681]++;__CLOVER_bool1=true;}
			__CLOVER_59_0.cloverRec.S[2682]++;Expr_Car e2 = (Expr_Car) e;
			__CLOVER_59_0.cloverRec.S[2683]++;if ((((e2.car.length() == 3) && (++__CLOVER_59_0.cloverRec.CT[972]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[972]==0&false)))
				{__CLOVER_59_0.cloverRec.S[2684]++;return e2.car.charAt(1);
			}else {__CLOVER_59_0.cloverRec.S[2685]++;if ((((e2.car.matches("\'(.)?\'")) && (++__CLOVER_59_0.cloverRec.CT[973]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[973]==0&false)))
				{assert ((((false)) && (++__CLOVER_59_0.cloverRec.CT[974]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[974]==0&false));
			}}__CLOVER_59_0.cloverRec.S[2686]++;break;
		case Expr.Var:if (!__CLOVER_bool1) {__CLOVER_59_0.cloverRec.S[2687]++;__CLOVER_bool1=true;}
			__CLOVER_59_0.cloverRec.S[2688]++;Expr_Var e3 = (Expr_Var) e;
			__CLOVER_59_0.cloverRec.S[2689]++;Attribut_Complet ac = table.trouve_attribut(e3.nom);
			assert ((((ac != null)) && (++__CLOVER_59_0.cloverRec.CT[975]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[975]==0&false));
			assert ((((ac.getFeature() instanceof FeatureExpr)) && (++__CLOVER_59_0.cloverRec.CT[976]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[976]==0&false));
			__CLOVER_59_0.cloverRec.S[2690]++;Expr e4;
			__CLOVER_59_0.cloverRec.S[2691]++;e4 = ((FeatureExpr) ac.getFeature()).expr;
			assert ((((e4 != null)) && (++__CLOVER_59_0.cloverRec.CT[977]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[977]==0&false));
			// TODO : eviter une recursivite infini
			//assert(e4 instanceof)
			//Expr_Car e5;
			__CLOVER_59_0.cloverRec.S[2692]++;return donne_valeur_char(e4, table);
		//break;
		default:if (!__CLOVER_bool1) {__CLOVER_59_0.cloverRec.S[2693]++;__CLOVER_bool1=true;}
			assert ((((false)) && (++__CLOVER_59_0.cloverRec.CT[978]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[978]==0&false));
		}
		__CLOVER_59_0.cloverRec.S[2694]++;return '_';
	}

	public ElementInt donne_valeur_int(Expr e, Table_Symbol table) {__CLOVER_59_0.cloverRec.M[358]++;
		assert ((((e != null)) && (++__CLOVER_59_0.cloverRec.CT[979]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[979]==0&false));
		assert ((((table != null)) && (++__CLOVER_59_0.cloverRec.CT[980]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[980]==0&false));
		__CLOVER_59_0.cloverRec.S[2695]++;ElementInt res = null;
		//elt=new ElementInt(e1,c1);
		__CLOVER_59_0.cloverRec.S[2696]++;boolean __CLOVER_bool2=false;switch (e.op) {
		case Expr.Entier:if (!__CLOVER_bool2) {__CLOVER_59_0.cloverRec.S[2697]++;__CLOVER_bool2=true;}
			__CLOVER_59_0.cloverRec.S[2698]++;Expr_Entier e2 = (Expr_Entier) e;
			__CLOVER_59_0.cloverRec.S[2699]++;if ((((e2.str.matches("[\\+-]?[0-9]+")) && (++__CLOVER_59_0.cloverRec.CT[981]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[981]==0&false))) {{
				__CLOVER_59_0.cloverRec.S[2700]++;Integer i = new Integer(e2.str);
				__CLOVER_59_0.cloverRec.S[2701]++;res = new ElementInt(e, i.intValue());
				__CLOVER_59_0.cloverRec.S[2702]++;return res;//i.intValue();
			}
			}assert ((((false)) && (++__CLOVER_59_0.cloverRec.CT[982]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[982]==0&false));
			__CLOVER_59_0.cloverRec.S[2703]++;break;
		case Expr.Var:if (!__CLOVER_bool2) {__CLOVER_59_0.cloverRec.S[2704]++;__CLOVER_bool2=true;}
			__CLOVER_59_0.cloverRec.S[2705]++;Expr_Var e3 = (Expr_Var) e;
			__CLOVER_59_0.cloverRec.S[2706]++;Attribut_Complet ac = table.trouve_attribut(e3.nom);
			assert ((((ac != null)) && (++__CLOVER_59_0.cloverRec.CT[983]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[983]==0&false));
			__CLOVER_59_0.cloverRec.S[2707]++;if ((((ac.getFeature() instanceof FeatureExpr) && (++__CLOVER_59_0.cloverRec.CT[984]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[984]==0&false))) {{// feature constante
				__CLOVER_59_0.cloverRec.S[2708]++;Expr e4;
				__CLOVER_59_0.cloverRec.S[2709]++;e4 = ((FeatureExpr) ac.getFeature()).expr;
				assert ((((e4 != null)) && (++__CLOVER_59_0.cloverRec.CT[985]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[985]==0&false));
				// TODO : eviter une recursivite infini
				//assert(e4 instanceof)
				//Expr_Car e5;
				__CLOVER_59_0.cloverRec.S[2710]++;ElementInt ei = donne_valeur_int(e4, table);
				__CLOVER_59_0.cloverRec.S[2711]++;return new ElementInt(e, ei.valeur);
			} }else {__CLOVER_59_0.cloverRec.S[2712]++;if ((((ac.getFeature() instanceof FeatureUnique) && (++__CLOVER_59_0.cloverRec.CT[986]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[986]==0&false))) {{// feature
																  // unique
				__CLOVER_59_0.cloverRec.S[2713]++;res = new ElementInt(e, table.classe, (FeatureUnique) ac
						.getFeature());
				__CLOVER_59_0.cloverRec.S[2714]++;return res;
			} }else {{
				assert ((((false) ) && (++__CLOVER_59_0.cloverRec.CT[987]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[987]==0&false)): e3.nom;
			}
			}}__CLOVER_59_0.cloverRec.S[2715]++;break;
		case Expr.PlusU:if (!__CLOVER_bool2) {__CLOVER_59_0.cloverRec.S[2716]++;__CLOVER_bool2=true;}
			__CLOVER_59_0.cloverRec.S[2717]++;Expr_Unaire e5 = (Expr_Unaire) e;
			__CLOVER_59_0.cloverRec.S[2718]++;res = donne_valeur_int(e5.expr1, table);
			//res.valeur=-res.valeur;
			__CLOVER_59_0.cloverRec.S[2719]++;return res;//donne_valeur_int(e5.expr1,table);
		case Expr.MoinsU:if (!__CLOVER_bool2) {__CLOVER_59_0.cloverRec.S[2720]++;__CLOVER_bool2=true;}
			__CLOVER_59_0.cloverRec.S[2721]++;Expr_Unaire e6 = (Expr_Unaire) e;
			__CLOVER_59_0.cloverRec.S[2722]++;res = donne_valeur_int(e6.expr1, table);
			__CLOVER_59_0.cloverRec.S[2723]++;res.valeur = -res.valeur;
			__CLOVER_59_0.cloverRec.S[2724]++;return res;//-donne_valeur_int(e6.expr1,table);
		default:if (!__CLOVER_bool2) {__CLOVER_59_0.cloverRec.S[2725]++;__CLOVER_bool2=true;}
			assert ((((false)) && (++__CLOVER_59_0.cloverRec.CT[988]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[988]==0&false));
		}
		__CLOVER_59_0.cloverRec.S[2726]++;return null;
	}

	public void verifie_liste_assertion(Classe c, Feature f, Assert ass[],
			int lieux) {__CLOVER_59_0.cloverRec.M[359]++;
		__CLOVER_59_0.cloverRec.S[2727]++;int i;
		__CLOVER_59_0.cloverRec.S[2728]++;Assert a;
		__CLOVER_59_0.cloverRec.S[2729]++;Type t;

		assert ((((lieux >= dans_invariant && lieux <= dans_check)) && (++__CLOVER_59_0.cloverRec.CT[989]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[989]==0&false));
		__CLOVER_59_0.cloverRec.S[2730]++;if ((((ass == null) && (++__CLOVER_59_0.cloverRec.CT[990]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[990]==0&false))) {{
			__CLOVER_59_0.cloverRec.S[2731]++;return;
		}
		}__CLOVER_59_0.cloverRec.S[2732]++;if ((((lieux == dans_ensure) && (++__CLOVER_59_0.cloverRec.CT[991]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[991]==0&false)))
			{__CLOVER_59_0.cloverRec.S[2733]++;context.dans_ensure = true;
		}__CLOVER_59_0.cloverRec.S[2734]++;for (i = 0; (((i < ass.length) && (++__CLOVER_59_0.cloverRec.CT[992]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[992]==0&false)); i++) {{
			__CLOVER_59_0.cloverRec.S[2735]++;a = ass[i];
			__CLOVER_59_0.cloverRec.S[2736]++;if ((((a.expr != null) && (++__CLOVER_59_0.cloverRec.CT[993]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[993]==0&false))) {{
				__CLOVER_59_0.cloverRec.S[2737]++;t = verifie_expr(context, a.expr, true);
				__CLOVER_59_0.cloverRec.S[2738]++;if ((((t != null && !t.egaux(bool)) && (++__CLOVER_59_0.cloverRec.CT[994]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[994]==0&false))) {{//t.nom.compareToIgnoreCase("boolean")
												  // != 0) {
					//erreur("l'assertion n'est pas un booleen",
					// a.expr.debut());
					__CLOVER_59_0.cloverRec.S[2739]++;int no = -1;
					__CLOVER_59_0.cloverRec.S[2740]++;boolean __CLOVER_bool3=false;switch (lieux) {
					case dans_require:if (!__CLOVER_bool3) {__CLOVER_59_0.cloverRec.S[2741]++;__CLOVER_bool3=true;}
						__CLOVER_59_0.cloverRec.S[2742]++;no = ErreurVWBE.type_require;
						__CLOVER_59_0.cloverRec.S[2743]++;break;
					case dans_invariant:if (!__CLOVER_bool3) {__CLOVER_59_0.cloverRec.S[2744]++;__CLOVER_bool3=true;}
						__CLOVER_59_0.cloverRec.S[2745]++;no = ErreurVWBE.type_invariant;
						__CLOVER_59_0.cloverRec.S[2746]++;break;
					case dans_invariant_boucle:if (!__CLOVER_bool3) {__CLOVER_59_0.cloverRec.S[2747]++;__CLOVER_bool3=true;}
						__CLOVER_59_0.cloverRec.S[2748]++;no = ErreurVWBE.type_loop_inv;
						__CLOVER_59_0.cloverRec.S[2749]++;break;
					case dans_ensure:if (!__CLOVER_bool3) {__CLOVER_59_0.cloverRec.S[2750]++;__CLOVER_bool3=true;}
						__CLOVER_59_0.cloverRec.S[2751]++;no = ErreurVWBE.type_ensure;
						__CLOVER_59_0.cloverRec.S[2752]++;break;
					case dans_check:if (!__CLOVER_bool3) {__CLOVER_59_0.cloverRec.S[2753]++;__CLOVER_bool3=true;}
						__CLOVER_59_0.cloverRec.S[2754]++;no = ErreurVWBE.type_check;
						__CLOVER_59_0.cloverRec.S[2755]++;break;
					default:if (!__CLOVER_bool3) {__CLOVER_59_0.cloverRec.S[2756]++;__CLOVER_bool3=true;}
						assert ((((false)) && (++__CLOVER_59_0.cloverRec.CT[995]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[995]==0&false));
					}
					__CLOVER_59_0.cloverRec.S[2757]++;erreur(new ErreurVWBE(c, a.expr, no));
				}
			}}
		}}
		}__CLOVER_59_0.cloverRec.S[2758]++;if ((((lieux == dans_ensure) && (++__CLOVER_59_0.cloverRec.CT[996]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[996]==0&false)))
			{__CLOVER_59_0.cloverRec.S[2759]++;context.dans_ensure = false;
	}}

	public Type verifie_appel(Context context, NomFeature nom,
			Vector parametre, Classe c0, Position pos, boolean cible) {__CLOVER_59_0.cloverRec.M[360]++;
		__CLOVER_59_0.cloverRec.S[2760]++;Attribut_Complet a1;
		__CLOVER_59_0.cloverRec.S[2761]++;Type t1, t2;
		__CLOVER_59_0.cloverRec.S[2762]++;int i;
		__CLOVER_59_0.cloverRec.S[2763]++;Classe c; //=context.classe_courante;
		__CLOVER_59_0.cloverRec.S[2764]++;Feature f = env.feature;//context.feature_courante;
		assert ((((pos != null)) && (++__CLOVER_59_0.cloverRec.CT[997]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[997]==0&false));
		assert ((((nom != null)) && (++__CLOVER_59_0.cloverRec.CT[998]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[998]==0&false));

		__CLOVER_59_0.cloverRec.S[2765]++;if ((((c0 == null) && (++__CLOVER_59_0.cloverRec.CT[999]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[999]==0&false))) {{
			__CLOVER_59_0.cloverRec.S[2766]++;c = env.classe;//context.classe_courante;
		} }else {{
			__CLOVER_59_0.cloverRec.S[2767]++;c = c0;
		}
		}assert ((((c != null)) && (++__CLOVER_59_0.cloverRec.CT[1000]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1000]==0&false));
		__CLOVER_59_0.cloverRec.S[2768]++;Table_Symbol table = context.donne_table_symbol(c);

		__CLOVER_59_0.cloverRec.S[2769]++;a1 = context.donne_attribut(nom, c);
		__CLOVER_59_0.cloverRec.S[2770]++;if ((((a1 != null) && (++__CLOVER_59_0.cloverRec.CT[1001]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1001]==0&false))) {{
			assert ((((table == a1.table_symbol)) && (++__CLOVER_59_0.cloverRec.CT[1002]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1002]==0&false));
			//assert(!nom.nom.equalsIgnoreCase("tata")):"p="+parametre.size()+";p[0]="+parametre.elementAt(0);
			__CLOVER_59_0.cloverRec.S[2771]++;verifie_a_valide(context, nom, parametre, c, pos, a1);
			__CLOVER_59_0.cloverRec.S[2772]++;t1 = a1.donne_type_retour(context);
			__CLOVER_59_0.cloverRec.S[2773]++;if ((((t1 != null && t1.is_like) && (++__CLOVER_59_0.cloverRec.CT[1003]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1003]==0&false))) {{
				__CLOVER_59_0.cloverRec.S[2774]++;int no;
				__CLOVER_59_0.cloverRec.S[2775]++;no = type_like_parametre(t1, table, a1.signature);
				__CLOVER_59_0.cloverRec.S[2776]++;if ((((no != -1) && (++__CLOVER_59_0.cloverRec.CT[1004]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1004]==0&false))) {{// Type de retour like un parametre
					__CLOVER_59_0.cloverRec.S[2777]++;Expr e = (Expr) parametre.elementAt(no);
					__CLOVER_59_0.cloverRec.S[2778]++;if ((((!e.erreur) && (++__CLOVER_59_0.cloverRec.CT[1005]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1005]==0&false)))
						{__CLOVER_59_0.cloverRec.S[2779]++;t1 = e.type;
				}}
			}}
			}__CLOVER_59_0.cloverRec.S[2780]++;return t1;
		} }else {{
			//assert(table.liste_attribut[7].nom.meme_nom(nom)):
			//		"nom="+nom+";attr="+table.liste_attribut[7].nom;
			//System.out.println(table.toString());
			__CLOVER_59_0.cloverRec.S[2781]++;Declare_entite entite = null;
			__CLOVER_59_0.cloverRec.S[2782]++;DeclareVar var;
			__CLOVER_59_0.cloverRec.S[2783]++;if ((((nom.nom != null) && (++__CLOVER_59_0.cloverRec.CT[1006]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1006]==0&false)))
				{__CLOVER_59_0.cloverRec.S[2784]++;entite = env.donne_entite(nom.nom);
			}__CLOVER_59_0.cloverRec.S[2785]++;if ((((entite != null) && (++__CLOVER_59_0.cloverRec.CT[1007]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1007]==0&false))) {{// variable locale ou parametre
				assert ((((entite instanceof DeclareVar)) && (++__CLOVER_59_0.cloverRec.CT[1008]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1008]==0&false));
				__CLOVER_59_0.cloverRec.S[2786]++;var = (DeclareVar) entite;
				__CLOVER_59_0.cloverRec.S[2787]++;t1 = var.type;
				__CLOVER_59_0.cloverRec.S[2788]++;if ((((parametre.size() > 0) && (++__CLOVER_59_0.cloverRec.CT[1009]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1009]==0&false))) {{
					__CLOVER_59_0.cloverRec.S[2789]++;int nb1, nb2;
					__CLOVER_59_0.cloverRec.S[2790]++;nb1 = ((((parametre == null) ) && (++__CLOVER_59_0.cloverRec.CT[1010]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1010]==0&false))? 0 : parametre.size();
					__CLOVER_59_0.cloverRec.S[2791]++;nb2 = 0;
					//assert(false):"nb1="+nb1+";nb2="+nb2;
					__CLOVER_59_0.cloverRec.S[2792]++;erreur(new ErreurVUAR1(nom,
							env.classe/* context.classe_courante */, nb1, pos,
							env.classe, nb2, var.debut())
					//"le nombre de parametre ne correspond pas"
					/* ,a1.feature.debut() */);
				}
				}__CLOVER_59_0.cloverRec.S[2793]++;return t1;
			} }else {{
				__CLOVER_59_0.cloverRec.S[2794]++;if ((((cible) && (++__CLOVER_59_0.cloverRec.CT[1011]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1011]==0&false)))
					{__CLOVER_59_0.cloverRec.S[2795]++;logging.erreur(new ErreurVUEX1(c, nom, pos));
				}else
					{__CLOVER_59_0.cloverRec.S[2796]++;logging.erreur(new ErreurVUEX2(c, nom, pos));
			}}

			//fatal
			/* erreur */
			// ("l'attribut " + nom + " n'existe pas dans le classe " + c.nom);
		}}
		}__CLOVER_59_0.cloverRec.S[2797]++;return null;
	}

	public int type_like_parametre(Type t1, Table_Symbol table1, Signature sig) {__CLOVER_59_0.cloverRec.M[361]++;
		assert ((((t1 != null)) && (++__CLOVER_59_0.cloverRec.CT[1012]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1012]==0&false));
		assert ((((table1 != null)) && (++__CLOVER_59_0.cloverRec.CT[1013]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1013]==0&false));
		assert ((((sig != null)) && (++__CLOVER_59_0.cloverRec.CT[1014]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1014]==0&false));
		__CLOVER_59_0.cloverRec.S[2798]++;if ((((t1.is_like) && (++__CLOVER_59_0.cloverRec.CT[1015]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1015]==0&false))) {{
			__CLOVER_59_0.cloverRec.S[2799]++;String nom1, nom2;
			__CLOVER_59_0.cloverRec.S[2800]++;nom1 = ((Expr_Var) t1.like).nom;
			__CLOVER_59_0.cloverRec.S[2801]++;for (int i = 0; (((i < sig.nb_parametre()) && (++__CLOVER_59_0.cloverRec.CT[1016]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1016]==0&false)); i++) {{

				__CLOVER_59_0.cloverRec.S[2802]++;nom2 = sig.getNom(i);
				__CLOVER_59_0.cloverRec.S[2803]++;if ((((nom1.compareToIgnoreCase(nom2) == 0) && (++__CLOVER_59_0.cloverRec.CT[1017]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1017]==0&false))) {{
					__CLOVER_59_0.cloverRec.S[2804]++;return i;
				}
			}}
		}}
		}__CLOVER_59_0.cloverRec.S[2805]++;return -1;
	}

	public boolean verifie_a_valide(Context context, NomFeature nom,
			Vector parametre, Classe c, Position pos, Attribut_Complet a1) {__CLOVER_59_0.cloverRec.M[362]++;
		assert ((((context != null)) && (++__CLOVER_59_0.cloverRec.CT[1018]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1018]==0&false));
		assert ((((nom != null)) && (++__CLOVER_59_0.cloverRec.CT[1019]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1019]==0&false));
		assert ((((parametre != null)) && (++__CLOVER_59_0.cloverRec.CT[1020]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1020]==0&false));
		assert ((((c != null)) && (++__CLOVER_59_0.cloverRec.CT[1021]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1021]==0&false));
		assert ((((pos != null)) && (++__CLOVER_59_0.cloverRec.CT[1022]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1022]==0&false));
		assert ((((a1 != null)) && (++__CLOVER_59_0.cloverRec.CT[1023]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1023]==0&false));
		__CLOVER_59_0.cloverRec.S[2806]++;Table_Symbol table, table2;
		__CLOVER_59_0.cloverRec.S[2807]++;Type d2;
		__CLOVER_59_0.cloverRec.S[2808]++;Vector v1 = parametre;
		__CLOVER_59_0.cloverRec.S[2809]++;Signature signature = a1.signature;
		__CLOVER_59_0.cloverRec.S[2810]++;boolean res = true;
		__CLOVER_59_0.cloverRec.S[2811]++;table = a1.table_symbol;
		assert ((((table != null)) && (++__CLOVER_59_0.cloverRec.CT[1024]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1024]==0&false));
		__CLOVER_59_0.cloverRec.S[2812]++;if ((((((signature.nb_parametre() > 0) && (v1 == null || v1.size() == 0))
				|| (v1 != null && signature.nb_parametre() != v1.size())
				|| ((signature.nb_parametre() == 0) && (v1 != null && v1.size() > 0))) && (++__CLOVER_59_0.cloverRec.CT[1025]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1025]==0&false))) {{
			__CLOVER_59_0.cloverRec.S[2813]++;int nb1, nb2;
			__CLOVER_59_0.cloverRec.S[2814]++;nb1 = ((((v1 == null) ) && (++__CLOVER_59_0.cloverRec.CT[1026]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1026]==0&false))? 0 : v1.size();
			__CLOVER_59_0.cloverRec.S[2815]++;nb2 = signature.nb_parametre();
			//assert(false):"nb1="+nb1+";nb2="+nb2;
			__CLOVER_59_0.cloverRec.S[2816]++;erreur(new ErreurVUAR1(nom, env.classe/* context.classe_courante */,
					nb1, pos, c, nb2, a1.getFeature().debut())
			//"le nombre de parametre ne correspond pas"
			/* ,a1.feature.debut() */);
			__CLOVER_59_0.cloverRec.S[2817]++;res = false;
		} }else {{
			__CLOVER_59_0.cloverRec.S[2818]++;if ((((v1 != null) && (++__CLOVER_59_0.cloverRec.CT[1027]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1027]==0&false))) {{
				__CLOVER_59_0.cloverRec.S[2819]++;Expr e1;
				__CLOVER_59_0.cloverRec.S[2820]++;Type t1, t2, t3;
				__CLOVER_59_0.cloverRec.S[2821]++;table2 = context.donne_table_symbol(c);
				__CLOVER_59_0.cloverRec.S[2822]++;for (int i = 0; (((i < v1.size()) && (++__CLOVER_59_0.cloverRec.CT[1028]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1028]==0&false)); i++) {{
					__CLOVER_59_0.cloverRec.S[2823]++;e1 = (Expr) v1.elementAt(i);
					__CLOVER_59_0.cloverRec.S[2824]++;d2 = signature.getParametre(i);//d[i];
					__CLOVER_59_0.cloverRec.S[2825]++;t1 = verifie_expr(context, e1, true);
					__CLOVER_59_0.cloverRec.S[2826]++;if ((((t1 == null) && (++__CLOVER_59_0.cloverRec.CT[1029]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1029]==0&false))) {{// TODO: type inconnue
						/*
						 * erreur( new ErreurVUAR2(nom,i,
						 * context.classe_courante,t1,e1.debut(),
						 * c,d2,d2.debut()));
						 */
						__CLOVER_59_0.cloverRec.S[2827]++;return false;
					}
					}__CLOVER_59_0.cloverRec.S[2828]++;t2 = table.trouve_vrai_type(t1);
					__CLOVER_59_0.cloverRec.S[2829]++;t3 = table2.trouve_vrai_type(d2);
					__CLOVER_59_0.cloverRec.S[2830]++;int no = type_like_parametre(d2, table2, signature);
					//for(int j=0;j<d2.length;j++)
					__CLOVER_59_0.cloverRec.S[2831]++;if ((((no != -1) && (++__CLOVER_59_0.cloverRec.CT[1030]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1030]==0&false))) {{
						__CLOVER_59_0.cloverRec.S[2832]++;Expr e2 = (Expr) v1.elementAt(no);
						__CLOVER_59_0.cloverRec.S[2833]++;t3 = e2.type;
						__CLOVER_59_0.cloverRec.S[2834]++;if ((((!context.type_compatible(t2, table, t3, table2)) && (++__CLOVER_59_0.cloverRec.CT[1031]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1031]==0&false))) {{
							__CLOVER_59_0.cloverRec.S[2835]++;erreur(new ErreurVUAR2(nom, i,
									env.classe/* context.classe_courante */, t2,
									e1.debut(), c, t3, e2.debut())
							/*
							 * "Type incompatible pour le parametre " + i,
							 * e1.debut()
							 */);
							__CLOVER_59_0.cloverRec.S[2836]++;res = false;
						}
					}} }else {{
						__CLOVER_59_0.cloverRec.S[2837]++;if ((((!context.type_compatible(t2, table, t3, table2)) && (++__CLOVER_59_0.cloverRec.CT[1032]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1032]==0&false))) {{
							__CLOVER_59_0.cloverRec.S[2838]++;erreur(new ErreurVUAR2(nom, i,
									env.classe/* context.classe_courante */, t2,
									e1.debut(), c, t3, d2.debut())
							/*
							 * "Type incompatible pour le parametre " + i,
							 * e1.debut()
							 */);
							__CLOVER_59_0.cloverRec.S[2839]++;res = false;
						}
					}}
				}}
			}}
		}}
		}__CLOVER_59_0.cloverRec.S[2840]++;return false;
	}

	public Type verifie_expr(Context context, Expr expr, boolean debut) {__CLOVER_59_0.cloverRec.M[363]++;
		__CLOVER_59_0.cloverRec.S[2841]++;Type t = null;
		__CLOVER_59_0.cloverRec.S[2842]++;int i, j;
		__CLOVER_59_0.cloverRec.S[2843]++;NomFeature f1;
		__CLOVER_59_0.cloverRec.S[2844]++;Type t1, t2;
		//Attribut f2 = null;
		//Attribut a1, a2; //attributs,attributs_ancetre
		__CLOVER_59_0.cloverRec.S[2845]++;DeclareVar d[], d2;
		__CLOVER_59_0.cloverRec.S[2846]++;Classe c = env.classe;//context.classe_courante;&\u00e9'((\u00e8_(-_\u00e8
		__CLOVER_59_0.cloverRec.S[2847]++;Feature f = env.feature;//context.feature_courante;
		__CLOVER_59_0.cloverRec.S[2848]++;Table_Symbol table = context.donne_table_symbol(c), table2;
		__CLOVER_59_0.cloverRec.S[2849]++;Attribut_Complet attr1, attr2;

		assert ((((expr != null)) && (++__CLOVER_59_0.cloverRec.CT[1033]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1033]==0&false));
		__CLOVER_59_0.cloverRec.S[2850]++;boolean __CLOVER_bool4=false;switch (expr.op) {
		case Expr.Var:if (!__CLOVER_bool4) {__CLOVER_59_0.cloverRec.S[2851]++;__CLOVER_bool4=true;}
			__CLOVER_59_0.cloverRec.S[2852]++;Expr_Var expr_var = (Expr_Var) expr;
			__CLOVER_59_0.cloverRec.S[2853]++;if ((((!context.var_existe(expr_var.nom)) && (++__CLOVER_59_0.cloverRec.CT[1034]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1034]==0&false))) {{
				__CLOVER_59_0.cloverRec.S[2854]++;logging.erreur(new ErreurVEEN(c, expr_var.nom, expr_var.oper));
				__CLOVER_59_0.cloverRec.S[2855]++;expr.erreur = true;
				__CLOVER_59_0.cloverRec.S[2856]++;System.out.println("*****a");
			} }else {{
				__CLOVER_59_0.cloverRec.S[2857]++;if ((((!context.est_variable(expr_var.nom)) && (++__CLOVER_59_0.cloverRec.CT[1035]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1035]==0&false))) {{// il n'existe pas de
														  // type de retour
					__CLOVER_59_0.cloverRec.S[2858]++;erreur(new ErreurVKCN1(c, expr_var));
					__CLOVER_59_0.cloverRec.S[2859]++;expr.erreur = true;
					__CLOVER_59_0.cloverRec.S[2860]++;System.out.println("*****b");
				} }else {{
					__CLOVER_59_0.cloverRec.S[2861]++;NomFeature f3 = new NomFeature(expr_var.nom);
					__CLOVER_59_0.cloverRec.S[2862]++;Attribut_Complet ac = context.donne_attribut(f3, c);
					__CLOVER_59_0.cloverRec.S[2863]++;if ((((ac != null) && (++__CLOVER_59_0.cloverRec.CT[1036]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1036]==0&false))) {{
						__CLOVER_59_0.cloverRec.S[2864]++;if ((((ac.signature.nb_parametre() > 0) && (++__CLOVER_59_0.cloverRec.CT[1037]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1037]==0&false))) {{// erreur: pas de
															  // parametres
							__CLOVER_59_0.cloverRec.S[2865]++;erreur(new ErreurVUAR1(f3, c, 0, expr_var.debut(),
									c, ac.signature.nb_parametre(), ac
											.getFeature().debut()));
							__CLOVER_59_0.cloverRec.S[2866]++;expr.erreur = true;
							__CLOVER_59_0.cloverRec.S[2867]++;System.out.println("*****c");
						}
					}}
					}__CLOVER_59_0.cloverRec.S[2868]++;Declare_entite entite = env.donne_entite(expr_var.nom);
					//t =
					// context.donne_type_var(expr_var.nom,expr_var.debut());
					__CLOVER_59_0.cloverRec.S[2869]++;if ((((entite == null) && (++__CLOVER_59_0.cloverRec.CT[1038]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1038]==0&false))) {{
						// TODO: variable sans type de retour
						//erreur("La variable " + expr_var.nom + " n'existe
						// pas");
						//logging.erreur(new
						// ErreurVEEN(c,expr_var.nom,expr_var.oper));
						__CLOVER_59_0.cloverRec.S[2870]++;logging.erreur(new ErreurVEEN(c, expr_var.nom, expr_var
								.debut()));
						__CLOVER_59_0.cloverRec.S[2871]++;expr.erreur = true;
						__CLOVER_59_0.cloverRec.S[2872]++;System.out.println("*****d");
					} }else {{
						//t=table.trouve_vrai_type(t);
						__CLOVER_59_0.cloverRec.S[2873]++;t = entite.getType();
						assert ((((t != null)) && (++__CLOVER_59_0.cloverRec.CT[1039]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1039]==0&false));
					}
				}}
			}}
			}__CLOVER_59_0.cloverRec.S[2874]++;expr.type = t;
			__CLOVER_59_0.cloverRec.S[2875]++;expr.classe = env.classe;
			__CLOVER_59_0.cloverRec.S[2876]++;break;
		case Expr.Entier:if (!__CLOVER_bool4) {__CLOVER_59_0.cloverRec.S[2877]++;__CLOVER_bool4=true;}
			__CLOVER_59_0.cloverRec.S[2878]++;expr.type = t = new TypeSimple(false, "INTEGER", null);
			__CLOVER_59_0.cloverRec.S[2879]++;expr.classe = c;
			__CLOVER_59_0.cloverRec.S[2880]++;break;
		case Expr.Chaine:if (!__CLOVER_bool4) {__CLOVER_59_0.cloverRec.S[2881]++;__CLOVER_bool4=true;}
			__CLOVER_59_0.cloverRec.S[2882]++;expr.type = t = new TypeSimple(false, "STRING", null);
			__CLOVER_59_0.cloverRec.S[2883]++;expr.classe = c;
			__CLOVER_59_0.cloverRec.S[2884]++;break;
		case Expr.Reel:if (!__CLOVER_bool4) {__CLOVER_59_0.cloverRec.S[2885]++;__CLOVER_bool4=true;}
			__CLOVER_59_0.cloverRec.S[2886]++;expr.type = t = new TypeSimple(false, "REAL", null);
			__CLOVER_59_0.cloverRec.S[2887]++;expr.classe = c;
			__CLOVER_59_0.cloverRec.S[2888]++;break;
		case Expr.Char:if (!__CLOVER_bool4) {__CLOVER_59_0.cloverRec.S[2889]++;__CLOVER_bool4=true;}
			__CLOVER_59_0.cloverRec.S[2890]++;expr.type = t = new TypeSimple(false, "CHARACTER", null);
			__CLOVER_59_0.cloverRec.S[2891]++;expr.classe = c;
			__CLOVER_59_0.cloverRec.S[2892]++;break;
		case Expr.Vrai:if (!__CLOVER_bool4) {__CLOVER_59_0.cloverRec.S[2893]++;__CLOVER_bool4=true;}
		case Expr.Faux:if (!__CLOVER_bool4) {__CLOVER_59_0.cloverRec.S[2894]++;__CLOVER_bool4=true;}
			__CLOVER_59_0.cloverRec.S[2895]++;expr.type = t = new TypeSimple(false, "BOOLEAN", null);
			__CLOVER_59_0.cloverRec.S[2896]++;expr.classe = c;
			__CLOVER_59_0.cloverRec.S[2897]++;break;
		case Expr.Old:if (!__CLOVER_bool4) {__CLOVER_59_0.cloverRec.S[2898]++;__CLOVER_bool4=true;}
			//assert(false);
			//t=
			__CLOVER_59_0.cloverRec.S[2899]++;Expr_Unaire expr_un1 = (Expr_Unaire) expr;
			__CLOVER_59_0.cloverRec.S[2900]++;t = verifie_expr(context, expr_un1.expr1, true);
			__CLOVER_59_0.cloverRec.S[2901]++;if ((((!env.dans_ensure()) && (++__CLOVER_59_0.cloverRec.CT[1040]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1040]==0&false)))//(!context.dans_ensure)
			{{// Erreur VAOL1
				__CLOVER_59_0.cloverRec.S[2902]++;erreur(new ErreurVAOL1(c, expr_un1));
				__CLOVER_59_0.cloverRec.S[2903]++;expr.erreur = true;
			}
			//erreur("Old non implement\u00e9", expr.debut());
			}__CLOVER_59_0.cloverRec.S[2904]++;expr.type = t;
			__CLOVER_59_0.cloverRec.S[2905]++;expr.classe = expr_un1.expr1.classe;
			__CLOVER_59_0.cloverRec.S[2906]++;break;
		case Expr.Dollard:if (!__CLOVER_bool4) {__CLOVER_59_0.cloverRec.S[2907]++;__CLOVER_bool4=true;}
			//assert(false);
			//t=
			__CLOVER_59_0.cloverRec.S[2908]++;Expr_Unaire expr_un2 = (Expr_Unaire) expr;
			__CLOVER_59_0.cloverRec.S[2909]++;t = verifie_expr(context, expr_un2.expr1, true);
			__CLOVER_59_0.cloverRec.S[2910]++;if ((((expr_un2.expr1.op != Expr.Var) && (++__CLOVER_59_0.cloverRec.CT[1041]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1041]==0&false)))//(!context.dans_ensure)
			{{// Erreur VUAR4
				__CLOVER_59_0.cloverRec.S[2911]++;erreur(new ErreurVUAR4(expr_un2.expr1, c, expr.debut()));
				__CLOVER_59_0.cloverRec.S[2912]++;expr.erreur = true;
			}
			//erreur("Old non implement\u00e9", expr.debut());
			}__CLOVER_59_0.cloverRec.S[2913]++;t = new TypeSimple(false, "POINTER", null);
			__CLOVER_59_0.cloverRec.S[2914]++;expr.type = t;
			__CLOVER_59_0.cloverRec.S[2915]++;expr.classe = c;
			__CLOVER_59_0.cloverRec.S[2916]++;break;
		case Expr.Egal:if (!__CLOVER_bool4) {__CLOVER_59_0.cloverRec.S[2917]++;__CLOVER_bool4=true;}
		case Expr.Diff:if (!__CLOVER_bool4) {__CLOVER_59_0.cloverRec.S[2918]++;__CLOVER_bool4=true;}
			__CLOVER_59_0.cloverRec.S[2919]++;Expr_Binaire expr_bin2 = (Expr_Binaire) expr;
			__CLOVER_59_0.cloverRec.S[2920]++;t1 = verifie_expr(context, expr_bin2.expr1, true);
			__CLOVER_59_0.cloverRec.S[2921]++;t2 = verifie_expr(context, expr_bin2.expr2, true);
			__CLOVER_59_0.cloverRec.S[2922]++;if ((((t1 != null && t2 != null) && (++__CLOVER_59_0.cloverRec.CT[1042]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1042]==0&false))) {{
				//Type t1_=table.trouve_vrai_type(t1);
				//Type t2_=table.trouve_vrai_type(t2);
				__CLOVER_59_0.cloverRec.S[2923]++;if ((((!context.type_compatible(t2, table, t1, table)
						&& !context.type_compatible(t1, table, t2, table)) && (++__CLOVER_59_0.cloverRec.CT[1043]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1043]==0&false))) {{
					__CLOVER_59_0.cloverRec.S[2924]++;logging.erreur(new ErreurVWEQ(c, expr_bin2, t1, t2));
					__CLOVER_59_0.cloverRec.S[2925]++;expr.erreur = true;
				}
				}__CLOVER_59_0.cloverRec.S[2926]++;t = new TypeSimple(false, "BOOLEAN", new Vector());
			}
			}__CLOVER_59_0.cloverRec.S[2927]++;expr.type = t;
			__CLOVER_59_0.cloverRec.S[2928]++;expr.classe = c;
			__CLOVER_59_0.cloverRec.S[2929]++;break;
		case Expr.Plus:if (!__CLOVER_bool4) {__CLOVER_59_0.cloverRec.S[2930]++;__CLOVER_bool4=true;}
		case Expr.Moins:if (!__CLOVER_bool4) {__CLOVER_59_0.cloverRec.S[2931]++;__CLOVER_bool4=true;}
		case Expr.Fois:if (!__CLOVER_bool4) {__CLOVER_59_0.cloverRec.S[2932]++;__CLOVER_bool4=true;}
		case Expr.Div:if (!__CLOVER_bool4) {__CLOVER_59_0.cloverRec.S[2933]++;__CLOVER_bool4=true;}
		case Expr.Mod:if (!__CLOVER_bool4) {__CLOVER_59_0.cloverRec.S[2934]++;__CLOVER_bool4=true;}
		case Expr.Puiss:if (!__CLOVER_bool4) {__CLOVER_59_0.cloverRec.S[2935]++;__CLOVER_bool4=true;}
		case Expr.Xor:if (!__CLOVER_bool4) {__CLOVER_59_0.cloverRec.S[2936]++;__CLOVER_bool4=true;}
		case Expr.Or:if (!__CLOVER_bool4) {__CLOVER_59_0.cloverRec.S[2937]++;__CLOVER_bool4=true;}
		case Expr.And:if (!__CLOVER_bool4) {__CLOVER_59_0.cloverRec.S[2938]++;__CLOVER_bool4=true;}
		case Expr.And_Then:if (!__CLOVER_bool4) {__CLOVER_59_0.cloverRec.S[2939]++;__CLOVER_bool4=true;}
		case Expr.Or_Else:if (!__CLOVER_bool4) {__CLOVER_59_0.cloverRec.S[2940]++;__CLOVER_bool4=true;}
		case Expr.Implies:if (!__CLOVER_bool4) {__CLOVER_59_0.cloverRec.S[2941]++;__CLOVER_bool4=true;}
		case Expr.Infs:if (!__CLOVER_bool4) {__CLOVER_59_0.cloverRec.S[2942]++;__CLOVER_bool4=true;}
		case Expr.Inf:if (!__CLOVER_bool4) {__CLOVER_59_0.cloverRec.S[2943]++;__CLOVER_bool4=true;}
		case Expr.Sup:if (!__CLOVER_bool4) {__CLOVER_59_0.cloverRec.S[2944]++;__CLOVER_bool4=true;}
		case Expr.Sups:if (!__CLOVER_bool4) {__CLOVER_59_0.cloverRec.S[2945]++;__CLOVER_bool4=true;}
		case Expr.Div_entier:if (!__CLOVER_bool4) {__CLOVER_59_0.cloverRec.S[2946]++;__CLOVER_bool4=true;}
		case Expr.Free_Op:if (!__CLOVER_bool4) {__CLOVER_59_0.cloverRec.S[2947]++;__CLOVER_bool4=true;}
			__CLOVER_59_0.cloverRec.S[2948]++;Expr_Binaire expr_bin = (Expr_Binaire) expr;
			__CLOVER_59_0.cloverRec.S[2949]++;f1 = expr_bin.donne_nom_feature();
			//if(f1==null)
			{
				//	erreur("operation");
				//assert(expr_bin.op!=Expr.Free_Op):"f1="+f1;
			}
			//f2 = null;
			__CLOVER_59_0.cloverRec.S[2950]++;t1 = verifie_expr(context, expr_bin.expr1, true);
			__CLOVER_59_0.cloverRec.S[2951]++;t2 = verifie_expr(context, expr_bin.expr2, true);
			__CLOVER_59_0.cloverRec.S[2952]++;boolean trouve = false;
			__CLOVER_59_0.cloverRec.S[2953]++;if ((((expr_bin.op == 30) && (++__CLOVER_59_0.cloverRec.CT[1044]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1044]==0&false))) {{
				__CLOVER_59_0.cloverRec.S[2954]++;String s1 = expr_bin.debut().toString();
				__CLOVER_59_0.cloverRec.S[2955]++;String s2 = "(15,22,.\\std_classe\\COMPARABLE.e)";
				assert ((((s1 != s2)) && (++__CLOVER_59_0.cloverRec.CT[1045]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1045]==0&false));
				__CLOVER_59_0.cloverRec.S[2956]++;if ((((s1.equals(s2)) && (++__CLOVER_59_0.cloverRec.CT[1046]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1046]==0&false))) {{
					//trouve=true;
					//assert(false):"("+t1+","+t2+")";
				}
			}}
			}assert ((((!expr_bin.debut().equals(
					"(15,22,.\\std_classe\\COMPARABLE.e)")) ) && (++__CLOVER_59_0.cloverRec.CT[1047]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1047]==0&false)): "expr="
					+ expr_bin.op + "(" + t1 + "," + t2 + ")";
			__CLOVER_59_0.cloverRec.S[2957]++;if ((((t1 != null && t2 != null) && (++__CLOVER_59_0.cloverRec.CT[1048]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1048]==0&false))) {{
				//if(trouve) assert(false);
				__CLOVER_59_0.cloverRec.S[2958]++;Type t1_ = table.trouve_vrai_type(t1);
				__CLOVER_59_0.cloverRec.S[2959]++;Classe cl = context.cherche_classe(t1_);
				__CLOVER_59_0.cloverRec.S[2960]++;if ((((cl == null) && (++__CLOVER_59_0.cloverRec.CT[1049]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1049]==0&false))) {{
					__CLOVER_59_0.cloverRec.S[2961]++;if ((((trouve) && (++__CLOVER_59_0.cloverRec.CT[1050]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1050]==0&false)))
						{assert ((((false)) && (++__CLOVER_59_0.cloverRec.CT[1051]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1051]==0&false));
					/* context. */
					}__CLOVER_59_0.cloverRec.S[2962]++;erreur("La classe1 " + t1.nom + " n'existe pas",
							expr_bin.expr1.debut());
					__CLOVER_59_0.cloverRec.S[2963]++;expr.erreur = true;
				} }else {{
					//if(trouve) assert(false);
					__CLOVER_59_0.cloverRec.S[2964]++;table2 = context.donne_table_symbol(t1_);
					assert ((((table2 != null)) && (++__CLOVER_59_0.cloverRec.CT[1052]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1052]==0&false));
					__CLOVER_59_0.cloverRec.S[2965]++;Vector param = new Vector();
					__CLOVER_59_0.cloverRec.S[2966]++;param.addElement(expr_bin.expr2);
					__CLOVER_59_0.cloverRec.S[2967]++;verifie_appel(context, f1, param, cl,
							expr_bin.oper.debut(), true);
					__CLOVER_59_0.cloverRec.S[2968]++;attr1 = table2.donne_attribut(f1);
					__CLOVER_59_0.cloverRec.S[2969]++;if ((((attr1 == null) && (++__CLOVER_59_0.cloverRec.CT[1053]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1053]==0&false))) {{
						//assert(expr_bin.op!=Expr.Free_Op):"f1="+f1;
						__CLOVER_59_0.cloverRec.S[2970]++;t = null;
						__CLOVER_59_0.cloverRec.S[2971]++;expr.erreur = true;
					} }else {{
						/*
						 * if(!context.est_variable(expr_var.nom)) {// il
						 * n'existe pas de type de retour erreur(new
						 * ErreurVKCN1(c,expr_var)); } TODO: a refaire else
						 */
						{
							__CLOVER_59_0.cloverRec.S[2972]++;t = attr1.donne_type_retour(context);
							__CLOVER_59_0.cloverRec.S[2973]++;if ((((t == null) && (++__CLOVER_59_0.cloverRec.CT[1054]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1054]==0&false))) {{// pas de type de retour
								__CLOVER_59_0.cloverRec.S[2974]++;erreur(new ErreurVKCN1(c, expr_bin));
								__CLOVER_59_0.cloverRec.S[2975]++;expr.erreur = true;
							} }else {{
								__CLOVER_59_0.cloverRec.S[2976]++;t = table2.trouve_vrai_type(t);
								__CLOVER_59_0.cloverRec.S[2977]++;expr.classe = cl;
							}
						}}
					}
				}}
			}} }else {{
				//assert(false):"Erreur:type null="+t1+":"+t2+";"+
				//				expr.op+"."+expr.debut();
			}
			}__CLOVER_59_0.cloverRec.S[2978]++;if ((((trouve) && (++__CLOVER_59_0.cloverRec.CT[1055]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1055]==0&false))) {{
				assert ((((false) ) && (++__CLOVER_59_0.cloverRec.CT[1056]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1056]==0&false)): "t=" + t;
			}
			}__CLOVER_59_0.cloverRec.S[2979]++;expr.type = t;
			__CLOVER_59_0.cloverRec.S[2980]++;break;
		case Expr.Not:if (!__CLOVER_bool4) {__CLOVER_59_0.cloverRec.S[2981]++;__CLOVER_bool4=true;}
		case Expr.PlusU:if (!__CLOVER_bool4) {__CLOVER_59_0.cloverRec.S[2982]++;__CLOVER_bool4=true;}
		case Expr.MoinsU:if (!__CLOVER_bool4) {__CLOVER_59_0.cloverRec.S[2983]++;__CLOVER_bool4=true;}
		case Expr.Free_OpU:if (!__CLOVER_bool4) {__CLOVER_59_0.cloverRec.S[2984]++;__CLOVER_bool4=true;}
			__CLOVER_59_0.cloverRec.S[2985]++;Expr_Unaire expr_un = (Expr_Unaire) expr;
			__CLOVER_59_0.cloverRec.S[2986]++;f1 = expr_un.donne_nom_feature();
			//assert(false);
			assert ((((f1 != null)) && (++__CLOVER_59_0.cloverRec.CT[1057]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1057]==0&false));
			//f2 = null;
			__CLOVER_59_0.cloverRec.S[2987]++;t1 = verifie_expr(context, expr_un.expr1, true);
			__CLOVER_59_0.cloverRec.S[2988]++;if ((((t1 != null) && (++__CLOVER_59_0.cloverRec.CT[1058]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1058]==0&false))) {{
				__CLOVER_59_0.cloverRec.S[2989]++;Type t1_ = table.trouve_vrai_type(t1);
				__CLOVER_59_0.cloverRec.S[2990]++;Classe cl = context.cherche_classe(t1_);
				__CLOVER_59_0.cloverRec.S[2991]++;if ((((cl == null) && (++__CLOVER_59_0.cloverRec.CT[1059]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1059]==0&false))) {{
					__CLOVER_59_0.cloverRec.S[2992]++;context.erreur("La classe " + t1.nom + " n'existe pas");
					__CLOVER_59_0.cloverRec.S[2993]++;expr.erreur = true;
				} }else {{
					__CLOVER_59_0.cloverRec.S[2994]++;table2 = context.donne_table_symbol(t1_);
					assert ((((table2 != null)) && (++__CLOVER_59_0.cloverRec.CT[1060]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1060]==0&false));
					__CLOVER_59_0.cloverRec.S[2995]++;Vector param = new Vector();
					__CLOVER_59_0.cloverRec.S[2996]++;verifie_appel(context, f1, param, cl, expr_un.oper.debut(),
							true);
					__CLOVER_59_0.cloverRec.S[2997]++;attr1 = table2.donne_attribut(f1);
					__CLOVER_59_0.cloverRec.S[2998]++;if ((((attr1 == null) && (++__CLOVER_59_0.cloverRec.CT[1061]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1061]==0&false))) {{
						__CLOVER_59_0.cloverRec.S[2999]++;t = null;
					} }else {{
						__CLOVER_59_0.cloverRec.S[3000]++;t = attr1.donne_type_retour(context);
						__CLOVER_59_0.cloverRec.S[3001]++;if ((((t == null) && (++__CLOVER_59_0.cloverRec.CT[1062]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1062]==0&false))) {{// pas de type de retour
							__CLOVER_59_0.cloverRec.S[3002]++;erreur(new ErreurVKCN1(c, expr_un));
							__CLOVER_59_0.cloverRec.S[3003]++;expr.erreur = true;
						} }else {{
							__CLOVER_59_0.cloverRec.S[3004]++;t = table2.trouve_vrai_type(t);
							__CLOVER_59_0.cloverRec.S[3005]++;expr.classe = cl;
						}
					}}
					/*
					 * attr1=table2.donne_attribut(f1); if (attr1 == null) {
					 * /*erreur( "l'operation2 " + f1 + " n'existe pas dans" + "
					 * la classe " + cl.nom,
					 */
					//expr_un./*expr1.*/debut());
					/*
					 * logging.erreur(new ErreurVUEX1(c,f1,expr_un.debut())); }
					 * else { //Feature f3 = f2.feature; if
					 * (/*attr1.parametre!=null&&
					 *///									attr1.parametre.length>0*/attr1.signature.nb_parametre()>0)
					   // {
					/*
					 * context.erreur("parametre incompatible"); } else { t =
					 * attr1.donne_type_retour(context);
					 * t=table2.trouve_vrai_type(t); } }
					 */
				}}
			}} }else {{
				//assert(false):"type null="+t1+":"+expr.op+";"+
				//				expr.debut()+"!"+expr_un.expr1.debut()+"!"+
				//				expr_un.expr1.op;
			}
			}__CLOVER_59_0.cloverRec.S[3006]++;expr.type = t;
			__CLOVER_59_0.cloverRec.S[3007]++;break;
		case Expr.Appel:if (!__CLOVER_bool4) {__CLOVER_59_0.cloverRec.S[3008]++;__CLOVER_bool4=true;}
			__CLOVER_59_0.cloverRec.S[3009]++;Expr_Appel expr_app = (Expr_Appel) expr;
			__CLOVER_59_0.cloverRec.S[3010]++;t = verifie_appel(context, new NomFeature(expr_app.nom),
					expr_app.parametre, null, expr_app.debut(), debut);
			//t=table2.trouve_vrai_type(t);
			__CLOVER_59_0.cloverRec.S[3011]++;if ((((t == null) && (++__CLOVER_59_0.cloverRec.CT[1063]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1063]==0&false))) {{// Erreur VKCN1
				__CLOVER_59_0.cloverRec.S[3012]++;Attribut_Complet ac = context.donne_attribut(new NomFeature(
						expr_app.nom), c);
				__CLOVER_59_0.cloverRec.S[3013]++;if ((((ac != null) && (++__CLOVER_59_0.cloverRec.CT[1064]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1064]==0&false))) {{
					__CLOVER_59_0.cloverRec.S[3014]++;erreur(new ErreurVKCN1(c, expr_app));
					__CLOVER_59_0.cloverRec.S[3015]++;expr.erreur = true;
				}
			}} }else {{
				__CLOVER_59_0.cloverRec.S[3016]++;expr.classe = context.cherche_classe(t);
			}
			}__CLOVER_59_0.cloverRec.S[3017]++;expr.type = t;
			__CLOVER_59_0.cloverRec.S[3018]++;break;
		case Expr.Tableau:if (!__CLOVER_bool4) {__CLOVER_59_0.cloverRec.S[3019]++;__CLOVER_bool4=true;}
			__CLOVER_59_0.cloverRec.S[3020]++;Expr_Tableau expr_tab = (Expr_Tableau) expr;
			__CLOVER_59_0.cloverRec.S[3021]++;Vector v = expr_tab.tableau,
			v2;
			__CLOVER_59_0.cloverRec.S[3022]++;Type t3,
			t4 = null;
			__CLOVER_59_0.cloverRec.S[3023]++;System.out.println("debut:");
			__CLOVER_59_0.cloverRec.S[3024]++;for (i = 0; (((i < v.size()) && (++__CLOVER_59_0.cloverRec.CT[1065]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1065]==0&false)); i++) {{
				__CLOVER_59_0.cloverRec.S[3025]++;t3 = verifie_expr(context, (Expr) v.elementAt(i), true);
				__CLOVER_59_0.cloverRec.S[3026]++;System.out.println("type(" + i + ")=" + t3 + ":" + t4);
				// TODO: a calculer le type
				//t4=super_type(t3,t4);
			}
			}__CLOVER_59_0.cloverRec.S[3027]++;System.out.println("fin");
			/*
			 * if(t4==null) { assert(false); } v2=new Vector();
			 * v2.addElement(t4);
			 */
			__CLOVER_59_0.cloverRec.S[3028]++;expr.type = t = new TypeSimple(false, "ARRAY", null/*
														  * new
														  * Type(false,"ANY",new
														  * Vector())/*v2
														  */);
			__CLOVER_59_0.cloverRec.S[3029]++;expr.classe = c;
			__CLOVER_59_0.cloverRec.S[3030]++;break;
		case Expr.Point:if (!__CLOVER_bool4) {__CLOVER_59_0.cloverRec.S[3031]++;__CLOVER_bool4=true;}
			/**
			 * TODO: a revoir (code incorrecte)
			 */
			__CLOVER_59_0.cloverRec.S[3032]++;Expr_Binaire expr_pt = (Expr_Binaire) expr;
			__CLOVER_59_0.cloverRec.S[3033]++;Expr e2 = expr_pt.expr2;
			__CLOVER_59_0.cloverRec.S[3034]++;System.out
					.println("Point-----" + c.nom + ":" + expr_pt/* .expr1+","+e2 */);
			__CLOVER_59_0.cloverRec.S[3035]++;t1 = verifie_expr(context, expr_pt.expr1, debut);
			//assert(t1!=null);
			__CLOVER_59_0.cloverRec.S[3036]++;if ((((t1 != null) && (++__CLOVER_59_0.cloverRec.CT[1066]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1066]==0&false))) {{
				__CLOVER_59_0.cloverRec.S[3037]++;System.out.println("salut1");
				__CLOVER_59_0.cloverRec.S[3038]++;Classe cl = context.cherche_classe(t1);
				__CLOVER_59_0.cloverRec.S[3039]++;if ((((cl != null) && (++__CLOVER_59_0.cloverRec.CT[1067]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1067]==0&false))) {{
					__CLOVER_59_0.cloverRec.S[3040]++;System.out.println("salut2");
					//context.classe_courante = cl;
					__CLOVER_59_0.cloverRec.S[3041]++;if ((((e2.op != Expr.Appel && e2.op != Expr.Var) && (++__CLOVER_59_0.cloverRec.CT[1068]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1068]==0&false))) {{
						__CLOVER_59_0.cloverRec.S[3042]++;context.erreur("Liste d'appel non conforme");
						__CLOVER_59_0.cloverRec.S[3043]++;expr.erreur = true;
					} }else {{
						//t2 = verifie_expr(context, e2,false);
						//if (t2 != null) {
						__CLOVER_59_0.cloverRec.S[3044]++;System.out.println("salut3");
						__CLOVER_59_0.cloverRec.S[3045]++;String n;
						__CLOVER_59_0.cloverRec.S[3046]++;if ((((e2.op == Expr.Appel) && (++__CLOVER_59_0.cloverRec.CT[1069]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1069]==0&false))) {{
							__CLOVER_59_0.cloverRec.S[3047]++;n = ((Expr_Appel) e2).nom;
						} }else {{
							__CLOVER_59_0.cloverRec.S[3048]++;n = ((Expr_Var) e2).nom;
						}
						}__CLOVER_59_0.cloverRec.S[3049]++;f1 = new NomFeature(n);
						__CLOVER_59_0.cloverRec.S[3050]++;attr1 = context.donne_attribut(f1, cl);
						__CLOVER_59_0.cloverRec.S[3051]++;if ((((attr1 != null) && (++__CLOVER_59_0.cloverRec.CT[1070]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1070]==0&false))) {{
							__CLOVER_59_0.cloverRec.S[3052]++;System.out.println("salut4");
							/*
							 * if(a1.feature.nom.prefix|| a1.feature.nom.infix) {
							 * erreur("la fonction ne doit pas etre prefix ou
							 * infix"); }
							 */
							__CLOVER_59_0.cloverRec.S[3053]++;Signature sig;
							__CLOVER_59_0.cloverRec.S[3054]++;sig = attr1.signature;

							__CLOVER_59_0.cloverRec.S[3055]++;if ((((e2.op == Expr.Var) && (++__CLOVER_59_0.cloverRec.CT[1071]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1071]==0&false))) {{
								__CLOVER_59_0.cloverRec.S[3056]++;if ((((sig.nb_parametre() > 0) && (++__CLOVER_59_0.cloverRec.CT[1072]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1072]==0&false))) {{//	erreur: pas de
															 // parametres
									__CLOVER_59_0.cloverRec.S[3057]++;erreur(new ErreurVUAR1(f1, c, 0,
											e2.debut(), cl, sig.nb_parametre(),
											attr1.getFeature().debut()));
									__CLOVER_59_0.cloverRec.S[3058]++;expr.erreur = true;
								}
								}__CLOVER_59_0.cloverRec.S[3059]++;t2 = sig.getTypeRetour();
								assert ((((t2 != null) ) && (++__CLOVER_59_0.cloverRec.CT[1073]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1073]==0&false)): "exp:" + e2 + ","
										+ sig.nb_parametre();
							} }else {{
								__CLOVER_59_0.cloverRec.S[3060]++;Vector param;
								__CLOVER_59_0.cloverRec.S[3061]++;param = ((Expr_Appel) e2).parametre;
								//if()
								__CLOVER_59_0.cloverRec.S[3062]++;verifie_a_valide(context, f1, param, cl, e2
										.debut(), attr1);
								__CLOVER_59_0.cloverRec.S[3063]++;t2 = attr1.donne_type_retour(context);
								assert ((((t2 != null)) && (++__CLOVER_59_0.cloverRec.CT[1074]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1074]==0&false));
							}
							}__CLOVER_59_0.cloverRec.S[3064]++;table2 = context.donne_table_symbol(t1);
							// tres important car a.b:like x pointe vers le x
							// de la classe A si a:A
							assert ((((t2 != null)) && (++__CLOVER_59_0.cloverRec.CT[1075]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1075]==0&false));
							__CLOVER_59_0.cloverRec.S[3065]++;t = table2.trouve_vrai_type(t2);
							//t = t2;
							__CLOVER_59_0.cloverRec.S[3066]++;expr.classe = cl;
						} }else {{
							__CLOVER_59_0.cloverRec.S[3067]++;System.out.println("Salut5");
							/* context. */
							/*
							 * erreur( "la fonction " + n + " n'existe pas dans
							 * la classe " + t1.nom, expr_pt.debut());
							 */
							__CLOVER_59_0.cloverRec.S[3068]++;erreur(new ErreurVUEX2(cl, f1, e2.debut()));
							__CLOVER_59_0.cloverRec.S[3069]++;expr.erreur = true;
						}
						//}
					}}
					//context.classe_courante = c;
				}}
			}}
			}__CLOVER_59_0.cloverRec.S[3070]++;expr.type = t;
			__CLOVER_59_0.cloverRec.S[3071]++;System.out.println("Fin point");
			__CLOVER_59_0.cloverRec.S[3072]++;break;
		default:if (!__CLOVER_bool4) {__CLOVER_59_0.cloverRec.S[3073]++;__CLOVER_bool4=true;}
			assert ((((false)) && (++__CLOVER_59_0.cloverRec.CT[1076]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1076]==0&false));
			/* context. */
			__CLOVER_59_0.cloverRec.S[3074]++;erreur("expression no " + expr.op + " inconnue", expr.debut());
			__CLOVER_59_0.cloverRec.S[3075]++;break;
		}
		//assert(t==null/*||!t.is_like*/):"t="+t+",expr="+expr;
		__CLOVER_59_0.cloverRec.S[3076]++;return t;
	}

	// retourne le plus petit type qui est conforme a t1 et t2
	public Type super_type(Type t1, Type t2) {__CLOVER_59_0.cloverRec.M[364]++;
		__CLOVER_59_0.cloverRec.S[3077]++;if ((((t1 == null) && (++__CLOVER_59_0.cloverRec.CT[1077]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1077]==0&false)))
			{__CLOVER_59_0.cloverRec.S[3078]++;return t2;
		}__CLOVER_59_0.cloverRec.S[3079]++;if ((((t2 == null) && (++__CLOVER_59_0.cloverRec.CT[1078]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1078]==0&false)))
			{__CLOVER_59_0.cloverRec.S[3080]++;return t1;
		}__CLOVER_59_0.cloverRec.S[3081]++;Classe c1, c2;
		__CLOVER_59_0.cloverRec.S[3082]++;int no1, no2, i, len, res = -1, j;
		__CLOVER_59_0.cloverRec.S[3083]++;boolean table[];
		__CLOVER_59_0.cloverRec.S[3084]++;Type t;
		__CLOVER_59_0.cloverRec.S[3085]++;c1 = context.cherche_classe(t1);
		__CLOVER_59_0.cloverRec.S[3086]++;no1 = context.no_classe(c1);
		__CLOVER_59_0.cloverRec.S[3087]++;c2 = context.cherche_classe(t2);
		__CLOVER_59_0.cloverRec.S[3088]++;no2 = context.no_classe(c2);
		__CLOVER_59_0.cloverRec.S[3089]++;len = table_heritage.length;
		__CLOVER_59_0.cloverRec.S[3090]++;table = new boolean[len];
		__CLOVER_59_0.cloverRec.S[3091]++;System.out.println("super1");
		__CLOVER_59_0.cloverRec.S[3092]++;for (i = 0; (((i < len) && (++__CLOVER_59_0.cloverRec.CT[1079]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1079]==0&false)); i++) {{
			__CLOVER_59_0.cloverRec.S[3093]++;table[i] = table_heritage[no1][i] && table_heritage[no2][i];
		}
		}__CLOVER_59_0.cloverRec.S[3094]++;System.out.println("super2");
		__CLOVER_59_0.cloverRec.S[3095]++;for (i = 0; (((i < len) && (++__CLOVER_59_0.cloverRec.CT[1080]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1080]==0&false)); i++) {{
			__CLOVER_59_0.cloverRec.S[3096]++;int nb_descendant = 0, nb_total = 0;
			__CLOVER_59_0.cloverRec.S[3097]++;if ((((table[i]) && (++__CLOVER_59_0.cloverRec.CT[1081]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1081]==0&false))) {{// un des ancetres
				__CLOVER_59_0.cloverRec.S[3098]++;System.out.println("super5:" + i);
				__CLOVER_59_0.cloverRec.S[3099]++;for (j = 0; (((j < len) && (++__CLOVER_59_0.cloverRec.CT[1082]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1082]==0&false)); j++) {{
					__CLOVER_59_0.cloverRec.S[3100]++;if ((((j != i && table[j]) && (++__CLOVER_59_0.cloverRec.CT[1083]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1083]==0&false))) {{//un autre des ancetres
						__CLOVER_59_0.cloverRec.S[3101]++;nb_total++;
						__CLOVER_59_0.cloverRec.S[3102]++;if ((((table_heritage[j][i]) && (++__CLOVER_59_0.cloverRec.CT[1084]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1084]==0&false))) {{
							__CLOVER_59_0.cloverRec.S[3103]++;nb_descendant++;
						}
					}}
				}}
				}__CLOVER_59_0.cloverRec.S[3104]++;System.out.println("super6:" + i);
				__CLOVER_59_0.cloverRec.S[3105]++;if ((((nb_total > 0 && nb_total == nb_descendant) && (++__CLOVER_59_0.cloverRec.CT[1085]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1085]==0&false))) {{// la classe i
																// est l'ancetre
																// de toutes les
																// classes
					__CLOVER_59_0.cloverRec.S[3106]++;table[i] = false;
					__CLOVER_59_0.cloverRec.S[3107]++;i = 0;
				}
				}__CLOVER_59_0.cloverRec.S[3108]++;System.out.println("super7:" + i);
			}
		}}
		}__CLOVER_59_0.cloverRec.S[3109]++;System.out.println("super3");
		__CLOVER_59_0.cloverRec.S[3110]++;for (i = 0; (((i < len) && (++__CLOVER_59_0.cloverRec.CT[1086]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1086]==0&false)); i++) {{
			__CLOVER_59_0.cloverRec.S[3111]++;if ((((table[i]) && (++__CLOVER_59_0.cloverRec.CT[1087]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1087]==0&false))) {{
				assert ((((res == -1) ) && (++__CLOVER_59_0.cloverRec.CT[1088]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1088]==0&false)): "t=" + res + "+" + i;// plusieurs type de
														  // retour non compris
				__CLOVER_59_0.cloverRec.S[3112]++;res = i;
			}
		}}
		}assert ((((res != -1)) && (++__CLOVER_59_0.cloverRec.CT[1089]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1089]==0&false));
		__CLOVER_59_0.cloverRec.S[3113]++;System.out.println("super4");
		__CLOVER_59_0.cloverRec.S[3114]++;t = ((Classe) liste_classe.elementAt(res)).type;
		__CLOVER_59_0.cloverRec.S[3115]++;return t;
	}

	public void affiche_heritage_directe() {__CLOVER_59_0.cloverRec.M[365]++;
		__CLOVER_59_0.cloverRec.S[3116]++;int i, j, nb;
		__CLOVER_59_0.cloverRec.S[3117]++;Classe cl, cl2;

		__CLOVER_59_0.cloverRec.S[3118]++;System.out.println("heritage directe:");
		__CLOVER_59_0.cloverRec.S[3119]++;for (i = 0; (((i < liste_classe.size()) && (++__CLOVER_59_0.cloverRec.CT[1090]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1090]==0&false)); i++) {{
			__CLOVER_59_0.cloverRec.S[3120]++;cl = (Classe) liste_classe.elementAt(i);
			__CLOVER_59_0.cloverRec.S[3121]++;System.out.print("classe " + cl.nom + " herite de :");
			__CLOVER_59_0.cloverRec.S[3122]++;nb = 0;
			__CLOVER_59_0.cloverRec.S[3123]++;for (j = 0; (((j < table_heritage_directe.length) && (++__CLOVER_59_0.cloverRec.CT[1091]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1091]==0&false)); j++) {{

				__CLOVER_59_0.cloverRec.S[3124]++;cl2 = (Classe) liste_classe.elementAt(j);
				__CLOVER_59_0.cloverRec.S[3125]++;if ((((table_heritage_directe[i][j]) && (++__CLOVER_59_0.cloverRec.CT[1092]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1092]==0&false))) {{
					__CLOVER_59_0.cloverRec.S[3126]++;if ((((nb > 0) && (++__CLOVER_59_0.cloverRec.CT[1093]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1093]==0&false))) {{
						__CLOVER_59_0.cloverRec.S[3127]++;System.out.print(",");
					}
					}__CLOVER_59_0.cloverRec.S[3128]++;System.out.print(cl2.nom);
					__CLOVER_59_0.cloverRec.S[3129]++;nb++;
				}
			}}
			}__CLOVER_59_0.cloverRec.S[3130]++;System.out.println("");
			//System.out.println("attr:" + cl.attributs);
			//System.out.println("attr ancetre:" + cl.attributs_ancetre);
		}
	}}

	public void affiche_heritage() {__CLOVER_59_0.cloverRec.M[366]++;
		__CLOVER_59_0.cloverRec.S[3131]++;int i, j, nb;
		__CLOVER_59_0.cloverRec.S[3132]++;Classe cl, cl2;

		__CLOVER_59_0.cloverRec.S[3133]++;System.out.println("heritage complet:");
		__CLOVER_59_0.cloverRec.S[3134]++;for (i = 0; (((i < table_heritage.length) && (++__CLOVER_59_0.cloverRec.CT[1094]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1094]==0&false)); i++) {{
			__CLOVER_59_0.cloverRec.S[3135]++;cl = (Classe) liste_classe.elementAt(i);
			__CLOVER_59_0.cloverRec.S[3136]++;System.out.print("classe " + cl.nom + " herite de :");
			__CLOVER_59_0.cloverRec.S[3137]++;nb = 0;
			__CLOVER_59_0.cloverRec.S[3138]++;for (j = 0; (((j < table_heritage.length) && (++__CLOVER_59_0.cloverRec.CT[1095]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1095]==0&false)); j++) {{

				__CLOVER_59_0.cloverRec.S[3139]++;cl2 = (Classe) liste_classe.elementAt(j);
				__CLOVER_59_0.cloverRec.S[3140]++;if ((((table_heritage[i][j]) && (++__CLOVER_59_0.cloverRec.CT[1096]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1096]==0&false))) {{
					__CLOVER_59_0.cloverRec.S[3141]++;if ((((nb > 0) && (++__CLOVER_59_0.cloverRec.CT[1097]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1097]==0&false))) {{
						__CLOVER_59_0.cloverRec.S[3142]++;System.out.print(",");
					}
					}__CLOVER_59_0.cloverRec.S[3143]++;System.out.print(cl2.nom);
					__CLOVER_59_0.cloverRec.S[3144]++;nb++;
				}
			}}
			}__CLOVER_59_0.cloverRec.S[3145]++;System.out.println("");
			//System.out.println("attr:" + cl.attributs);
			//System.out.println("attr ancetre:" + cl.attributs_ancetre);
		}
	}}

	public void affiche_classe() {__CLOVER_59_0.cloverRec.M[367]++;
		__CLOVER_59_0.cloverRec.S[3146]++;int i;
		__CLOVER_59_0.cloverRec.S[3147]++;Classe cl;
		__CLOVER_59_0.cloverRec.S[3148]++;for (i = 0; (((i < liste_classe.size()) && (++__CLOVER_59_0.cloverRec.CT[1098]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1098]==0&false)); i++) {{
			__CLOVER_59_0.cloverRec.S[3149]++;cl = (Classe) liste_classe.elementAt(i);
			__CLOVER_59_0.cloverRec.S[3150]++;System.out.println(i + ":" + cl.nom);
		}
	}}

	public void ajoute_type(Type liste[]) {__CLOVER_59_0.cloverRec.M[368]++;
		__CLOVER_59_0.cloverRec.S[3151]++;int i, j;
		__CLOVER_59_0.cloverRec.S[3152]++;Type t, t2;
		__CLOVER_59_0.cloverRec.S[3153]++;boolean trouve = false;

		__CLOVER_59_0.cloverRec.S[3154]++;for (i = 0; (((i < liste.length) && (++__CLOVER_59_0.cloverRec.CT[1099]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1099]==0&false)); i++) {{
			__CLOVER_59_0.cloverRec.S[3155]++;t = liste[i];
			__CLOVER_59_0.cloverRec.S[3156]++;trouve = false;
			__CLOVER_59_0.cloverRec.S[3157]++;for (j = 0; (((!trouve && j < liste_type.size()) && (++__CLOVER_59_0.cloverRec.CT[1100]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1100]==0&false)); j++) {{
				__CLOVER_59_0.cloverRec.S[3158]++;t2 = (Type) liste_type.elementAt(j);
				__CLOVER_59_0.cloverRec.S[3159]++;if ((((t2.egaux(t)) && (++__CLOVER_59_0.cloverRec.CT[1101]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1101]==0&false))) {{
					__CLOVER_59_0.cloverRec.S[3160]++;trouve = true;
				}
			}}
			}__CLOVER_59_0.cloverRec.S[3161]++;if ((((!trouve) && (++__CLOVER_59_0.cloverRec.CT[1102]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1102]==0&false))) {{
				__CLOVER_59_0.cloverRec.S[3162]++;liste_type.addElement(t);
			}
		}}
	}}

	public Ace get_configuration() {__CLOVER_59_0.cloverRec.M[369]++;
		__CLOVER_59_0.cloverRec.S[3163]++;return configuration;
	}

	protected Ace configuration;

	public void configure(String nom) {__CLOVER_59_0.cloverRec.M[370]++;
		assert ((((nom != null)) && (++__CLOVER_59_0.cloverRec.CT[1103]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1103]==0&false));
		__CLOVER_59_0.cloverRec.S[3164]++;if ((((nom.endsWith(".e")) && (++__CLOVER_59_0.cloverRec.CT[1104]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1104]==0&false))) {{// fichier Eiffel
			__CLOVER_59_0.cloverRec.S[3165]++;Grappe g;
			__CLOVER_59_0.cloverRec.S[3166]++;NomGrappe ng;
			__CLOVER_59_0.cloverRec.S[3167]++;NomSysteme ns = new NomSysteme("defaut", new Token(-1, -1, "xx",
					"yy"));
			__CLOVER_59_0.cloverRec.S[3168]++;Type nom_classe;
			__CLOVER_59_0.cloverRec.S[3169]++;String nom_simple;
			__CLOVER_59_0.cloverRec.S[3170]++;Vector liste;
			__CLOVER_59_0.cloverRec.S[3171]++;Chaine rep;
			__CLOVER_59_0.cloverRec.S[3172]++;String path_standard[] = { "", ".\\std_classe\\", ".\\",/* ".\\test\\", */
					"" };
			assert ((((path_standard != null)) && (++__CLOVER_59_0.cloverRec.CT[1105]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1105]==0&false));
			assert ((((path_standard.length > 0)) && (++__CLOVER_59_0.cloverRec.CT[1106]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1106]==0&false));
			__CLOVER_59_0.cloverRec.S[3173]++;File f = new File(nom);
			__CLOVER_59_0.cloverRec.S[3174]++;String path = f.getParent();
			__CLOVER_59_0.cloverRec.S[3175]++;nom_simple = f.getName();
			__CLOVER_59_0.cloverRec.S[3176]++;if ((((nom_simple.endsWith(".e")) && (++__CLOVER_59_0.cloverRec.CT[1107]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1107]==0&false)))
				{__CLOVER_59_0.cloverRec.S[3177]++;nom_simple = nom_simple.substring(0, nom_simple.length() - 2);
			}__CLOVER_59_0.cloverRec.S[3178]++;nom_classe = new TypeSimple(false, nom_simple, new Vector());
			__CLOVER_59_0.cloverRec.S[3179]++;if ((((path != null) && (++__CLOVER_59_0.cloverRec.CT[1108]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1108]==0&false))) {{
				__CLOVER_59_0.cloverRec.S[3180]++;path_standard[path_standard.length - 1] = path + "\\";
			}
			}__CLOVER_59_0.cloverRec.S[3181]++;liste = new Vector();
			__CLOVER_59_0.cloverRec.S[3182]++;for (int i = 0; (((i < path_standard.length) && (++__CLOVER_59_0.cloverRec.CT[1109]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1109]==0&false)); i++) {{
				__CLOVER_59_0.cloverRec.S[3183]++;Vector v = new Vector();
				__CLOVER_59_0.cloverRec.S[3184]++;v.addElement(path_standard[i]);
				__CLOVER_59_0.cloverRec.S[3185]++;rep = new Chaine(v, new Token(-1, -1, "xx", "yy"));
				__CLOVER_59_0.cloverRec.S[3186]++;g = new Grappe(null, rep);
				__CLOVER_59_0.cloverRec.S[3187]++;liste.addElement(g);
			}
			}__CLOVER_59_0.cloverRec.S[3188]++;configuration = new Ace(ns, nom_classe, null, null, liste);
		} }else {__CLOVER_59_0.cloverRec.S[3189]++;if ((((nom.endsWith(".ace")) && (++__CLOVER_59_0.cloverRec.CT[1110]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1110]==0&false))) {{// fichier Ace
			__CLOVER_59_0.cloverRec.S[3190]++;String nom_reel = nom;
			__CLOVER_59_0.cloverRec.S[3191]++;Ace ace;
			__CLOVER_59_0.cloverRec.S[3192]++;System.out.println("++++++++++++++++++++++++");
			__CLOVER_59_0.cloverRec.S[3193]++;try{
			__CLOVER_59_0.cloverRec.S[3194]++;ParserAce parser_tmp,parser = new ParserAce(nom_reel);
			//parser.setASTNodeClass("compiler.ASTDefaut");
			//parser.setFilename(nom_reel);
			//parser.lexer = lexer;
			__CLOVER_59_0.cloverRec.S[3195]++;parser.logging = logging;
			__CLOVER_59_0.cloverRec.S[3196]++;parser_tmp = parser;
			//parser.logging=logging;
			// Parse the input expression
			//System.out.println("A1");
			__CLOVER_59_0.cloverRec.S[3197]++;ace = parser.parse_ace();
			__CLOVER_59_0.cloverRec.S[3198]++;if ((((ace == null || !parser.etatOk() || !parser.etatParserOk()) && (++__CLOVER_59_0.cloverRec.CT[1111]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1111]==0&false))) {{
				__CLOVER_59_0.cloverRec.S[3199]++;configuration=null;
				__CLOVER_59_0.cloverRec.S[3200]++;if ((((!parser.etatOk()) && (++__CLOVER_59_0.cloverRec.CT[1112]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1112]==0&false))) {{
					__CLOVER_59_0.cloverRec.S[3201]++;int x, y;
					__CLOVER_59_0.cloverRec.S[3202]++;x = parser_tmp.lexer.getColumn();
					__CLOVER_59_0.cloverRec.S[3203]++;y = parser_tmp.lexer.getLine();
					__CLOVER_59_0.cloverRec.S[3204]++;logging.erreur(new ErreurSource("Erreur lexicale:"
							+ parser.lexer.getMessageErr(), x, y, nom_reel));
				} }else {__CLOVER_59_0.cloverRec.S[3205]++;if ((((!parser.etatParserOk()) && (++__CLOVER_59_0.cloverRec.CT[1113]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1113]==0&false))) {{
					__CLOVER_59_0.cloverRec.S[3206]++;logging.erreur(new ErreurSource("Erreur de parsing:"
							+ parser.getMsgErreur(), parser.getLine(), parser
							.getColumn(), parser.getFilename()));
				} }else {{
					assert ((((false)) && (++__CLOVER_59_0.cloverRec.CT[1114]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1114]==0&false));
				}
				}}__CLOVER_59_0.cloverRec.S[3207]++;return;
			}
			}__CLOVER_59_0.cloverRec.S[3208]++;configuration=ace;
			
		}catch (FileNotFoundException e) {
			__CLOVER_59_0.cloverRec.S[3209]++;logging.erreur(new ErreurIO("Fichier " + nom_reel
					+ " non trouve", nom_reel));
			__CLOVER_59_0.cloverRec.S[3210]++;return;
		} catch (SecurityException e) {
			__CLOVER_59_0.cloverRec.S[3211]++;logging.erreur(new ErreurSource("Erreur: erreur de securite", -1,
					-1, nom_reel));
			__CLOVER_59_0.cloverRec.S[3212]++;return;
		}
			/*try {
				AceLexer lexer = new AceLexer(new FileInputStream(nom_reel));
				lexer.setFilename(nom_reel);
				AceParser parser = new AceParser(lexer);
				parser.setASTNodeClass("tinyeiffel.compiler.ASTDefaut");
				parser.setFilename(nom_reel);
				parser.lexer = lexer;
				parser.logging = logging;
				//parser.logging=logging;
				// Parse the input expression
				configuration = parser.ace();
				System.out.println("classe racine:" + configuration.nom_classe);
				System.out.println("----------------------");
			} catch (TokenStreamException e) {
				//erreur("exception: " + e);
				int x, y;
				x = -1;
				y = -1;
				if (e instanceof TokenStreamRecognitionException) {
					//x=((TokenStreamRecognitionException)e).;
					//y=((TokenStreamRecognitionException)e);
				}
				logging.erreur(new ErreurSource("Erreur lexicale:"
						+ e.getMessage(), x, y, nom_reel));
			} catch (RecognitionException e) {
				//erreur("exception: " + e);
				logging.erreur(new ErreurSource("Erreur de parsing:"
						+ e.getMessage(), e.getLine(), e.getColumn(), e
						.getFilename()));
			} catch (FileNotFoundException e) {
				//erreur("Erreur1: fichier " + nom_fichier + " non trouve");
				//erreur("exception: " + e);
				//assert(false);
				logging.erreur(new ErreurIO("Fichier " + nom + " non trouve",
						nom));
			} catch (SecurityException e) {
				logging.erreur(new ErreurSource("Erreur: erreur de securite",
						-1, -1, nom));
			}*/
		} }else {{
			assert ((((false)) && (++__CLOVER_59_0.cloverRec.CT[1115]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1115]==0&false));
		}
		}}__CLOVER_59_0.cloverRec.S[3213]++;if ((((configuration == null) && (++__CLOVER_59_0.cloverRec.CT[1116]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1116]==0&false))) {{
			__CLOVER_59_0.cloverRec.S[3214]++;System.out.println("Univers:null");
		} }else {{
			__CLOVER_59_0.cloverRec.S[3215]++;Grappe g, liste[];
			__CLOVER_59_0.cloverRec.S[3216]++;liste = configuration.liste_grappe;
			/*
			 * System.out.println("Univers:{"); if(liste!=null) { for(int i=0;i
			 * <liste.length;i++) { if(i>0) System.out.println(","); g=liste[i];
			 * System.out.print(i+":"+g.donne_repertoire());
			 * if(g.getNom()!=null) { System.out.print("("+g.getNom()+")"); } } }
			 * System.out.println("}");
			 */
		}
	}}

	public String donne_nom(String nom) {__CLOVER_59_0.cloverRec.M[371]++;
		__CLOVER_59_0.cloverRec.S[3217]++;File file;
		__CLOVER_59_0.cloverRec.S[3218]++;String path[] = null; //= path_standard;
		__CLOVER_59_0.cloverRec.S[3219]++;int i;
		__CLOVER_59_0.cloverRec.S[3220]++;String s;
		__CLOVER_59_0.cloverRec.S[3221]++;Grappe g[];

		assert ((((configuration != null)) && (++__CLOVER_59_0.cloverRec.CT[1117]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1117]==0&false));
		__CLOVER_59_0.cloverRec.S[3222]++;g = configuration.liste_grappe;
		__CLOVER_59_0.cloverRec.S[3223]++;path = new String[g.length];
		__CLOVER_59_0.cloverRec.S[3224]++;for (i = 0; (((i < g.length) && (++__CLOVER_59_0.cloverRec.CT[1118]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1118]==0&false)); i++) {{
			__CLOVER_59_0.cloverRec.S[3225]++;path[i] = g[i].donne_repertoire();
			__CLOVER_59_0.cloverRec.S[3226]++;if ((((!path[i].endsWith("\\")) && (++__CLOVER_59_0.cloverRec.CT[1119]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1119]==0&false)))
				{__CLOVER_59_0.cloverRec.S[3227]++;path[i] = path[i] + "\\";
		}}
		}__CLOVER_59_0.cloverRec.S[3228]++;for (i = 0; (((i < path.length) && (++__CLOVER_59_0.cloverRec.CT[1120]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1120]==0&false)); i++) {{
			__CLOVER_59_0.cloverRec.S[3229]++;s = path[i] + nom;
			__CLOVER_59_0.cloverRec.S[3230]++;if ((((nom.equalsIgnoreCase("TOTO1.e")) && (++__CLOVER_59_0.cloverRec.CT[1121]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1121]==0&false))) {{
				__CLOVER_59_0.cloverRec.S[3231]++;System.out.println("coucou[" + i + "]" + s + ";");
			}
			}__CLOVER_59_0.cloverRec.S[3232]++;file = new File(s);
			__CLOVER_59_0.cloverRec.S[3233]++;if ((((file.exists()) && (++__CLOVER_59_0.cloverRec.CT[1122]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1122]==0&false))) {{
				__CLOVER_59_0.cloverRec.S[3234]++;return s;
			}
		}}

		}__CLOVER_59_0.cloverRec.S[3235]++;return "";
	}

	public boolean classe_existe(String nom) {__CLOVER_59_0.cloverRec.M[372]++;
		__CLOVER_59_0.cloverRec.S[3236]++;return donne_nom(nom + ".e") != "";
	}

	public Classe parse_file(String nom_fichier) {__CLOVER_59_0.cloverRec.M[373]++;
		__CLOVER_59_0.cloverRec.S[3237]++;Classe c;
		__CLOVER_59_0.cloverRec.S[3238]++;String nom_reel = null;
		__CLOVER_59_0.cloverRec.S[3239]++;Parser parser_tmp = null;
		__CLOVER_59_0.cloverRec.S[3240]++;System.out.println("parse de " + nom_fichier);
		__CLOVER_59_0.cloverRec.S[3241]++;nom_reel = donne_nom(nom_fichier);
		__CLOVER_59_0.cloverRec.S[3242]++;if ((((nom_reel == "") && (++__CLOVER_59_0.cloverRec.CT[1123]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1123]==0&false))) {{
			__CLOVER_59_0.cloverRec.S[3243]++;logging.erreur(new ErreurIO("Fichier " + nom_fichier
					+ " non trouve", nom_fichier));
			__CLOVER_59_0.cloverRec.S[3244]++;return null;
		}
		}__CLOVER_59_0.cloverRec.S[3245]++;try {
			//Lexer lexer =new Lexer(new FileInputStream(nom_reel));
			//lexer.setFilename(nom_reel);
			__CLOVER_59_0.cloverRec.S[3246]++;Parser parser = new Parser(nom_reel);
			//parser.setASTNodeClass("compiler.ASTDefaut");
			//parser.setFilename(nom_reel);
			//parser.lexer = lexer;
			__CLOVER_59_0.cloverRec.S[3247]++;parser.logging = logging;
			__CLOVER_59_0.cloverRec.S[3248]++;parser_tmp = parser;
			//parser.logging=logging;
			// Parse the input expression
			//System.out.println("A1");
			__CLOVER_59_0.cloverRec.S[3249]++;c = parser.parse_classe();
			__CLOVER_59_0.cloverRec.S[3250]++;if ((((c == null || !parser.etatOk() || !parser.etatParserOk()) && (++__CLOVER_59_0.cloverRec.CT[1124]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1124]==0&false))) {{
				__CLOVER_59_0.cloverRec.S[3251]++;if ((((!parser.etatOk()) && (++__CLOVER_59_0.cloverRec.CT[1125]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1125]==0&false))) {{
					__CLOVER_59_0.cloverRec.S[3252]++;int x, y;
					__CLOVER_59_0.cloverRec.S[3253]++;x = parser_tmp.lexer.getColumn();
					__CLOVER_59_0.cloverRec.S[3254]++;y = parser_tmp.lexer.getLine();
					__CLOVER_59_0.cloverRec.S[3255]++;logging.erreur(new ErreurSource("Erreur lexicale:"
							+ parser.lexer.getMessageErr(), x, y, nom_reel));
				} }else {__CLOVER_59_0.cloverRec.S[3256]++;if ((((!parser.etatParserOk()) && (++__CLOVER_59_0.cloverRec.CT[1126]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1126]==0&false))) {{
					__CLOVER_59_0.cloverRec.S[3257]++;logging.erreur(new ErreurSource("Erreur de parsing:"
							+ parser.getMsgErreur(), parser.getLine(), parser
							.getColumn(), parser.getFilename()));
				} }else {{
					assert ((((false)) && (++__CLOVER_59_0.cloverRec.CT[1127]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1127]==0&false));
				}
				}}__CLOVER_59_0.cloverRec.S[3258]++;return null;
			}
			//System.out.println("A2");
			}__CLOVER_59_0.cloverRec.S[3259]++;Vector liste_classe = parser.type_utilisee;
			//System.out.println("classe:" + liste_classe);
			__CLOVER_59_0.cloverRec.S[3260]++;if ((((c == null) && (++__CLOVER_59_0.cloverRec.CT[1128]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1128]==0&false))) {{
				__CLOVER_59_0.cloverRec.S[3261]++;return null;
			}
			}__CLOVER_59_0.cloverRec.S[3262]++;if ((((c.type != null && c.type.generique != null
					&& c.type.generique.length > 0) && (++__CLOVER_59_0.cloverRec.CT[1129]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1129]==0&false))) {{// elimination dans
													 // liste_classe
				// des parametres generiques
				__CLOVER_59_0.cloverRec.S[3263]++;for (int i = 0; (((i < c.type.generique.length) && (++__CLOVER_59_0.cloverRec.CT[1130]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1130]==0&false)); i++) {{
					__CLOVER_59_0.cloverRec.S[3264]++;Type t1, t2;
					__CLOVER_59_0.cloverRec.S[3265]++;t1 = c.type.generique[i];
					__CLOVER_59_0.cloverRec.S[3266]++;for (int j = 0; (((j < liste_classe.size()) && (++__CLOVER_59_0.cloverRec.CT[1131]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1131]==0&false)); j++) {{
						__CLOVER_59_0.cloverRec.S[3267]++;t2 = (Type) liste_classe.elementAt(j);
						__CLOVER_59_0.cloverRec.S[3268]++;if ((((t1.egaux(t2)) && (++__CLOVER_59_0.cloverRec.CT[1132]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1132]==0&false))) {{
							__CLOVER_59_0.cloverRec.S[3269]++;liste_classe.remove(j);
							__CLOVER_59_0.cloverRec.S[3270]++;j--;
						}
					}}
				}}
			}}
			}__CLOVER_59_0.cloverRec.S[3271]++;c.set_liste_classe(liste_classe);
		}/*
		  * catch (TokenStreamException e) { //erreur("exception: " + e); int
		  * x,y;
		  * 
		  * x=parser_tmp.lexer.getColumn(); y=parser_tmp.lexer.getLine();
		  * //parser_tmp.lexer.getFilename(); if(e instanceof
		  * TokenStreamRecognitionException) {
		  * //x=((TokenStreamRecognitionException)e).;
		  * //y=((TokenStreamRecognitionException)e); } logging.erreur(new
		  * ErreurSource("Erreur lexicale:"+ e.getMessage(),x,y,nom_reel));
		  * return null; } catch (RecognitionException e) { //erreur("exception: " +
		  * e); logging.erreur(new ErreurSource("Erreur de parsing:"+
		  * e.getMessage(),e.getLine(),e.getColumn(), e.getFilename())); return
		  * null; }
		  */catch (FileNotFoundException e) {
			//erreur("Erreur1: fichier " + nom_fichier + " non trouve");
			//erreur("exception: " + e);
			//assert(false);
			__CLOVER_59_0.cloverRec.S[3272]++;logging.erreur(new ErreurIO("Fichier " + nom_fichier
					+ " non trouve", nom_fichier));
			__CLOVER_59_0.cloverRec.S[3273]++;return null;
		} catch (SecurityException e) {
			__CLOVER_59_0.cloverRec.S[3274]++;logging.erreur(new ErreurSource("Erreur: erreur de securite", -1,
					-1, nom_fichier));
			__CLOVER_59_0.cloverRec.S[3275]++;return null;
		}
		__CLOVER_59_0.cloverRec.S[3276]++;return c;
	}

	public Classe parse_file2(String nom_fichier) {__CLOVER_59_0.cloverRec.M[374]++;
		__CLOVER_59_0.cloverRec.S[3277]++;Classe c;
		__CLOVER_59_0.cloverRec.S[3278]++;String nom_reel = null;
		__CLOVER_59_0.cloverRec.S[3279]++;EiffelParser parser_tmp = null;
		__CLOVER_59_0.cloverRec.S[3280]++;System.out.println("parse de " + nom_fichier);
		__CLOVER_59_0.cloverRec.S[3281]++;nom_reel = donne_nom(nom_fichier);
		__CLOVER_59_0.cloverRec.S[3282]++;if ((((nom_reel == "") && (++__CLOVER_59_0.cloverRec.CT[1133]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1133]==0&false))) {{
			__CLOVER_59_0.cloverRec.S[3283]++;logging.erreur(new ErreurIO("Fichier " + nom_fichier
					+ " non trouve", nom_fichier));
			__CLOVER_59_0.cloverRec.S[3284]++;return null;
		}
		}__CLOVER_59_0.cloverRec.S[3285]++;try {
			__CLOVER_59_0.cloverRec.S[3286]++;EiffelLexer lexer = new EiffelLexer(new FileInputStream(nom_reel));
			__CLOVER_59_0.cloverRec.S[3287]++;lexer.setFilename(nom_reel);
			__CLOVER_59_0.cloverRec.S[3288]++;EiffelParser parser = new EiffelParser(lexer);
			__CLOVER_59_0.cloverRec.S[3289]++;parser.setASTNodeClass("tinyeiffel.compiler.ASTDefaut");
			__CLOVER_59_0.cloverRec.S[3290]++;parser.setFilename(nom_reel);
			__CLOVER_59_0.cloverRec.S[3291]++;parser.lexer = lexer;
			__CLOVER_59_0.cloverRec.S[3292]++;parser.logging = logging;
			__CLOVER_59_0.cloverRec.S[3293]++;parser_tmp = parser;
			//parser.logging=logging;
			// Parse the input expression
			//System.out.println("A1");
			__CLOVER_59_0.cloverRec.S[3294]++;c = parser.classe();
			//System.out.println("A2");
			__CLOVER_59_0.cloverRec.S[3295]++;Vector liste_classe = parser.type_utilisee;
			//System.out.println("classe:" + liste_classe);
			__CLOVER_59_0.cloverRec.S[3296]++;if ((((c == null) && (++__CLOVER_59_0.cloverRec.CT[1134]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1134]==0&false))) {{
				__CLOVER_59_0.cloverRec.S[3297]++;return null;
			}
			}__CLOVER_59_0.cloverRec.S[3298]++;if ((((c.type != null && c.type.generique != null
					&& c.type.generique.length > 0) && (++__CLOVER_59_0.cloverRec.CT[1135]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1135]==0&false))) {{// elimination dans
													 // liste_classe
				// des parametres generiques
				__CLOVER_59_0.cloverRec.S[3299]++;for (int i = 0; (((i < c.type.generique.length) && (++__CLOVER_59_0.cloverRec.CT[1136]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1136]==0&false)); i++) {{
					__CLOVER_59_0.cloverRec.S[3300]++;Type t1, t2;
					__CLOVER_59_0.cloverRec.S[3301]++;t1 = c.type.generique[i];
					__CLOVER_59_0.cloverRec.S[3302]++;for (int j = 0; (((j < liste_classe.size()) && (++__CLOVER_59_0.cloverRec.CT[1137]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1137]==0&false)); j++) {{
						__CLOVER_59_0.cloverRec.S[3303]++;t2 = (Type) liste_classe.elementAt(j);
						__CLOVER_59_0.cloverRec.S[3304]++;if ((((t1.egaux(t2)) && (++__CLOVER_59_0.cloverRec.CT[1138]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1138]==0&false))) {{
							__CLOVER_59_0.cloverRec.S[3305]++;liste_classe.remove(j);
							__CLOVER_59_0.cloverRec.S[3306]++;j--;
						}
					}}
				}}
			}}
			}__CLOVER_59_0.cloverRec.S[3307]++;c.set_liste_classe(liste_classe);
		} catch (TokenStreamException e) {
			//erreur("exception: " + e);
			__CLOVER_59_0.cloverRec.S[3308]++;int x, y;

			__CLOVER_59_0.cloverRec.S[3309]++;x = parser_tmp.lexer.getColumn();
			__CLOVER_59_0.cloverRec.S[3310]++;y = parser_tmp.lexer.getLine();
			//parser_tmp.lexer.getFilename();
			__CLOVER_59_0.cloverRec.S[3311]++;if ((((e instanceof TokenStreamRecognitionException) && (++__CLOVER_59_0.cloverRec.CT[1139]!=0|true)) || (++__CLOVER_59_0.cloverRec.CF[1139]==0&false))) {{
				//x=((TokenStreamRecognitionException)e).;
				//y=((TokenStreamRecognitionException)e);
			}
			}__CLOVER_59_0.cloverRec.S[3312]++;logging.erreur(new ErreurSource(
					"Erreur lexicale:" + e.getMessage(), x, y, nom_reel));
			__CLOVER_59_0.cloverRec.S[3313]++;return null;
		} catch (RecognitionException e) {
			//erreur("exception: " + e);
			__CLOVER_59_0.cloverRec.S[3314]++;logging.erreur(new ErreurSource("Erreur de parsing:"
					+ e.getMessage(), e.getLine(), e.getColumn(), e
					.getFilename()));
			__CLOVER_59_0.cloverRec.S[3315]++;return null;
		} catch (FileNotFoundException e) {
			//erreur("Erreur1: fichier " + nom_fichier + " non trouve");
			//erreur("exception: " + e);
			//assert(false);
			__CLOVER_59_0.cloverRec.S[3316]++;logging.erreur(new ErreurIO("Fichier " + nom_fichier
					+ " non trouve", nom_fichier));
			__CLOVER_59_0.cloverRec.S[3317]++;return null;
		} catch (SecurityException e) {
			__CLOVER_59_0.cloverRec.S[3318]++;logging.erreur(new ErreurSource("Erreur: erreur de securite", -1,
					-1, nom_fichier));
			__CLOVER_59_0.cloverRec.S[3319]++;return null;
		}
		__CLOVER_59_0.cloverRec.S[3320]++;return c;
	}
}