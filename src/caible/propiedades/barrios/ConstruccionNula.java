package caible.propiedades.barrios;


import partida.jugador.Jugador;

public class ConstruccionNula extends Construccion {
	

	public ConstruccionNula(BarrioNormal barrio) {
	
	}



	public Construccion construir(Jugador unJugador, BarrioNormal unBarrio) throws RuntimeException {
		this.habilitadoAConstruir(unJugador, unBarrio);//chequea efectivo y barrios
		Construccion casaConstruida = new ConstruccionCasa(unBarrio);

		this.cobrarCostoConstruccion(unJugador, unBarrio.getPrecioConstruirCasa());

		return casaConstruida;
	}

}
