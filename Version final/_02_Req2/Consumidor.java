/**
 * Clase consumidor que hereda de la clase Thread. Se encarga de enviar los correos llamando al m�todo getCarta().
 * @author PBeitia
 */
package _02_Req2;

public class Consumidor extends Thread{
	
	//Declaro las variables que forman la clase.
	public String nombre;
	public Carta carta;
	
	//Constructor completo
	public Consumidor(String nombre, Carta carta) {
		super();
		this.nombre = nombre;
		this.carta = carta;
	}
	
	//M�todo run que se ejecutar� y enviar� un m�ximo de 10 correos por hilo.
	public void run(){
		for(int i = 0;i<=10;i++){
			String correo = carta.getCarta();
			System.out.println(nombre + " ha enviado el correo " + correo);
		}
	}
}
