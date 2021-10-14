/**
 * Clase encarga de Generar Mails aleatorios basandose en una lista de correos, asuntos, etc.
 * @author PBeitia
 */
package _02_Req2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class GeneradorMails {
	
	//Contructor del Mail que llama a los métodos
	public Email generarEmail() {
		Email email = new Email();
		email.setId(generarId());
		email.setDestinatario(generarDestinatario());
		email.setRemitente(generarRemitente());
		email.setAsunto(generarAsunto());
		email.setCuerpo(generarCuerpo());
		return email;
	}
	
	//Método encargado de generar Id´s para los correos entre 0 y 10000
	public long generarId() {
		int numero = ThreadLocalRandom.current().nextInt(0, 10000);
		return numero;
	}
	
	//Método encargado de generar remitentes
	public String generarRemitente() {
		List<String> listaNombres = new ArrayList<String>();
		
		listaNombres.add("victor@gmail.com");
		listaNombres.add("pedro@gmail.com");
		listaNombres.add("pablo@gmail.com");
		listaNombres.add("beni@gmail.com");
		listaNombres.add("manu@gmail.com");
		listaNombres.add("jose@gmail.com");
		
		//Elige un elemento al azar del ArrayList
		int numero = ThreadLocalRandom.current().nextInt(0, 6);
		
		return listaNombres.get(numero);
	}
	
	//Método encargado de generar Destinatarios
	public String generarDestinatario() {
		List<String> listaNombres = new ArrayList<String>();
		
		listaNombres.add("pikachu@gmail.com");
		listaNombres.add("montse@gmail.com");
		listaNombres.add("sara@gmail.com");
		listaNombres.add("elena@gmail.com");
		listaNombres.add("maria@gmail.com");
		listaNombres.add("patri@gmail.com");
		
		//Elige un elemento al azar del ArrayList
		int numero = ThreadLocalRandom.current().nextInt(0, 6);
		
		return listaNombres.get(numero);
	}
	
	//Método encargado de generar asuntos
	public String generarAsunto() {
		List<String> listaNombres = new ArrayList<String>();
		
		listaNombres.add("Saludo");
		listaNombres.add("Despedida");
		listaNombres.add("Pregunta");
		listaNombres.add("Duda");
		listaNombres.add("Advertencia");
		listaNombres.add("Peligro");
		
		//Elige un elemento al azar del ArrayList
		int numero = ThreadLocalRandom.current().nextInt(0, 6);
		
		return listaNombres.get(numero);
	}
	
	//Método encargado de generar cuerpos de correo
	public String generarCuerpo() {
		List<String> listaNombres = new ArrayList<String>();
		
		listaNombres.add("SDGSDGDGD");
		listaNombres.add("JHKHJKHJK");
		listaNombres.add("CVNVNVBN");
		listaNombres.add("4564564");
		listaNombres.add("WRWERWER");
		listaNombres.add("POPOPOPOPOP");
		
		//Elige un elemento al azar del ArrayList
		int numero = ThreadLocalRandom.current().nextInt(0, 6);
		
		return listaNombres.get(numero);
	}
}
