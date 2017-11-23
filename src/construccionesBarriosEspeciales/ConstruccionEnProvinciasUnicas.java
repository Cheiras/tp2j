package construccionesBarriosEspeciales;

import caible.propiedades.barrios.BarrioEspecial;
import excepciones.MontoInsuficienteException;
import excepciones.RequisitosInsuficientesException;
import partida.jugador.Jugador;
public abstract class ConstruccionEnProvinciasUnicas {

	protected int costoRenta;
	
	public int getCostoRenta() {
		return this.costoRenta;
	}
	public void construir(Jugador duenio,BarrioEspecial unBarrio) {
	}
}
