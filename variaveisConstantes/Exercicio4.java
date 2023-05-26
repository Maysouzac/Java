package variaveisConstantes;
import java.util.Scanner;


public class Exercicio4 {

	public static void main(String[] args) {
		float n1, n2, n3, n4, diferenca;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o primeiro numero: ");
		n1 = leia.nextFloat();
		
		System.out.println("Digite o segundo numero: ");
		n2 = leia.nextFloat();
		
		System.out.println("Digite o terceiro numero: ");
		n3 = leia.nextFloat();
		
		System.out.println("Digite o quarto numero: ");
		n4 = leia.nextFloat();
		
		diferenca = (n1 * n2) - (n3 * n4);
		
		System.out.printf("A diferença é " + "%.1f", diferenca);
	}

}
