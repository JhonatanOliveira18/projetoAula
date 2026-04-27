package entradaSaida;

import java.util.Scanner; //Importando a classe Scanner para dentro da minha Classe

public class AulaScanner {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		
		String nome;
		
		// Entrada de dados
		System.out.println("Digite o seu nome: ");
		
		// Processamento
		nome = e.nextLine();
		
		e.close();
		
		// Saída de dados
		System.out.println("Bom dia, " + nome); //Concatenando
	}

}
