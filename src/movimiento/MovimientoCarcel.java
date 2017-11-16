package movimiento;

import partida.*;

public class MovimientoCarcel implements MeMuevo {
	
	private int turnosEnCarcel;
		
	public MovimientoCarcel() {
		
		this.turnosEnCarcel = 0;
			
	}
	
	public void mover(Jugador Prisionero,int cantidad) {
		
		if(turnosEnCarcel == 3) {
		
			MeMuevo movimiento = new MovimientoNormal();
			
			Prisionero.nuevoMovimiento(movimiento);
			
			return;
			
		}
		
		turnosEnCarcel += 1;
		
	}
}
