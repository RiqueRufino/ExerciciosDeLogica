/*Nome do programador: Henrique Rufino
 *Data de elabora��o: 10/08/2017;
 * Objetivo:Receba um n�mero inteiro. Calcule e mostre a s�rie de Fibonacci at� o seu N�n�simo termo. 
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
