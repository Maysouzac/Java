package lacosRepeticao;
import java.util.Scanner;


public class While {

    public static void main(String[] args) {

        String continua = "s";
        int numero1, numero2, resultado = 0;
        Scanner leia = new Scanner(System.in);

        while(continua.equals("s")) {
            System.out.println("Digite o primeiro valor: ");
            numero1 = leia.nextInt();

            System.out.println("Digite o segundo valor: ");
            numero2 = leia.nextInt();

            resultado = numero1 + numero2;

            System.out.println("Resultado final: " + resultado);

        System.out.println("Deseja continuar? (s/n)");
        continua = leia.next();

        }

        System.out.println("Fim do programa.");

	}

}
