package movimiento;

import partida.jugador.Jugador;

public class MovimientoNormal implements MeMuevo {
	
	public void mover(Jugador jugador,int cantidad) {
		
		for(int i = 0; i < cantidad; i++) {
		
			jugador.avanzarCasillero();	
				
		}
	}	
	public void siguienteMovimiento(Jugador unJugador) {
		
		MeMuevo movimientoCarcel = new MovimientoCarcelDiaUno();
		unJugador.nuevoMovimiento(movimientoCarcel);
	}
	
}
