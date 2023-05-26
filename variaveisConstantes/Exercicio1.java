package variaveisConstantes;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		float salario, abono, novosalario;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite seu salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite seu abono: ");
		abono = leia.nextFloat();
		
		novosalario =  (salario + abono);
		
		System.out.printf("Novo Salário é " + "%.2f", novosalario);
		
		

	}

}
