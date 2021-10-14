package actividad1_req1;

public class Principal {

	public static void main(String[] args) {

		Primos numero = new Primos("Numero 1");
		Primos numero1 = new Primos("Numero 2");
		Primos numero2 = new Primos("Numero 3");
		Primos numero3 = new Primos("Numero 4");

		numero.pedirNumero();
		numero1.pedirNumero();
		numero2.pedirNumero();
		numero3.pedirNumero();

		numero.start();
		numero1.start();
		numero2.start();
		numero3.start();
	}
}
