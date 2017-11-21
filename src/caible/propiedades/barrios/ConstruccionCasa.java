package caible.propiedades.barrios;

import partida.jugador.Jugador;

public class ConstruccionCasa extends Construccion {

	public ConstruccionCasa(BarrioNormal barrio) {
		
		this.costoConstruccion = barrio.getPrecioConstruirCasa();
		this.costoRenta = barrio.getPrecioAlquilerConUnaCasa();

	}
	@Override
	public Construccion construir(Jugador unJugador,BarrioNormal unBarrio) {
		Construccion casaConstruida = new ConstruccionSegundaCasa(unBarrio);
		cobrarCostoConstruccion(unJugador);
		return casaConstruida;
	}

}
