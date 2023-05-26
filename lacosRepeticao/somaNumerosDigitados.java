package lacosRepeticao;
import java.util.Scanner;


public class somaNumerosDigitados {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int num, soma=0;
		
		do {
			System.out.println("Digite o número: ");
			num = ler.nextInt();
			soma = soma + num;
			
		} while (num != 0);
		System.out.println("A soma dos números é " + soma);
	}

}
