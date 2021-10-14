package actividad1_Req2;

public class ConsumidorEmail extends Thread {

	private String nombre;
	private Email email;
	private BufferEmail buffer;

	public ConsumidorEmail(String nombre, BufferEmail buffer) {
		super();
		this.nombre = nombre;
		this.buffer = buffer;
	}

	public void run() {

		while (true) {

			email = buffer.getEmail();
			System.out.println(nombre + " -> " + email.toString() + "\n");
		}
	}

}
