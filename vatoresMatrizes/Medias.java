package vatoresMatrizes;

import java.util.Scanner;

public class Medias {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int[][] matriz = new int[3][3];

		int diagonalPrincipal, diagonalSecundaria;

		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.println("Digite um valor para a posição");
				matriz[linha][coluna] = leia.nextInt();
			}
		}

		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.println(
						"O valor armazenado na posição [" + linha + "][" + coluna + "] é: " + matriz[linha][coluna]);
			}
		}
	}

}
