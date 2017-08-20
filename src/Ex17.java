/* Nome do Programador: Henrique Rufino
 * Data da Elabora��o: 04/08/2017
 * Objetivo: Calcule a quantidade de litros gastos em uma viagem, sabendo que o autom�vel faz 12 km/l. Receber o tempo de percurso e a velocidade m�dia. 
 */

import javax.swing.JOptionPane;

public class Ex17 {

	public static void main(String[] args) {
		
		double tempo, velocidade, litros;
		
		tempo = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo (em horas):"));
		velocidade = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade (em km/h):"));
		
		litros = (tempo * velocidade) / 12;
		
		System.out.println("Total de litros gastos: "+ litros);
	}

}
