package estadoDuenio;

import caible.propiedades.Propiedad;
import excepciones.JugadorEnBancarrotaException;
import partida.jugador.Jugador;

public class ConDuenio extends EstadoDuenio {

	public void jugadorCayo(Jugador jugadorQueCayo, Propiedad propiedadEnLaQueCayo) {
		if (jugadorQueCayo != propiedadEnLaQueCayo.obtenerDuenio()) {
			try {
				propiedadEnLaQueCayo.cobrarAlquiler(jugadorQueCayo);
			}catch(RuntimeException e) {
				throw new JugadorEnBancarrotaException("No tienes dinero suficiente como para pagar el alquiler. Estas en Bancarrota");
			}
		}
	
	}

	@Override
	public boolean tieneDuenio() {
		return true;
	}
}
