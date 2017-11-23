package estadoConstruccion;

import caible.propiedades.barrios.BarrioNormal;

public class EstadoSinConstruccion extends EstadoConstruccion {
	
	public EstadoSinConstruccion(BarrioNormal barrio) {
		this.costoRenta=barrio.getPrecioAlquiler();
		this.costoConstruir=barrio.getPrecioConstruirCasa();
	}
	
	public int getCostoRenta() {
		return this.costoRenta;
	}
}
