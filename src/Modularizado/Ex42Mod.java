/*Nome do programador: Henrique Rufino
 *Data de elaboração: 14/08/2017;
 * Objetivo:Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99 
 */

package Modularizado;

public class Ex42Mod {

	public static void main(String[] args) {
		
		System.out.println(calcSerie());
	}
	
	public static double calcSerie() {
		double resultado = 0, cont = 1;
		
		for(double i = 1; i <= 50; i++) {
			resultado += i / cont;
			cont += 2;
		}
		
		return resultado;
	}

}
