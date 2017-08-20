/*Nome do Programador: Henrique Rufino
 *Data de Elaboração: 14/08/2017;
 *Objetivo: Receba 2 números inteiros. Verifique e mostre todos os números primos existentes entre eles. 
 */

import javax.swing.JOptionPane;

public class Ex40 {

	public static void main(String[] args) {
		
		int numUm, numDois, inicio, fim, contador = 0;
		
		numUm = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
		numDois = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
		
		if(numUm < numDois) {
			inicio = numUm;
			fim = numDois;
		}
		else {
			inicio = numDois;
			fim = numUm;
		}
		
		for(int i = inicio; i <= fim; i++){
			for(int i2 = 1; i2 <= i; i2++){
				 if(i % i2 == 0) {
					 contador += 1;
				 }
			}
			if(contador == 2) {
				System.out.println(i);
			}
			contador = 0;
		}
	}

}
