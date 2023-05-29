package vatoresMatrizes;


public class vetor {

	public static void main(String[] args) {
		
		String vetorCachorros [] = {"Boxer", "Pinscher", "Husky", "Corgi"};
		
		/* System.out.println("1º Casa: " + vetorCachorros[0]);
		System.out.println("2º Casa: " + vetorCachorros[1]);
		System.out.println("3º Casa: " + vetorCachorros[2]);
		System.out.println("4º Casa: " + vetorCachorros[3]);
		System.out.println("5º Casa: " + vetorCachorros[4]);
		*/
		
		for(int numero = 0; numero < vetorCachorros.length; numero ++) {
			System.out.println((numero + 1) + "º Casa: " + vetorCachorros[numero]);

		}
		
		System.out.println("O tamanho do vetor é " + vetorCachorros.length);

	}

}
