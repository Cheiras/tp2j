package excepciones;

import vista.VentanaDeAlerta;

public class CaibleNoComprableException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CaibleNoComprableException(String mensaje) {
		
		VentanaDeAlerta alerta=new VentanaDeAlerta("Error",mensaje);
		alerta.display();
		
	}
}
