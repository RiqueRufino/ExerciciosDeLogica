/*Nome do Programador: Henrique Rufino
 *Data de Elaboração: 14/08/2017;
 *Objetivo: Receba 2 números inteiros. Verifique e mostre todos os números primos existentes entre eles. 
 */

package Modularizado;

import javax.swing.JOptionPane;

public class Ex40Mod {

	public static void main(String[] args) {
		int numUm, numDois;
		
		numUm = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
		numDois = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
		
		System.out.println(calcPrimos(numUm, numDois));
	}
	
	public static String calcPrimos(int numUm, int numDois) {
		int inicio, fim, contador = 0;
		String resultado = "";
		
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
				resultado += i + "\n";
			}
			contador = 0;
		}
		
		return resultado;
	}

}
