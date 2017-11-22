package caible.propiedades.barrios;

import partida.jugador.Jugador;

public class ConstruccionSegundaCasa extends Construccion {

	
	public ConstruccionSegundaCasa(BarrioNormal barrio) {
		
		this.costoConstruccion = barrio.getPrecioConstruirHotel();
		this.costoRenta = barrio.getPrecioAlquilerConDosCasas();

	}
	
	@Override
	public Construccion construir(Jugador unJugador, BarrioNormal unBarrio) {
		
		this.habilitadoAConstruir(unJugador, unBarrio);//chequea efectivo y barrios
		
		Construccion hotel = new ConstruccionHotel(unBarrio);
		cobrarCostoConstruccion(unJugador);
		return hotel;
		}

}
