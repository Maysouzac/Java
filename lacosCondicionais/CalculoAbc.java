package lacosCondicionais;

import java.util.Scanner;

public class CalculoAbc {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int a, b, c;

		System.out.println("Digite um número: ");
		a = ler.nextInt();

		System.out.println("Digite um número: ");
		b = ler.nextInt();

		System.out.println("Digite um número: ");
		c = ler.nextInt();

		if ((a + b) > c) {
			System.out.println("A Soma de A + B é Maior do que C");
		} else if ((a + b) < c) {
			System.out.println("A Soma de A + B é Menor do que C");
		}

		else {
			System.out.println("A Soma de A + B é Igual a C");

		}

	}
}
