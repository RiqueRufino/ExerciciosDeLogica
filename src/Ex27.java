/*Nome do programador: Henrique Rufino
 * Data de elabora��o: 10/08/2017
 * Objetivo: Receba o n�mero de voltas, a extens�o do circuito (em metros) e o tempo de dura��o (minutos). Calcule e mostre a velocidade m�dia em km/h. 
 */

import javax.swing.JOptionPane;

public class Ex27 {

	public static void main(String[] args) {
		
		double numVoltas, metros, tempo, velocidade;
		
		numVoltas = Double.parseDouble(JOptionPane.showInputDialog("Digite o n�mero de voltas:"));
		metros = Double.parseDouble(JOptionPane.showInputDialog("Digite os metros:"));
		tempo = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo:"));
		velocidade = ( (metros * numVoltas) / 100) / (tempo / 60);
		System.out.println("Velocidade media = " + velocidade);
	}

}
