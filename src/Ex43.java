/*Nome do programador: Henrique Rufino
 *Data de elaboração: 14/08/2017;
 *Objetivo: Calcule e mostre quantos anos serão necessários para que Ana seja maior que Maria sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m e cresce 2 cm ao ano. 
 */

public class Ex43 {

	public static void main(String[] args) {
		
		double ana = 1.1, maria = 1.5;
		int contador = 0;
		
		while(ana < maria) {
			contador += 1;
			ana += 0.03;
			maria += 0.02;
		}
		
		System.out.println(contador);
	}

}
