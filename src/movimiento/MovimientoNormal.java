package movimiento;

import partida.*;

public class MovimientoNormal implements MeMuevo {
	
	public void mover(Jugador jugador) {
		
			jugador.avanzarCasillero();	
				
	}

}
