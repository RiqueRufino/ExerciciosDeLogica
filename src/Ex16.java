/* Nome do Programador: Henrique Rufino
 * Data da Elabora��o: 04/08/2017
 * Objetivo:Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o n�mero de descendentes. Calcule o sal�rio que ser�o as horas trabalhadas x o valor por hora. Calcule o sal�rio l�quido (= Sal�rio Bruto � desconto). A cada dependente ser� acrescido R$ 100 no Sal�rio L�quido. Exiba o sal�rio a receber. 
 */

import javax.swing.JOptionPane;

public class Ex16 {

	public static void main(String[] args) {
		
		int hrsTrab,numDep;
		double valorHr, porcDesc, liquido;
		
		hrsTrab = Integer.parseInt(JOptionPane.showInputDialog("Digite a(s) hora(s) trabalhada(s):"));
		valorHr = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da hora trabalhada:"));
		porcDesc = Double.parseDouble(JOptionPane.showInputDialog("Digite a porcentagem do desconto:"));
		numDep = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero dedependentes:"));
		
		liquido = (hrsTrab * valorHr) - ( (hrsTrab * valorHr) * porcDesc / 100) + (numDep * 100);
		System.out.println("Sal�rio liqu�do=" + liquido);
	}

}
