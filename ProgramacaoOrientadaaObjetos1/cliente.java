	/*Atividade 01

Utilizando os conceitos de Classe, Objeto e Métodos, da Programação Orientada a Objetos,
crie a Classe Cliente com os seus respectivos Métodos e Atributos. Na sequência, crie
uma Classe chamada TestaCliente, instancie dois objetos da Classe Cliente e apresente
as informações destes 2 Objetos no console. */


package ProgramacaoOrientadaaObjetos1;

public class cliente {
	
		//atributos da classe
	    private String nome;
	    private String email;
	    private int idade;
	    private String endereco;
	    private String telefone;
	    
	    //construtor da classe
	    public cliente(String nome, String email, int idade, String endereco, String telefone) {
	    	this.nome = nome;
	    	this.email = email;
	    	this.idade = idade;
	    	this.endereco = endereco;
	    	this.telefone = telefone;
	
	    }
	    
	    //Métodos Get e Set da Classe Conta

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public int getIdade() {
	        return idade;
	    }

	    public void setIdade(int idade) {
	        this.idade = idade;
	    }

	    public String getEndereco() {
	        return endereco;
	    }

	    public void setEndereco(String endereco) {
	        this.endereco = endereco;
	    }

	    public String getTelefone() {
	        return telefone;
	    }

	    public void setTelefone(String telefone) {
	        this.telefone = telefone;
	    }

	    // Método visualizar para exibir os atributos

	    public void visualizar() {
	        System.out.println("Nome: " + nome);
	        System.out.println("Email: " + email);
	        System.out.println("Idade: " + idade);
	        System.out.println("Endereço: " + endereco);
	        System.out.println("Telefone: " + telefone);
	        System.out.println("---------------------------");
	    }
	
}