package excepciones;

public class CaibleNoConstruibleException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CaibleNoConstruibleException(String mensaje) {
		
		System.out.println(mensaje);
		
	}
}
