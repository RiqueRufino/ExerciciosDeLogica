/*Nome do programador: Henrique Rufino
 *Data de elaboração: 10/08/2017;
 *Objetivo:Receba 100 números inteiros reais. Verifique e mostre o maior
 * e o menos valor. Obs.: somente valores positivos.
 */

package Modularizado;

import javax.swing.JOptionPane;

public class Ex38Mod {
	static double[] valores = new double[100], resultado = new double[2];
	
	public static void main(String[] args) {

		lerValores();
		calcMaiorMenor();
		
		System.out.println("Menor=" + resultado[1] + ", maior=" + resultado[0]);
	}
	
	public static void lerValores() {
		for(int i = 0; i < valores.length; i++) {
			valores[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor:"));
		}
	}
	
	public static double[] calcMaiorMenor() {
		
		double num;
		
		resultado[0] = valores[0];
		resultado[1] = valores[1];
		
		if(resultado[1] < resultado[0]) {
			num = resultado[1];
			resultado[1] = resultado[0];
			resultado[0] = num;
		}
		
		for(int i = 2; i <= valores.length; i++) {
			
			if(valores[i] > resultado[1]) {
				resultado[1] = valores[i];
			}
			else{
				if(valores[i] < resultado[0]) {
					resultado[0] = valores[i];
				}
			}
		}
		
		return resultado;
	}

}
