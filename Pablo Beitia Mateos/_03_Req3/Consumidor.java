package _03_Req3;

public class Consumidor extends Thread{
	
	public String nombre;
	public Carta carta;
	
	public Consumidor(String nombre, Carta carta) {
		super();
		this.nombre = nombre;
		this.carta = carta;
	}

	public void run(){
		while(true) {
			String correo = carta.getCarta();
			System.out.println(nombre + " ha enviado el correo " + correo);
		}
	}
}
