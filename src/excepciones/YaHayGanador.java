package excepciones;

import vista.VentanaDeAlerta;

public class YaHayGanador extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public YaHayGanador(String mensaje) {
		
		VentanaDeAlerta alerta=new VentanaDeAlerta("Ganador",mensaje);
		alerta.display();
		
	}
}
