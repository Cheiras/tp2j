package movimiento;

import partida.jugador.Jugador;

public class MovimientoCarcelDiaTres implements MeMuevo {

	public void mover(Jugador prisionero, int cantidad) {

		prisionero.deshabilitar();
	}
	
	public void siguienteMovimiento(Jugador unJugador) {
		MeMuevo movimiento = new MovimientoNormal();
		unJugador.nuevoMovimiento(movimiento);
	}
}
