package excepciones;

import vista.VentanaDeAlerta;

public class JugadorEnBancarrotaException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JugadorEnBancarrotaException(String mensaje) {
		VentanaDeAlerta alerta=new VentanaDeAlerta("Error",mensaje);
		alerta.display();
	}

}
