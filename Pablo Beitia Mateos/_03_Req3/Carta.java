package _03_Req3;

import java.util.LinkedList;
import java.util.Queue;

public class Carta {
	public final static int MAX_ELEMENTOS = 5;
	
	private Queue<String> carta = new LinkedList<>();
	
	public synchronized void addCarta(String email) {
		if(email.contains("pikachu@gmail.com")) {
			System.out.println("NO SE PUEDEN ENVIAR MAILS A PIKACHU");
		}else {
			try {
				Thread.sleep(500);
				while(carta.size() == MAX_ELEMENTOS) {
					try {
						wait();
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
				carta.offer(email);
				notify();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public synchronized String getCarta() {
		while(carta.size() == 0) {
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		String s = carta.poll();
		
		notify();
		return s;
	}
}
