/* Nome do Programador: Henrique Rufino
 * Data da Elabora��o: 04/08/2017
 * Objetivo: Coletar Receba o sal�rio de um funcion�rio e mostre o novo sal�rio com reajuste de 15%. 
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
