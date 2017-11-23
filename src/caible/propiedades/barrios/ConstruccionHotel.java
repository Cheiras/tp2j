package caible.propiedades.barrios;

import excepciones.ConstruccionException;
import partida.jugador.Jugador;

public class ConstruccionHotel extends Construccion {

	
	public ConstruccionHotel(BarrioNormal barrio) {

	}
	
	@Override
	public Construccion construir(Jugador unJugador, BarrioNormal unBarrio) throws RuntimeException {
		throw new ConstruccionException("No hay nada mas que puedas construir para este barrio.");
	}

}
