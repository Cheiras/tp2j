package construccionesBarriosEspeciales;

import caible.propiedades.barrios.BarrioEspecial;
import caible.propiedades.barrios.BarrioNormal;
import estadoConstruccion.EstadoConstruccion;
import estadoConstruccion.EstadoConstruccionUnaCasa;
import partida.jugador.Jugador;

public class EstadoSinConstruccionEnProvinciasUnicas extends EstadoConstruccionEnProvinciasUnicas {
	
	public EstadoSinConstruccionEnProvinciasUnicas(BarrioEspecial barrioEspecial) {
		this.costoRenta=barrioEspecial.getPrecioAlquiler();
		this.costoConstruccion=barrioEspecial.getPrecioConstruirEdificioHistorico();/***SE USA???***/
	}
	
	public int getCostoRenta() {
		return this.costoRenta;
	}

	@Override
	public EstadoConstruccionEnProvinciasUnicas construir(Jugador duenio, BarrioEspecial unBarrio) {
		// TODO Auto-generated method stub
		this.habilitadoAConstruir(duenio, unBarrio);
		EstadoConstruccionEnProvinciasUnicasUnaCasa casaConstruida=new EstadoConstruccionEnProvinciasUnicasUnaCasa(unBarrio);
		this.cobrarCostoConstruccion(duenio, unBarrio.getPrecioConstruirEdificioHistorico());
		return casaConstruida;
		
	}
	

}
