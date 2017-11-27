package estadoConstruccion;

import caible.propiedades.barrios.BarrioNormal;
import excepciones.ConstruccionException;
import partida.jugador.Jugador;

public class EstadoConstruccionHotel extends EstadoConstruccion {

	public EstadoConstruccionHotel(BarrioNormal unBarrio, int costoRenta,int costoConstruccion) {
		this.costoRenta=costoRenta;
		this.costoConstruccion=costoConstruccion;
	}
	@Override
	public void construir(Jugador unJugador, BarrioNormal unBarrio) throws RuntimeException {
		throw new ConstruccionException("No hay nada mas que puedas construir para este barrio.");
	}

}
