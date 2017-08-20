/*Nome do programador: Henrique Rufino
 *Data de elaboração: 10/08/2017;
 * Objetivo: Receba um número. Calcule e mostre os resultados da tabuada desse número. 
 */

package Modularizado;

import javax.swing.JOptionPane;

public class Ex34Mod {

	public static void main(String[] args) {

		int num;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));
		System.out.println(tabuada(num));
	}
	
	public static String tabuada(int num) {
		String resultado = "";
		
		for(int i = 1; i <= 10; i++) {
			resultado += i + " X " + num + " = " + i * num + "\n";
		}
		
		return resultado;
	}

}
