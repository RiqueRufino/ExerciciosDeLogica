/* Nome do Programador: Henrique Rufino
 * Data da Elaboração: 04/08/2017
 * Objetivo:Receba a quantidade de horas trabalhadas, o valor por hora, 
 * o percentual de desconto e o número de descendentes.Calcule o salário 
 * que serão as horas trabalhadas x o valor por hora. Calcule o salário 
 * líquido (= Salário Bruto – desconto). A cada dependente será acrescido 
 * R$ 100 no Salário Líquido. Exiba o salário a receber. 
 */

package Modularizado;

import javax.swing.JOptionPane;

public class Ex16Mod {
	
	public static void main(String[] args) {
		
		int hrsTrab,numDep;
		double valorHr, porcDesc, salLiquido;
		
		hrsTrab = Integer.parseInt(JOptionPane.showInputDialog("Digite a(s) hora(s) trabalhada(s):"));
		valorHr = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da hora trabalhada:"));
		porcDesc = Double.parseDouble(JOptionPane.showInputDialog("Digite a porcentagem de desconto:"));
		numDep = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de dependente(s):"));
		
		salLiquido = calcSalario(hrsTrab, valorHr, porcDesc, numDep);
		System.out.println("Salário liquído =" + salLiquido);
	}
	
	static double calcSalario(int hrsTrab, double valorHr, double porcDesc, int numDep) {
		double liquido;
		liquido = (hrsTrab * valorHr) - ( (hrsTrab * valorHr) * porcDesc / 100) + (numDep * 100);
		return liquido;
	}
}
