/* Nome do Programador: Henrique Rufino
 * Data da Elaboração: 04/08/2017
 * Objetivo:Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem. Mostre os 4 números em ordem crescente. 
 */

package Modularizado;

import javax.swing.JOptionPane;

public class Ex23Mod {
	static int numUm, numDois, numTres, numQuatro, controle;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		numUm=Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
		numDois=Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
		numTres=Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor"));
		numQuatro=Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto valor"));
		ordemCrescente();
		System.out.println(numUm+","+numDois+","+numTres+","+numQuatro);
	}
	static void ordemCrescente() {
		if(numQuatro>numTres) {	
		} 
		else {
			if(numQuatro>numDois) {
				controle=numQuatro;
				numQuatro=numTres;
				numTres=controle;
			} 
			else {
				if(numQuatro>numUm) {
					controle=numQuatro;
					numQuatro=numTres;
					numTres=numDois;
					numDois=controle;
				}
				else {
					controle=numQuatro;
					numQuatro=numTres;
					numTres=numDois;
					numDois=numUm;
					numUm=controle;
				}
			}
		}
	}
}
