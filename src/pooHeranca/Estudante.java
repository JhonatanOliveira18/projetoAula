package pooHeranca;

public class Estudante extends Pessoa{ //Classe Filha ou Classe Derivada de Pessoa

	// Atributos
	private String matricula;
	private String curso;

	// Construtor
	public Estudante(String nome, int idade, String email, String matricula, String curso) {
		//Indicando pro método construtor da classe filha o método construtor da classe mãe
		super(nome, idade, email); //super => representa a classe mãe, o método construtor da classe mãe
		this.matricula = matricula;
		this.curso = curso;
	}

	
	// Getters e Setters
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
}