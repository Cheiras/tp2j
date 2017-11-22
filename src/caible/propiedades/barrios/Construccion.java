package caible.propiedades.barrios;

import excepciones.MontoInsuficienteException;
import excepciones.RequisitosInsuficientesException;
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
	
	public void habilitadoAConstruir(Jugador unJugador, BarrioNormal unBarrio) throws RuntimeException{
		if(! unJugador.contienePropiedadString(unBarrio.getNombreBarrioDupla())) {
			throw new RequisitosInsuficientesException("Debes tener los dos barrios para construir");
		}
		else if(unJugador.montoMenorA(this.costoConstruccion)){
			throw new MontoInsuficienteException("No tienes el dinero suficiente como para construir");
		}
	}
}
