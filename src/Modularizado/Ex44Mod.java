/*Nome do programador: Henrique Rufino
 *Data de Elaboração: 14/08/2017;
 *Objetivo: Receba o número da base e do expoente. Calcule e mostre 
 *o valor da potência. 
 */


package Modularizado;

import javax.swing.JOptionPane;

public class Ex44Mod {

	public static void main(String[] args) {
		int expoente;
		double base, resultado;
		
		base=Double.parseDouble(JOptionPane.showInputDialog("Digite a base:"));
		expoente=Integer.parseInt(JOptionPane.showInputDialog("Digite o expoente:"));
		
		resultado=calcPotencia(base, expoente);
		
		System.out.println(resultado);
	}

	public static double calcPotencia(double base, int expoente) {
		double resultado = 1;
		
		for(int i = 1; i <= expoente; i++) {
			resultado = resultado * base;
		}
		
		return resultado;
	}
}
