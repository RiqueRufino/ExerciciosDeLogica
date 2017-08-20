/* Nome do Programador: Henrique Rufino
 * Data da Elaboração: 04/08/2017
 * Objetivo: Receba 2 números reais. Calcule e mostre a diferença desses valores.  
 */

import javax.swing.JOptionPane;

public class Ex10 {

	public static void main(String[] args) {
		
		double numUm, numDois, resultado;
		
		numUm = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor:"));
		numDois = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));
		resultado = numUm - numDois;
		if(resultado < 0) {
			resultado = resultado * (-1);
		}
		System.out.println("Resultado: " + resultado);
	}

}
