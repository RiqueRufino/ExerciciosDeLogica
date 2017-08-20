/*Nome do programador: Henrique Rufino
 *Data de elaboração: 10/08/2017;
 * Objetivo:Receba a data de nascimento e atual em ano, mês e dia. Calcule e mostre a idade em anos, meses e dias, considerando os anos bissextos.
 */

import javax.swing.JOptionPane;

public class Ex30 {

	public static void main(String[] args) {
		
		int diaNasc, mesNasc, anoNasc, diaAtual, mesAtual, anoAtual, idadeDia, idadeMes, idadeAno, qtdDias;
		
		diaNasc=Integer.parseInt(JOptionPane.showInputDialog("Digite o dia de nascimento:"));
		mesNasc=Integer.parseInt(JOptionPane.showInputDialog("Digite o mes de anascimento:"));
		anoNasc=Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento:"));
		diaAtual=Integer.parseInt(JOptionPane.showInputDialog("Digite o dia atual:"));
		mesAtual=Integer.parseInt(JOptionPane.showInputDialog("Digite o mes atual:"));
		anoAtual=Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual:"));
		
		idadeAno = anoAtual - anoNasc;
		idadeMes = mesAtual - mesNasc;
		
		if(idadeMes < 0) {
			idadeAno = idadeAno - 1;
			idadeMes = idadeMes + 12;
		}
		idadeDia = diaAtual - diaNasc;
		
		if(idadeDia < 0) {
			idadeMes = idadeMes - 1;
			
			if(idadeMes < 0) {
				idadeAno = idadeAno - 1;
				idadeMes = idadeMes + 12;
			}
			
			if(anoAtual % 4 == 0 && idadeMes == 2){
				qtdDias=29;
			}
			else {
				if(idadeMes == 2) {
					qtdDias = 28;
				}
				else {
					if(idadeMes == 4 || idadeMes == 6 || idadeMes == 9 || idadeMes == 11){
						qtdDias = 30;
					}
					else {
						qtdDias = 31;
					}
				}
			}
			
			idadeDia = idadeDia + qtdDias;
		}
		System.out.println(idadeAno+" ano(s), "+idadeMes+" mes(es), "+idadeDia+" dia(s)");
	}

}
