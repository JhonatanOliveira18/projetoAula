package vetor;

public class ExemploVetor {

	public static void main(String[] args) {
		
	/* Vetores só aceitam informações de uma única tipagem
	Array é uma estrutura de dados baseada em índice, cada elemento presente é referenciado por um índice.
	Iniciando do indice 0. Estrutura de valor fixo.
	Vetores ou Arrays Unidimencionais permitem acessar uma grande quantidade de dados em memória
	utilizando somente uma única variável, então eu tenho acesso a varias posições 
	(os índices de diferentes valores) de maneira controlada.
	Os vetores servem para solucionar o problema das variáveis que só podem guardar um dado por vez.
	*/
		
		//Tipagem + Nome vetor []
		String vetorCachorros[] = {"Boxer", "Pastor","Pinchers","Husky","Corgi" };
		
		for(int i = 0; i < 5; i++) {
			System.out.println((i + 1) + "° elemento: " + vetorCachorros[i]);
		}
		

	}

}
