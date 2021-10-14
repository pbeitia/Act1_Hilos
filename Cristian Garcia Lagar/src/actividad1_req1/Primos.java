package actividad1_req1;

import java.util.Scanner;

/**
 * 
 * @author cristiangarcialagar
 * 
 * Clase primos para calcular numeros primos que hereda de Thread para poder trabajar con hilos en multitarea.
 *
 */

public class Primos extends Thread {
	
	private String nombre;
	private long numero;
	private boolean esPrimo;

	public Primos(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	/**
	 * Este metodo solicita un numero por pantalla
	 * 
	 * @return numero solicitado por pantalla 
	 */
	public long pedirNumero() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		numero = sc.nextLong();
		return numero;
	}
	
	/**+
	 *  Calcula si el numero propiedad del objeto es primo o no.
	 *  
	 * @return true si es primo y false si no lo es.
	 */

	public boolean obtenerPrimo() {

		esPrimo = true;

		if (numero == 0 || numero == 1) {
			esPrimo = false;
			return esPrimo;
		} else {
			for (int j = 2; j < numero - 1; j++) {
				if (numero % j == 0) {
					esPrimo = false;
					break;
				} else {
					esPrimo = true;
				}
			}
			return esPrimo;
		}
	}

	/**
	 * 	Metodo run heredado de Thread que permite la ejecucion del hilo
	 */
	public void run() {
		long tiempoInicio = System.currentTimeMillis();
		esPrimo = obtenerPrimo();
		long tiempoFinal = System.currentTimeMillis();
		long tiempoResultado = tiempoFinal - tiempoInicio;

		if (esPrimo == false) {
			System.out.println("Numero: " + numero + " - nombre hilo: " + nombre + " - tiempo: " + tiempoResultado
					+ " milisegundos " + "- El numero no es primo");
		} else {
			System.out.println("Numero: " + numero + " - nombre hilo: " + nombre + " - tiempo: " + tiempoResultado
					+ " milisegundos " + "- El numero es primo");
		}
	}
}