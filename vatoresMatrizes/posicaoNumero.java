package vatoresMatrizes;
import java.util.Scanner;

public class posicaoNumero {

	public static void main(String[] args) {

		int[] vetorInteiros = { 7, 1, 8, 10, 3, 6, 2, 5, 4, 9 };
		Scanner leia = new Scanner(System.in);
		int posicao;
		

		System.out.println("\nDigite um número: ");
		posicao = leia.nextInt();
		

		for (int indice = 0; indice < vetorInteiros.length; indice++) {
			if (posicao == vetorInteiros[indice]) {
				System.out.println("O número " + posicao + " esta localizado na posição: " + indice);
				return;

			}
		}


			System.out.println("\nElemento não encontrado!");

	}

}
