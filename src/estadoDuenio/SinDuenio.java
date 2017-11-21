package estadoDuenio;

import caible.propiedades.Propiedad;
import partida.jugador.Jugador;

public class SinDuenio extends EstadoDuenio {

	public void jugadorCayo(Jugador jugadorQueCayo, Propiedad propiedadEnQueCayo) {

		if (jugadorQueCayo.getEfectivo() >= propiedadEnQueCayo.getPrecioDeCompra()) {
			/*
			 * por ahora no damos la opcion de no comprar la propiedad, eso para
			 * mas adelante, lo hacemos con la interfaz. Now, jugador que cae
			 * jugador que compra
			 */
			propiedadEnQueCayo.comprar(jugadorQueCayo);
			propiedadEnQueCayo.asignarDuenio();
		}
	}
}
