/* Nome do Programador: Henrique Rufino
 * Data da Elaboração: 04/08/2017
 * Objetivo: Receba a temperatura em graus Celsius. Calcule e mostre a sua temperatura convertida em fahrenheit F = (9*C+160) /5. 
 */

import javax.swing.JOptionPane;

public class Ex04 {

	public static void main(String[] args) {
		
	 double tempC, tempF;
	 tempC=Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em Celsius:"));
	 tempF=( 9 * tempC + 160 ) / 50;
	 System.out.println("Temperatura = " + tempF);
	}

}
