/* Nome do Programador: Henrique Rufino
 * Data da Elaboração: 04/08/2017
 * Objetivo: Receba os coeficientes A, B e C de uma equação do 2º grau (AX²+BX+C=0). Calcule e mostre as raízes reais (considerar que a equação possue2 raízes).  
 */

import javax.swing.JOptionPane;

public class Ex05 {

	
	public static void main(String[] args) {
		
		double numA,numB,numC,raizUm,raizDois,delta;
		
		numA=Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro termo:"));
		numB=Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo termo:"));
		numC=Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro termo:"));
		
		delta= ( numB * numB ) - ( 4 * numA * numC );
		raizUm=( (-numB) + Math.sqrt(delta) ) / 2 * numA;
		raizDois=( (-numB) - Math.sqrt(delta) ) / 2 * numA;
		System.out.println("X¹=" + raizUm + " X²=" + raizDois);
	}

}
