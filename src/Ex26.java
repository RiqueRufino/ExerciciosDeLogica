/*Nome do programador: Henrique Rufino
 *Data de elabora��o: 10/08/2017;
 * Objetivo: Receba 2 n�meros inteiros. Verifique e mostre se o maior n�mero � m�ltiplo do menor.
 */

import javax.swing.JOptionPane;

public class Ex26 {

	public static void main(String[] args) {
		
		int numUm, numDois;
		
		numUm = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
		numDois = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));
		if(numUm == numDois) {
			System.out.println("Os numeros s�o iguais.");
		}
		else {
			if(numUm > numDois) {
				if(numDois % numDois == 0) {
					System.out.println(numUm+" � um multiplo de "+numDois);
				}
				else {
					System.out.println(numUm+" n�o � um multiplo de "+numDois);
				}
			}
			else {
				if(numDois % numUm ==0) {
					System.out.println(numUm+" � um multiplo de "+numDois);
				}
				else {
					System.out.println(numUm+" n�o � um multiplo de "+numDois);
					
				}
			}
		}
	}

}
