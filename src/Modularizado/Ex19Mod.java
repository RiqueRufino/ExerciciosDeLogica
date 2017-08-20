/* Nome do Programador: Henrique Rufino
 * Data da Elaboração: 04/08/2017
 * Objetivo:Receba 2 valores reais. Calcule e mostre o maior deles.
 */

package Modularizado;

import javax.swing.JOptionPane;

public class Ex19Mod {
	
	public static void main(String[] args) {
		double numUm, numDois;
		
		numUm = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor:"));
		numDois = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));
		
		JOptionPane.showMessageDialog(null, calcMaiorNum(numUm, numDois));
		
	}
	
	static String calcMaiorNum(double numUm, double numDois) {
		
		if(numUm == numDois) {
			return "Os numeros são iguais.";
		}
		else {
			if(numUm > numDois) {
				return "O maior é " + numUm;
			}
			else {
				return "O maior é "+ numDois;
			}
		}
	}

}
