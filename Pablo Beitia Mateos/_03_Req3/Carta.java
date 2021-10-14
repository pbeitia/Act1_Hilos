/**
 * 
 * Clase Carta que contiene un buffer con un m�ximo de 5 elementos y no env�a el correo si el destinatario es pikachu.
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
	 * M�todo encargado de a�adir al buffer los correos para luego ser enviados
	 * No a�ade los correos al buffer si contienen el email de pikachu
	 * @param email Par�metro que contiene el email completo
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
				//A�ado el mail al buffer
				carta.offer(email);
				//Notifico a la clase consumidor que no est� en espera.
				notify();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	/**
	 * M�todo encargado de enviar el correo del buffer.
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
		
		//Notifico a la clase Productor que no est� en espera.
		notify();
		
		//Devuelve el correo completo
		return s;
	}
}
