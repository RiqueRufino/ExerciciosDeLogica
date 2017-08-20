/* Nome do Programador: Henrique Rufino
 * Data da Elaboração: 04/08/2017
 * Objetivo: Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos.
 */

import javax.swing.JOptionPane;

public class Ex12 {

	public static void main(String[] args) {
		
		int anoNasc, anoAtual, idadeAtual, idadeFutura;
		
		anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento:"));
		anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual:"));
		idadeAtual = anoAtual - anoNasc;
		idadeFutura = idadeAtual + 17;
		System.out.println("Sua idade atual é  de " + idadeAtual + ", idade daqui 17 anos é de" + idadeFutura);
	}

}
