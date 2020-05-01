package entidades;

import java.util.Scanner;

public class MatrizTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ordem = sc.nextInt();
		int negativo = 0;
		int[][] matriz = new int[ordem][ordem];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
				if (matriz[i][j] < 0) {
					negativo++;
				}
			}
		}
		System.out.println("Diagonal principal:");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print(matriz[i][i] + " ");
		}

		System.out.println("\nNúmeros negativos = " + negativo);
		sc.close();
	}

}
