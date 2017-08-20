package Modularizado;

import javax.swing.JOptionPane;

public class Ex32Mod {
	public static void main(String[] args) {		
		int fatorial = calcFatorial(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor:")));
		System.out.println("fatorial = " + fatorial);
	}
	
	public static int calcFatorial(int num) {
		int fat = 1;
		for(int i = 1; i <= num; i++) {
			fat = fat * i;
		}
		return fat;
	}

}
