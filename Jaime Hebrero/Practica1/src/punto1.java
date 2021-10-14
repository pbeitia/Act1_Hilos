
import java.util.Scanner;

public class punto1  extends Thread {
	
	private int numero;
	private boolean esP = true;
	
	public punto1(String nombre) {
		super(nombre);
		this.start();
		
	}
	
	@Override
	public void run() {
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("escribe un numero");
		numero = sc.nextInt();
		
		
		
		if(numero == 0 || numero ==1 ) {
			esP=false;
		}else {
			for(int j=2; j<numero-1;j++) {
				if (numero % j == 0) {
					esP =false;
					break;
				}else {
					esP = true;
				}
			}
		}
		
		
		System.out.println("el nombre del hilo es: " + getName());
		
		
		if (esP == false) {
			System.out.println("El numero " + numero +" no es primo" + "\n"); 
		} else {
			System.out.println("El numero " + numero +" es primo" + "\n"); 
		}
		
		
      
      
	
	}
	
	/*
	public int pedirNumero() {
		Scanner sc= new Scanner(System.in);
		System.out.println("escribe un numero");
		numero = sc.nextInt();
		return numero;	
	}
	
	
	public void conseguirPrimo() {
		
		if(numero == 0 || numero ==1 ) {
			esP=false;
		}else {
			for(int j=2; j<numero-1;j++) {
				if (numero % j == 0) {
					esP =false;
					break;
				}else {
					esP = true;
				}
			}
		}
		
	}
	
	
	public void esPrimo(boolean esP) {
		if (esP == false) {
			System.out.println("El numero " + numero +"no es primo" + "\n"); 
		} else {
			System.out.println("El numero " + numero +"es primo" + "\n"); 
		}
	}
	
	
	

*/
	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public boolean isEsP() {
		return esP;
	}


	public void setEsP(boolean esP) {
		this.esP = esP;
	}
	
	
	
}
