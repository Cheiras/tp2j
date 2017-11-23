package estadoConstruccion;

import caible.propiedades.barrios.BarrioNormal;
import partida.jugador.Jugador;

public class EstadoSinConstruccion extends EstadoConstruccion {
	
	public EstadoSinConstruccion(BarrioNormal barrio) {
		this.costoRenta=barrio.getPrecioAlquiler();
		this.costoConstruccion=barrio.getPrecioConstruirCasa();/***SE USA???***/
	}
	
	public int getCostoRenta() {
		return this.costoRenta;
	}

	@Override
	public EstadoConstruccion construir(Jugador duenio, BarrioNormal unBarrio) {
		// TODO Auto-generated method stub
		this.habilitadoAConstruir(duenio, unBarrio);
		EstadoConstruccion casaConstruida=new EstadoConstruccionUnaCasa(unBarrio);
		this.cobrarCostoConstruccion(duenio, unBarrio.getPrecioConstruirCasa());
		return casaConstruida;
		
	}
	

}
