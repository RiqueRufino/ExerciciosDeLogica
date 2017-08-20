/*Nome do Programador: Henrique Rufino
 *Data de Elaboração: 14/08/2017;
 *Objetivo:Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225 
 */

public class Ex45 {

	public static void main(String[] args) {
		
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
		System.out.println(resultado);
	}

}
