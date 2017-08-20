package Modularizado;

import javax.swing.JOptionPane;

public class Ex22Mod {
	static int numUm, numDois, controle;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		numUm=Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero:"));
		numDois=Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero:"));
		ordemCrescente();
		System.out.println(numUm+", "+numDois);
	}
	static void ordemCrescente(){
		if(numUm>numDois) {
			controle=numUm;
			numUm=numDois;
			numDois=numUm;
		}
	}

}
