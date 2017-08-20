/*Nome do programador: Henrique Rufino
 *Data de elaboração: 10/08/2017;
 * Objetivo:Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N! 
 */

import javax.swing.JOptionPane;

public class Ex36 {

	public static void main(String[] args) {
		
		int num, fatorial;
		double resultado;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));
		fatorial = 1;
		resultado = 1;
		for(int i = 1; i <= num; i++) {
			for(int i2 = 1; i2 <= i; i2++) {
				fatorial = fatorial * i2;
			}
			resultado += 1.0 / fatorial;
		}
		
		System.out.println(resultado);
	}

}
