/* Nome do Programador: Henrique Rufino
 * Data da Elaboração: 04/08/2017
 * Objetivo:Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa. 
 */

import javax.swing.JOptionPane;

public class Ex15 {

	public static void main(String[] args) {
		
		double catetoUm, catetoDois, hipo;
		
		catetoUm = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro cateto:"));
		catetoDois = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo cateto:"));
		hipo = Math.sqrt(catetoUm * catetoDois + catetoDois * catetoDois);
		System.out.println("Hipotenusa = " + hipo);
	}

}
