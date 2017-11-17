package movimiento;

import partida.Jugador;

public class MovimientoCarcelDiaUno implements MeMuevo {

	public void mover(Jugador prisionero, int cantidad) {
		MeMuevo movimientoDiasExtra = new MovimientoCarcelDiaDos();
		prisionero.nuevoMovimiento(movimientoDiasExtra);
		prisionero.habilitar();
	}
}
