/*Nome do programador: Henrique Rufino
 *Data de elaboração: 10/08/2017;
 * Objetivo: 26.	Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor.
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
			System.out.println("Os numeros são iguais.");
		}
		else {
			if(numUm>numDois) {
				if(numDois%numDois==0) {
					System.out.println(numUm+" é um multiplo de "+numDois);
				}
				else {
					System.out.println(numUm+" não é um multiplo de "+numDois);
				}
			}
			else {
				if(numDois%numUm==0) {
					System.out.println(numUm+" é um multiplo de "+numDois);
				}
				else {
					System.out.println(numUm+" não é um multiplo de "+numDois);
					
				}
			}
		}
	}
}
