package lacoCondicional;

import java.util.Scanner;

public class ExemploIfElse {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		
		// Variáveis
		float nota1, nota2, media;
		
		// Entrada de Dados
		System.out.println("Digite a primeira nota: ");
		nota1 = e.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = e.nextFloat();
		
		// Processamento
		media = (nota1 + nota2) / 2;
		
		if(media >= 6) {
			System.out.println("Parabéns, pessoa participante aprovada!");
		}
		else {
			System.out.println("Infelizmente, pessoa participante reprovada!");
		}

	}

}
