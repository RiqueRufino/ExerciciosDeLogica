/*Nome do programador: Henrique Rufino
 *Data de elaboração: 10/08/2017;
 *Objetivo:Receba 100 números inteiros reais. Verifique e mostre o maior e o menos valor. Obs.: somente valores positivos.
 */

import javax.swing.JOptionPane;

public class Ex38 {

	public static void main(String[] args) {
		
		double num, maior, menor;
		
		maior = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor"));
		menor = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor"));
		if(maior < menor) {
			num = maior;
			maior = menor;
			menor = num;
		}
		for(int i = 3; i <= 100; i++) {
			num = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor:"));
			if(num > maior) {
				maior = num;
			}
			else{
				if(num < menor) {
					menor = num;
				}
			}
		}
		System.out.println("Menor=" + menor + ", maior=" + maior);
	}

}
