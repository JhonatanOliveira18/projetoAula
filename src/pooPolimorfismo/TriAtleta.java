package pooPolimorfismo;

public class TriAtleta extends Pessoa implements ICiclista {
	
	int competicoes;

	public TriAtleta(String nome, int idade, int competicoes) {
		super(nome, idade);
		this.competicoes = competicoes;
	}

	public int getCompeticoes() {
		return competicoes;
	}

	public void setCompeticoes(int competicoes) {
		this.competicoes = competicoes;
	}
	
	
	public void competicoesConcluidas() {
		System.out.println("Competições concluídas: " + this.competicoes);
	}
	//Polimorfismo de SobreCarga (Sobrecarga de Método)
	public void competicoesConcluidas(int num) {
		System.out.println("Competições concluídas: " + num);
	}
	
	//Polimorfismo de Sobrescrita (Sobrescrita de Método)
	public void visualizar() {
		super.visualizar();
		System.out.println("Competições: " + this.competicoes);
	}

	@Override
	public void pedalar() {
		System.out.println("Estou pedalando...");
		
	}
	
	
}
