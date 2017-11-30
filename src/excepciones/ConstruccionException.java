package excepciones;

import vista.VentanaDeAlerta;

public class ConstruccionException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ConstruccionException(String mensaje) {
		VentanaDeAlerta alerta=new VentanaDeAlerta("Error",mensaje);
		alerta.display();
	}
	
}
