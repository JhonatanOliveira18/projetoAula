package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplo1 {

	public static void main(String[] args) {
		
		//List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

		//List<Integer> numerosDesordenados = Arrays.asList(6,7,8,1,4,5,9,10,2,3);

		List<String> estados = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas Gerais","Espirito Santo", 
		"São Paulo", "Rio de Janeiro", "Minas Gerais", "São Paulo", "Rio de Janeiro");

		//Stream
		//Criando uma stream chamada estadosEmMaiusculo que recebe estados
		List<String> estadosEmMaiusculo = estados.stream()
				.map(x -> x.toUpperCase()) //Usando lambda. X representa todos os estados e deixa eles em maiusculo (Operação intermediaria -> Processamento)
				.collect(Collectors.toList()); //Operação terminal finalização
		
		List<String> estadosUnicos = estados.stream()
				.distinct()
				.collect(Collectors.toList());
		
		long quantidadeEstados = estados.stream()
				.distinct()
				.count();
				
		
		System.out.println("Estados em Maiúsculo: " + estadosEmMaiusculo);
		System.out.println("Coleção/Dados Inicial: " + estados);
		System.out.println("Estados Unicos: " + estadosUnicos);
		System.out.println("Quantidade de estados: " + quantidadeEstados);
		
	}

}
