/*Nome do programador: Henrique Rufino
 *Data de elaboração: 10/08/2017;
 * Objetivo:Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu N’nésimo termo. 
 */

import javax.swing.JOptionPane;

public class Ex37 {

	public static void main(String[] args) {
		
		int num, atual = 0, anterior = 1, proximo = 0;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));
		for(int i = 1; i <= num;i++) {
			proximo = atual + anterior;
			System.out.println(proximo);
			anterior = atual;
			atual = proximo;
			
		}
	}

}
