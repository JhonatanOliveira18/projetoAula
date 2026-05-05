package pooPolimorfismo;

public class TestaClasse {

	public static void main(String[] args) {

		//Pessoa p = new Pessoa("Maria", 18);

		TriAtleta t = new TriAtleta("Lucas", 78, 10);
		
		TriAtleta t2 = new TriAtleta("João", 20, 50);
		
		t2.competicoesConcluidas(20);
		t2.competicoesConcluidas();
		t.visualizar();

	}

}
