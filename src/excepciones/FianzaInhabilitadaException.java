package excepciones;

public class FianzaInhabilitadaException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FianzaInhabilitadaException(String mensaje) {
		System.out.println(mensaje);
	}
}
