package caible.propiedades.barrios;


import partida.jugador.Jugador;

public class ConstruccionNula extends Construccion {
	

	public ConstruccionNula(BarrioNormal barrio) {
		this.costoRenta=barrio.getAlquiler();
		this.costoConstruccion=barrio.getPrecioConstruirCasa();
	}
	@Override
	public int getCostoRenta() {
		return this.costoRenta;
	}


	public Construccion construir(Jugador unJugador, BarrioNormal unBarrio) throws RuntimeException {
		this.habilitadoAConstruir(unJugador, unBarrio);//chequea efectivo y barrios
		Construccion casaConstruida = new ConstruccionCasa(unBarrio);

		this.cobrarCostoConstruccion(unJugador, unBarrio.getPrecioConstruirCasa());

		return casaConstruida;
	}

}
