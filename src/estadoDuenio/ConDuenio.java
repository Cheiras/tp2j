package estadoDuenio;

import partida.Jugador;
import propiedades.Propiedad;

public class ConDuenio extends EstadoDuenio {
	
	public void jugadorCayo(Jugador jugadorQueCayo,Propiedad propiedadEnLaQueCayo) {
		if(jugadorQueCayo!=propiedadEnLaQueCayo.obtenerDuenio()) {
			propiedadEnLaQueCayo.cobrarAlquiler(jugadorQueCayo);
		}
		
	}
}
