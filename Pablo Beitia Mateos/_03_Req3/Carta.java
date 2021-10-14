/**
 * 
 * Clase Carta que contiene un buffer con un máximo de 5 elementos y no envía el correo si el destinatario es pikachu.
 *
 * @author PBeitia
 *
 */
package _03_Req3;

//Importo las clases necesarias para crear el buffer.
import java.util.LinkedList;
import java.util.Queue;

public class Carta {
	public final static int MAX_ELEMENTOS = 5;
	
	//Queue usa FIFO (First In First Out)
	private Queue<String> carta = new LinkedList<>();
	
	/**
	 * Método encargado de añadir al buffer los correos para luego ser enviados
	 * No añade los correos al buffer si contienen el email de pikachu
	 * @param email Parámetro que contiene el email completo
	 */
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
				//Añado el mail al buffer
				carta.offer(email);
				//Notifico a la clase consumidor que no esté en espera.
				notify();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	/**
	 * Método encargado de enviar el correo del buffer.
	 * @return
	 */
	public synchronized String getCarta() {
		while(carta.size() == 0) {
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		//Lo saca del buffer
		String s = carta.poll();
		
		//Notifico a la clase Productor que no esté en espera.
		notify();
		
		//Devuelve el correo completo
		return s;
	}
}
