package construccionesBarriosEspeciales;

import caible.propiedades.barrios.BarrioEspecial;
import partida.jugador.Jugador;

public class EstadoSinConstruccionEnProvinciasUnicas extends EstadoConstruccionEnProvinciasUnicas {
	
	public EstadoSinConstruccionEnProvinciasUnicas(int precioAlquiler, int precioConstruirEdificioHistorico) {
		this.costoRenta=precioAlquiler;
		this.costoConstruccion=precioConstruirEdificioHistorico;
	}
	

	@Override
	public void construir(Jugador duenio, BarrioEspecial unBarrio) {
		this.habilitadoAConstruir(duenio, unBarrio);
		this.cobrarCostoConstruccion(duenio, this.costoConstruccion);
		unBarrio.cambiarEstadoConstruccion();		
	}
	

}
