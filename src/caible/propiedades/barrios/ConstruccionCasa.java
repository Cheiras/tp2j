package caible.propiedades.barrios;

import partida.jugador.Jugador;

public class ConstruccionCasa extends Construccion {

	public ConstruccionCasa(BarrioNormal barrio) {
		
		this.barrio = barrio;
		this.costoConstruccion = barrio.getPrecioConstruirCasa();
		this.costoRenta = barrio.getPrecioAlquilerConDosCasas();


	}
	@Override
	public Construccion construir(Jugador unJugador) {
		Construccion casaConstruida = new ConstruccionSegundaCasa(this.barrio);
		cobrarCostoConstruccion(unJugador);
		return casaConstruida;
	}

}
