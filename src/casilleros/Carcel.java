package casilleros;

import Excepciones.MontoInsuficiente;
import movimiento.MeMuevo;
import movimiento.MovimientoCarcel;
import movimiento.MovimientoNormal;
import partida.Jugador;

public class Carcel extends Caible{

	private int precioFianza;

	
	public Carcel() {
		this.precioFianza = 10000; 
		this.posicion = 10;
	}
	
	public void accionar(Jugador unJugador) {
		MeMuevo movCarcel = new MovimientoCarcel();
		unJugador.nuevoMovimiento(movCarcel);
		unJugador.nuevaPosicion(this.posicion);
	}
	
	
	public void pagarFianza(Jugador unJugador) throws MontoInsuficiente {
		if (unJugador.montoMenorA(this.precioFianza)) {
			throw new MontoInsuficiente("No le alcanza el efectivo para pagar la fianza");		
		}
		
		MeMuevo movNormal = new MovimientoNormal();
		
		unJugador.reducirEfectivo(this.precioFianza);
		
		unJugador.nuevoMovimiento(movNormal);
		
		
	}
}
	