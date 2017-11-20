package caible.especiales;

import casilleros.Caible;
import excepciones.FianzaInhabilitadaException;
import excepciones.MontoInsuficienteException;
import movimiento.MeMuevo;
import movimiento.MovimientoCarcelDiaUno;
import movimiento.MovimientoNormal;
import partida.jugador.Jugador;

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
	
	public void pagarFianza(Jugador unJugador) throws RuntimeException {
		
		if(unJugador.montoMenorA(this.precioFianza)) {
			throw new MontoInsuficienteException("No tienes dinero suficiente para pagar la fianza");
		}
		if(unJugador.estadoDeHabilitacion()) {
			
			MeMuevo movNormal = new MovimientoNormal();
			unJugador.nuevoMovimiento(movNormal);
			unJugador.reducirEfectivo(this.precioFianza);
			return;
			
		}
		throw new FianzaInhabilitadaException("No estas habilitado a pagar la fianza");
	}

}
