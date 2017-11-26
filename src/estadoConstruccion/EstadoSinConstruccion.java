package estadoConstruccion;

import caible.propiedades.barrios.BarrioNormal;
import partida.jugador.Jugador;

public class EstadoSinConstruccion extends EstadoConstruccion {
	
	public EstadoSinConstruccion(BarrioNormal barrio, int costoRenta, int costoConstruccion) {
		this.costoRenta=costoRenta;
		this.costoConstruccion=costoConstruccion;
	}
	
	public int getCostoRenta() {
		return this.costoRenta;
	}

	@Override
	public void construir(Jugador duenio, BarrioNormal unBarrio) {
		this.habilitadoAConstruir(duenio, unBarrio);
		this.cobrarCostoConstruccion(duenio, this.costoConstruccion);
		unBarrio.cambiarEstadoConstruccion();
		
	}
	

}
