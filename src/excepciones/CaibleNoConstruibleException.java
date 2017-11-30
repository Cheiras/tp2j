package excepciones;

import vista.VentanaDeAlerta;

public class CaibleNoConstruibleException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CaibleNoConstruibleException(String mensaje) {
		
		VentanaDeAlerta alerta=new VentanaDeAlerta("Error",mensaje);
		alerta.display();
		
	}
}
