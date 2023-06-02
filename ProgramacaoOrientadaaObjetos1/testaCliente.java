package ProgramacaoOrientadaaObjetos1;

public class testaCliente {

	public static void main(String[] args) {
		// Instanciando dois objetos da classe Cliente
        cliente cliente1 = new cliente("João", "joao@email.com", 30, "Rua A", "11");
        cliente cliente2 = new cliente("Maria", "maria@email.com", 25, "Rua B", "20");

        // Exibindo as informações dos objetos
        cliente1.visualizar();
        cliente2.visualizar();
    }
}