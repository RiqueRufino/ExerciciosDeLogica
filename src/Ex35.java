/*Nome do programador: Henrique Rufino
 *Data de elabora��o: 10/08/2017;
 * Objetivo:Receba 2 n�meros inteiros, verifique qual o maior entre eles. Calcule e mostre o resultado da somat�ria dos n�meros �mpares entre esses valores.
 */

import javax.swing.JOptionPane;

public class Ex35 {

	public static void main(String[] args) {
		
		int numUm, numDois, resultado = 0, comeco, fim;
		
		numUm = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
		numDois = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));
		if(numUm < numDois) {
			comeco = numUm;
			fim = numDois;
		}
		else {
			comeco = numDois;
			fim = numUm;
		}
		for(int i = comeco; i <= fim; i++) {
			if(i % 2 == 1) {
				resultado += i;
			}
		}
		System.out.println(resultado);
	}

}
