/*Nome do programador: Henrique Rufino
 *Data de elaboração: 10/08/2017;
 * Objetivo:Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N! 
 */


package Modularizado;

import javax.swing.JOptionPane;

public class Ex36Mod {

	public static void main(String[] args) {
		int num;
		double resultado;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));
		resultado = calcSerie(num);
		
		System.out.println(resultado);
	}

	public static double calcSerie(int num) {
		int fatorial = 1;
		double resultado = 1;
		
		for(int i = 1; i <= num; i++) {
			for(int i2 = 1; i2 <= i; i2++) {
				fatorial = fatorial * i2;
			}
			resultado += 1.0 / fatorial;
		}
		
		return resultado;
	}
}
