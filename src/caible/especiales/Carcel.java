package caible.especiales;

import casilleros.Caible;
import excepciones.FianzaInhabilitadaException;
import excepciones.MontoInsuficienteException;
import movimiento.MeMuevo;
import movimiento.MovimientoCarcelDiaUno;
import movimiento.MovimientoNormal;
import partida.jugador.Jugador;

public class Carcel extends Caible {

	private int precioFianza = 10000;

	public Carcel() {
		super("Carcel");
		this.posicion = 5;
	}

	public void accionar(Jugador unJugador) {
		unJugador.siguienteMovimiento();
		unJugador.setIndice(this.posicion);
	}
	
	public void pagarFianza(Jugador unJugador) throws RuntimeException {
		
		if(unJugador.montoMenorA(this.precioFianza)) {
			throw new MontoInsuficienteException("No tienes dinero suficiente para pagar la fianza");
		}
		if(unJugador.estadoDeHabilitacion()) {
			
			MeMuevo movNormal = new MovimientoNormal();
			unJugador.nuevoMovimiento(movNormal);
			unJugador.reducirEfectivo(this.precioFianza);
			unJugador.deshabilitar();
			return;
			
		}
		throw new FianzaInhabilitadaException("No estas habilitado a pagar la fianza");
	}

}
