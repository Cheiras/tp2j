package excepciones;

public class ConstruccionException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ConstruccionException(String mensaje) {
		System.out.println(mensaje);
	}
	
}
