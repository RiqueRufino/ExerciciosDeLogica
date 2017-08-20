/* Nome do Programador: Henrique Rufino
 * Data da Elaboração: 04/08/2017
 * Objetivo: Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias durará esse alimento sabendo que a pessoa consome 50g ao dia.
 */

import javax.swing.JOptionPane;

public class Ex13 {

	public static void main(String[] args) {
	
		double quilos, dias;
		
		quilos = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso em quilos:"));
		dias = quilos * 1000 / 5;
		System.out.println("Quantidade de dias " + dias);
	}

}
