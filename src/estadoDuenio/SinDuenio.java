package estadoDuenio;

import caible.propiedades.Propiedad;
import partida.jugador.Jugador;

public class SinDuenio extends EstadoDuenio {

	public void jugadorCayo(Jugador jugadorQueCayo, Propiedad propiedadEnQueCayo) {
		
	}

	@Override
	public boolean tieneDuenio() {
		return false;
	}
}
