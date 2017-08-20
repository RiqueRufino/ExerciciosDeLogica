/*Nome do programador: Henrique Rufino
 *Data de elaboração: 10/08/2017;
 * Objetivo:Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde: Casa:  1 2 3 4 ... 64 Qte: 1 2 4 8 ... N 
 */

package Modularizado;

public class Ex39Mod {
	
	public static void main (String [] args) {
		
		System.out.println(calcGraos());
	}
	
	public static int calcGraos() {
		int quantidade = 1;
		
		for (int casa = 2; casa <= 64; casa++) {
			quantidade = quantidade + quantidade;
		}
		
		return quantidade;
	}
}
