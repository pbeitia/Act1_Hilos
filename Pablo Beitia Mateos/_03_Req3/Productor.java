package _03_Req3;

public class Productor extends Thread{

	public String nombre;
	public Carta carta;
	
	
	public Productor(String nombre, Carta carta) {
		super();
		this.nombre = nombre;
		this.carta = carta;
	}


	public void run(){

		GeneradorMails gm = new GeneradorMails();
		for (int i = 1; i<=10 ;i++) {
			Email email = gm.generarEmail();
			System.out.println(nombre + " añade el correo con id: " + email.getId());
			carta.addCarta(email.toString());
		}
	}
}

