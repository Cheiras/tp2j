package caible.propiedades.barrios;

import excepciones.MontoInsuficienteException;
import partida.jugador.Jugador;

public class ConstruccionNula extends Construccion {
	

	public ConstruccionNula(BarrioNormal barrio) {
		
		this.barrio = barrio;
		this.costoConstruccion = barrio.getPrecioConstruirCasa();
		this.costoRenta = barrio.getPrecioAlquilerConUnaCasa();

	}


	@Override
	public Construccion construir(Jugador unJugador) throws MontoInsuficienteException {
		Construccion casaConstruida = new ConstruccionCasa(this.barrio);
		cobrarCostoConstruccion(unJugador);
		return casaConstruida;
	}

}
