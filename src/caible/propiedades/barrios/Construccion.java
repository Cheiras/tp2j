package caible.propiedades.barrios;

import Excepciones.MontoInsuficienteException;
import partida.Jugador;

public abstract class Construccion {
	
	protected int costoConstruccion;
	protected int costoRenta;	
	protected BarrioNormal barrio;

	public abstract Construccion construir(Jugador unJugador);
	
	public int getCostoRenta() {
		return costoRenta;
	}		
	
	public void cobrarCostoConstruccion(Jugador unJugador) throws MontoInsuficienteException {
		if(unJugador.montoMenorA(this.costoConstruccion)) {
			throw new MontoInsuficienteException("Dinero isnsuficiente para construir");
		}
		unJugador.reducirEfectivo(costoConstruccion);
	}
}
