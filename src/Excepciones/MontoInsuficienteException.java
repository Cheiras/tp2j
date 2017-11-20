package Excepciones;

public class MontoInsuficienteException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public	MontoInsuficienteException(String mensaje) {
		System.out.println(mensaje);
	}

}
