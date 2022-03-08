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

CADENA =[\"\“\'] [^\"\”\'\n]* [\"\”\'\n]
BLANCOS=[ \t\r\f\n]+
digito = [0-9]
letra = [a-zA-ZñÑ]
id = {letra}+({letra}|{digito}|"_")*   
numero = {digito}+("." {digito}+)?
CommentSimple =   ("//".*\r\n) | ("//".*\n) | ("//".*\r)
CommentMulti = "<!""<"*([^!>]|[^!]">"|"!"[^>])*"!"*"!>"


%%
/*-------------------------------------------------------------------
--------------------- 3ra. y ultima area: Reglas Lexicas
-------------------------------------------------------------------*/

//-------> Comentarios


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
                 

//-------> Expresiones Regulares
{BLANCOS}                      {}
{CommentSimple}                {}
{CommentMulti}                 {}
{digito}                             { return new Symbol(sym.Digito, yyline, yychar, yytext()); }
[!-/]                           { return new Symbol(sym.Simbolo, yyline, yychar, yytext()); }
{letra}                        { return new Symbol(sym.Letra, yyline, yychar, yytext()); }
{id}   { return new Symbol(sym.Id, yyline, yychar, yytext()); }
{CADENA}     { return new Symbol(sym.Cadena, yyline, yychar, yytext()); }

. {
    Entrada.Error.add("Este es un error léxico: "+yytext() + "en línea"+yyline+" y columna "+yychar);
}

