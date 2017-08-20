package Modularizado;

import javax.swing.JOptionPane;

public class Ex29Mod {
	static double valorInv, valorCor;
	static int tipoInv;
	
	public static void main(String[] args) {
	
		tipoInv = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 ou 2 para o tipode de investimento:"));
		valorInv = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do investimento:"));
		investimento();
	}
	
	static void investimento(){
		switch (tipoInv) {
		case 1:
			valorCor=valorInv*1.03;
			System.out.println(valorCor);
			break;
		case 2:
			valorCor=valorInv*1.05;
			System.out.println(valorCor);
			break;
		default:
			System.out.println("Invalido.");
			break;
		}
	}

}
