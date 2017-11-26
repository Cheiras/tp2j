package construccionesBarriosEspeciales;

import caible.propiedades.barrios.BarrioEspecial;
import partida.jugador.Jugador;

public class EstadoSinConstruccionEnProvinciasUnicas extends EstadoConstruccionEnProvinciasUnicas {
	
	public EstadoSinConstruccionEnProvinciasUnicas(BarrioEspecial barrioEspecial, int precioAlquiler, int precioConstruirEdificioHistorico) {
		this.costoRenta=precioAlquiler;
		this.costoConstruccion=precioConstruirEdificioHistorico;
	}
	
	public int getCostoRenta() {
		return this.costoRenta;
	}

	@Override
	public void construir(Jugador duenio, BarrioEspecial unBarrio) {
		this.habilitadoAConstruir(duenio, unBarrio);
		this.cobrarCostoConstruccion(duenio,costoConstruccion);
		unBarrio.cambiarEstadoConstruccion();		
	}
	

}
