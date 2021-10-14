package _02_Req2;

import java.util.LinkedList;
import java.util.Queue;

public class Carta {
	public final static int MAX_ELEMENTOS = 5;
	
	private Queue<String> carta = new LinkedList<>();
	
	public synchronized void addCarta(String email) {
		
			while(carta.size() == MAX_ELEMENTOS) {
				try {
					Thread.sleep(5000);
					wait();
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			carta.offer(email);
			notify();
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
