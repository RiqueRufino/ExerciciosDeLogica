/* Nome do Programador: Henrique Rufino
 * Data da Elaboração: 04/08/2017
 * Objetivo:Receba os valores do comprimento, largura e altura de um paralelepípedo. Calcule e mostre seu volume.  
 */

import javax.swing.JOptionPane;

public class Ex07 {

	public static void main(String[] args) {
		
		double comprimento, largura, altura, volume;
		
		comprimento=Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento:"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o altura:"));
		largura = Double.parseDouble(JOptionPane.showInputDialog("Digite o largura:"));
		volume = comprimento * altura * largura;
		System.out.println("Volume = "+ volume);
	}

}
