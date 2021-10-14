package _02_Req2;

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

/*		try {
			for(int id = 1; id<=10; id++) {
				String correo = nombre + " - " + id;
				carta.addCarta(correo);
				Thread.sleep(5000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/