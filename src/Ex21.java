/* Nome do Programador: Henrique Rufino
 * Data da Elabora��o: 04/08/2017
 * Objetivo: Receba 4 notas bimestrais de um aluno. Calcule e mostre a m�dia aritm�tica. Mostre a mensagem de acordo com a m�dia: 
a. Se a m�dia for >= 6,0 exibir �APROVADO�; b. Se a m�dia for >= 3,0 ou < 6,0 exibir �EXAME�; c. Se a m�dia for < 3,0 exibir �RETIDO�. 
 */

import javax.swing.JOptionPane;

public class Ex21 {

	public static void main(String[] args) {
		
		double notaUm, notaDois, notaTres, notaQuatro, media;
		
		notaUm = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
		notaDois = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));
		notaTres = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota:"));
		notaQuatro = Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota:"));
		media = (notaUm + notaDois + notaTres + notaQuatro) / 4;
		if(media < 3) {
			System.out.println("RETIDO");
		} else {
			if(media < 6) {
				System.out.println("EXAME");
			} else {
				System.out.println("APROVADO");
			}
		}
	}

}
