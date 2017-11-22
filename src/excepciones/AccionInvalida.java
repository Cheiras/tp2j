package excepciones;

public class AccionInvalida extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AccionInvalida(String mensaje) {
		
		System.out.println(mensaje);
		
	}
}
