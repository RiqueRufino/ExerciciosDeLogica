/* Nome do Programador: Henrique Rufino
 * Data da Elabora��o: 04/08/2017
 * Objetivo:Receba 3 valores obrigatoriamente em ordem crescente e um 4� valor n�o necessariamente em ordem. Mostre os 4 n�meros em ordem crescente. 
 */

import javax.swing.JOptionPane;

public class Ex23 {

	public static void main(String[] args) {
		
		int numUm, numDois, numTres, numQuatro;
		
		numUm = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
		numDois = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
		numTres = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor"));
		numQuatro = Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto valor"));
		
		if(numQuatro > numTres) {
			System.out.println(numUm + "," + numDois + "," + numTres + "," + numQuatro);
		} 
		else {
			if(numQuatro > numDois) {
				System.out.println(numUm + "," + numDois + "," + numQuatro + "," + numTres);
			} 
			else {
				if(numQuatro > numUm) {
					System.out.println(numUm + "," + numQuatro + "," + numDois + "," + numTres);
				}
				else {
					System.out.println(+numQuatro + "," + numUm + "," + numDois + "," + numTres);
				}
			}
		}
	}

}
