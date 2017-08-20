package Modularizado;

public class Ex31Mod {
	static int quadrado;
	public static void main(String[] args) {
	 calcQuadrado();
		
	}
	
	static void calcQuadrado() {
		for(int i = 10; i <= 150; i++) {
			quadrado = i * i;
			System.out.println(quadrado);
		}
	}

}
