
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Wed Mar 09 19:18:56 CST 2022
//----------------------------------------------------

package Analizador;

import java_cup.runtime.Symbol;
import java.util.ArrayList;
import arbol.Conjunto;
import arbol.Hoja;
import expanalyzer.ExpAnalyzer;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Wed Mar 09 19:18:56 CST 2022
  */
public class Sintactico extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Sintactico() {super();}

  /** Constructor which sets the default scanner. */
  public Sintactico(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Sintactico(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\033\000\002\002\004\000\002\002\005\000\002\003" +
    "\004\000\002\003\003\000\002\004\003\000\002\004\003" +
    "\000\002\004\003\000\002\004\003\000\002\005\010\000" +
    "\002\006\005\000\002\006\003\000\002\007\003\000\002" +
    "\007\003\000\002\007\003\000\002\010\003\000\002\010" +
    "\004\000\002\011\006\000\002\012\004\000\002\012\003" +
    "\000\002\013\005\000\002\013\005\000\002\013\004\000" +
    "\002\013\004\000\002\013\004\000\002\013\005\000\002" +
    "\013\003\000\002\017\006" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\064\000\004\005\004\001\002\000\010\004\013\011" +
    "\014\026\011\001\002\000\004\002\006\001\002\000\004" +
    "\002\001\001\002\000\012\004\ufffc\011\ufffc\014\ufffc\026" +
    "\ufffc\001\002\000\012\004\ufffd\011\ufffd\014\ufffd\026\ufffd" +
    "\001\002\000\006\012\037\013\040\001\002\000\012\004" +
    "\ufffa\011\ufffa\014\ufffa\026\ufffa\001\002\000\004\013\021" +
    "\001\002\000\012\004\ufffb\011\ufffb\014\ufffb\026\ufffb\001" +
    "\002\000\012\004\ufffe\011\ufffe\014\ufffe\026\ufffe\001\002" +
    "\000\012\004\013\011\014\014\017\026\011\001\002\000" +
    "\004\002\000\001\002\000\012\004\uffff\011\uffff\014\uffff" +
    "\026\uffff\001\002\000\004\026\022\001\002\000\004\012" +
    "\023\001\002\000\012\006\031\007\027\023\025\027\032" +
    "\001\002\000\004\010\036\001\002\000\010\006\031\007" +
    "\027\027\032\001\002\000\004\010\ufff7\001\002\000\006" +
    "\010\ufff6\022\ufff6\001\002\000\006\010\ufff3\022\033\001" +
    "\002\000\006\010\ufff5\022\ufff5\001\002\000\006\010\ufff4" +
    "\022\ufff4\001\002\000\010\006\031\007\027\027\032\001" +
    "\002\000\004\010\ufff8\001\002\000\004\010\ufff2\001\002" +
    "\000\012\004\ufff9\011\ufff9\014\ufff9\026\ufff9\001\002\000" +
    "\020\005\050\015\044\016\053\017\043\020\047\021\045" +
    "\030\046\001\002\000\004\030\041\001\002\000\004\010" +
    "\042\001\002\000\012\004\uffe7\011\uffe7\014\uffe7\026\uffe7" +
    "\001\002\000\020\005\050\015\044\016\053\017\043\020" +
    "\047\021\045\030\046\001\002\000\020\005\050\015\044" +
    "\016\053\017\043\020\047\021\045\030\046\001\002\000" +
    "\020\005\050\015\044\016\053\017\043\020\047\021\045" +
    "\030\046\001\002\000\022\005\uffe8\010\uffe8\015\uffe8\016" +
    "\uffe8\017\uffe8\020\uffe8\021\uffe8\030\uffe8\001\002\000\020" +
    "\005\050\015\044\016\053\017\043\020\047\021\045\030" +
    "\046\001\002\000\004\026\060\001\002\000\022\005\uffef" +
    "\010\uffef\015\uffef\016\uffef\017\uffef\020\uffef\021\uffef\030" +
    "\uffef\001\002\000\022\005\050\010\056\015\044\016\053" +
    "\017\043\020\047\021\045\030\046\001\002\000\020\005" +
    "\050\015\044\016\053\017\043\020\047\021\045\030\046" +
    "\001\002\000\020\005\050\015\044\016\053\017\043\020" +
    "\047\021\045\030\046\001\002\000\022\005\uffed\010\uffed" +
    "\015\uffed\016\uffed\017\uffed\020\uffed\021\uffed\030\uffed\001" +
    "\002\000\012\004\ufff1\011\ufff1\014\ufff1\026\ufff1\001\002" +
    "\000\022\005\ufff0\010\ufff0\015\ufff0\016\ufff0\017\ufff0\020" +
    "\ufff0\021\ufff0\030\ufff0\001\002\000\004\014\061\001\002" +
    "\000\022\005\uffe9\010\uffe9\015\uffe9\016\uffe9\017\uffe9\020" +
    "\uffe9\021\uffe9\030\uffe9\001\002\000\022\005\uffeb\010\uffeb" +
    "\015\uffeb\016\uffeb\017\uffeb\020\uffeb\021\uffeb\030\uffeb\001" +
    "\002\000\022\005\uffea\010\uffea\015\uffea\016\uffea\017\uffea" +
    "\020\uffea\021\uffea\030\uffea\001\002\000\020\005\050\015" +
    "\044\016\053\017\043\020\047\021\045\030\046\001\002" +
    "\000\022\005\uffee\010\uffee\015\uffee\016\uffee\017\uffee\020" +
    "\uffee\021\uffee\030\uffee\001\002\000\022\005\uffec\010\uffec" +
    "\015\uffec\016\uffec\017\uffec\020\uffec\021\uffec\030\uffec\001" +
    "\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\064\000\004\002\004\001\001\000\014\003\015\004" +
    "\014\005\007\011\006\017\011\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\012\004\017\005\007\011" +
    "\006\017\011\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\010\006\023\007" +
    "\027\010\025\001\001\000\002\001\001\000\004\007\034" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\007\033" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\006\012\051\013\050\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\013\065\001" +
    "\001\000\004\013\063\001\001\000\004\013\062\001\001" +
    "\000\002\001\001\000\004\013\061\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\013\056\001\001\000\004" +
    "\013\053\001\001\000\004\013\054\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\013\064\001\001\000\002\001\001\000\002\001\001" +
    "" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Sintactico$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Sintactico$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Sintactico$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    /*Method that is called when parser can be recovered*/
	public void syntax_error(Symbol s){ 
        Entrada.Error.add("Token no reconocido: " +s.value); 
    }

	/*Method that is called when parser can't be recovered*/
	public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{ 
        Entrada.Error.add("Fatal error, unexcepted token: "+s.value); 
    }

    public void miFuncion() {
    // ....
    }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Sintactico$actions {
  private final Sintactico parser;

  /** Constructor */
  CUP$Sintactico$actions(Sintactico parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Sintactico$do_action(
    int                        CUP$Sintactico$act_num,
    java_cup.runtime.lr_parser CUP$Sintactico$parser,
    java.util.Stack            CUP$Sintactico$stack,
    int                        CUP$Sintactico$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintactico$result;

      /* select the action based on the action number */
      switch (CUP$Sintactico$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // Evaluar ::= Id DosP Cadena PyC 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("Evaluar",13, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // ER ::= Cadena 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 RESULT = new String(a); 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("ER",9, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // ER ::= LlaveA Id LlaveC 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		 RESULT = new String(a); 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("ER",9, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // ER ::= Interro ER 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 RESULT = new Hoja("Interro", a.toString()); 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("ER",9, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // ER ::= Positiva ER 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 RESULT = new Hoja("Positiva", a.toString()); 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("ER",9, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // ER ::= Ast ER 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 RESULT = new Hoja("Ast", a.toString()); 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("ER",9, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // ER ::= Disy ER ER 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 RESULT = new Hoja("Disy", a.toString(), b.toString()); 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("ER",9, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // ER ::= Conc ER ER 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 RESULT = ExpAnalyzer.hojasN.add(new Hoja("Conc", a.toString(), b.toString())); 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("ER",9, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // listER ::= ER 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("listER",8, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // listER ::= listER ER 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("listER",8, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // ExpRegular ::= Id Flecha listER PyC 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("ExpRegular",7, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // ListaConj ::= Coma ParametroConj 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("ListaConj",6, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // ListaConj ::= ParametroConj 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("ListaConj",6, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // ParametroConj ::= Simbolo 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("ParametroConj",5, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // ParametroConj ::= Digito 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("ParametroConj",5, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // ParametroConj ::= Letra 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("ParametroConj",5, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // PosConj ::= ListaConj 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("PosConj",4, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // PosConj ::= ParametroConj Tilde ParametroConj 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("PosConj",4, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // Conjuntos ::= CONJ DosP Id Flecha PosConj PyC 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)).value;
		RESULT = new Conjunto(a," buscando...");
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("Conjuntos",3, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-5)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // Instrucciones ::= Evaluar 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("Instrucciones",2, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // Instrucciones ::= Separador 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("Instrucciones",2, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // Instrucciones ::= ExpRegular 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("Instrucciones",2, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // Instrucciones ::= Conjuntos 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("Instrucciones",2, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // ListaInstruc ::= Instrucciones 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("ListaInstruc",1, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // ListaInstruc ::= ListaInstruc Instrucciones 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("ListaInstruc",1, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // Inicio ::= LlaveA ListaInstruc LlaveC 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("Inicio",0, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= Inicio EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		RESULT = start_val;
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintactico$parser.done_parsing();
          return CUP$Sintactico$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

