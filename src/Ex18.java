/* Nome do Programador: Henrique Rufino
 * Data da Elabora��o: 04/08/2017
 * Objetivo: Receba 2 valores inteiros. Calcule e mostre o resultado da diferen�a do maior pelo menos valor. 
 */

import javax.swing.JOptionPane;

public class Ex18 {

	public static void main(String[] args) {
		
		double numUm, numDois, resultado;
		
		numUm = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor:"));
		numDois = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor:"));
		
		if(numUm == numDois) {
			System.out.println("Os n�meros s�o iguais.");
		}
		else {
			if(numUm > numDois) {
				resultado = numUm - numDois;
				System.out.println(resultado);
			}
			else {
				resultado = numDois - numUm;
				System.out.println(resultado);
			}
		}
	}

}
