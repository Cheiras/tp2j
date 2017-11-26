package estadoConstruccion;

import caible.propiedades.barrios.BarrioNormal;
import excepciones.ConstruccionException;
import excepciones.JugadorEnBancarrotaException;
import excepciones.MontoInsuficienteException;
import excepciones.RequisitosInsuficientesException;
import partida.jugador.Jugador;

public abstract class EstadoConstruccion {
	protected int costoRenta;
	protected int costoConstruccion;
	
	

	
	public int getCostoRenta(){
		return this.costoRenta;
	}
	
	public void habilitadoAConstruir(Jugador unJugador, BarrioNormal unBarrio) throws RuntimeException {
		if (!unJugador.contienePropiedadString(unBarrio.getNombreBarrioDupla())) {
			throw new RequisitosInsuficientesException("Debes tener los dos barrios para construir");
		} else if (unJugador.montoMenorA(this.costoConstruccion)) {
			throw new MontoInsuficienteException("No tienes el dinero suficiente como para construir");
		}
	}
	

	public void habilitadoAConstruirHotel(Jugador unJugador, BarrioNormal unBarrio) throws RuntimeException {
		BarrioNormal DuplaDelBarrio = unJugador.obtenerPropiedadString(unBarrio.getNombreBarrioDupla());
		if(!DuplaDelBarrio.barrioHabilitadoParaConstruirHotel()) {
			throw new ConstruccionException("No estas habilitado para construir un Hotel");
		}
	}
	
	public void cobrarAlquiler(Jugador unJugador, Jugador duenio ) throws RuntimeException {
		if (unJugador.montoMenorA(costoRenta)) {
			throw new JugadorEnBancarrotaException("Dinero insuficiente para pagar alquiler, entro en Bancarota");
		}
		duenio.aumentarEfectivo(this.costoRenta);
		unJugador.reducirEfectivo(this.costoRenta);
		
	}
		
	
	public void cobrarCostoConstruccion(Jugador unJugador, int unValor) throws MontoInsuficienteException {
		if (unJugador.montoMenorA(unValor)) {
			throw new MontoInsuficienteException("Dinero insuficiente para construir");
		}
		unJugador.reducirEfectivo(unValor);
	}
	
	public abstract void construir (Jugador duenio,BarrioNormal unBarrio);
	
	public boolean habilitadoParaConstruirHotel() {
		return false;
	}
}
