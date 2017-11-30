package excepciones;

import vista.VentanaDeAlerta;

public class AccionInvalida extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AccionInvalida(String mensaje) {
		
		VentanaDeAlerta alerta=new VentanaDeAlerta("Error",mensaje);
		alerta.display();
		
	}
}
