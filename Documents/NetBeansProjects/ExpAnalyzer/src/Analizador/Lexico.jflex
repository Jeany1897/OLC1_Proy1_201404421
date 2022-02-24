//-------> Paquete, importaciones
package Analizador; 
import java_cup.runtime.Symbol; 

%%
//-------> Directivas
%class Lexico
%public
%line
%char
%unicode
%cup
%ignorecase


%%
//-------> Palabras reservadas
"CONJ"                   { return new Symbol(sym.CONJ, yyline, yychar, yytext());}

//-------> Simbolos
"{"                     {return new Symbol(sym.LlaveA, yyline, yychar, yytext());}  
";"                     {return new Symbol(sym.PyC, yyline, yychar, yytext());}  
"%%"                    {return new Symbol(sym.Separador, yyline, yychar, yytext());}  
"{"                     {return new Symbol(sym.LlaveA, yyline, yychar, yytext());}  
"->"                    {return new Symbol(sym.Flecha, yyline, yychar, yytext());}  
":"                     {return new Symbol(sym.DosP, yyline, yychar, yytext());}  
"}"                     {return new Symbol(sym.LlaveC, yyline, yychar, yytext());}  
"."                     {return new Symbol(sym.Conc, yyline, yychar, yytext());}  
"|"                     {return new Symbol(sym.Disy, yyline, yychar, yytext());}  
"*"                     {return new Symbol(sym.Ast, yyline, yychar, yytext());}  
"+"                     {return new Symbol(sym.Positiva, yyline, yychar, yytext());}  
"?"                     {return new Symbol(sym.Interro, yyline, yychar, yytext());}  
"~"                     {return new Symbol(sym.Tilde, yyline, yychar, yytext());}  
"|"                     {return new Symbol(sym.Disy, yyline, yychar, yytext());}  
","                     {return new Symbol(sym.Coma, yyline, yychar, yytext());}  
"\'"                    {return new Symbol(sym.ComillaSimple, yyline, yychar, yytext());}  
"\""                    {return new Symbol(sym.ComillaDoble, yyline, yychar, yytext());}  
"<!"                    {return new Symbol(sym.CommentA, yyline, yychar, yytext());}  
"!>"                    {return new Symbol(sym.CommentC, yyline, yychar, yytext());}  
                 

//-------> Expresiones Regulares
[ \n\t\r]+                        {}
[0-9]                             { return new Symbol(sym.Digito, yyline, yychar, yytext()); }
//Digito+                            { return new Symbol(sym.Entero, yyline, yychar, yytext()); }
[a-zA-ZñÑ]                        { return new Symbol(sym.Letra, yyline, yychar, yytext()); }
[a-zA-ZñÑ]+([a-zA-ZñÑ]|[0-9]|"_")*   { return new Symbol(sym.Id, yyline, yychar, yytext()); }

. {
    System.out.println("Este es un error léxico: "+yytext() + "en línea"+yyline+" y columna "+yychar);
}

