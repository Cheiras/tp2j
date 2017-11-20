package premio;

import partida.jugador.Jugador;

public class PremioNulo extends Premio {
	
	public PremioNulo() {
		this.valorPremio = 0;
	}
	
	public void cobrar(Jugador unJugador) {
		unJugador.aumentarEfectivo(this.valorPremio);
	}
}
