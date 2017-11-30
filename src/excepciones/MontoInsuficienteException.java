package excepciones;

import vista.VentanaDeAlerta;

public class MontoInsuficienteException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public	MontoInsuficienteException(String mensaje) {
		VentanaDeAlerta alerta=new VentanaDeAlerta("Error",mensaje);
		alerta.display();
	}

}
