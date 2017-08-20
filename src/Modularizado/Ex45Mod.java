/*Nome do Programador: Henrique Rufino
 *Data de Elabora��o: 14/08/2017;
 *Objetivo:Calcule e mostre a s�rie 1 � 2/4 + 3/9 � 4/16 + 5/25 + ... + 15/225 
 */

package Modularizado;

public class Ex45Mod {

	public static void main(String[] args) {
		double resultado = calcSerie();
		
		System.out.println(resultado);
	}

	public static double calcSerie() {
		double resultado = 1.0;
		int divAnterior = 1, numImpar = 3;
		
		for(int i = 2; i <= 15; i++) {
			if( i % 2 == 0) {
				resultado -= i / (divAnterior + numImpar);
			}
			else {
				resultado += i / (divAnterior + numImpar);		
			}
			divAnterior += numImpar;
			numImpar += 2;
		}
		
		return resultado;
	}
}
