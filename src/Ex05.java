/* Nome do Programador: Henrique Rufino
 * Data da Elabora��o: 04/08/2017
 * Objetivo: Receba os coeficientes A, B e C de uma equa��o do 2� grau (AX�+BX+C=0). Calcule e mostre as ra�zes reais (considerar que a equa��o possue2 ra�zes).  
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
		System.out.println("X�=" + raizUm + " X�=" + raizDois);
	}

}
