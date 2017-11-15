package Excepciones;

public class MontoInsuficiente extends RuntimeException {
	
	public	MontoInsuficiente(String mensaje) {
		System.out.println(mensaje);
	}

}
