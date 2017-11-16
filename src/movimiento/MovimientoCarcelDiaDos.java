package movimiento;

import partida.Jugador;

public class MovimientoCarcelDiaDos implements MeMuevo {

	public void mover(Jugador prisionero, int cantidad) {
		MeMuevo movimientoDiasExtra = new MovimientoCarcelDiaTres();
		prisionero.nuevoMovimiento(movimientoDiasExtra);
	}
}
