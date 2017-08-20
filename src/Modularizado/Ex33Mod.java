/*Nome do programador: Henrique Rufino
 *Data de elaboração: 10/08/2017;
 * Objetivo:Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N
 */

package Modularizado;

import javax.swing.JOptionPane;

public class Ex33Mod {

	public static void main(String[] args) {
		double resultado = 0;
		int num;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));
		resultado = calcSerie(num);
		
		System.out.println(resultado);
	}
	
	public static double calcSerie(int num) {
		double resultado = 0;
		
		for(int i = 1; i <= num; i++) {
			resultado += (1.0 / i);
		}
		
		return resultado;
	}

}
