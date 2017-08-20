/* Nome do Programador: Henrique Rufino
 * Data da Elaboração: 04/08/2017
 * Objetivo: Receba a base e a altura de um triângulo. Calcule e mostre a sua área.  
 */

import javax.swing.JOptionPane;

public class Ex03 {
	
	public static void main(String arg[]){
		
		double base, altura, area;
		base=Double.parseDouble(JOptionPane.showInputDialog("Digite a base:"));
		altura=Double.parseDouble(JOptionPane.showInputDialog("Digite a altura:"));
		area= base * altura / 2;
		System.out.println("Area = " + area);
	}
}
