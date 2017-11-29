package estadoConstruccion;
import caible.propiedades.barrios.BarrioNormal;
import partida.jugador.Jugador;

public class EstadoConstruccionUnaCasa extends EstadoConstruccion{

	public EstadoConstruccionUnaCasa(BarrioNormal unBarrio, int costoRenta, int costoConstruccion) {
		this.costoRenta=costoRenta;
		this.costoConstruccion = costoConstruccion;
	}

	@Override
	public void construir(Jugador duenio, BarrioNormal unBarrio) {
		this.habilitadoAConstruir(duenio, unBarrio);
		cobrarCostoConstruccion(duenio,this.costoConstruccion);
		unBarrio.cambiarEstadoConstruccion();
	}
	
	
}
