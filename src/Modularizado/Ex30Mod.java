package Modularizado;

import javax.swing.JOptionPane;

public class Ex30Mod {
	static int diaNasc, mesNasc, anoNasc, diaAtual, mesAtual, anoAtual, idadeDia, idadeMes, idadeAno, qtdDias;

	public static void main(String[] args) {
			
		diaNasc=Integer.parseInt(JOptionPane.showInputDialog("Digite o dia de nascimento:"));
		mesNasc=Integer.parseInt(JOptionPane.showInputDialog("Digite o mes de anascimento:"));
		anoNasc=Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento:"));
		diaAtual=Integer.parseInt(JOptionPane.showInputDialog("Digite o dia atual:"));
		mesAtual=Integer.parseInt(JOptionPane.showInputDialog("Digite o mes atual:"));
		anoAtual=Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual:"));
		calcIdade();
		System.out.println(idadeAno+" ano(s), "+idadeMes+" mes(es), "+idadeDia+" dia(s)");

	}
	static void calcIdade() {
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

	}
}
