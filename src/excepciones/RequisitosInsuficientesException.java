package excepciones;

public class RequisitosInsuficientesException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RequisitosInsuficientesException(String mensaje) {
		System.out.println(mensaje);
	}

}
