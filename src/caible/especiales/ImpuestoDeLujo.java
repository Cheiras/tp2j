package caible.especiales;

import casilleros.Caible;
import partida.jugador.Jugador;

public class ImpuestoDeLujo extends Caible {

	private double porcentaje = 10;
	
	public ImpuestoDeLujo(){
		super("Impuesto de lujo");
		this.posicion = 10;
	}

	public void accionar(Jugador unJugador) {
		double impuestoTotal = unJugador.getEfectivo() * (porcentaje / 100);
		unJugador.reducirEfectivo((int) impuestoTotal);
	}

}
