/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ */package tinyeiffel.eiffelviewer;
//package org.eclipse.swt.examples.javaviewer;


import org.eclipse.swt.*;
import org.eclipse.swt.custom.*;
import org.eclipse.swt.graphics.*;
import org.eclipse.swt.widgets.*;
import java.util.*;
import java.io.*;

class JavaLineStyler implements LineStyleListener {static class __CLOVER_85_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}
	JavaScanner scanner = new JavaScanner();
	int[] tokenColors;
	Color[] colors;
	Vector blockComments = new Vector();

	public static final int EOF= -1;
	public static final int EOL= 10;

	public static final int WORD=		0;
	public static final int WHITE=		1;
	public static final int KEY=			2;
	public static final int COMMENT=		3;	
	public static final int STRING=		5;
	public static final int OTHER=		6;
	public static final int NUMBER=		7;

	public static final int MAXIMUM_TOKEN= 8;

public JavaLineStyler() {__CLOVER_85_0.cloverRec.M[781]++;
	__CLOVER_85_0.cloverRec.S[14218]++;initializeColors();
	__CLOVER_85_0.cloverRec.S[14219]++;scanner = new JavaScanner();
}

Color getColor(int type) {__CLOVER_85_0.cloverRec.M[782]++;
	__CLOVER_85_0.cloverRec.S[14220]++;if ((((type < 0 || type >= tokenColors.length) && (++__CLOVER_85_0.cloverRec.CT[3141]!=0|true)) || (++__CLOVER_85_0.cloverRec.CF[3141]==0&false))) {{
		__CLOVER_85_0.cloverRec.S[14221]++;return null;
	}
	/*switch(type)
	{
		case COMMENT:
			return new Color(display, new RGB(51,204,51);
			break;
	}*/
	}__CLOVER_85_0.cloverRec.S[14222]++;return colors[tokenColors[type]];
}

boolean inBlockComment(int start, int end) {__CLOVER_85_0.cloverRec.M[783]++;
	__CLOVER_85_0.cloverRec.S[14223]++;for (int i=0; (((i<blockComments.size()) && (++__CLOVER_85_0.cloverRec.CT[3142]!=0|true)) || (++__CLOVER_85_0.cloverRec.CF[3142]==0&false)); i++) {{
		__CLOVER_85_0.cloverRec.S[14224]++;int[] offsets = (int[])blockComments.elementAt(i);
		// start of comment in the line
		__CLOVER_85_0.cloverRec.S[14225]++;if (((((offsets[0] >= start) && (offsets[0] <= end)) && (++__CLOVER_85_0.cloverRec.CT[3143]!=0|true)) || (++__CLOVER_85_0.cloverRec.CF[3143]==0&false))) {__CLOVER_85_0.cloverRec.S[14226]++;return true;
		// end of comment in the line
		}__CLOVER_85_0.cloverRec.S[14227]++;if (((((offsets[1] >= start) && (offsets[1] <= end)) && (++__CLOVER_85_0.cloverRec.CT[3144]!=0|true)) || (++__CLOVER_85_0.cloverRec.CF[3144]==0&false))) {__CLOVER_85_0.cloverRec.S[14228]++;return true;
		}__CLOVER_85_0.cloverRec.S[14229]++;if (((((offsets[0] <= start) && (offsets[1] >= end)) && (++__CLOVER_85_0.cloverRec.CT[3145]!=0|true)) || (++__CLOVER_85_0.cloverRec.CF[3145]==0&false))) {__CLOVER_85_0.cloverRec.S[14230]++;return true;
	}}
	}__CLOVER_85_0.cloverRec.S[14231]++;return false;
}

void initializeColors() {__CLOVER_85_0.cloverRec.M[784]++;
	__CLOVER_85_0.cloverRec.S[14232]++;Display display = Display.getDefault();
	__CLOVER_85_0.cloverRec.S[14233]++;colors= new Color[] {
		new Color(display, new RGB(0, 0, 0)),		// black
		new Color(display, new RGB(255, 0, 0)),	// red
		new Color(display, new RGB(0, 255, 0)),	// green
		new Color(display, new RGB(0,   0, 255)),	// blue
		new Color(display, new RGB(0,128,0)),
		new Color(display, new RGB(255,0,255))
	};
	__CLOVER_85_0.cloverRec.S[14234]++;tokenColors= new int[MAXIMUM_TOKEN];
	__CLOVER_85_0.cloverRec.S[14235]++;tokenColors[WORD]=		0;
	__CLOVER_85_0.cloverRec.S[14236]++;tokenColors[WHITE]=		0;
	__CLOVER_85_0.cloverRec.S[14237]++;tokenColors[KEY]=		3; 
	__CLOVER_85_0.cloverRec.S[14238]++;tokenColors[COMMENT]=	4; 
	__CLOVER_85_0.cloverRec.S[14239]++;tokenColors[STRING]= 	5; 
	__CLOVER_85_0.cloverRec.S[14240]++;tokenColors[OTHER]=		0;
	__CLOVER_85_0.cloverRec.S[14241]++;tokenColors[NUMBER]=	0;
}

void disposeColors() {__CLOVER_85_0.cloverRec.M[785]++;
	__CLOVER_85_0.cloverRec.S[14242]++;for (int i=0;(((i<colors.length) && (++__CLOVER_85_0.cloverRec.CT[3146]!=0|true)) || (++__CLOVER_85_0.cloverRec.CF[3146]==0&false));i++) {{
		__CLOVER_85_0.cloverRec.S[14243]++;colors[i].dispose();
	}
}}

/**
 * Event.detail			line start offset (input)	
 * Event.text 			line text (input)
 * LineStyleEvent.styles 	Enumeration of StyleRanges, need to be in order. (output)
 * LineStyleEvent.background 	line background color (output)
 */
public void lineGetStyle(LineStyleEvent event) {__CLOVER_85_0.cloverRec.M[786]++;
	__CLOVER_85_0.cloverRec.S[14244]++;Vector styles = new Vector();
	__CLOVER_85_0.cloverRec.S[14245]++;int token;
	__CLOVER_85_0.cloverRec.S[14246]++;StyleRange lastStyle;
	// If the line is part of a block comment, create one style for the entire line.
	__CLOVER_85_0.cloverRec.S[14247]++;if ((((inBlockComment(event.lineOffset, event.lineOffset + event.lineText.length())) && (++__CLOVER_85_0.cloverRec.CT[3147]!=0|true)) || (++__CLOVER_85_0.cloverRec.CF[3147]==0&false))) {{
		__CLOVER_85_0.cloverRec.S[14248]++;styles.addElement(new StyleRange(event.lineOffset, event.lineText.length(), getColor(COMMENT), null));
		__CLOVER_85_0.cloverRec.S[14249]++;event.styles = new StyleRange[styles.size()];
		__CLOVER_85_0.cloverRec.S[14250]++;styles.copyInto(event.styles);
		__CLOVER_85_0.cloverRec.S[14251]++;return;
	}
	}__CLOVER_85_0.cloverRec.S[14252]++;Color defaultFgColor = ((Control)event.widget).getForeground();
	__CLOVER_85_0.cloverRec.S[14253]++;scanner.setRange(event.lineText);
	__CLOVER_85_0.cloverRec.S[14254]++;token = scanner.nextToken();
	__CLOVER_85_0.cloverRec.S[14255]++;while ((((token != EOF) && (++__CLOVER_85_0.cloverRec.CT[3148]!=0|true)) || (++__CLOVER_85_0.cloverRec.CF[3148]==0&false))) {{
		__CLOVER_85_0.cloverRec.S[14256]++;if ((((token == OTHER) && (++__CLOVER_85_0.cloverRec.CT[3149]!=0|true)) || (++__CLOVER_85_0.cloverRec.CF[3149]==0&false))) {{
			// do nothing for non-colored tokens
		} }else {__CLOVER_85_0.cloverRec.S[14257]++;if ((((token != WHITE) && (++__CLOVER_85_0.cloverRec.CT[3150]!=0|true)) || (++__CLOVER_85_0.cloverRec.CF[3150]==0&false))) {{
			__CLOVER_85_0.cloverRec.S[14258]++;Color color = getColor(token);
			// Only create a style if the token color is different than the 
			// widget's default foreground color and the token's style is not 
			// bold.  Keywords are bolded.
			__CLOVER_85_0.cloverRec.S[14259]++;if (((((!color.equals(defaultFgColor)) || (token == KEY)) && (++__CLOVER_85_0.cloverRec.CT[3151]!=0|true)) || (++__CLOVER_85_0.cloverRec.CF[3151]==0&false))) {{
				__CLOVER_85_0.cloverRec.S[14260]++;StyleRange style = new StyleRange(scanner.getStartOffset() + event.lineOffset, scanner.getLength(), color, null);
				__CLOVER_85_0.cloverRec.S[14261]++;if ((((token == KEY) && (++__CLOVER_85_0.cloverRec.CT[3152]!=0|true)) || (++__CLOVER_85_0.cloverRec.CF[3152]==0&false))) {{
					__CLOVER_85_0.cloverRec.S[14262]++;style.fontStyle = SWT.BOLD;
				}
				}__CLOVER_85_0.cloverRec.S[14263]++;if ((((styles.isEmpty()) && (++__CLOVER_85_0.cloverRec.CT[3153]!=0|true)) || (++__CLOVER_85_0.cloverRec.CF[3153]==0&false))) {{
					__CLOVER_85_0.cloverRec.S[14264]++;styles.addElement(style);
				} }else {{
					// Merge similar styles.  Doing so will improve performance.
					__CLOVER_85_0.cloverRec.S[14265]++;lastStyle = (StyleRange)styles.lastElement();
					__CLOVER_85_0.cloverRec.S[14266]++;if ((((lastStyle.similarTo(style) && (lastStyle.start + lastStyle.length == style.start)) && (++__CLOVER_85_0.cloverRec.CT[3154]!=0|true)) || (++__CLOVER_85_0.cloverRec.CF[3154]==0&false))) {{
						__CLOVER_85_0.cloverRec.S[14267]++;lastStyle.length += style.length;
					} }else {{
						__CLOVER_85_0.cloverRec.S[14268]++;styles.addElement(style); 
					}
				}} 
			}} 
		}} }else {__CLOVER_85_0.cloverRec.S[14269]++;if (((((!styles.isEmpty()) && ((lastStyle=(StyleRange)styles.lastElement()).fontStyle == SWT.BOLD))))) {{
			__CLOVER_85_0.cloverRec.S[14270]++;int start = scanner.getStartOffset() + event.lineOffset;
			__CLOVER_85_0.cloverRec.S[14271]++;lastStyle = (StyleRange)styles.lastElement();
			// A font style of SWT.BOLD implies that the last style
			// represents a java keyword.
			__CLOVER_85_0.cloverRec.S[14272]++;if ((((lastStyle.start + lastStyle.length == start) && (++__CLOVER_85_0.cloverRec.CT[3156]!=0|true)) || (++__CLOVER_85_0.cloverRec.CF[3156]==0&false))) {{
				// Have the white space take on the style before it to 
				// minimize the number of style ranges created and the
				// number of font style changes during rendering.
				__CLOVER_85_0.cloverRec.S[14273]++;lastStyle.length += scanner.getLength();
			}
		}} 
		}}}__CLOVER_85_0.cloverRec.S[14274]++;token= scanner.nextToken();
	}
	}__CLOVER_85_0.cloverRec.S[14275]++;event.styles = new StyleRange[styles.size()];
	__CLOVER_85_0.cloverRec.S[14276]++;styles.copyInto(event.styles);
}
public void parseBlockComments(String text) {__CLOVER_85_0.cloverRec.M[787]++;
	__CLOVER_85_0.cloverRec.S[14277]++;blockComments = new Vector();
	__CLOVER_85_0.cloverRec.S[14278]++;StringReader buffer = new StringReader(text);
	__CLOVER_85_0.cloverRec.S[14279]++;int ch;
	__CLOVER_85_0.cloverRec.S[14280]++;boolean blkComment = false;
	__CLOVER_85_0.cloverRec.S[14281]++;int cnt = 0;
	__CLOVER_85_0.cloverRec.S[14282]++;int[] offsets = new int[2];
	__CLOVER_85_0.cloverRec.S[14283]++;boolean done = false;
	
	__CLOVER_85_0.cloverRec.S[14284]++;try {
	__CLOVER_85_0.cloverRec.S[14285]++;while ((((!done) && (++__CLOVER_85_0.cloverRec.CT[3157]!=0|true)) || (++__CLOVER_85_0.cloverRec.CF[3157]==0&false))) {{
		__CLOVER_85_0.cloverRec.S[14286]++;boolean __CLOVER_bool0=false;switch (ch = buffer.read()) {
			case -1 :if (!__CLOVER_bool0) {__CLOVER_85_0.cloverRec.S[14287]++;__CLOVER_bool0=true;} {
				__CLOVER_85_0.cloverRec.S[14288]++;if ((((blkComment) && (++__CLOVER_85_0.cloverRec.CT[3158]!=0|true)) || (++__CLOVER_85_0.cloverRec.CF[3158]==0&false))) {{
					__CLOVER_85_0.cloverRec.S[14289]++;offsets[1] = cnt;
					__CLOVER_85_0.cloverRec.S[14290]++;blockComments.addElement(offsets);
				}
				}__CLOVER_85_0.cloverRec.S[14291]++;done = true;
				__CLOVER_85_0.cloverRec.S[14292]++;break;
			}
			case '/' :if (!__CLOVER_bool0) {__CLOVER_85_0.cloverRec.S[14293]++;__CLOVER_bool0=true;} {
				__CLOVER_85_0.cloverRec.S[14294]++;ch = buffer.read();
				__CLOVER_85_0.cloverRec.S[14295]++;if (((((ch == '*') && (!blkComment)) && (++__CLOVER_85_0.cloverRec.CT[3159]!=0|true)) || (++__CLOVER_85_0.cloverRec.CF[3159]==0&false))) {{
					__CLOVER_85_0.cloverRec.S[14296]++;offsets = new int[2];
					__CLOVER_85_0.cloverRec.S[14297]++;offsets[0] = cnt;
					__CLOVER_85_0.cloverRec.S[14298]++;blkComment = true;
					__CLOVER_85_0.cloverRec.S[14299]++;cnt++;	
				} }else {{
					__CLOVER_85_0.cloverRec.S[14300]++;cnt++;
				}						
				}__CLOVER_85_0.cloverRec.S[14301]++;cnt++;
				__CLOVER_85_0.cloverRec.S[14302]++;break;
			}
			case '*' :if (!__CLOVER_bool0) {__CLOVER_85_0.cloverRec.S[14303]++;__CLOVER_bool0=true;} {
				__CLOVER_85_0.cloverRec.S[14304]++;if ((((blkComment) && (++__CLOVER_85_0.cloverRec.CT[3160]!=0|true)) || (++__CLOVER_85_0.cloverRec.CF[3160]==0&false))) {{
					__CLOVER_85_0.cloverRec.S[14305]++;ch = buffer.read();
					__CLOVER_85_0.cloverRec.S[14306]++;cnt++;
					__CLOVER_85_0.cloverRec.S[14307]++;if ((((ch == '/') && (++__CLOVER_85_0.cloverRec.CT[3161]!=0|true)) || (++__CLOVER_85_0.cloverRec.CF[3161]==0&false))) {{
						__CLOVER_85_0.cloverRec.S[14308]++;blkComment = false;	
						__CLOVER_85_0.cloverRec.S[14309]++;offsets[1] = cnt;
						__CLOVER_85_0.cloverRec.S[14310]++;blockComments.addElement(offsets);
					}
				}}
				}__CLOVER_85_0.cloverRec.S[14311]++;cnt++;	
				__CLOVER_85_0.cloverRec.S[14312]++;break;
			}
			default :if (!__CLOVER_bool0) {__CLOVER_85_0.cloverRec.S[14313]++;__CLOVER_bool0=true;} {
				__CLOVER_85_0.cloverRec.S[14314]++;cnt++;				
				__CLOVER_85_0.cloverRec.S[14315]++;break;
			}
		}
	}		
	}} catch(IOException e) {
		// ignore errors
	}
}

/**
 * A simple fuzzy scanner for Java
 */
public class JavaScanner {

	protected Hashtable fgKeys= null;
	protected StringBuffer fBuffer= new StringBuffer();
	protected String fDoc;
	protected int fPos;
	protected int fEnd;
	protected int fStartToken;
	protected boolean fEofSeen= false;

	private String[] fgKeywords= { 
		/*"abstract",
		"boolean", "break", "byte",
		"case", "catch", "char", "class", "continue",
		"default", "do", "double",
		"else", "extends",
		"false", "final", "finally", "float", "for",
		"if", "implements", "import", "instanceof", "int", "interface",
		"long",
		"native", "new", "null",
		"package", "private", "protected", "public",
		"return",
		"short", "static", "super", "switch", "synchronized",
		"this", "throw", "throws", "transient", "true", "try",
		"void", "volatile",
		"while"*/
		"alias", "all",
          "and", "as", "check", "class", "creation", "debug", "deferred", "do", "else",
          "elseif", "end", "ensure", "expanded", "export", "external", "feature", "from",
          "frozen", "if", "implies", "indexing", "infix", "inherit", "inspect",
          "invariant", "is", "like", "local", "loop", "not", "obsolete", "old", "once", "or",
          "prefix", "redefine", "rename", "require", "rescue", "retry", "select",
          "separate", "then", "undefine", "until", "variant", "when", "xor"
	};

	public JavaScanner() {__CLOVER_85_0.cloverRec.M[788]++;
		__CLOVER_85_0.cloverRec.S[14316]++;initialize();
	}

	/**
	 * Returns the ending location of the current token in the document.
	 */
	public final int getLength() {__CLOVER_85_0.cloverRec.M[789]++;
		__CLOVER_85_0.cloverRec.S[14317]++;return fPos - fStartToken;
	}

	/**
	 * Initialize the lookup table.
	 */
	void initialize() {__CLOVER_85_0.cloverRec.M[790]++;
		__CLOVER_85_0.cloverRec.S[14318]++;fgKeys= new Hashtable();
		__CLOVER_85_0.cloverRec.S[14319]++;Integer k= new Integer(KEY);
		__CLOVER_85_0.cloverRec.S[14320]++;for (int i= 0; (((i < fgKeywords.length) && (++__CLOVER_85_0.cloverRec.CT[3162]!=0|true)) || (++__CLOVER_85_0.cloverRec.CF[3162]==0&false)); i++)
			{__CLOVER_85_0.cloverRec.S[14321]++;fgKeys.put(fgKeywords[i], k);
	}}

	/**
	 * Returns the starting location of the current token in the document.
	 */
	public final int getStartOffset() {__CLOVER_85_0.cloverRec.M[791]++;
		__CLOVER_85_0.cloverRec.S[14322]++;return fStartToken;
	}

	/**
	 * Returns the next lexical token in the document.
	 */
	public int nextToken() {__CLOVER_85_0.cloverRec.M[792]++;
		__CLOVER_85_0.cloverRec.S[14323]++;int c;
		__CLOVER_85_0.cloverRec.S[14324]++;fStartToken= fPos;
		__CLOVER_85_0.cloverRec.S[14325]++;while (true) {{
			__CLOVER_85_0.cloverRec.S[14326]++;boolean __CLOVER_bool1=false;switch (c= read()) {			
			case EOF:if (!__CLOVER_bool1) {__CLOVER_85_0.cloverRec.S[14327]++;__CLOVER_bool1=true;}
				__CLOVER_85_0.cloverRec.S[14328]++;return EOF;				
			case '-':if (!__CLOVER_bool1) {__CLOVER_85_0.cloverRec.S[14329]++;__CLOVER_bool1=true;}	// comment
				__CLOVER_85_0.cloverRec.S[14330]++;c= read();
				__CLOVER_85_0.cloverRec.S[14331]++;if ((((c == '-') && (++__CLOVER_85_0.cloverRec.CT[3163]!=0|true)) || (++__CLOVER_85_0.cloverRec.CF[3163]==0&false))) {{
					__CLOVER_85_0.cloverRec.S[14332]++;while (true) {{
						__CLOVER_85_0.cloverRec.S[14333]++;c= read();
						__CLOVER_85_0.cloverRec.S[14334]++;if (((((c == EOF) || (c == EOL)) && (++__CLOVER_85_0.cloverRec.CT[3164]!=0|true)) || (++__CLOVER_85_0.cloverRec.CF[3164]==0&false))) {{
							__CLOVER_85_0.cloverRec.S[14335]++;unread(c);
							__CLOVER_85_0.cloverRec.S[14336]++;return COMMENT;
						}
					}}
				}} }else {{
					__CLOVER_85_0.cloverRec.S[14337]++;unread(c);
				}
				}__CLOVER_85_0.cloverRec.S[14338]++;return OTHER;
			case '\'':if (!__CLOVER_bool1) {__CLOVER_85_0.cloverRec.S[14339]++;__CLOVER_bool1=true;}	// char const
				__CLOVER_85_0.cloverRec.S[14340]++;character: for(;;) {{
					__CLOVER_85_0.cloverRec.S[14341]++;c= read();
					__CLOVER_85_0.cloverRec.S[14342]++;boolean __CLOVER_bool2=false;switch (c) {
						case '\'':if (!__CLOVER_bool2) {__CLOVER_85_0.cloverRec.S[14343]++;__CLOVER_bool2=true;}
							__CLOVER_85_0.cloverRec.S[14344]++;return STRING;
						case EOF:if (!__CLOVER_bool2) {__CLOVER_85_0.cloverRec.S[14345]++;__CLOVER_bool2=true;}
							__CLOVER_85_0.cloverRec.S[14346]++;unread(c);
							__CLOVER_85_0.cloverRec.S[14347]++;return STRING;
						case '\\':if (!__CLOVER_bool2) {__CLOVER_85_0.cloverRec.S[14348]++;__CLOVER_bool2=true;}
							__CLOVER_85_0.cloverRec.S[14349]++;c= read();
							__CLOVER_85_0.cloverRec.S[14350]++;break;
						}
				}

			}case '"':if (!__CLOVER_bool1) {__CLOVER_85_0.cloverRec.S[14351]++;__CLOVER_bool1=true;}	// string
				__CLOVER_85_0.cloverRec.S[14352]++;string: for (;;) {{
					__CLOVER_85_0.cloverRec.S[14353]++;c= read();
					__CLOVER_85_0.cloverRec.S[14354]++;boolean __CLOVER_bool3=false;switch (c) {
						case '"':if (!__CLOVER_bool3) {__CLOVER_85_0.cloverRec.S[14355]++;__CLOVER_bool3=true;}
							__CLOVER_85_0.cloverRec.S[14356]++;return STRING;
						case EOF:if (!__CLOVER_bool3) {__CLOVER_85_0.cloverRec.S[14357]++;__CLOVER_bool3=true;}
							__CLOVER_85_0.cloverRec.S[14358]++;unread(c);
							__CLOVER_85_0.cloverRec.S[14359]++;return STRING;
						case '\\':if (!__CLOVER_bool3) {__CLOVER_85_0.cloverRec.S[14360]++;__CLOVER_bool3=true;}
							__CLOVER_85_0.cloverRec.S[14361]++;c= read();
							__CLOVER_85_0.cloverRec.S[14362]++;break;
						}
				}

			}case '0':if (!__CLOVER_bool1) {__CLOVER_85_0.cloverRec.S[14363]++;__CLOVER_bool1=true;} case '1':if (!__CLOVER_bool1) {__CLOVER_85_0.cloverRec.S[14364]++;__CLOVER_bool1=true;} case '2':if (!__CLOVER_bool1) {__CLOVER_85_0.cloverRec.S[14365]++;__CLOVER_bool1=true;} case '3':if (!__CLOVER_bool1) {__CLOVER_85_0.cloverRec.S[14366]++;__CLOVER_bool1=true;} case '4':if (!__CLOVER_bool1) {__CLOVER_85_0.cloverRec.S[14367]++;__CLOVER_bool1=true;}
			case '5':if (!__CLOVER_bool1) {__CLOVER_85_0.cloverRec.S[14368]++;__CLOVER_bool1=true;} case '6':if (!__CLOVER_bool1) {__CLOVER_85_0.cloverRec.S[14369]++;__CLOVER_bool1=true;} case '7':if (!__CLOVER_bool1) {__CLOVER_85_0.cloverRec.S[14370]++;__CLOVER_bool1=true;} case '8':if (!__CLOVER_bool1) {__CLOVER_85_0.cloverRec.S[14371]++;__CLOVER_bool1=true;} case '9':if (!__CLOVER_bool1) {__CLOVER_85_0.cloverRec.S[14372]++;__CLOVER_bool1=true;}
				__CLOVER_85_0.cloverRec.S[14373]++;do {{
					__CLOVER_85_0.cloverRec.S[14374]++;c= read();
				} }while((((Character.isDigit((char)c)) && (++__CLOVER_85_0.cloverRec.CT[3165]!=0|true)) || (++__CLOVER_85_0.cloverRec.CF[3165]==0&false)));
				__CLOVER_85_0.cloverRec.S[14375]++;unread(c);
				__CLOVER_85_0.cloverRec.S[14376]++;return NUMBER;
			default:if (!__CLOVER_bool1) {__CLOVER_85_0.cloverRec.S[14377]++;__CLOVER_bool1=true;}
				__CLOVER_85_0.cloverRec.S[14378]++;if ((((Character.isWhitespace((char)c)) && (++__CLOVER_85_0.cloverRec.CT[3166]!=0|true)) || (++__CLOVER_85_0.cloverRec.CF[3166]==0&false))) {{
					__CLOVER_85_0.cloverRec.S[14379]++;do {{
						__CLOVER_85_0.cloverRec.S[14380]++;c= read();
					} }while((((Character.isWhitespace((char)c)) && (++__CLOVER_85_0.cloverRec.CT[3167]!=0|true)) || (++__CLOVER_85_0.cloverRec.CF[3167]==0&false)));
					__CLOVER_85_0.cloverRec.S[14381]++;unread(c);
					__CLOVER_85_0.cloverRec.S[14382]++;return WHITE;
				}
				}__CLOVER_85_0.cloverRec.S[14383]++;if ((((Character.isJavaIdentifierStart((char)c)) && (++__CLOVER_85_0.cloverRec.CT[3168]!=0|true)) || (++__CLOVER_85_0.cloverRec.CF[3168]==0&false))) {{
					__CLOVER_85_0.cloverRec.S[14384]++;fBuffer.setLength(0);
					__CLOVER_85_0.cloverRec.S[14385]++;do {{
						__CLOVER_85_0.cloverRec.S[14386]++;fBuffer.append((char)c);
						__CLOVER_85_0.cloverRec.S[14387]++;c= read();
					} }while((((Character.isJavaIdentifierPart((char)c)) && (++__CLOVER_85_0.cloverRec.CT[3169]!=0|true)) || (++__CLOVER_85_0.cloverRec.CF[3169]==0&false)));
					__CLOVER_85_0.cloverRec.S[14388]++;unread(c);
					__CLOVER_85_0.cloverRec.S[14389]++;Integer i= (Integer) fgKeys.get(fBuffer.toString());
					__CLOVER_85_0.cloverRec.S[14390]++;if ((((i != null) && (++__CLOVER_85_0.cloverRec.CT[3170]!=0|true)) || (++__CLOVER_85_0.cloverRec.CF[3170]==0&false)))
						{__CLOVER_85_0.cloverRec.S[14391]++;return i.intValue();
						}__CLOVER_85_0.cloverRec.S[14392]++;return WORD;
				}
				}__CLOVER_85_0.cloverRec.S[14393]++;return OTHER;
			}
		}
	}}

	/**
	 * Returns next character.
	 */
	protected int read() {__CLOVER_85_0.cloverRec.M[793]++;
		__CLOVER_85_0.cloverRec.S[14394]++;if ((((fPos <= fEnd) && (++__CLOVER_85_0.cloverRec.CT[3171]!=0|true)) || (++__CLOVER_85_0.cloverRec.CF[3171]==0&false))) {{
			__CLOVER_85_0.cloverRec.S[14395]++;return fDoc.charAt(fPos++);
		}
		}__CLOVER_85_0.cloverRec.S[14396]++;return EOF;
	}

	public void setRange(String text) {__CLOVER_85_0.cloverRec.M[794]++;
		__CLOVER_85_0.cloverRec.S[14397]++;fDoc= text;
		__CLOVER_85_0.cloverRec.S[14398]++;fPos= 0;
		__CLOVER_85_0.cloverRec.S[14399]++;fEnd= fDoc.length() -1;
	}

	protected void unread(int c) {__CLOVER_85_0.cloverRec.M[795]++;
		__CLOVER_85_0.cloverRec.S[14400]++;if ((((c != EOF) && (++__CLOVER_85_0.cloverRec.CT[3172]!=0|true)) || (++__CLOVER_85_0.cloverRec.CF[3172]==0&false)))
	    	{__CLOVER_85_0.cloverRec.S[14401]++;fPos--;
	}}
}





}
