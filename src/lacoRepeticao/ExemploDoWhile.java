package lacoRepeticao;

import java.util.Scanner;

public class ExemploDoWhile {

	public static void main(String[] args) {
		
		// Variaveis
		int numero, resultado, contador = 3;
		
		// Scanner
		Scanner leia = new Scanner(System.in);
		
		//Laço de repetição DO-WHILE
		do {
			
			System.out.println("\nDigite um número inteiro: ");
			numero = leia.nextInt();
			resultado = numero * 5;
			System.out.println("\nO resultado da multiplicação é: " + resultado);
			
		}while(contador <= 2);
		
		leia.close();
	}

}
