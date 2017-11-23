package estadoConstruccion;

import caible.propiedades.barrios.BarrioNormal;
import excepciones.ConstruccionException;
import partida.jugador.Jugador;

public class EstadoConstruccionHotel extends EstadoConstruccion {

	public EstadoConstruccionHotel(BarrioNormal unBarrio) {
		this.costoRenta=unBarrio.getPrecioAlquilerConHotel();
	}
	@Override
	public EstadoConstruccion construir(Jugador unJugador, BarrioNormal unBarrio) throws RuntimeException {
		throw new ConstruccionException("No hay nada mas que puedas construir para este barrio.");
	}

}
