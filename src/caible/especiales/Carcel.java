package caible.especiales;

import Excepciones.MontoInsuficiente;
import casilleros.Caible;
import movimiento.MeMuevo;
import movimiento.MovimientoCarcelDiaUno;
import movimiento.MovimientoNormal;
import partida.Jugador;

public class Carcel extends Caible {

	private int precioFianza;

	public Carcel() {
		this.precioFianza = 10000;
		this.posicion = 5;
	}

	public void accionar(Jugador unJugador) {
		MeMuevo movCarcel = new MovimientoCarcelDiaUno();
		unJugador.nuevoMovimiento(movCarcel);
		unJugador.setPosicion(this.posicion);
	}
	
	public int getPrecioFianza() {
		return this.precioFianza;
	}

}
