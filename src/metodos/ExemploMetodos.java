package metodos;

import java.util.Scanner;

import metodoExterno.ExemploMetodoExterno;

public class ExemploMetodos {

	public static void main(String[] args) {
		
		
		
		Scanner e = new Scanner(System.in);
		
		System.out.println("Insira o primeiro valor da soma: ");
		int num1 = e.nextInt();
		System.out.println("Insira o segundo valor da soma: ");
		int num2 = e.nextInt();
		
		int resultado = somar(num1,num2);
		
		System.out.println("RESULTADO: " + resultado);
		
		mensagem();
		saudacao("Salve salve familia!");
		
		ExemploMetodoExterno.info();
	}
	

	//MÉTODO COM RETORNO E ARGUMENTOS
	
	//modificar de acesso + independencia + tipo de retorno + nome do metodo + (parametros)
	public static int somar(int num1, int num2) { //Assinatura do método
		return num1 + num2;
	}
	
	//MÉTODO SEM RETORNO SEM PARÂMETRO
	public static void mensagem() {
		System.out.println("Esse método não tem retorno (void)");
	}
	
	//MÉTODO SEM RETORNO COM PARÂMETRO
	public static void saudacao(String msg) {
		System.out.println(msg);
	}
}
