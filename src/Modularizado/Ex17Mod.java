/* Nome do Programador: Henrique Rufino
 * Data da Elaboração: 04/08/2017
 * Objetivo: Calcule a quantidade de litros gastos em uma viagem, sabendo que
 *  o automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média. 
 */

package Modularizado;

import javax.swing.JOptionPane;

public class Ex17Mod {
	
	public static void main(String[] args) {
		
		double tempo, velocidade, litrosGasto;
		
		tempo=Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo (em horas):"));
		velocidade=Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade (em km/h):"));
		
		litrosGasto = calcLitrosGastos(tempo, velocidade);
		
		System.out.println("Total de litros gastos: "+ litrosGasto);
	
	}
	
	static double calcLitrosGastos(double tempo, double velocidade){
		
		double litros = (tempo * velocidade) / 12;
		
		return litros;
	}

}
