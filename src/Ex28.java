/*Nome do programador: Henrique Rufino
 *Data de elaboração: 10/08/2017;
 * Objetivo: Receba o preço atual e a média mensal de um produto. Calcule e mostre o novo preço sabendo que: Venda Mensal Preço Atual Preço Novo < 500 < 30 + 10% >= 500 e < 1000 >= 30 e < 80 +15% >= 1000 >= 80 - 5% Obs.: para outras condições, preço novo será igual ao preço atual.
 */

import javax.swing.JOptionPane;

public class Ex28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vendaMensal;
		double precoAtual, precoNovo;

		vendaMensal = Integer.parseInt(JOptionPane.showInputDialog("Digite a venda mensal:"));
		precoAtual = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço atual:"));
		
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
		System.out.println(precoNovo);
	}

}
