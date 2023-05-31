package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class organizeAsCores {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<String>();
		
		String cor;
		
		for (int num = 0; num <= 4; num++) {
			System.out.println("Digite uma cor: ");
			cor = ler.next();
			cores.add(cor);

		}
		
		System.out.println("\nVocê escolheu as cores: " + cores);

		//collection organizar a lista
		Collections.sort(cores);
		for (String color : cores) {
			System.out.println("Suas cores são: " + color);
		}
		ler.close();
	}

}
