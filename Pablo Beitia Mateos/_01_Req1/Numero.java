package _01_Req1;

public class Numero implements Runnable {
	private long num;
	private boolean primo;
	
	public Numero(long num, boolean primo) {
		this.num = num;
		this.primo = primo;
	}
	
	@Override
	public void run() {
		long tiempoprincipal = System.currentTimeMillis();
		System.out.println("Arrancando hilo: " + Thread.currentThread().getName());
		long tiempoFinal = System.currentTimeMillis();
		Primo.comprobar(num,primo);
	}
}
