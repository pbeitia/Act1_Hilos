package _01_Req1;

public class Primo {
	
	public static synchronized void comprobar(long numero, boolean primo){
		if(numero < 2) {
			primo = false;
		}else {
			for(long i=2;i<numero;i++) {
		        if(numero%i==0)
		            primo = false;
		    }
		}
		
		try {
			if(primo == true) {
				System.out.println("Ha procesado el número " + numero + " en el hilo " + Thread.currentThread().getName() + " y es PRIMO ");
				
			}else {
				System.out.println("Ha procesado el número " + numero + " en el hilo " + Thread.currentThread().getName() + " y NO es PRIMO ");
			}
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
