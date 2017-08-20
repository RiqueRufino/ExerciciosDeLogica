/* Nome do Programador: Henrique Rufino
* Data da Elaboração: 04/08/2017 
* Objetivo: Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética.
* Mostre a mensagem de acordo com a média: a. Se a média for >= 6,0 exibir “APROVADO”;
* b. Se a média for >= 3,0 ou < 6,0 exibir “EXAME”; c. Se a média for < 3,0 exibir “RETIDO”. 
*/

package Modularizado;

import javax.swing.JOptionPane;

public class Ex21Mod {
	
	public static void main(String[] args) {
		double media;
		double[] nota = new double[4];
		
		lerNota(nota);
		
		media = calcMedia(nota);
		
		System.out.println(situacaoAluno(media));
	}
	
	public static void lerNota(double[] nota) {
		for(int i = 0; i < nota.length; i++) {
			nota[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a "+ (i + 1) +"ª nota:"));
		}
	}
	
	public static double calcMedia (double[] nota){
		double media;
		int somaNotas = 0;
		
		for(int i = 0; i < nota.length;i++) {
			somaNotas += nota[i];
		}
	
		media = somaNotas / nota.length;
		
		return media;
	}
	
	public static String situacaoAluno(double media) {
		if(media < 3) {
			return "RETIDO";
		} 
		else {
			if(media < 6) {
				return "EXAME";
			} 
			else {
				return "APROVADO";
			}
		}
	}
}
