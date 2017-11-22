package excepciones;

public class JugadorEnBancarrotaException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JugadorEnBancarrotaException(String mensaje) {
		System.out.println(mensaje);
	}

}
