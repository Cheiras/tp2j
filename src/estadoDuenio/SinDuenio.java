package estadoDuenio;

import caible.propiedades.Propiedad;
import partida.jugador.Jugador;

public class SinDuenio extends EstadoDuenio {

	public void jugadorCayo(Jugador jugadorQueCayo, Propiedad propiedadEnQueCayo) {
		if (!jugadorQueCayo.montoMenorA(propiedadEnQueCayo.getPrecioDeCompra() ) ) {
			propiedadEnQueCayo.comprar(jugadorQueCayo);
			propiedadEnQueCayo.asignarDuenio();
		}
	}
}
