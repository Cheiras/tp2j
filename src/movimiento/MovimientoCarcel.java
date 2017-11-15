package movimiento;

import partida.*;

public class MovimientoCarcel implements MeMuevo {
	
	private int turnosEnCarcel;
		
	public MovimientoCarcel() {
		
		this.turnosEnCarcel = 0;
			
	}
	
	public void mover(Jugador Prisionero) {
		
		if(turnosEnCarcel == 3) {
		
			MeMuevo movimiento = new MovimientoNormal();
			
			Prisionero.nuevoMovimiento(movimiento);
			
		}
		
		turnosEnCarcel += 1;
		
		
	}

}
