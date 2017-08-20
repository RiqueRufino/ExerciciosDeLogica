/* Nome do Programador: Henrique Rufino
 * Data da Elaboração: 04/08/2017
 * Objetivo:Receba 2 valores reais. Calcule e mostre o maior deles.
 */

import javax.swing.JOptionPane;

public class Ex19 {

	public static void main(String[] args) {
		
		double numUm, numDois;
		
		numUm = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor:"));
		numDois = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));
		
		if(numUm == numDois) {
			System.out.println("Os numeros são iguais.");
		}
		else {
			if(numUm > numDois) {
				System.out.println("O maior é "+numUm);
			}
			else {
				System.out.println("O maior é "+numDois);
			}
		}
	}

}
