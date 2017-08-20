/*Nome do programador: Henrique Rufino
 *Data de elaboração: 10/08/2017;
 * Objetivo: Receba um número. Calcule e mostre os resultados da tabuada desse número. 
 */

import javax.swing.JOptionPane;

public class Ex34 {

	public static void main(String[] args) {
		
		int num;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));
		for(int i = 1; i <= 10; i++) {
			System.out.println(i + "X" + num + "=" + i * num);;
		}
	}

}
