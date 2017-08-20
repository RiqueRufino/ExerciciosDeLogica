/* Nome do Programador: Henrique Rufino
 * Data da Elaboração: 04/08/2017
 * Objetivo: Receba 2ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo. 
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
