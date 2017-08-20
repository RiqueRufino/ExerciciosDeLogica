/* Nome do Programador: Henrique Rufino
 * Data da Elaboração: 04/08/2017
 * Objetivo: Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3. 
 */

import javax.swing.JOptionPane;

public class Ex24 {

	public static void main(String[] args) {
		
		int valor;
		
		valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor:"));
		if(valor % 3 ==0 && valor % 2 == 0) {
			System.out.println("valor divisivel por 2 e por 3");
		}
		else {
			if(valor % 3 == 0) {
				System.out.println("Valor divisivel por 3");
			}
			else {
				if(valor % 2 == 0) {
					System.out.println("Valor divisivel por 2");
				}
				else {
					System.out.println("Valor não divisivel por 2 nem 3");
				}
			}
		}
	}

}
