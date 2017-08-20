/*Nome do programador: Henrique Rufino
 *Data de elaboração: 10/08/2017;
 * Objetivo:Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde: Casa:  1 2 3 4 ... 64 Qte: 1 2 4 8 ... N 
 */

public class Ex39 {

	public static void main(String[] args) {
		
		int quantidade = 1;
		
		for (int casa = 2; casa <= 64; casa++) {
			quantidade = quantidade + quantidade;
		}
		System.out.println(quantidade);
	}

}
