/*Nome do programador: Henrique Rufino
 *Data de elaboração: 10/08/2017;
 * Objetivo:Receba 2 números inteiros, verifique qual o maior entre eles.
 * Calcule e mostre o resultado da somatória dos números ímpares entre esses valores.
 */

package Modularizado;

import javax.swing.JOptionPane;

public class Ex35Mod {

	public static void main(String[] args) {
		int numUm, numDois, resulSomatoria = 0;
		int[] ordemNum = new int[2];
		
		numUm = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
		numDois = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));
		
		ordemNum = calcMaiorMenor(numUm, numDois);;
		resulSomatoria = somatoriaImpares(ordemNum);
		
		System.out.println(resulSomatoria);
	}
	
	public static int[] calcMaiorMenor(int numUm, int numDois) {
		int[] resultado = new int[2];
		
		if(numUm < numDois) {
			resultado[0] = numUm;
			resultado[1] = numDois;
		}
		else {
			resultado[0] = numDois;
			resultado[1] = numUm;
		}
		
		return resultado;
	}

	public static int somatoriaImpares(int[] limite) {
		int resultado = 0;
		
		for(int i = limite[0]; i < limite[1]; i++) {
			if(i % 2 == 1) {
				resultado += i;
			}
		}
		
		return resultado;
	}
}
