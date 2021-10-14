package _02_Req2;

public class Consumidor extends Thread{
	
	public String nombre;
	public Carta carta;
	
	public Consumidor(String nombre, Carta carta) {
		super();
		this.nombre = nombre;
		this.carta = carta;
	}

	public void run(){
		for(int i = 0;i<=10;i++){
			String correo = carta.getCarta();
			System.out.println(nombre + " ha enviado el correo " + correo);
		}
	}
}
