/* Nome do Programador: Henrique Rufino
 * Data da Elabora��o: 04/08/2017
 * Objetivo: Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e quantos anos ter� daqui a 17 anos.
 */

import javax.swing.JOptionPane;

public class Ex12 {

	public static void main(String[] args) {
		
		int anoNasc, anoAtual, idadeAtual, idadeFutura;
		
		anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento:"));
		anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual:"));
		idadeAtual = anoAtual - anoNasc;
		idadeFutura = idadeAtual + 17;
		System.out.println("Sua idade atual �  de " + idadeAtual + ", idade daqui 17 anos � de" + idadeFutura);
	}

}
