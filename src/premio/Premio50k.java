package premio;

import partida.jugador.Jugador;

public class Premio50k extends Premio {
	
	public Premio50k() {
		this.valorPremio = 50000;
	}
	
	public void cobrar(Jugador unJugador) {
		unJugador.aumentarEfectivo(this.valorPremio);
		Premio premio30k = new Premio30k();
		unJugador.setPremio(premio30k);
	}
	
}
