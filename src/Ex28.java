/*Nome do programador: Henrique Rufino
 *Data de elabora��o: 10/08/2017;
 * Objetivo: Receba o pre�o atual e a m�dia mensal de um produto. Calcule e mostre o novo pre�o sabendo que: Venda Mensal Pre�o Atual Pre�o Novo < 500 < 30 + 10% >= 500 e < 1000 >= 30 e < 80 +15% >= 1000 >= 80 - 5% Obs.: para outras condi��es, pre�o novo ser� igual ao pre�o atual.
 */

import javax.swing.JOptionPane;

public class Ex28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vendaMensal;
		double precoAtual, precoNovo;

		vendaMensal = Integer.parseInt(JOptionPane.showInputDialog("Digite a venda mensal:"));
		precoAtual = Double.parseDouble(JOptionPane.showInputDialog("Digite o pre�o atual:"));
		
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
