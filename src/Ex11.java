/* Nome do Programador: Henrique Rufino
 * Data da Elaboração: 04/08/2017
 * Objetivo: Receba o raio de uma circunferência. Calcule e mostre o comprimento da circunferência. 
 */

import javax.swing.JOptionPane;

public class Ex11 {

	public static void main(String[] args) {
		
		double circ,raio;
		
		raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio"));
		circ = 2 * raio * 3.14;
		System.out.println("Circunferência= " + circ);
	}

}
