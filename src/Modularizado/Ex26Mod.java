/*Nome do programador: Henrique Rufino
 *Data de elabora��o: 10/08/2017;
 * Objetivo: 26.	Receba 2 n�meros inteiros. Verifique e mostre se o maior n�mero � m�ltiplo do menor.
 */
package Modularizado;

import javax.swing.JOptionPane;

public class Ex26Mod {
	static int numUm, numDois;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		numUm=Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
		numDois=Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));
		multiploDoMaior();
	}
	static void multiploDoMaior() {
		if(numUm==numDois) {
			System.out.println("Os numeros s�o iguais.");
		}
		else {
			if(numUm>numDois) {
				if(numDois%numDois==0) {
					System.out.println(numUm+" � um multiplo de "+numDois);
				}
				else {
					System.out.println(numUm+" n�o � um multiplo de "+numDois);
				}
			}
			else {
				if(numDois%numUm==0) {
					System.out.println(numUm+" � um multiplo de "+numDois);
				}
				else {
					System.out.println(numUm+" n�o � um multiplo de "+numDois);
					
				}
			}
		}
	}
}
