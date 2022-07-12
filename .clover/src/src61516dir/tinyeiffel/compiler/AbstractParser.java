/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 4 juin 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package tinyeiffel.compiler;

import java.util.Vector;

import tinyeiffel.ast.Chaine;
import tinyeiffel.ast.NomFeature;
import tinyeiffel.ast.Token;
import tinyeiffel.ast.Type;
import tinyeiffel.erreur.ErreurSource;

/**
 * @author barret
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public abstract class AbstractParser extends Lexer_Constantes {static class __CLOVER_53_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	public Vector type_utilisee;
	public Logging logging;
	protected Lexer lexer;

	public void ajoute_type(Type t) {__CLOVER_53_0.cloverRec.M[291]++;
		__CLOVER_53_0.cloverRec.S[1415]++;int j;
	
		__CLOVER_53_0.cloverRec.S[1416]++;if((((t!=null&&!((Type)t).is_like) && (++__CLOVER_53_0.cloverRec.CT[566]!=0|true)) || (++__CLOVER_53_0.cloverRec.CF[566]==0&false)))
		{{
			__CLOVER_53_0.cloverRec.S[1417]++;for(j=0;(((j<type_utilisee.size()) && (++__CLOVER_53_0.cloverRec.CT[567]!=0|true)) || (++__CLOVER_53_0.cloverRec.CF[567]==0&false));j++)
			{{
				__CLOVER_53_0.cloverRec.S[1418]++;if((((((Type)type_utilisee.elementAt(j)).egaux(t)) && (++__CLOVER_53_0.cloverRec.CT[568]!=0|true)) || (++__CLOVER_53_0.cloverRec.CF[568]==0&false)))
				{{
					__CLOVER_53_0.cloverRec.S[1419]++;return;
				}
			}}
			}__CLOVER_53_0.cloverRec.S[1420]++;type_utilisee.addElement(t);
		}
	}}

	public void ajoute_type(Vector t) {__CLOVER_53_0.cloverRec.M[292]++;
		__CLOVER_53_0.cloverRec.S[1421]++;int i,j;
		__CLOVER_53_0.cloverRec.S[1422]++;boolean trouve;
	
		__CLOVER_53_0.cloverRec.S[1423]++;if((((t!=null) && (++__CLOVER_53_0.cloverRec.CT[569]!=0|true)) || (++__CLOVER_53_0.cloverRec.CF[569]==0&false)))
		{{
			__CLOVER_53_0.cloverRec.S[1424]++;for(i=0;(((i<t.size()) && (++__CLOVER_53_0.cloverRec.CT[570]!=0|true)) || (++__CLOVER_53_0.cloverRec.CF[570]==0&false));i++)
			{{
				__CLOVER_53_0.cloverRec.S[1425]++;if((((!((Type)t.elementAt(i)).is_like) && (++__CLOVER_53_0.cloverRec.CT[571]!=0|true)) || (++__CLOVER_53_0.cloverRec.CF[571]==0&false)))
				{{
					__CLOVER_53_0.cloverRec.S[1426]++;trouve=false;
					__CLOVER_53_0.cloverRec.S[1427]++;for(j=0;(((!trouve&&j<type_utilisee.size()) && (++__CLOVER_53_0.cloverRec.CT[572]!=0|true)) || (++__CLOVER_53_0.cloverRec.CF[572]==0&false));j++)
					{{
						__CLOVER_53_0.cloverRec.S[1428]++;if((((((Type)type_utilisee.elementAt(j)).egaux(
							((Type)t.elementAt(i)))) && (++__CLOVER_53_0.cloverRec.CT[573]!=0|true)) || (++__CLOVER_53_0.cloverRec.CF[573]==0&false)))
						{{
								__CLOVER_53_0.cloverRec.S[1429]++;trouve=true;
						}
					}}
					}__CLOVER_53_0.cloverRec.S[1430]++;if((((!trouve) && (++__CLOVER_53_0.cloverRec.CT[574]!=0|true)) || (++__CLOVER_53_0.cloverRec.CF[574]==0&false)))
					{{
						__CLOVER_53_0.cloverRec.S[1431]++;ajoute_type((Type)t.elementAt(i));
					}
				}}
			}}
		}}
	}}

	/********************** parser ***********************/
	public boolean etatOk() {__CLOVER_53_0.cloverRec.M[293]++;
		__CLOVER_53_0.cloverRec.S[1432]++;return lexer.etatOk;
	}

	protected NomFeature parse_nom_feature() {__CLOVER_53_0.cloverRec.M[294]++;
		__CLOVER_53_0.cloverRec.S[1433]++;Token t_nom,t_frozen,t_accoladeF,t_id,t_virgule;
		__CLOVER_53_0.cloverRec.S[1434]++;Type type;
		__CLOVER_53_0.cloverRec.S[1435]++;NomFeature n=null;
		__CLOVER_53_0.cloverRec.S[1436]++;boolean erreur=false,est_frozen=false,est_deferred=false;
		__CLOVER_53_0.cloverRec.S[1437]++;Vector liste_creation,liste_nom_feature,liste_type;
		__CLOVER_53_0.cloverRec.S[1438]++;t_frozen=lexer.lit(TK_FROZEN);
		__CLOVER_53_0.cloverRec.S[1439]++;if((((t_frozen!=null) && (++__CLOVER_53_0.cloverRec.CT[575]!=0|true)) || (++__CLOVER_53_0.cloverRec.CF[575]==0&false)))
		{{
			__CLOVER_53_0.cloverRec.S[1440]++;est_frozen=true;
		}
		}__CLOVER_53_0.cloverRec.S[1441]++;t_nom=lexer.lit(ID);
		__CLOVER_53_0.cloverRec.S[1442]++;if((((t_nom!=null) && (++__CLOVER_53_0.cloverRec.CT[576]!=0|true)) || (++__CLOVER_53_0.cloverRec.CF[576]==0&false)))
		{{
			__CLOVER_53_0.cloverRec.S[1443]++;n=new NomFeature(t_nom.text);
			__CLOVER_53_0.cloverRec.S[1444]++;n.set_token(t_nom,null);
			__CLOVER_53_0.cloverRec.S[1445]++;n.prefix=false;
			__CLOVER_53_0.cloverRec.S[1446]++;n.infix=false;
		}
		}else
		{{// TODO: infix et prefix
			__CLOVER_53_0.cloverRec.S[1447]++;Chaine ch;
			__CLOVER_53_0.cloverRec.S[1448]++;Token t_infix,t_prefix=null;
			__CLOVER_53_0.cloverRec.S[1449]++;t_infix=lexer.lit(TK_INFIX);
			__CLOVER_53_0.cloverRec.S[1450]++;if((((t_infix==null) && (++__CLOVER_53_0.cloverRec.CT[577]!=0|true)) || (++__CLOVER_53_0.cloverRec.CF[577]==0&false)))
			{{
				__CLOVER_53_0.cloverRec.S[1451]++;t_prefix=lexer.lit(TK_PREFIX);
			}
			}__CLOVER_53_0.cloverRec.S[1452]++;if((((t_infix!=null||t_prefix!=null) && (++__CLOVER_53_0.cloverRec.CT[578]!=0|true)) || (++__CLOVER_53_0.cloverRec.CF[578]==0&false)))
			{{
				__CLOVER_53_0.cloverRec.S[1453]++;ch=parse_chaine();
				__CLOVER_53_0.cloverRec.S[1454]++;if((((ch==null) && (++__CLOVER_53_0.cloverRec.CT[579]!=0|true)) || (++__CLOVER_53_0.cloverRec.CF[579]==0&false)))
				{{
					__CLOVER_53_0.cloverRec.S[1455]++;erreur_parse("Il faut une chaine");
					__CLOVER_53_0.cloverRec.S[1456]++;erreur=true;
				}
				}else
				{{
					__CLOVER_53_0.cloverRec.S[1457]++;n=new NomFeature(ch);
					__CLOVER_53_0.cloverRec.S[1458]++;if((((t_infix!=null) && (++__CLOVER_53_0.cloverRec.CT[580]!=0|true)) || (++__CLOVER_53_0.cloverRec.CF[580]==0&false)))
					{{
						__CLOVER_53_0.cloverRec.S[1459]++;n.set_token(null,t_infix);
						__CLOVER_53_0.cloverRec.S[1460]++;n.infix=true;
					}
					}else
					{{
						__CLOVER_53_0.cloverRec.S[1461]++;n.set_token(null,t_prefix);
						__CLOVER_53_0.cloverRec.S[1462]++;n.prefix=true;
					}
				}}
			}}
		}}
		}__CLOVER_53_0.cloverRec.S[1463]++;if((((n!=null) && (++__CLOVER_53_0.cloverRec.CT[581]!=0|true)) || (++__CLOVER_53_0.cloverRec.CF[581]==0&false)))
		{{
			__CLOVER_53_0.cloverRec.S[1464]++;n.frozen=est_frozen;
			__CLOVER_53_0.cloverRec.S[1465]++;n.tfrozen=t_frozen;
		}
		//assert((cl!=null)!=erreur);
		}__CLOVER_53_0.cloverRec.S[1466]++;if((((erreur||!etatParserOk()||!etatOk()) && (++__CLOVER_53_0.cloverRec.CT[582]!=0|true)) || (++__CLOVER_53_0.cloverRec.CF[582]==0&false)))
		{{
			__CLOVER_53_0.cloverRec.S[1467]++;erreur_parse2("Erreur dans le nom d'attribut");
		}
		}__CLOVER_53_0.cloverRec.S[1468]++;return n;
	}

	protected Chaine parse_chaine() {__CLOVER_53_0.cloverRec.M[295]++;
		__CLOVER_53_0.cloverRec.S[1469]++;Token t_ch,t_debut;
		__CLOVER_53_0.cloverRec.S[1470]++;Chaine ch,res=null;
		__CLOVER_53_0.cloverRec.S[1471]++;Vector liste=new Vector();
		//erreur_parse("chaine1");
		__CLOVER_53_0.cloverRec.S[1472]++;t_ch=lexer.lit(STRING);
		//erreur_parse("chaine2");
		__CLOVER_53_0.cloverRec.S[1473]++;t_debut=t_ch;
		__CLOVER_53_0.cloverRec.S[1474]++;while((((t_ch!=null) && (++__CLOVER_53_0.cloverRec.CT[583]!=0|true)) || (++__CLOVER_53_0.cloverRec.CF[583]==0&false)))
		{{
			__CLOVER_53_0.cloverRec.S[1475]++;liste.addElement(t_ch.text);
			__CLOVER_53_0.cloverRec.S[1476]++;t_ch=lexer.lit(STRING);
		}
		//erreur_parse("chaine3");
		}__CLOVER_53_0.cloverRec.S[1477]++;if((((liste.size()>0) && (++__CLOVER_53_0.cloverRec.CT[584]!=0|true)) || (++__CLOVER_53_0.cloverRec.CF[584]==0&false)))
		{{
			assert((((t_debut!=null)) && (++__CLOVER_53_0.cloverRec.CT[585]!=0|true)) || (++__CLOVER_53_0.cloverRec.CF[585]==0&false));
			__CLOVER_53_0.cloverRec.S[1478]++;res=new Chaine(liste,t_debut);
		}
		}__CLOVER_53_0.cloverRec.S[1479]++;if((((!etatParserOk()||!etatOk()) && (++__CLOVER_53_0.cloverRec.CT[586]!=0|true)) || (++__CLOVER_53_0.cloverRec.CF[586]==0&false)))
		{{
			__CLOVER_53_0.cloverRec.S[1480]++;erreur_parse2("Erreur dans la chaine");
		}
		}__CLOVER_53_0.cloverRec.S[1481]++;return res;
	}

	protected void erreur_parse(String msg) {__CLOVER_53_0.cloverRec.M[296]++;
		assert((((msg!=null)) && (++__CLOVER_53_0.cloverRec.CT[587]!=0|true)) || (++__CLOVER_53_0.cloverRec.CF[587]==0&false));
		__CLOVER_53_0.cloverRec.S[1482]++;if((((liste_erreur==null) && (++__CLOVER_53_0.cloverRec.CT[588]!=0|true)) || (++__CLOVER_53_0.cloverRec.CF[588]==0&false)))
		{{
			__CLOVER_53_0.cloverRec.S[1483]++;liste_erreur=new Vector();
		}
		}__CLOVER_53_0.cloverRec.S[1484]++;liste_erreur.addElement("Erreur Parse ("+lexer.y+","+lexer.x+"):"+msg);
		__CLOVER_53_0.cloverRec.S[1485]++;System.out.println("Erreur Parse ("+lexer.y+","+lexer.x+"):"+msg);
		__CLOVER_53_0.cloverRec.S[1486]++;System.out.print("suivant_deja_lu="+lexer.suivant_deja_lu);
		__CLOVER_53_0.cloverRec.S[1487]++;if((((lexer.suivant_deja_lu) && (++__CLOVER_53_0.cloverRec.CT[589]!=0|true)) || (++__CLOVER_53_0.cloverRec.CF[589]==0&false)))
			{__CLOVER_53_0.cloverRec.S[1488]++;System.out.print("token="+lexer.dernier_token.text);
		}__CLOVER_53_0.cloverRec.S[1489]++;System.out.println();
		__CLOVER_53_0.cloverRec.S[1490]++;System.out.println("Debug lexer :"+lexer.str_debug());
	}

	protected void erreur_parse2(String msg) {__CLOVER_53_0.cloverRec.M[297]++;
		assert((((msg!=null)) && (++__CLOVER_53_0.cloverRec.CT[590]!=0|true)) || (++__CLOVER_53_0.cloverRec.CF[590]==0&false));
		__CLOVER_53_0.cloverRec.S[1491]++;logging.erreur(new ErreurSource(msg,getLine(),
					getColumn(),getFilename()));
	}

	Vector liste_erreur;

	public boolean etatParserOk() {__CLOVER_53_0.cloverRec.M[298]++;
		__CLOVER_53_0.cloverRec.S[1492]++;if ((((liste_erreur==null||liste_erreur.size()==0) && (++__CLOVER_53_0.cloverRec.CT[591]!=0|true)) || (++__CLOVER_53_0.cloverRec.CF[591]==0&false)))
			{__CLOVER_53_0.cloverRec.S[1493]++;return true;
		}else
			{__CLOVER_53_0.cloverRec.S[1494]++;return false;
	}}

	public String getMsgErreur() {__CLOVER_53_0.cloverRec.M[299]++;
		assert((((!etatParserOk())) && (++__CLOVER_53_0.cloverRec.CT[592]!=0|true)) || (++__CLOVER_53_0.cloverRec.CF[592]==0&false));
		__CLOVER_53_0.cloverRec.S[1495]++;return (String)liste_erreur.elementAt(0);
	}

	public int getColumn() {__CLOVER_53_0.cloverRec.M[300]++;
		__CLOVER_53_0.cloverRec.S[1496]++;return lexer.getColumn();
	}

	public int getLine() {__CLOVER_53_0.cloverRec.M[301]++;
		__CLOVER_53_0.cloverRec.S[1497]++;return lexer.getLine();
	}

	public String getFilename() {__CLOVER_53_0.cloverRec.M[302]++;
		__CLOVER_53_0.cloverRec.S[1498]++;return lexer.nom_fichier;
	}

}
