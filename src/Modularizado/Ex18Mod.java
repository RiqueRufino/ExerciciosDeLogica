/* Nome do Programador: Henrique Rufino
 * Data da Elaboração: 04/08/2017
 * Objetivo: Receba 2 valores inteiros. Calcule e mostre o resultado da diferença 
 * do maior pelo menos valor. 
 */

package Modularizado;

import javax.swing.JOptionPane;

public class Ex18Mod {
	
	public static void main(String[] args) {
		
		int numUm, numDois;
		
		numUm = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
		numDois = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));
		
		System.out.println(calcDiferença(numUm, numDois));
		
	}
	
	static String calcDiferença(int numUm, int numDois) {
		int resultado;
		
		if(numUm == numDois) {
			return "Os números são iguais.";
		}
		else {
			if(numUm > numDois) {
				resultado = numUm - numDois;
				return "Resultado = " + resultado;
			}
			else {
				resultado = numDois - numUm;
				return "Resultado = " + resultado;
			}
		}
	}

}
