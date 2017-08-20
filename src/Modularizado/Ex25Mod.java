package Modularizado;

import javax.swing.JOptionPane;

public class Ex25Mod {
	static int hrInicial, minInicial, hrFinal, minFinal, durHr, durMin;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		hrInicial=Integer.parseInt(JOptionPane.showInputDialog("Digite a hora inicial:"));
		minInicial=Integer.parseInt(JOptionPane.showInputDialog("Digite o min inicial:"));
		hrFinal=Integer.parseInt(JOptionPane.showInputDialog("Digite a hora final:"));
		minFinal=Integer.parseInt(JOptionPane.showInputDialog("Digite o min final:"));
		calculoHora();
	}
	
	static void calculoHora() {

		if((hrInicial>=0) && (hrInicial<=23) && (minInicial>=0) && (minInicial<=59) && (hrFinal>=0) && (hrFinal<=23) && (minFinal>=0) && (minFinal<=59)) {
			if((hrFinal < hrInicial) && (minFinal < minInicial)) {
				durHr = hrFinal + 23 - hrInicial;
 				durMin = minFinal + 60 - minInicial;
 				System.out.println(durHr+":"+durMin);
			}
			else {
				if((hrFinal > hrInicial) && (minFinal >= minInicial)) {
					durHr = hrFinal - hrInicial;
 					durMin = minFinal - minInicial;
 					System.out.println(durHr+":"+durMin);
				}
				else {
					if((hrFinal > hrInicial) && (minFinal < minInicial)) {
						durHr = hrFinal - 1 - hrInicial;
						durMin = minFinal + 60 - minInicial;
						System.out.println(durHr+":"+durMin);
					}
					else {
						if((hrFinal == hrInicial) && (minFinal == minInicial)) {
							durHr = 24;;
       						durMin = 0; 
       						System.out.println(durHr+":"+durMin);
						}
						else {
							if((hrFinal == hrInicial) && (minFinal < minInicial)) {
								System.out.println("Valores Iválidos.");
							}
							else {
								if((hrFinal == hrInicial) && (minFinal > minInicial)) {
									durHr = 0;
     								durMin = minFinal - minInicial;
     								System.out.println(durHr+":"+durMin);

								}
								else {
									if((hrFinal < hrInicial) && (minFinal >= minInicial)) {
										durHr = hrFinal + 24 - hrInicial;
    									durMin = minFinal - minInicial;
    									System.out.println(durHr+":"+durMin);

									}
								}
							}
						}
					}
				}
			}
		}
		else {
			System.out.println("Invalido");
		}

	}

}
