package collection2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ordemChegada {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();
		Scanner leia = new Scanner(System.in);
		int num;
		String nome;

		do {
			System.out.println("\n    MENU    ");
			System.out.println("\n1 - Adicionar cliente na fila.");
			System.out.println("\n2 - Listar todos os clientes.");
			System.out.println("\n3 - Retirar clientes da fila.");
			System.out.println("\n0 - sair.");
			System.out.println("\nDigite a opção desejada: ");
			num = leia.nextInt();

			if (num == 1) {
				System.out.println("\nDigite o nome do cliente: ");
				nome = leia.next();
				System.out.println("\nCliente adicionado com sucesso!" + fila.add(nome));
			}
			if (num == 2) {
				System.out.println(fila);
			}
			if (num == 3) {
				if (fila.size() == 0) {
					System.out.println("\nFila vazia.");
				} else {
					System.out.println("\nExcluido com sucesso: " + fila.poll());
				}

			}
		} while (num != 0);

	}

}