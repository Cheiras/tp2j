package construccionesBarriosEspeciales;

import caible.propiedades.barrios.Barrio;
import caible.propiedades.barrios.BarrioEspecial;
import excepciones.MontoInsuficienteException;
import partida.jugador.Jugador;

public abstract class EstadoConstruccionEnProvinciasUnicas {
	protected int costoRenta;
	protected int costoConstruccion;
	
	
	public int getCostoRenta() {
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
	
	public abstract EstadoConstruccionEnProvinciasUnicas construir (Jugador duenio,BarrioEspecial barrioEspecial);
	
	public boolean puedeConstruirHotel() {
		return false;
	}
}
