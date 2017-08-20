/*Nome do programador: Henrique Rufino
 *Data de elaboração: 10/08/2017;
 * Objetivo: Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor.
 */

import javax.swing.JOptionPane;

public class Ex26 {

	public static void main(String[] args) {
		
		int numUm, numDois;
		
		numUm = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
		numDois = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));
		if(numUm == numDois) {
			System.out.println("Os numeros são iguais.");
		}
		else {
			if(numUm > numDois) {
				if(numDois % numDois == 0) {
					System.out.println(numUm+" é um multiplo de "+numDois);
				}
				else {
					System.out.println(numUm+" não é um multiplo de "+numDois);
				}
			}
			else {
				if(numDois % numUm ==0) {
					System.out.println(numUm+" é um multiplo de "+numDois);
				}
				else {
					System.out.println(numUm+" não é um multiplo de "+numDois);
					
				}
			}
		}
	}

}
