package caible.propiedades.barrios;

import excepciones.MontoInsuficienteException;
import partida.jugador.Jugador;

public abstract class Construccion {
	
	protected int costoConstruccion;
	protected int costoRenta;	


	public abstract Construccion construir(Jugador unJugador,BarrioNormal unBarrio);
	
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
