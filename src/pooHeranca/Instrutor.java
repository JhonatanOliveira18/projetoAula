package pooHeranca;

public class Instrutor extends Pessoa {

	// Atributos
	private String especialidade;

	// Construtor
	public Instrutor(String nome, int idade, String email, String especialidade) {
		super(nome, idade, email);
		this.especialidade = especialidade;
	}

	
	// Getters e Setters
	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
}
