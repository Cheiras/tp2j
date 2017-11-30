package excepciones;

import vista.VentanaDeAlerta;

public class NumeroDobleEnDadosException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NumeroDobleEnDadosException(String mensaje) {
		VentanaDeAlerta alerta=new VentanaDeAlerta("Error",mensaje);
		alerta.display();
	}

}