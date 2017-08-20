package Modularizado;

import javax.swing.JOptionPane;

public class Ex27Mod {
	static double numVoltas, metros, tempo, velocidade;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numVoltas = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de voltas:"));
		metros = Double.parseDouble(JOptionPane.showInputDialog("Digite os metros:"));
		tempo = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo:"));
		calcVelocidade();
		System.out.println("Velocidade media = " + velocidade);
	
	}

	public static void calcVelocidade() {
		velocidade = ( (metros * numVoltas) / 1000) / (tempo / 60);
	}
}
