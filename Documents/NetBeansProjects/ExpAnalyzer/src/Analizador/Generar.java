/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analizador;

/**
 *
 * @author Jeany
 */
public class Generar {
    public static void main(String[] args) {
		try {
			String ruta =  "src/Analizador/";
			String opcFlex[] =  {ruta+"Lexico.jflex","-d",ruta};
			jflex.Main.generate(opcFlex);
			
			String opcCup[] =  {"-destdir", ruta,"-parser","Sintactico",ruta+"Sintactico.cup"};
			java_cup.Main.main(opcCup);
		} catch (Exception e) {
		}
	}
}
