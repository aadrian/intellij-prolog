/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package tech.phosphorus.intellij.prolog;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static tech.phosphorus.intellij.prolog.psi.PrologTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>prologLexer.flex</tt>
 */
public class PrologLexer implements FlexLexer {

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
   * Chosen bits are [12, 6, 3]
   * Total runtime size is 16576 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[(ZZ_CMAP_Z[ch>>9]<<6)|((ch>>3)&0x3f)]<<3)|(ch&0x7)];
  }

  /* The ZZ_CMAP_Z table has 2176 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1"+
    "\20\1\21\1\22\3\21\1\23\1\24\1\25\1\21\14\26\1\27\50\26\1\30\2\26\1\31\1\32"+
    "\1\33\1\34\25\26\1\35\20\21\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1"+
    "\47\1\50\1\21\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\21\1\26\1\60\1\61\5\21"+
    "\2\26\1\62\7\21\1\26\1\63\20\21\1\26\1\64\1\21\1\65\13\26\1\66\1\26\1\67\22"+
    "\21\1\70\5\21\1\71\13\21\1\72\1\73\10\21\1\74\2\21\1\75\1\76\7\21\123\26\1"+
    "\77\7\26\1\100\1\101\12\26\1\102\24\21\1\26\1\103\u0702\21");

  /* The ZZ_CMAP_Y table has 4352 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\2\0\1\2\1\3\1\4\1\5\1\6\2\7\1\10\1\11\2\12\1\13\1\14\3\0\1\15\1\16"+
    "\1\17\1\16\2\7\1\20\1\21\2\12\1\22\1\12\7\23\2\24\1\25\5\23\1\26\1\27\1\30"+
    "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\24\1\41\2\23\1\42\7\23\1\43\1\44"+
    "\1\45\1\23\10\12\1\46\4\12\1\47\1\50\1\51\1\52\1\0\1\53\1\54\12\0\1\55\5\0"+
    "\1\56\1\57\1\60\1\61\1\62\1\7\1\63\1\64\3\12\1\65\1\66\3\23\1\67\1\70\6\7"+
    "\6\12\4\23\1\71\1\72\6\23\1\73\1\74\14\23\1\6\3\7\1\20\1\75\1\11\4\12\11\0"+
    "\3\51\2\76\5\0\5\51\1\76\2\0\1\51\1\77\1\100\13\51\1\101\1\0\1\102\1\103\1"+
    "\51\1\104\2\0\1\105\3\51\3\0\1\106\12\51\1\107\1\0\1\75\1\0\5\51\1\76\1\110"+
    "\1\111\2\51\1\107\1\111\1\112\1\113\2\0\3\51\1\113\10\0\2\51\1\114\1\107\10"+
    "\0\1\115\6\51\1\116\2\0\1\113\1\51\1\77\1\51\1\100\1\51\1\117\1\104\1\120"+
    "\2\51\1\105\1\121\1\116\1\0\1\122\1\0\1\123\1\77\1\51\1\52\1\0\1\106\1\124"+
    "\1\120\2\51\1\105\1\125\1\52\3\0\1\126\1\103\1\51\1\127\1\0\1\106\1\130\1"+
    "\131\2\51\1\105\1\132\1\116\2\0\1\113\1\0\1\77\1\51\1\0\1\75\1\106\1\104\1"+
    "\120\2\51\1\105\1\132\1\116\3\0\1\123\1\77\1\51\1\75\1\0\1\133\1\134\1\135"+
    "\1\136\1\137\1\134\1\51\1\52\2\0\1\113\1\0\1\103\1\51\2\0\1\106\1\114\1\105"+
    "\2\51\1\105\1\51\1\116\3\0\1\76\1\77\1\51\2\0\1\117\1\114\1\105\2\51\1\105"+
    "\1\140\1\116\3\0\1\122\1\77\1\51\1\141\1\0\1\106\1\114\1\105\4\51\1\142\1"+
    "\0\1\122\1\143\1\144\1\77\1\51\1\0\1\145\1\106\1\51\1\146\1\145\2\51\1\131"+
    "\1\101\1\146\3\0\1\103\1\51\2\0\1\100\5\51\1\147\1\0\1\146\1\0\1\51\1\52\4"+
    "\0\1\150\1\151\1\115\1\100\1\152\1\153\1\147\1\154\1\155\1\0\1\51\1\156\4"+
    "\0\1\113\3\0\1\51\1\52\2\0\1\51\1\100\3\51\1\157\3\0\1\157\16\0\5\51\1\76"+
    "\1\0\1\144\1\51\1\52\1\107\1\160\1\161\1\103\1\117\1\51\1\52\1\122\1\51\1"+
    "\52\4\7\1\162\1\163\5\51\1\164\51\51\1\135\1\146\1\135\5\51\1\135\4\51\1\135"+
    "\1\146\1\135\1\51\1\146\7\51\1\135\10\51\1\76\4\0\2\51\2\0\12\7\1\165\1\166"+
    "\1\100\114\51\1\104\2\51\1\167\2\51\1\76\11\51\1\76\1\100\1\113\1\51\1\114"+
    "\1\52\1\0\2\51\1\52\1\0\2\51\1\52\1\0\1\51\1\114\1\113\1\0\6\51\1\170\3\0"+
    "\1\144\1\112\1\51\1\52\4\0\1\51\1\52\13\51\1\0\1\104\4\51\1\171\10\51\1\107"+
    "\1\0\3\51\1\146\4\0\1\103\4\51\1\107\1\157\1\0\5\51\1\170\3\51\1\52\1\51\1"+
    "\52\4\0\2\51\1\146\1\0\6\51\1\157\5\0\1\51\1\52\1\51\1\52\1\144\13\0\1\106"+
    "\5\51\1\170\1\0\1\106\1\170\1\51\1\52\4\0\1\172\3\51\1\113\1\103\6\51\1\107"+
    "\3\0\4\51\1\170\3\0\1\51\1\173\5\51\1\107\1\12\1\174\13\0\1\175\1\176\1\0"+
    "\30\12\10\0\22\23\1\177\1\200\14\23\1\12\1\7\1\166\1\165\1\12\1\7\1\12\1\7"+
    "\1\166\1\165\1\12\1\201\1\12\1\7\1\12\1\166\1\12\1\51\1\12\1\51\1\12\1\51"+
    "\1\202\1\203\1\204\1\205\1\206\1\207\1\12\1\210\1\204\1\205\1\211\1\212\3"+
    "\0\1\213\5\0\1\214\2\0\1\215\1\216\2\0\1\12\1\53\14\0\1\217\1\220\1\221\1"+
    "\222\1\223\1\224\1\225\1\226\1\227\1\230\2\0\2\231\2\232\1\233\145\0\1\234"+
    "\3\231\3\232\1\235\42\0\5\7\1\20\5\12\1\22\1\236\1\237\1\240\1\241\14\23\1"+
    "\242\1\243\1\244\1\0\4\12\1\245\1\17\7\51\1\144\2\0\2\51\1\146\1\0\10\146"+
    "\11\0\1\144\72\0\1\246\5\0\1\247\1\137\1\100\11\51\1\146\1\106\1\100\12\51"+
    "\1\164\1\106\4\51\1\107\1\100\12\51\1\146\2\0\3\51\1\76\6\0\170\51\1\107\11"+
    "\0\72\51\1\107\5\0\21\51\1\157\10\0\5\51\1\107\41\51\1\157\3\51\1\170\2\0"+
    "\5\23\1\250\1\0\1\144\3\23\1\251\10\51\1\107\5\0\1\144\1\51\1\72\1\23\1\25"+
    "\7\23\1\12\1\252\1\23\1\253\1\254\2\23\1\255\1\256\7\0\1\144\1\257\1\260\1"+
    "\164\2\51\1\76\3\0\6\51\1\170\1\0\1\145\5\51\1\170\3\0\1\51\1\52\2\0\1\145"+
    "\1\261\4\51\1\107\1\0\2\51\1\146\3\0\3\51\1\157\1\115\5\51\1\76\2\0\1\144"+
    "\1\51\1\52\1\114\2\51\1\146\5\51\1\113\2\0\1\164\1\170\1\51\1\52\2\51\1\146"+
    "\1\262\6\51\1\161\1\247\1\171\2\0\1\263\1\51\1\76\1\127\1\0\3\264\1\0\2\146"+
    "\5\12\1\265\1\166\1\0\12\12\4\51\1\76\1\0\1\51\1\52\64\51\1\170\1\0\2\51\1"+
    "\146\1\172\5\51\1\170\40\0\55\51\1\107\15\51\1\52\4\0\1\22\1\0\1\266\1\267"+
    "\1\51\1\105\1\146\1\155\1\270\15\51\1\52\3\0\1\172\54\51\1\107\2\0\10\51\1"+
    "\145\6\51\5\0\1\51\1\170\16\0\1\114\20\51\1\157\2\0\1\51\1\52\1\6\2\7\1\271"+
    "\1\11\2\12\1\13\1\103\12\51\1\146\3\145\1\127\4\0\1\51\1\140\2\51\1\146\2"+
    "\51\1\272\1\51\1\107\1\51\1\107\4\0\17\51\1\76\60\0\3\51\1\157\6\51\1\113"+
    "\5\0\4\51\2\0\2\51\1\105\1\52\4\51\1\107\1\0\3\51\1\107\4\51\1\170\1\51\6"+
    "\0\5\7\5\12\11\51\1\107\1\51\1\52\4\7\1\207\4\12\1\273\5\51\1\0\6\51\1\170"+
    "\23\0\46\51\1\146\1\0\2\51\1\107\1\0\1\51\23\0\1\107\1\105\4\51\1\130\1\274"+
    "\2\51\1\107\1\0\2\51\1\146\1\0\3\51\1\146\10\0\2\51\1\275\1\0\2\51\1\107\1"+
    "\0\3\51\1\52\10\0\7\51\1\103\10\0\1\113\1\0\1\140\1\100\2\51\1\170\5\0\3\51"+
    "\1\157\3\51\1\157\4\0\1\51\1\100\2\51\1\157\3\0\6\51\1\107\1\0\2\51\1\107"+
    "\1\0\2\51\1\76\1\0\2\51\1\52\15\0\11\51\1\113\6\0\6\7\1\271\1\0\6\12\1\13"+
    "\41\0\1\172\6\51\5\0\1\103\1\51\2\0\1\172\5\51\4\0\3\51\1\113\1\51\1\52\1"+
    "\172\3\51\1\146\1\0\1\103\1\51\2\0\4\51\1\276\1\0\1\172\5\51\1\76\1\0\1\277"+
    "\1\0\1\51\1\300\4\0\2\51\1\131\2\51\1\170\12\0\1\146\1\301\1\51\1\130\1\51"+
    "\1\113\5\51\1\146\2\0\1\51\1\52\1\106\1\104\1\120\2\51\1\105\1\132\1\116\2"+
    "\0\1\113\1\106\1\52\23\0\6\51\1\157\1\0\1\144\1\76\1\51\1\52\4\0\6\51\2\0"+
    "\1\123\1\0\1\51\1\52\24\0\5\51\1\146\5\0\1\170\4\0\6\51\2\0\1\112\1\0\1\51"+
    "\1\52\4\0\5\51\1\76\2\0\1\51\1\52\6\0\3\51\1\52\2\0\1\51\1\52\54\0\4\7\4\12"+
    "\1\51\1\52\1\0\1\144\70\0\7\51\1\113\40\0\1\51\1\105\3\51\1\146\2\0\1\113"+
    "\1\0\1\51\1\52\2\0\1\145\3\51\56\0\63\51\1\52\34\0\30\51\1\170\27\0\5\51\1"+
    "\146\72\0\10\51\1\146\67\0\7\51\1\113\3\51\1\146\1\51\1\52\14\0\3\51\1\107"+
    "\2\0\6\51\2\0\1\170\1\0\1\51\1\52\1\172\2\51\1\106\2\51\56\0\10\51\1\157\1"+
    "\0\1\113\7\0\1\172\1\51\10\0\1\113\3\0\75\51\1\157\2\0\36\51\1\76\41\0\1\52"+
    "\77\0\15\51\1\76\1\51\1\157\1\51\1\113\1\51\1\52\54\0\3\7\1\302\2\12\1\303"+
    "\2\7\1\304\1\202\2\12\3\7\1\302\2\12\1\305\1\306\1\307\1\304\1\310\1\311\1"+
    "\12\3\7\1\302\2\12\1\312\1\313\1\314\1\315\3\12\1\316\1\317\1\320\1\321\2"+
    "\12\1\303\2\7\1\304\3\12\3\7\1\302\2\12\1\303\2\7\1\304\3\12\3\7\1\302\2\12"+
    "\1\303\2\7\1\304\3\12\3\7\1\302\2\12\1\166\3\7\1\321\2\12\1\265\1\322\2\7"+
    "\1\323\2\12\1\202\1\303\2\7\1\315\2\12\1\22\1\241\2\7\1\20\3\12\1\324\3\7"+
    "\1\321\2\12\1\265\1\325\36\51\1\157\7\0\4\7\1\302\3\12\1\273\1\0\1\51\1\52"+
    "\24\0\1\140\3\51\1\150\1\100\1\164\1\326\1\327\1\330\1\150\1\331\1\150\2\164"+
    "\1\126\1\51\1\131\1\51\1\170\1\332\1\131\1\51\1\170\116\0\3\231\1\333\3\231"+
    "\1\333\3\231\1\333\16\0\32\51\1\146\5\0\106\51\1\157\1\0\33\51\1\107\120\51"+
    "\1\52\53\0\3\51\1\107\74\0");

  /* The ZZ_CMAP_A table has 1760 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\2\4\1\2\0\1\2\1\31\1\16\2\0\1\3\1\0\1\14\1\25\1\26\1\30\1\27\1\20"+
    "\1\22\1\5\1\23\12\4\1\21\1\17\1\13\1\24\1\13\2\0\22\12\1\0\1\15\4\0\22\10"+
    "\12\0\1\1\2\0\1\2\11\0\1\10\12\0\1\10\2\0\7\12\1\0\7\12\10\10\1\0\1\12\1\10"+
    "\1\12\1\10\1\12\1\10\1\12\2\10\1\12\1\10\1\12\1\10\1\12\1\10\1\12\2\10\1\12"+
    "\1\10\1\12\1\10\1\12\1\10\2\12\1\10\1\12\1\10\1\12\3\10\2\12\1\10\1\12\1\10"+
    "\2\12\1\10\3\12\2\10\4\12\1\10\2\12\1\10\3\12\3\10\2\12\1\10\2\12\1\10\1\12"+
    "\1\10\1\12\1\10\2\12\1\10\1\12\2\10\1\12\1\10\2\12\1\10\3\12\1\10\1\12\1\10"+
    "\2\12\2\10\1\7\1\12\3\10\4\7\1\12\1\7\1\10\1\12\1\7\1\10\1\12\1\7\1\10\1\12"+
    "\1\10\1\12\1\10\1\12\1\10\1\12\2\10\1\12\2\10\1\12\1\7\1\10\1\12\1\10\3\12"+
    "\1\10\1\12\7\10\2\12\1\10\2\12\2\10\1\12\1\10\4\12\5\10\1\7\4\10\7\7\2\10"+
    "\4\0\14\7\6\0\5\10\7\0\1\7\1\0\1\7\6\0\1\6\2\0\1\12\1\10\1\12\1\10\1\7\1\0"+
    "\1\12\1\10\2\0\4\10\1\0\1\12\6\0\1\12\1\0\3\12\1\0\1\12\1\0\2\12\1\10\11\12"+
    "\1\0\11\12\13\10\1\12\2\10\3\12\7\10\1\12\1\10\1\0\1\12\1\10\2\12\2\10\4\12"+
    "\1\10\10\0\1\12\1\10\1\12\1\10\1\12\1\10\2\12\1\10\1\12\1\10\1\12\1\10\1\12"+
    "\1\10\1\12\1\10\1\12\1\10\1\12\2\10\1\0\1\7\6\0\3\7\5\0\2\7\4\0\2\7\1\0\13"+
    "\7\1\0\1\7\7\0\2\7\7\0\7\7\2\0\2\7\1\0\6\7\5\0\11\7\6\0\2\7\4\0\1\7\11\0\1"+
    "\7\3\0\1\7\7\0\5\7\1\0\2\7\4\0\6\7\3\0\1\7\2\0\1\7\4\0\4\7\2\0\6\7\1\0\1\7"+
    "\3\0\2\7\6\0\1\7\5\0\2\7\1\0\4\7\4\0\2\7\1\0\2\7\1\0\2\7\2\0\4\7\1\0\1\7\3"+
    "\0\3\7\3\0\6\7\1\0\3\7\1\0\6\7\1\0\2\7\1\0\3\7\3\0\1\7\1\0\6\7\3\0\3\7\1\0"+
    "\4\7\3\0\2\7\1\0\1\7\1\0\2\7\3\0\2\7\3\0\4\7\1\0\3\7\1\0\2\7\5\0\3\7\2\0\1"+
    "\7\6\0\3\7\10\0\1\7\2\0\15\7\1\0\1\7\1\0\2\7\5\0\2\7\1\0\1\7\2\0\2\7\1\0\1"+
    "\7\2\0\1\7\3\0\3\7\1\0\1\7\1\0\1\7\2\0\2\7\1\0\3\7\5\0\1\7\2\0\5\7\1\0\1\7"+
    "\1\0\2\7\2\0\11\7\5\0\4\7\3\0\1\7\3\0\2\7\1\0\6\12\1\0\1\12\5\0\1\12\2\0\3"+
    "\7\1\0\4\7\6\12\2\0\6\10\2\0\1\2\13\7\4\0\1\7\1\0\1\7\10\0\7\7\3\0\3\7\1\10"+
    "\10\0\4\7\1\0\4\7\3\0\2\7\1\0\1\12\1\10\1\12\1\10\1\12\11\10\1\12\1\10\1\0"+
    "\1\12\1\0\1\12\1\0\1\12\1\0\1\12\5\10\1\0\2\10\4\12\1\7\1\0\1\10\3\0\3\10"+
    "\1\0\2\10\4\12\1\7\3\0\4\10\2\0\2\10\4\12\4\0\5\12\3\0\13\2\5\0\2\1\5\0\1"+
    "\2\7\0\1\2\1\0\1\10\15\0\1\10\2\0\1\12\4\0\1\12\2\0\1\10\3\12\2\10\3\12\1"+
    "\10\1\0\1\12\3\0\5\12\6\0\1\12\1\0\1\12\1\0\1\12\1\0\4\12\1\0\1\10\4\12\1"+
    "\10\4\7\1\10\2\0\2\10\2\12\5\0\1\12\4\10\4\0\1\10\1\0\10\11\10\6\3\0\1\12"+
    "\1\10\11\0\2\11\2\6\6\0\1\12\1\10\3\12\2\10\1\12\1\10\1\12\1\10\1\12\1\10"+
    "\4\12\1\10\1\12\2\10\1\12\10\10\3\12\1\10\1\12\2\10\6\0\1\12\1\10\1\12\1\10"+
    "\3\0\1\12\1\10\4\0\6\10\1\0\1\10\1\2\4\0\2\7\2\0\5\7\2\0\1\12\1\10\1\12\1"+
    "\10\1\12\1\10\1\7\1\0\1\12\1\10\1\12\3\10\2\0\1\10\1\12\1\10\1\12\1\10\2\12"+
    "\1\10\1\7\2\0\1\12\1\10\1\12\1\10\1\7\1\12\1\10\1\12\3\10\1\12\1\10\1\12\1"+
    "\10\5\12\1\0\5\12\1\10\1\12\4\10\7\7\1\0\3\7\1\0\1\7\3\0\1\7\1\0\1\7\4\0\1"+
    "\7\3\0\2\7\3\0\3\7\3\0\6\7\1\0\3\10\1\0\4\10\3\0\5\10\5\0\1\7\1\0\3\7\1\0"+
    "\2\7\1\0\2\7\3\12\5\0\3\7\1\0\2\7\1\0\1\7\4\10\4\0\1\7\3\0\1\7\2\0\4\7\1\0"+
    "\2\7\2\0\3\7\3\0\1\7\2\0\4\7\3\0\3\7\1\0\1\7\3\0\1\7\1\0\4\7\1\0\1\7\2\12"+
    "\12\10\12\12\6\10\1\12\1\0\2\12\2\0\1\12\2\0\2\12\2\0\4\12\1\0\2\12\2\10\1"+
    "\0\1\10\1\0\7\10\1\0\7\10\2\12\1\0\4\12\2\0\10\12\1\0\7\12\1\0\2\10\2\12\1"+
    "\0\4\12\1\0\5\12\1\0\1\12\3\0\7\12\1\0\10\10\11\12\1\0\5\10\1\0\10\10\1\12"+
    "\1\10\2\0\2\7\1\0\1\7\1\0\1\7\6\0\1\7\4\0\1\7\1\0\1\7\1\0\1\7\1\0\3\7\1\0"+
    "\1\7\1\0\1\7\1\0\1\7\1\0\1\7\1\0\3\7\1\0\3\7\2\11\6\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\2\1\1\11\1\12\1\10\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\4\1\0\1\23"+
    "\3\0\1\24\1\25";

  private static int [] zzUnpackAction() {
    int [] result = new int[30];
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
    "\0\0\0\32\0\64\0\116\0\150\0\32\0\202\0\234"+
    "\0\266\0\320\0\352\0\32\0\32\0\u0104\0\266\0\u011e"+
    "\0\266\0\32\0\32\0\266\0\266\0\266\0\u0138\0\320"+
    "\0\32\0\u0152\0\352\0\u016c\0\266\0\266";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[30];
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
    "\1\2\2\3\1\4\1\5\1\6\1\7\1\2\1\7"+
    "\2\10\1\11\1\12\1\2\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26"+
    "\33\0\2\3\27\0\1\4\1\0\30\4\4\0\1\5"+
    "\1\27\30\0\1\7\2\0\2\7\1\0\1\7\23\0"+
    "\1\10\2\0\2\10\1\0\1\10\32\0\1\11\5\0"+
    "\4\11\2\0\3\11\14\30\1\31\1\32\14\30\15\33"+
    "\1\34\1\31\13\33\13\0\1\11\5\0\1\11\1\35"+
    "\2\11\2\0\3\11\13\0\1\11\5\0\1\11\1\36"+
    "\2\11\2\0\3\11\4\0\1\27\25\0\1\30\1\0"+
    "\30\30\1\33\1\0\30\33";

  private static int [] zzUnpackTrans() {
    int [] result = new int[390];
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
    "\1\0\1\11\3\1\1\11\5\1\2\11\4\1\2\11"+
    "\4\1\1\0\1\11\3\0\2\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[30];
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
  public PrologLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public PrologLexer(java.io.Reader in) {
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
   * @return      {@code false}, iff there was new input.
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
   * Returns the character at position {@code pos} from the
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
   * Reports an error that occurred while scanning.
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
          case 22: break;
          case 2: 
            { return WHITE_SPACE;
            } 
            // fall through
          case 23: break;
          case 3: 
            { return COMMENT;
            } 
            // fall through
          case 24: break;
          case 4: 
            { return NUMBER;
            } 
            // fall through
          case 25: break;
          case 5: 
            { return DOT;
            } 
            // fall through
          case 26: break;
          case 6: 
            { return CONST_ID;
            } 
            // fall through
          case 27: break;
          case 7: 
            { return ATOM_ID;
            } 
            // fall through
          case 28: break;
          case 8: 
            { return OPERATOR_ID;
            } 
            // fall through
          case 29: break;
          case 9: 
            { return SEMI;
            } 
            // fall through
          case 30: break;
          case 10: 
            { return COMMA;
            } 
            // fall through
          case 31: break;
          case 11: 
            { return OP_2;
            } 
            // fall through
          case 32: break;
          case 12: 
            { return OP_4;
            } 
            // fall through
          case 33: break;
          case 13: 
            { return EQ;
            } 
            // fall through
          case 34: break;
          case 14: 
            { return LP;
            } 
            // fall through
          case 35: break;
          case 15: 
            { return RP;
            } 
            // fall through
          case 36: break;
          case 16: 
            { return OP_1;
            } 
            // fall through
          case 37: break;
          case 17: 
            { return OP_3;
            } 
            // fall through
          case 38: break;
          case 18: 
            { return OP_5;
            } 
            // fall through
          case 39: break;
          case 19: 
            { return STRING;
            } 
            // fall through
          case 40: break;
          case 20: 
            { return UNIFY;
            } 
            // fall through
          case 41: break;
          case 21: 
            { return NOT;
            } 
            // fall through
          case 42: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}