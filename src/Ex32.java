/*Nome do programador: Henrique Rufino
 *Data de elaboração: 10/08/2017;
 * Objetivo:Receba um número inteiro. Calcule e mostre o seu fatorial. 
 */

import javax.swing.JOptionPane;

public class Ex32 {

	public static void main(String[] args) {
		
		int num, fat = 1;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

		for(int i = 1; i <= num; i++) {
			fat = fat * i;
		}
		System.out.println("fatorial = " + fat);
	}

}
