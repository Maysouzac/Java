package collection2;
import java.util.Scanner;
import java.util.Stack;

public class pilhaLivros {

	public static void main(String[] args) {

		Stack<String> pilha = new Stack<String>();
		Scanner leia = new Scanner(System.in);
		int num;
		String livro;

		do {
			System.out.println("\n    MENU    ");
			System.out.println("\n1 - Adicionar livro na pilha.");
			System.out.println("\n2 - Listar todos os livros.");
			System.out.println("\n3 - Retirar livros da pilha.");
			System.out.println("\n0 - sair.");
			System.out.println("\nDigite a opção desejada: ");
			num = leia.nextInt();

			if (num == 1) {
				System.out.println("\nDigite o livro: ");
				livro = leia.next();
				System.out.println("\nLivro adicionado com sucesso!" + pilha.add(livro));
			}
			if (num == 2) {
				System.out.println(pilha);
			}
			if (num == 3) {
				if (pilha.size() == 0) {
					System.out.println("\nPilha vazia!");
				} else {
					System.out.println("\nExcluido com sucesso: " + pilha.pop());
				}

			}
		} while (num != 0);

	}

}