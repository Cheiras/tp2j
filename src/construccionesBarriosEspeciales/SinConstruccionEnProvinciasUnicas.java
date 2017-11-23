package construccionesBarriosEspeciales;

import caible.propiedades.barrios.BarrioEspecial;
import excepciones.MontoInsuficienteException;
import partida.jugador.Jugador;
import excepciones.MontoInsuficienteException;
public class SinConstruccionEnProvinciasUnicas extends ConstruccionEnProvinciasUnicas {

	public SinConstruccionEnProvinciasUnicas(BarrioEspecial unBarrio){
		this.costoRenta=unBarrio.getPrecioAlquiler();
	}
	
	public void construir(Jugador duenio,BarrioEspecial unBarrio) throws MontoInsuficienteException {
		if(duenio.getEfectivo()<unBarrio.getPrecioConstruirEdificioHistorico()) {
			throw new MontoInsuficienteException("Dinero insuficiente para construir");
		}
		ConstruccionEnProvinciasUnicas nuevaConstruccion=new ConstruccionUnicoEdificio(unBarrio);
		unBarrio.setConstruccion(nuevaConstruccion);
	}
}
