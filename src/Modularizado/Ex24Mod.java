package Modularizado;

import javax.swing.JOptionPane;

public class Ex24Mod {
	static int valor;
	static String texto;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		valor=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor:"));
		valorDivisivel();
		System.out.println(texto);
	}
	
	static void valorDivisivel() {
		if((valor%3==0)&&(valor%2==0)) {
			texto="valor divisivel por 2 e por 3";
		}
		else {
			if(valor%3==0) {
				texto="Valor divisivel por 3";
			}
			else {
				if(valor%2==0) {
					texto="Valor divisivel por 2";
				}
				else {
					texto="Valor não divisivel por 2 nem 3";
				}
			}
		}
	}
}
