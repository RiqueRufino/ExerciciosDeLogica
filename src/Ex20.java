/* Nome do Programador: Henrique Rufino
 * Data da Elabora��o: 04/08/2017
 * Objetivo: Receba 3 coeficientes A, B, e C de uma equa��o do 2� grau da f�rmula AX�+BX+C=0. Verifique e mostre a exist�ncia de ra�zes reais e se caso exista, calcule e mostre.
 */

import javax.swing.JOptionPane;

public class Ex20 {

	public static void main(String[] args) {
		
		double numA, numB, numC, raizUm, raizDois, delta;
		
		numA = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro coeficiente:"));
		numB = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo coeficiente:"));
		numC = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro coeficiente:"));
		delta = (numB * numB) - (4 * numA * numC);
		
		if(delta < 0) {
			System.out.println("N�o possui raizes.");
		}
		else {
			raizUm = ( (-numB) + Math.sqrt(delta) ) / (2 * numA);
			raizDois=( (-numB) - Math.sqrt(delta) ) / (2*numA);
			if(delta == 0) {
				System.out.println(raizUm);
			}
			else {
				System.out.println(raizUm + ", " + raizDois);
			}
		}
	}

}
