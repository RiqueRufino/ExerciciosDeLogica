/* Nome do Programador: Henrique Rufino
 * Data da Elabora��o: 04/08/2017
 * Objetivo: Receba o valor de um dep�sito em poupan�a. Calcule e mostre o valor ap�s 1 m�s de aplica��o sabendo que rende 1,3% a. m. 
 */

import javax.swing.JOptionPane;

public class Ex08 {

	public static void main(String[] args) {
		
		double deposito, valorFinal;
		
		deposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do deposito:"));
		valorFinal = deposito * 1.013;
		System.out.println("Valor final de: " + valorFinal);
	}

}
