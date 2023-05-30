package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arrayList {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ArrayList<Double> notas = new ArrayList<Double>();

		Double num = 0.0;
		notas.add(num);

		for (int num2 = 0; num2 <= 5; num2++) {
			System.out.println("Digite números positivos: ");
			num = ler.nextDouble();
			notas.add(num);

		}
		// mostra na tela todas as notas adicionadas
		// observe que a nota dupllcada foi adicionado duas vezes
		System.out.println("\nNotas cadastradas: " + notas);

		// mostra a posição (indice) de uma determinada nota
		// caso exista 2 notas iguais sera exibido a primeira nota encontrada
		System.out.println("\nA posição da nota 5 é: " + notas.indexOf(5d));

		Collections.sort(notas);
		// for modelo slim
		for (Double nota : notas) {
			System.out.println(nota);
		}

	}

}
