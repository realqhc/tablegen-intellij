/* The following code was generated by JFlex 1.7.0-1 tweaked for IntelliJ platform */

package cn.codetector.tablegenintellij.grammar;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static cn.codetector.tablegenintellij.psi.TableGenTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0-1
 * from the specification file <tt>/home/anakano/CLionProjects/tablegen-intellij/src/main/resources/cn/codetector/tablegenintellij/grammar/_TableGenLexer.flex</tt>
 */
public class _TableGenLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [9, 6, 6]
   * Total runtime size is 1568 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>12]|((ch>>6)&0x3f)]<<6)|(ch&0x3f)];
  }

  /* The ZZ_CMAP_Z table has 272 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\100\1\200\u010d\100");

  /* The ZZ_CMAP_Y table has 192 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\2\175\3\1\4\77\3");

  /* The ZZ_CMAP_A table has 320 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\4\1\2\2\3\1\2\22\0\1\4\1\20\1\11\1\0\1\7\5\0\1\22\4\0\1\21\12\5\7"+
    "\0\1\46\11\6\1\43\17\6\1\14\1\12\1\16\1\0\1\6\1\0\1\33\1\10\1\31\1\23\1\24"+
    "\1\25\1\34\1\40\1\30\2\6\1\26\1\36\1\13\1\32\2\6\1\37\1\41\1\27\1\35\1\42"+
    "\1\45\1\6\1\44\1\6\1\15\1\0\1\17\7\0\1\1\242\0\2\1\26\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\1\1\4\2\1"+
    "\1\5\1\1\12\4\1\6\1\4\1\0\1\7\2\0"+
    "\1\10\1\0\1\11\1\12\10\4\1\13\1\14\5\4"+
    "\1\15\1\7\2\0\1\16\1\17\3\4\1\20\2\4"+
    "\1\21\6\4\1\22\1\23\1\12\1\24\2\4\1\25"+
    "\2\4\1\26\1\27\2\4\1\30\5\4\1\31\2\4"+
    "\1\32\3\4\1\33\1\34\3\4\1\35\1\4\1\36"+
    "\1\37\6\4\1\40\3\4\1\41";

  private static int [] zzUnpackAction() {
    int [] result = new int[111];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\47\0\116\0\165\0\234\0\303\0\352\0\u0111"+
    "\0\u0138\0\u015f\0\u0186\0\u01ad\0\u01d4\0\u01fb\0\u0222\0\u0249"+
    "\0\u0270\0\u0297\0\u02be\0\u02e5\0\u030c\0\u0333\0\u035a\0\u0111"+
    "\0\47\0\u0381\0\u03a8\0\u03cf\0\u015f\0\u03f6\0\u041d\0\u0444"+
    "\0\u046b\0\u0492\0\u04b9\0\u04e0\0\u0507\0\u052e\0\u0555\0\u057c"+
    "\0\234\0\u05a3\0\u05ca\0\u05f1\0\u0618\0\u063f\0\u0666\0\u0111"+
    "\0\u068d\0\u06b4\0\u06db\0\234\0\u0702\0\u0729\0\u0750\0\234"+
    "\0\u0777\0\u079e\0\234\0\u07c5\0\u07ec\0\u0813\0\u083a\0\u0861"+
    "\0\u0888\0\234\0\47\0\47\0\234\0\u08af\0\u08d6\0\234"+
    "\0\u08fd\0\u0924\0\234\0\234\0\u094b\0\u0972\0\234\0\u0999"+
    "\0\u09c0\0\u09e7\0\u0a0e\0\u0a35\0\234\0\u0a5c\0\u0a83\0\234"+
    "\0\u0aaa\0\u0ad1\0\u0af8\0\234\0\234\0\u0b1f\0\u0b46\0\u0b6d"+
    "\0\234\0\u0b94\0\234\0\234\0\u0bbb\0\u0be2\0\u0c09\0\u0c30"+
    "\0\u0c57\0\u0c7e\0\234\0\u0ca5\0\u0ccc\0\u0cf3\0\234";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[111];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\2\2\3\3\1\4\1\5\1\6\1\7\1\10\1\2"+
    "\1\5\1\11\3\2\1\12\1\13\1\2\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\4\5\1\23\2\5"+
    "\1\24\1\5\1\25\3\5\51\0\3\3\47\0\1\4"+
    "\1\5\1\0\1\5\2\0\1\5\7\0\24\5\5\0"+
    "\2\5\1\0\1\5\2\0\1\5\7\0\24\5\6\0"+
    "\1\26\1\0\1\26\2\0\1\26\7\0\24\26\5\0"+
    "\2\5\1\0\1\5\2\0\1\5\7\0\5\5\1\27"+
    "\16\5\2\30\1\0\6\30\1\31\1\32\34\30\15\0"+
    "\1\33\37\0\1\34\1\0\1\34\2\0\1\34\4\0"+
    "\1\35\2\0\24\34\21\0\1\36\1\37\31\0\2\5"+
    "\1\0\1\5\2\0\1\5\7\0\1\5\1\40\6\5"+
    "\1\41\13\5\5\0\2\5\1\0\1\5\2\0\1\5"+
    "\7\0\3\5\1\42\20\5\5\0\2\5\1\0\1\5"+
    "\2\0\1\5\7\0\5\5\1\43\1\5\1\44\14\5"+
    "\5\0\2\5\1\0\1\5\2\0\1\5\7\0\1\5"+
    "\1\45\3\5\1\46\16\5\5\0\2\5\1\0\1\5"+
    "\2\0\1\5\7\0\15\5\1\47\6\5\5\0\2\5"+
    "\1\0\1\5\2\0\1\50\7\0\2\5\1\51\21\5"+
    "\5\0\2\5\1\0\1\5\2\0\1\5\7\0\3\5"+
    "\1\52\3\5\1\53\14\5\5\0\2\5\1\0\1\5"+
    "\2\0\1\5\7\0\12\5\1\54\11\5\5\0\2\5"+
    "\1\0\1\5\2\0\1\5\7\0\4\5\1\55\17\5"+
    "\5\0\2\5\1\0\1\5\2\0\1\5\7\0\1\5"+
    "\1\56\22\5\5\0\2\26\1\0\1\26\2\0\1\26"+
    "\7\0\24\26\5\0\2\5\1\0\1\5\2\0\1\5"+
    "\7\0\4\5\1\57\17\5\2\30\1\0\6\30\1\60"+
    "\1\32\34\30\16\33\1\0\1\61\27\33\5\0\2\34"+
    "\1\0\1\34\2\0\1\34\7\0\24\34\1\36\3\0"+
    "\43\36\22\37\1\62\24\37\5\0\2\5\1\0\1\5"+
    "\2\0\1\5\7\0\2\5\1\63\21\5\5\0\2\5"+
    "\1\0\1\5\2\0\1\5\7\0\11\5\1\64\12\5"+
    "\5\0\2\5\1\0\1\5\2\0\1\5\7\0\16\5"+
    "\1\65\5\5\5\0\2\5\1\0\1\5\2\0\1\5"+
    "\7\0\1\5\1\66\22\5\5\0\2\5\1\0\1\5"+
    "\2\0\1\5\7\0\14\5\1\67\7\5\5\0\2\5"+
    "\1\0\1\5\2\0\1\5\7\0\4\5\1\70\17\5"+
    "\5\0\2\5\1\0\1\5\2\0\1\5\7\0\16\5"+
    "\1\71\5\5\5\0\2\5\1\0\1\5\2\0\1\5"+
    "\7\0\1\5\1\72\22\5\5\0\2\5\1\0\1\5"+
    "\2\0\1\5\7\0\4\5\1\73\1\5\1\74\15\5"+
    "\5\0\2\5\1\0\1\5\2\0\1\5\7\0\10\5"+
    "\1\75\13\5\5\0\2\5\1\0\1\5\2\0\1\5"+
    "\7\0\1\76\23\5\5\0\2\5\1\0\1\5\2\0"+
    "\1\5\7\0\3\5\1\77\20\5\5\0\2\5\1\0"+
    "\1\5\2\0\1\5\7\0\14\5\1\100\7\5\5\0"+
    "\2\5\1\0\1\5\2\0\1\5\7\0\21\5\1\101"+
    "\2\5\5\0\2\5\1\0\1\5\2\0\1\5\7\0"+
    "\16\5\1\102\5\5\16\0\1\103\30\0\21\37\1\104"+
    "\1\62\24\37\5\0\2\5\1\0\1\5\2\0\1\5"+
    "\7\0\13\5\1\105\2\5\1\106\1\107\4\5\5\0"+
    "\2\5\1\0\1\5\2\0\1\5\7\0\1\5\1\110"+
    "\22\5\5\0\2\5\1\0\1\5\2\0\1\5\7\0"+
    "\3\5\1\111\20\5\5\0\2\5\1\0\1\5\2\0"+
    "\1\5\7\0\1\5\1\112\22\5\5\0\2\5\1\0"+
    "\1\5\2\0\1\5\7\0\4\5\1\113\17\5\5\0"+
    "\2\5\1\0\1\5\2\0\1\114\7\0\24\5\5\0"+
    "\2\5\1\0\1\5\2\0\1\5\7\0\3\5\1\115"+
    "\20\5\5\0\2\5\1\0\1\5\2\0\1\5\7\0"+
    "\16\5\1\116\5\5\5\0\2\5\1\0\1\5\2\0"+
    "\1\5\7\0\1\5\1\117\22\5\5\0\2\5\1\0"+
    "\1\5\2\0\1\5\7\0\4\5\1\120\17\5\5\0"+
    "\2\5\1\0\1\5\2\0\1\5\7\0\5\5\1\121"+
    "\16\5\5\0\2\5\1\0\1\5\2\0\1\5\7\0"+
    "\22\5\1\122\1\5\5\0\2\5\1\0\1\5\2\0"+
    "\1\5\7\0\1\5\1\123\22\5\5\0\2\5\1\0"+
    "\1\5\2\0\1\5\7\0\10\5\1\124\13\5\5\0"+
    "\2\5\1\0\1\5\2\0\1\5\7\0\1\125\23\5"+
    "\5\0\2\5\1\0\1\5\2\0\1\5\7\0\10\5"+
    "\1\126\13\5\5\0\2\5\1\0\1\5\2\0\1\5"+
    "\7\0\12\5\1\127\11\5\5\0\2\5\1\0\1\5"+
    "\2\0\1\5\7\0\16\5\1\130\5\5\5\0\2\5"+
    "\1\0\1\5\2\0\1\5\7\0\5\5\1\131\16\5"+
    "\5\0\2\5\1\0\1\5\2\0\1\132\7\0\24\5"+
    "\5\0\2\5\1\0\1\5\2\0\1\5\7\0\7\5"+
    "\1\133\14\5\5\0\2\5\1\0\1\5\2\0\1\5"+
    "\7\0\4\5\1\134\17\5\5\0\2\5\1\0\1\5"+
    "\2\0\1\5\7\0\14\5\1\135\7\5\5\0\2\5"+
    "\1\0\1\5\2\0\1\5\7\0\6\5\1\136\15\5"+
    "\5\0\2\5\1\0\1\5\2\0\1\5\7\0\1\137"+
    "\23\5\5\0\2\5\1\0\1\5\2\0\1\5\7\0"+
    "\6\5\1\140\15\5\5\0\2\5\1\0\1\5\2\0"+
    "\1\5\7\0\11\5\1\141\12\5\5\0\2\5\1\0"+
    "\1\5\2\0\1\5\7\0\14\5\1\142\7\5\5\0"+
    "\2\5\1\0\1\5\2\0\1\5\7\0\15\5\1\143"+
    "\6\5\5\0\2\5\1\0\1\5\2\0\1\5\7\0"+
    "\1\5\1\144\22\5\5\0\2\5\1\0\1\5\2\0"+
    "\1\5\7\0\3\5\1\145\20\5\5\0\2\5\1\0"+
    "\1\5\2\0\1\5\7\0\1\146\23\5\5\0\2\5"+
    "\1\0\1\5\2\0\1\5\7\0\10\5\1\147\13\5"+
    "\5\0\2\5\1\0\1\5\2\0\1\5\7\0\23\5"+
    "\1\150\5\0\2\5\1\0\1\5\2\0\1\5\7\0"+
    "\16\5\1\151\5\5\5\0\2\5\1\0\1\5\2\0"+
    "\1\5\7\0\16\5\1\152\5\5\5\0\2\5\1\0"+
    "\1\5\2\0\1\5\7\0\16\5\1\153\5\5\5\0"+
    "\2\5\1\0\1\5\2\0\1\5\7\0\16\5\1\154"+
    "\5\5\5\0\2\5\1\0\1\5\2\0\1\5\7\0"+
    "\1\5\1\155\22\5\5\0\2\5\1\0\1\5\2\0"+
    "\1\5\7\0\14\5\1\156\7\5\5\0\2\5\1\0"+
    "\1\5\2\0\1\5\7\0\4\5\1\157\17\5";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3354];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\25\1\1\0\1\11\2\0\1\1\1\0"+
    "\23\1\2\0\20\1\2\11\53\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[111];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  public _TableGenLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _TableGenLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return BAD_CHARACTER;
            } 
            // fall through
          case 34: break;
          case 2: 
            { return WHITE_SPACE;
            } 
            // fall through
          case 35: break;
          case 3: 
            { return DEC_INT;
            } 
            // fall through
          case 36: break;
          case 4: 
            { return IDENTIFIER;
            } 
            // fall through
          case 37: break;
          case 5: 
            { return BANG_OPR;
            } 
            // fall through
          case 38: break;
          case 6: 
            { return VARNAME;
            } 
            // fall through
          case 39: break;
          case 7: 
            { return STRING;
            } 
            // fall through
          case 40: break;
          case 8: 
            { return CONDITION;
            } 
            // fall through
          case 41: break;
          case 9: 
            { return LINE_COMMENT;
            } 
            // fall through
          case 42: break;
          case 10: 
            { return BLOCK_COMMENT;
            } 
            // fall through
          case 43: break;
          case 11: 
            { return KEYWORDIN;
            } 
            // fall through
          case 44: break;
          case 12: 
            { return KEYWORDIF;
            } 
            // fall through
          case 45: break;
          case 13: 
            { return KEYWORDBIT;
            } 
            // fall through
          case 46: break;
          case 14: 
            { return KEYWORDDEF;
            } 
            // fall through
          case 47: break;
          case 15: 
            { return KEYWORDDAG;
            } 
            // fall through
          case 48: break;
          case 16: 
            { return KEYWORDLET;
            } 
            // fall through
          case 49: break;
          case 17: 
            { return KEYWORDINT;
            } 
            // fall through
          case 50: break;
          case 18: 
            { return KEYWORDBITS;
            } 
            // fall through
          case 51: break;
          case 19: 
            { return CODE_FRAGMENT;
            } 
            // fall through
          case 52: break;
          case 20: 
            { return KEYWORDDEFM;
            } 
            // fall through
          case 53: break;
          case 21: 
            { return KEYWORDELSE;
            } 
            // fall through
          case 54: break;
          case 22: 
            { return KEYWORDLIST;
            } 
            // fall through
          case 55: break;
          case 23: 
            { return KEYWORDTHEN;
            } 
            // fall through
          case 56: break;
          case 24: 
            { return KEYWORDCODE;
            } 
            // fall through
          case 57: break;
          case 25: 
            { return KEYWORDFIELD;
            } 
            // fall through
          case 58: break;
          case 26: 
            { return KEYWORDCLASS;
            } 
            // fall through
          case 59: break;
          case 27: 
            { return KEYWORDDEFSET;
            } 
            // fall through
          case 60: break;
          case 28: 
            { return KEYWORDDEFVAR;
            } 
            // fall through
          case 61: break;
          case 29: 
            { return KEYWORDSTRING;
            } 
            // fall through
          case 62: break;
          case 30: 
            { return KEYWORDFOREACH;
            } 
            // fall through
          case 63: break;
          case 31: 
            { return KEYWORDINCLUDE;
            } 
            // fall through
          case 64: break;
          case 32: 
            { return KEYWORDMULTICLASS;
            } 
            // fall through
          case 65: break;
          case 33: 
            { return KEYWORDASSERT;
            } 
            // fall through
          case 66: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
