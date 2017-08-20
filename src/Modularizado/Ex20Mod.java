/* Nome do Programador: Henrique Rufino
 * Data da Elaboração: 04/08/2017
 * Objetivo: Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula AX²+BX+C=0.
 *  Verifique e mostre a existência de raízes reais e se caso exista, calcule e mostre.
 */

package Modularizado;

import javax.swing.JOptionPane;

public class Ex20Mod {
 
	public static void main(String[] args) {
		double numA, numB, numC, delta;
		double raiz[] = new double[2];
		
		numA=Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro coeficiente:"));
		numB=Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo coeficiente:"));
		numC=Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro coeficiente:"));
		
		delta = calcDelta(numA, numB, numC);
		
		if(delta < 0) {
			System.out.println("Não possui raizes.");
		}
		else {
			raiz = calcRaiz(numA, numB, numC);
			
			if(delta == 0) {
				System.out.println(raiz[1]);
			}
			else {
				System.out.println(raiz[0] + ", " + raiz[1]);
			}
		}
	}
	
	public static double calcDelta(double numA, double numB, double numC) {
		double delta = (numB * numB) - (4 * numA * numC);
		
		return delta;
	}
	
	static double[] calcRaiz(double numA, double numB, double numC) {
		double raiz[] = new double[2];
		
		raiz[0]=((-numB)+Math.sqrt(calcDelta(numA, numB, numC)))/(2*numA);
		raiz[1]=((-numB)-Math.sqrt(calcDelta(numA, numB, numC)))/(2*numA);
		
		return raiz;
	}
}
