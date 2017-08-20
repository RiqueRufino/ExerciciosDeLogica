/*Nome do programador: Henrique Rufino
 *Data de elaboração: 10/08/2017;
 * Objetivo: Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento. Calcule e mostre o valor corrigido em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%. Demais tipos não serão considerados. 
 */

import javax.swing.JOptionPane;

public class Ex29 {

	public static void main(String[] args) {
		
		double valorInv, valorCor;
		int tipoInv;
		
		tipoInv = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 ou 2 para o tipode de investimento:"));
		valorInv = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do investimento:"));
		
		switch (tipoInv) {
		case 1:
			valorCor=valorInv*1.03;
			System.out.println(valorCor);
			break;
		case 2:
			valorCor=valorInv*1.05;
			System.out.println(valorCor);
			break;
		default:
			System.out.println("Invalido.");
			break;
		}
	}

}
