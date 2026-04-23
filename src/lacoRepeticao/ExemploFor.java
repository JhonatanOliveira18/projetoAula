package lacoRepeticao;

import java.util.Scanner;

public class ExemploFor {

	public static void main(String[] args) {
		
		// Variáveis
		String nome;
		
		// Scanner
        Scanner leia = new Scanner(System.in);
        
        // Entrada de dados
        
        for(int i = 1; i < 4; i++) {
        	System.out.println("Digite o " + i + "º nome: ");
            nome = leia.nextLine();
        	System.out.println("O" + i +"º nome é: "  + nome);
        }

        leia.close();
	}

}
