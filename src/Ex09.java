/* Nome do Programador: Henrique Rufino
 * Data da Elaboração: 04/08/2017
 * Objetivo: Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados.  
 */

import javax.swing.JOptionPane;

public class Ex09 {

	
	public static void main(String[] args) {
		
		double numUm, numDois, resultado;
		
		numUm = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor:"));
		numDois = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor:"));
		resultado= ( numUm * numUm ) + ( numDois * numDois );
		System.out.println("Resultado = " + resultado);
	}

}
