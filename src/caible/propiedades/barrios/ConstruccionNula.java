package caible.propiedades.barrios;

import partida.jugador.Jugador;

public class ConstruccionNula extends Construccion {
	

	public ConstruccionNula(BarrioNormal barrio) {
		
		this.costoConstruccion = barrio.getPrecioConstruirCasa();
		this.costoRenta = barrio.getPrecioAlquiler();

	}


	@Override
	public Construccion construir(Jugador unJugador, BarrioNormal unBarrio) throws RuntimeException {
		
		this.habilitadoAConstruir(unJugador, unBarrio);//chequea efectivo y barrios
		
		Construccion casaConstruida = new ConstruccionCasa(unBarrio);
		cobrarCostoConstruccion(unJugador);
		return casaConstruida;
	}

}
