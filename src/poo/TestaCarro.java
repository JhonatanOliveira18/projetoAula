package poo;

public class TestaCarro {

	public static void main(String[] args) {
		
		// Instanciamento | Instanciar um objeto
		Carro c1 = new Carro("Kombi", 4, 4, "Modelo XYZ");
		
		c1.locomover();
		
		System.out.println("Marca: " + c1.getMarca());
		System.out.println("Qtd. Portas " + c1.getPortas());
		System.out.println(c1.parar());
	}

}
