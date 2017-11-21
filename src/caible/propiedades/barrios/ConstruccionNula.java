package caible.propiedades.barrios;

import excepciones.MontoInsuficienteException;
import excepciones.RequisitosInsuficientesException;
import partida.jugador.Jugador;

public class ConstruccionNula extends Construccion {
	

	public ConstruccionNula(BarrioNormal barrio) {
		
		this.costoConstruccion = barrio.getPrecioConstruirCasa();
		this.costoRenta = barrio.getPrecioAlquiler();

	}


	@Override
	public Construccion construir(Jugador unJugador, BarrioNormal unBarrio) throws RuntimeException {
		if(! unJugador.contienePropiedadString(unBarrio.getNombreBarrioDupla())) {
			throw new RequisitosInsuficientesException("Debes tener los dos barrios para construir");
		}
		Construccion casaConstruida = new ConstruccionCasa(unBarrio);
		cobrarCostoConstruccion(unJugador);
		return casaConstruida;
	}

}
