package estadoConstruccion;

import caible.propiedades.barrios.BarrioNormal;
import partida.jugador.Jugador;

public class EstadoConstruccionSegundaCasa extends EstadoConstruccion {

	public EstadoConstruccionSegundaCasa(BarrioNormal unBarrio) {
		this.costoRenta=unBarrio.getPrecioAlquilerConDosCasas();
	}
	@Override
	public EstadoConstruccion construir(Jugador duenio, BarrioNormal unBarrio) {
		// TODO Auto-generated method stub
		this.habilitadoAConstruir(duenio, unBarrio);
		EstadoConstruccion dosCasas=new EstadoConstruccionHotel(unBarrio);
		cobrarCostoConstruccion(duenio,unBarrio.getPrecioConstruirHotel());
		return dosCasas;
	}
	
	@Override
	public boolean puedeConstruirHotel() {
		return true;
	}

	
}
