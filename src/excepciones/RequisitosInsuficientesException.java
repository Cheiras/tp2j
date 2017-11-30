package excepciones;

import vista.VentanaDeAlerta;

public class RequisitosInsuficientesException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RequisitosInsuficientesException(String mensaje) {
		VentanaDeAlerta alerta=new VentanaDeAlerta("Error",mensaje);
		alerta.display();
	}

}
