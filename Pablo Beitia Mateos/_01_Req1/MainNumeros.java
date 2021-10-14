package _01_Req1;

import java.util.Scanner;

public class MainNumeros {
	
	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Escribe el primer número:");
		Numero n1 = new Numero(leer.nextLong(), true);
		
		System.out.println("Escribe el segundo número:");
		Numero n2 = new Numero(leer.nextInt(), true);
		
		System.out.println("Escribe el tercer número:");
		Numero n3 = new Numero(leer.nextInt(), true);
		
		System.out.println("Escribe el cuarto número:");
		Numero n4 = new Numero(leer.nextInt(), true);
		
		Thread t1 = new Thread(n1);	
		t1.setName("1");
		Thread t2 = new Thread(n2);	
		t2.setName("2");
		Thread t3 = new Thread(n3);	
		t3.setName("3");
		Thread t4 = new Thread(n4);	
		t4.setName("4");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		leer.close();
	}
}
