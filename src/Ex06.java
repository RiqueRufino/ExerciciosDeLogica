/* Nome do Programador: Henrique Rufino
 * Data da Elaboração: 04/08/2017
 * Objetivo: Receba os valores em x e y. Efetua a troca de seus valores e mostre seus conteúdos. 
 */

import javax.swing.JOptionPane;

public class Ex06 {

	public static void main(String[] args) {
	
	double valorUm, valorDois, controle;
	
	valorUm=Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor:"));
	valorDois=Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor:"));
	
	controle = valorUm;
	valorUm = valorDois;
	valorDois = controle;
	System.out.println(valorUm + "," + valorDois);
	}

}
