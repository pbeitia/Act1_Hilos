package actividad1_Req2;

public class ProductorEmail extends Thread {

	private String nombre;
	private Email email;
	private BufferEmail buffer;

	public ProductorEmail(String nombre, BufferEmail buffer) {
		super();
		this.nombre = nombre;
		this.buffer = buffer;
	}

	public void generarEmail() {
		email = new Email();
		email.setId(TextoAleatorio.obtenerTextoAleatorio());
		email.setDestinatario(TextoAleatorio.obtenerTextoAleatorio() + "@gmail.com");
		email.setAsunto(TextoAleatorio.obtenerTextoAleatorio());
		email.setRemitente(TextoAleatorio.obtenerTextoAleatorio() + "@gmail.com");
		email.setMensaje(TextoAleatorio.obtenerTextoAleatorio());
	}

	public void run() {

		for (int i = 0; i < 10; i++) {
			generarEmail();
			buffer.addEmail(email);
			System.out.println(nombre + " -> " + " ID Email- " + email.getId() + "\n");
		}
	}

}
