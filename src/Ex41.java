/*Nome do programador: Henrique Rufino
 *Data de elaboração: 14/08/2017;
 * Objetivo:Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7.
 */

public class Ex41 {

	public static void main(String[] args) {
		
		for(int dadoUm = 1; dadoUm <= 6; dadoUm++) {
			for(int dadoDois = 1; dadoDois <= 6; dadoDois++) {
				if(dadoUm + dadoDois == 7) {
					System.out.println(dadoUm + "+" + dadoDois + "= 7");
				}
			}
		}
	}

}
