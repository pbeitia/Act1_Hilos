package _02_Req2;


public class Main {
	public static void main(String[] args) {
		Carta carta = new Carta();
		
		Productor p1 = new Productor("Productor 1",carta);
		Productor p2 = new Productor("Productor 2",carta);
		Productor p3 = new Productor("Productor 3",carta);
		
		Consumidor c1 = new Consumidor("Consumidor 1",carta);
		Consumidor c2 = new Consumidor("Consumidor 2",carta);
		
		p1.start();
		p2.start();
		p3.start();
		
		c1.start();
		c2.start();
	}
}

