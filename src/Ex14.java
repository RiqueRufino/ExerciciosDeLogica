/* Nome do Programador: Henrique Rufino
 * Data da Elabora��o: 04/08/2017
 * Objetivo: Receba 2�ngulos de um tri�ngulo. Calcule e mostre o valor do 3� �ngulo. 
 */

import javax.swing.JOptionPane;

public class Ex14 {

	public static void main(String[] args) {
		
		double anguloUm, anguloDois, anguloTres;
		
		anguloUm = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro angulo:"));
		anguloDois = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo angulo:"));
		anguloTres = 180 - anguloUm - anguloDois;
		System.out.println("Terceiro angulo de " + anguloTres);
	}

}
