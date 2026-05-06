package optional;

import java.util.Optional;

public class ExemploOptional {

	public static void main(String[] args) {
		
		String[] palavras = new String[10];
		
		//palavras[5] = "TURMA";
		
		Optional<String> checaNulo = Optional.ofNullable(palavras[5]);
		
		//checaNulo seria a caixinha que armazena o objeto e verifica se ele é ou não nulo
		
		if(checaNulo.isPresent()) { //Optional, tem um objeto dentro de você? True/False
			String palavra = palavras[5].toLowerCase();
			System.out.println(palavra);
		}else {
			System.out.print("A palavra é nula!");
		}
		
	

	}

}
