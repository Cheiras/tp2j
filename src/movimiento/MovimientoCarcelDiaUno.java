package movimiento;

import partida.jugador.Jugador;

public class MovimientoCarcelDiaUno implements MeMuevo {

	public void mover(Jugador prisionero, int cantidad) {

	}
	
	public void siguienteMovimiento(Jugador unJugador) {
		MeMuevo movimientoDiasExtra = new MovimientoCarcelDiaDos();
		unJugador.nuevoMovimiento(movimientoDiasExtra);
		unJugador.habilitar();
	}
}
