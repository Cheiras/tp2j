package caible.propiedades.barrios;

import partida.jugador.Jugador;

public class ConstruccionSegundaCasa extends Construccion {

	
	public ConstruccionSegundaCasa(BarrioNormal barrio) {
		
		this.costoConstruccion = barrio.getPrecioConstruirCasa();
		this.costoRenta = barrio.getPrecioAlquilerConDosCasas();

	}
	
	@Override
	public Construccion construir(Jugador unJugador, BarrioNormal unBarrio) {
		// TODO Auto-generated method stub
		//chequear que este habilitado para construir hotel
		return null;
	}

}
