package variaveisConstantes;
import java.util.Scanner;


public class Exercicio3 {

	public static void main(String[] args) {
		float salariobruto, horasextras, descontos,adicionalnoturno, salarioliquido;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite seu salário: ");
		salariobruto = leia.nextFloat();
		
		System.out.println("Digite o adicional noturno: ");
		adicionalnoturno = leia.nextFloat();
		
		System.out.println("Digite suas horas extras: ");
		horasextras = leia.nextFloat();
		
		System.out.println("Digite seu desconto: ");
		descontos = leia.nextFloat();
		
		salarioliquido = salariobruto + adicionalnoturno + (horasextras*5) - descontos;
		
		System.out.printf("Sua salário é " + "%.2f", salarioliquido);
		
	}

}
