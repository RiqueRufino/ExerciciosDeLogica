/* Nome do Programador: Henrique Rufino
 * Data da Elaboração: 04/08/2017
 * Objetivo: Coletar o valor do lado de um quadrado, calcular sua área e apresentar o resultado. 
 */

import javax.swing.JOptionPane;
public class Ex01 {
	
 public static void main (String args[]) {
	 
	 int lado, area;
	 
	 lado=Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));
	 area = lado * lado;
	 System.out.println("Area =" + area);
 }
}
