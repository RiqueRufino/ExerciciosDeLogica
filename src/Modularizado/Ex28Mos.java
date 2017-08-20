package Modularizado;

import javax.swing.JOptionPane;

public class Ex28Mos {
	static int vendaMensal;
	static double precoAtual, precoNovo;
	public static void main(String[] args) {
		
		vendaMensal = Integer.parseInt(JOptionPane.showInputDialog("Digite a venda mensal:"));
		precoAtual = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço atual:"));
		reajustePreco();		
		System.out.println(precoNovo);
	}
	
	public static void reajustePreco() {
		if(vendaMensal<500 && precoAtual<30) {
			precoNovo=precoAtual*1.1;
		}
		else {
			if(vendaMensal>=500 && vendaMensal<100 && precoAtual>=30 && precoAtual<80) {
				precoNovo=precoAtual*0.95;
			}
			else {
				precoNovo=precoAtual;
			}
		}
	}
}
