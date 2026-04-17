package entradaSaida;

import java.util.Scanner;

public class AulaOperadores {

	public static void main(String[] args) {
		
		// Variáveis
		float celsius, fahrenheit;

		Scanner e = new Scanner(System.in);
		
		// Entrada de dados
		System.out.println("Insira a temperatura em Celsius: ");
		celsius = e.nextFloat();
		
		fahrenheit = celsius * 1.8f + 32;
		
		// Saída de dados
		System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
	}

}
