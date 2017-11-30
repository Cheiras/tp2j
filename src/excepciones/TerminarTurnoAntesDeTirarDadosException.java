package excepciones;

import vista.VentanaDeAlerta;

public class TerminarTurnoAntesDeTirarDadosException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TerminarTurnoAntesDeTirarDadosException(String mensaje) {
		
		VentanaDeAlerta alerta=new VentanaDeAlerta("Error",mensaje);
		alerta.display();
		
	}
}
