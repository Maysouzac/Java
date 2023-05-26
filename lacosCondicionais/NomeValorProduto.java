package lacosCondicionais;

import java.util.Scanner;

public class NomeValorProduto {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int num, quantidade, valor, valorTotal;
		
		System.out.println("Cardapio");
		System.out.println("\n1 - Cachorro quente \n2 - X-Salada \n3 - X-Bacon \n4 - Bauru \n5 - Refrigerante \n6 - Suco de Laranja");
		System.out.println("Digite o código do seu pedido: ");
		num = ler.nextInt();
		
		System.out.println("Digite a quantidade: ");
		quantidade = ler.nextInt();
		
			switch (num) {
			
			case 1:
				System.out.println("Chachorro quente");
				valor = 10;
				valorTotal = (valor*quantidade);
				System.out.println("Valor total: " + valorTotal);
				break;
				
			case 2:
				System.out.println("X-Salada");
				valor = 15;
				valorTotal = (valor*quantidade);
				System.out.println("Valor total: " + valorTotal);
				break;
				
			case 3:
				System.out.println("X-Bacon");
				valor = 18;
				valorTotal = (valor*quantidade);
				System.out.println("Valor total: " + valorTotal);
				break;
			
			case 4:
				System.out.println("Bauru");
				valor = 12;
				valorTotal = (valor*quantidade);
				System.out.println("Valor total: " + valorTotal);
				break;	
				
			case 5:
				System.out.println("Refrigerante");
				valor = 8;
				valorTotal = (valor*quantidade);
				System.out.println("Valor total: " + valorTotal);
				break;	
				
			case 6:
				System.out.println("Suco de laranja");
				valor = 13;
				valorTotal = (valor*quantidade);
				System.out.println("Valor total: " + valorTotal);
				break;	
			}
	}

}
