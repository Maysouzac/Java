package collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DetermineOsNumeros {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Set<Integer> setNumeros = new HashSet<Integer>();
		int num;
		
		setNumeros.add(10);
		setNumeros.add(9);
		setNumeros.add(8);
		setNumeros.add(7);
		setNumeros.add(6);
		setNumeros.add(5);
		setNumeros.add(4);
		setNumeros.add(3);
		setNumeros.add(2);
		setNumeros.add(1);
		
		System.out.println("Digite o número que deseja encontrar: ");
		num = ler.nextInt();
		
		if (setNumeros.contains(num)) {
			System.out.println("O número " + num + " foi encontrado.");
		}
		else {
			System.out.println("O número " + num + " não foi encontrado");
		}
		ler.close();
	}

}
