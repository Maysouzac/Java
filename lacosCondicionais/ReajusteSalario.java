package lacosCondicionais;

import java.util.Scanner;

public class ReajusteSalario {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		float salarioBase, salarioLiquido, reajuste;
		int cargo;
		String colaborador;
		
		
		System.out.println("Lista de Cargo:");
		System.out.println("\n1 - Gerente \n2 - Vendedor \n3 - Supervisor \n4 - Motorista \n5 - Estoquista \n6 - Técnico de TI");
		System.out.println("Digite o código do colaborador: ");
		cargo = ler.nextInt();
		System.out.println("Digite o nome do colaborador: ");
		colaborador = ler.next ();
		
		switch (cargo) {
		
		case 1:
			System.out.println("Cargo: GERENTE " + "Nome: " + colaborador);
			System.out.printf("Digite o salario: ");
			salarioBase = ler.nextFloat();
			reajuste = 0.1f;			
			salarioLiquido = (salarioBase + (salarioBase*reajuste));
			System.out.printf("Salario Liquido: %.2f" , salarioLiquido);
			
			break;
			
		case 2:
			System.out.println("Cargo: VENDEDOR " + "Nome: " + colaborador);
			System.out.printf("Digite o salario: ");
			salarioBase = ler.nextFloat();
			reajuste = 0.07f;			
			salarioLiquido = (salarioBase + (salarioBase*reajuste));
			System.out.printf("Salario Liquido: %.2f" , salarioLiquido);
			
			break;
			
		case 3:
			System.out.println("Cargo: SUPERVISOR " + "Nome: " + colaborador);
			System.out.printf("Digite o salario: ");
			salarioBase = ler.nextFloat();
			reajuste = 0.09f;			
			salarioLiquido = (salarioBase + (salarioBase*reajuste));
			System.out.printf("Salario Liquido: %.2f" , salarioLiquido);
			
			break;
			
		case 4:
			System.out.println("Cargo: MOTORISTA " + "Nome: " + colaborador);
			System.out.printf("Digite o salario: ");
			salarioBase = ler.nextFloat();
			reajuste = 0.06f;			
			salarioLiquido = (salarioBase + (salarioBase*reajuste));
			System.out.printf("Salario Liquido: %.2f" , salarioLiquido);
			
			break;
			
		case 5:
			System.out.println("Cargo: ESTOQUISTA " + "Nome: " + colaborador);
			System.out.printf("Digite o salario: ");
			salarioBase = ler.nextFloat();
			reajuste = 0.05f;			
			salarioLiquido = (salarioBase + (salarioBase*reajuste));
			System.out.printf("Salario Liquido: %.2f" , salarioLiquido);
			
			break;
			
		case 6:
			System.out.println("Cargo: TÉCNICO DE T.I. " + "Nome: " + colaborador);
			System.out.printf("Digite o salario: ");
			salarioBase = ler.nextFloat();
			reajuste = 0.08f;			
			salarioLiquido = (salarioBase + (salarioBase*reajuste));
			System.out.printf("Salario Liquido: %.2f" , salarioLiquido);
			
			break;

		}
		

	}

}
