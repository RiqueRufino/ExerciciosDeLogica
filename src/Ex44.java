/*Nome do programador: Henrique Rufino
 *Data de Elabora��o: 14/08/2017;
 *Objetivo: Receba o n�mero da base e do expoente. Calcule e mostre o valor da pot�ncia. 
 */

import javax.swing.JOptionPane;

public class Ex44 {

	public static void main(String[] args) {
		
		int base, expoente, resultado = 1;
		
		base=Integer.parseInt(JOptionPane.showInputDialog("Digite a base:"));
		expoente=Integer.parseInt(JOptionPane.showInputDialog("Digite o expoente:"));
		
		for(int i = 1; i <= expoente; i++) {
			resultado = resultado * base;
		}
		System.out.println(resultado);
	}

}
