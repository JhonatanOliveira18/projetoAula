package lacoCondicional;

import java.util.Scanner;

public class ExemploIf {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite sua idade: ");
		idade = e.nextInt();
		
		if(idade < 18) {
			System.out.println("Você não pode dirigir.");
		}
		

	}

}
