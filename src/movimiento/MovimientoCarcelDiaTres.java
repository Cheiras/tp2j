package movimiento;

import partida.Jugador;

public class MovimientoCarcelDiaTres implements MeMuevo {

	public void mover(Jugador Prisionero, int cantidad) {

		MeMuevo movimiento = new MovimientoNormal();

		Prisionero.nuevoMovimiento(movimiento);
		
		Prisionero.deshabilitar();
	}

}
