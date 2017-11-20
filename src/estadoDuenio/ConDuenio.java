package estadoDuenio;

import caible.propiedades.Propiedad;
import partida.jugador.Jugador;

public class ConDuenio extends EstadoDuenio {

	public void jugadorCayo(Jugador jugadorQueCayo, Propiedad propiedadEnLaQueCayo) {
		if (jugadorQueCayo != propiedadEnLaQueCayo.obtenerDuenio()) {
			propiedadEnLaQueCayo.cobrarAlquiler(jugadorQueCayo);
		}

	}
}
