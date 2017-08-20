/*Nome do programador: Henrique Rufino
 * Data de elaboração: 10/08/2017
 * Objetivo: Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos). Calcule e mostre a velocidade média em km/h. 
 */

import javax.swing.JOptionPane;

public class Ex27 {

	public static void main(String[] args) {
		
		double numVoltas, metros, tempo, velocidade;
		
		numVoltas = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de voltas:"));
		metros = Double.parseDouble(JOptionPane.showInputDialog("Digite os metros:"));
		tempo = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo:"));
		velocidade = ( (metros * numVoltas) / 100) / (tempo / 60);
		System.out.println("Velocidade media = " + velocidade);
	}

}
