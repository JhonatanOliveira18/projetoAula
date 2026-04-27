package vetor;

import java.util.Scanner;

public class ExemploVetor2 {

	public static void main(String[] args) {
		// Exemplo de array onde o usuário popula o array
		
		int vetorNumeros[] = new int[3]; //Indicando que esse vetor possui tres posições, 3 indices, 3 casas
		
		Scanner e = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			
			System.out.println("Digite um numero: ");
			vetorNumeros[i] = e.nextInt();
		}
		
		e.close();
		
		for(int i = 0; i < 3; i++) {
			System.out.println((i + 1) + "° elemento do vetor é: " + vetorNumeros[i]);
		}
		
				
	}

}
