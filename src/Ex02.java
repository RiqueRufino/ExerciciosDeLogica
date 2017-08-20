/* Nome do Programador: Henrique Rufino
 * Data da Elaboração: 04/08/2017
 * Objetivo: Coletar Receba o salário de um funcionário e mostre o novo salário com reajuste de 15%. 
 */

import javax.swing.JOptionPane;

public class Ex02 {
	
	public static void mais (String args[]) {
		
		double salarioAtual,novoSalario;
		 
		salarioAtual=Double.parseDouble(JOptionPane.showInputDialog("Digite o salario atual:"));
		novoSalario = salarioAtual * 1.15;
		System.out.println("Novo salario = " + novoSalario);
	}
}
