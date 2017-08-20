/*Nome do programador: Henrique Rufino
 *Data de elaboração: 14/08/2017;
 * Objetivo:Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99 
 */

public class Ex42 {
	
	public static void main (String [] args) {
		
		double resultado = 0, cont = 1;
		
		for(double i = 1; i <= 50; i++) {
			resultado += i / cont;
			cont += 2;
		}
		
		System.out.println(resultado);
	}
}
