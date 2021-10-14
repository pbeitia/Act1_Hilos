/**
 * Clase productor que hereda de la clase Thread. Se encarga de a�adir los correos llamando al m�todo addCarta().
 * @author PBeitia
 */
package _03_Req3;

public class Productor extends Thread{

	//Declaro las variables que forman la clase.
	public String nombre;
	public Carta carta;
	
	//Constructor completo
	public Productor(String nombre, Carta carta) {
		super();
		this.nombre = nombre;
		this.carta = carta;
	}

	//M�todo run que se ejecutar� y a�adir� un m�ximo de 10 correos por hilo.
	public void run(){
		GeneradorMails gm = new GeneradorMails();
		for (int i = 1; i<=10 ;i++) {
			Email email = gm.generarEmail();
			System.out.println(nombre + " a�ade el correo con id: " + email.getId());
			carta.addCarta(email.toString());
		}
	}
}
