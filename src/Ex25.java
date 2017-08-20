/* Nome do Programador: Henrique Rufino
 * Data da Elaboração: 04/08/2017
 * Objetivo: Receba a hora de início e de final de um jogo (HH,MM) sabendo que o tempo máximo é de 24 horas e pode começar num dia e terminar noutro.  
 */

import javax.swing.JOptionPane;

public class Ex25 {

	public static void main(String[] args) {
		
		int hrInicial, minInicial, hrFinal, minFinal, durHr, durMin;
		
		hrInicial = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora inicial:"));
		minInicial = Integer.parseInt(JOptionPane.showInputDialog("Digite o min inicial:"));
		hrFinal = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora final:"));
		minFinal = Integer.parseInt(JOptionPane.showInputDialog("Digite o min final:"));
		if(hrInicial >= 0 && hrInicial <= 23 && minInicial >= 0 && minInicial <= 59 && hrFinal >= 0 && hrFinal <= 23 && minFinal >= 0 && minFinal <= 59) {
			if(hrFinal < hrInicial && minFinal < minInicial) {
				durHr = hrFinal + 23 - hrInicial;
 				durMin = minFinal + 60 - minInicial;
 				System.out.println(durHr + ":" + durMin);
			}
			else {
				if(hrFinal > hrInicial && minFinal >= minInicial) {
					durHr = hrFinal - hrInicial;
 					durMin = minFinal - minInicial;
 					System.out.println(durHr +":" + durMin);
				}
				else {
					if(hrFinal > hrInicial && minFinal < minInicial) {
						durHr = hrFinal - 1 - hrInicial;
						durMin = minFinal + 60 - minInicial;
						System.out.println(durHr+":"+durMin);
					}
					else {
						if(hrFinal == hrInicial && minFinal == minInicial) {
							durHr = 24;;
       						durMin = 0; 
       						System.out.println(durHr+":"+durMin);
						}
						else {
							if(hrFinal == hrInicial && minFinal < minInicial) {
								System.out.println("Valores Iválidos.");
							}
							else {
								if(hrFinal == hrInicial && minFinal > minInicial) {
									durHr = 0;
     								durMin = minFinal - minInicial;
     								System.out.println(durHr + ":" + durMin);

								}
								else {
									if(hrFinal < hrInicial && minFinal >= minInicial) {
										durHr = hrFinal + 24 - hrInicial;
    									durMin = minFinal - minInicial;
    									System.out.println(durHr + ":" + durMin);

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
