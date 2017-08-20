/* Nome do Programador: Henrique Rufino
 * Data da Elaboração: 04/08/2017
 * Objetivo: Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m. 
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
