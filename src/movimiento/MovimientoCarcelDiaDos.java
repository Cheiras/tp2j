package movimiento;

import partida.jugador.Jugador;

public class MovimientoCarcelDiaDos implements MeMuevo {

	public void mover(Jugador prisionero, int cantidad) {
		this.siguienteMovimiento(prisionero);
	}
	
	public void siguienteMovimiento(Jugador unJugador) {
		MeMuevo movimientoDiasExtra = new MovimientoCarcelDiaTres();
		unJugador.nuevoMovimiento(movimientoDiasExtra);
	}
}
