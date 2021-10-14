package actividad1_Req2;

public class TextoAleatorio {

	public static String obtenerTextoAleatorio() {
		String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		String cadenaAleatoria = "";
		int aleatorio;
		char caracter;

		for (int i = 0; i < 4; i++) {

			aleatorio = (int) (Math.random() * caracteres.length() - 1);
			caracter = caracteres.charAt(aleatorio);
			cadenaAleatoria += caracter;
		}
		return cadenaAleatoria;

	}
}
