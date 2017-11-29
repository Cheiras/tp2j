package excepciones;

public class CaibleNoComprableException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CaibleNoComprableException(String mensaje) {
		
		System.out.println(mensaje);
		
	}
}
