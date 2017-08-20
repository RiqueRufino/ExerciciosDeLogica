/*Nome do programador: Henrique Rufino
 *Data de elabora��o: 10/08/2017;
 * Objetivo:Receba um n�mero inteiro. Calcule e mostre a s�rie de Fibonacci at� o seu N�n�simo termo. 
 */

package Modularizado;

import javax.swing.JOptionPane;

public class Ex37Mod {

	public static void main(String[] args) {
		int num;
		String serie;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));
		
		serie = calcFibonacci(num);
		
		System.out.println(serie);
	}
	
	public static String calcFibonacci(int num) {
		String serie = "";
		int atual = 0, anterior = 1, proximo = 0;
		
		for(int i = 1; i <= num;i++) {
			proximo = atual + anterior;
			serie += proximo + " ";
			anterior = atual;
			atual = proximo;
			
		}
		
		return serie;
	}

}
