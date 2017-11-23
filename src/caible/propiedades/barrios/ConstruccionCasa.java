package caible.propiedades.barrios;

import partida.jugador.Jugador;

public class ConstruccionCasa extends Construccion {

	public ConstruccionCasa(BarrioNormal barrio) {


	}

	public Construccion construir(Jugador unJugador, BarrioNormal unBarrio) {
		
		this.habilitadoAConstruir(unJugador, unBarrio);// chequea efectivo y
														// barrios
		Construccion casaConstruida = new ConstruccionSegundaCasa(unBarrio);
		cobrarCostoConstruccion(unJugador, unBarrio.getPrecioConstruirCasa());

		return casaConstruida;
	}

}
