/*Nome do programador: Henrique Rufino
 *Data de elabora��o: 10/08/2017;
 * Objetivo:Receba um n�mero inteiro. Calcule e mostre o seu fatorial. 
 */

import javax.swing.JOptionPane;

public class Ex32 {

	public static void main(String[] args) {
		
		int num, fat = 1;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero:"));

		for(int i = 1; i <= num; i++) {
			fat = fat * i;
		}
		System.out.println("fatorial = " + fat);
	}

}
