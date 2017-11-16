package movimiento;

import partida.*;

public class MovimientoNormal implements MeMuevo {
	
	public void mover(Jugador jugador,int cantidad) {
		
		for(int i = 0; i < cantidad; i++) {
		
			jugador.avanzarCasillero();	
				
		}
	}
}
