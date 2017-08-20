/* Nome do Programador: Henrique Rufino
 * Data da Elaboração: 04/08/2017
 * Objetivo:Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente. 
 */

import javax.swing.JOptionPane;

public class Ex22 {

	public static void main(String[] args) {
		
		int numUm, numDois;
		
		numUm = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero:"));
		numDois = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero:"));
		if(numUm < numDois) {
			System.out.println(numUm + ", " + numDois);
		} else {
			System.out.println(numDois + ", " + numUm);
		}
	}

}
