package movimiento;

import partida.jugador.Jugador;

public class MovimientoCarcelDiaTres implements MeMuevo {

	public void mover(Jugador prisionero, int cantidad) {

		
	}
	
	public void siguienteMovimiento(Jugador unJugador) {
		MeMuevo movimiento = new MovimientoNormal();
		unJugador.nuevoMovimiento(movimiento);
		unJugador.deshabilitar();
	}
}
