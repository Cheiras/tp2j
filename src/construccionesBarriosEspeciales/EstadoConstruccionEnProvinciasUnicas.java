package construccionesBarriosEspeciales;

import caible.propiedades.barrios.Barrio;
import caible.propiedades.barrios.BarrioEspecial;
import excepciones.JugadorEnBancarrotaException;
import excepciones.MontoInsuficienteException;
import partida.jugador.Jugador;

public abstract class EstadoConstruccionEnProvinciasUnicas{
	protected int costoRenta;
	protected int costoConstruccion;
	
	public int getCostoRenta(){
		return this.costoRenta;
	}
	
	public void habilitadoAConstruir(Jugador unJugador, Barrio unBarrio) throws RuntimeException {
		 if (unJugador.montoMenorA(this.costoConstruccion)) {
			throw new MontoInsuficienteException("No tienes el dinero suficiente como para construir");
		}
	}
	
	public void cobrarCostoConstruccion(Jugador unJugador, int unValor) throws MontoInsuficienteException {

		if (unJugador.montoMenorA(unValor)) {
			throw new MontoInsuficienteException("Dinero insuficiente para construir");
		}

		unJugador.reducirEfectivo(unValor);
		
	}
	
	public void cobrarRenta(Jugador unJugador, Jugador duenio) throws MontoInsuficienteException {

		if (unJugador.montoMenorA(this.costoRenta)) {
			throw new JugadorEnBancarrotaException("Entraste en Bancarrota.");
		}

		unJugador.reducirEfectivo(this.costoRenta);
		duenio.aumentarEfectivo(this.costoRenta);
		
	}
	
	public abstract void construir (Jugador duenio,BarrioEspecial barrioEspecial);

	
}
