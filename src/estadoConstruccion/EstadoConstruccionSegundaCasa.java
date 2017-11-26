package estadoConstruccion;

import caible.propiedades.barrios.BarrioNormal;
import partida.jugador.Jugador;

public class EstadoConstruccionSegundaCasa extends EstadoConstruccion {

	public EstadoConstruccionSegundaCasa(BarrioNormal unBarrio, int costoRenta, int costoConstruccion) {
		this.costoRenta=costoRenta;
		this.costoConstruccion=costoConstruccion;
	}
	@Override
	public void construir(Jugador duenio, BarrioNormal unBarrio) {
		this.habilitadoAConstruir(duenio, unBarrio);
		cobrarCostoConstruccion(duenio,this.costoConstruccion);
		unBarrio.cambiarEstadoConstruccion();
	}
	
	@Override
	public boolean puedeConstruirHotel() {
		return true;
	}

	
}
