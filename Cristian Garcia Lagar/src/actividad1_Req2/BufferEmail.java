package actividad1_Req2;

import java.util.LinkedList;
import java.util.Queue;

public class BufferEmail {

	public final int MAX_EMAIL = 5;
	private Queue<Email> buffer = new LinkedList<>();

	public synchronized void addEmail(Email email) {

		while (buffer.size() == MAX_EMAIL) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		try {
			Thread.sleep(500);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		if (!email.getDestinatario().equals("pikachu@gmail.com")) {
			buffer.offer(email);
		} else {
			System.out.println("Destinatario no valido, mensaje no enviado.");
		}
		notify();
	}

	public synchronized Email getEmail() {
		Email email = null;
		while (buffer.size() == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		email = buffer.poll();
		notify();
		return email;

	}

}
