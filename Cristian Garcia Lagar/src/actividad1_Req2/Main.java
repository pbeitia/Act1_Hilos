package actividad1_Req2;

public class Main {

	public static void main(String[] args) {

		BufferEmail buffer = new BufferEmail();

		ProductorEmail productor1 = new ProductorEmail("Productor 1", buffer);
		ProductorEmail productor2 = new ProductorEmail("Productor 2", buffer);
		ProductorEmail productor3 = new ProductorEmail("Productor 3", buffer);

		ConsumidorEmail consumidor1 = new ConsumidorEmail("Consumidor 1", buffer);
		ConsumidorEmail consumidor2 = new ConsumidorEmail("Consumidor 2", buffer);

		productor1.start();
		productor2.start();
		productor3.start();

		consumidor1.start();
		consumidor2.start();
	}

}
