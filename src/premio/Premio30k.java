package premio;

import partida.Jugador;

public class Premio30k extends Premio {
	
	public Premio30k() {
		this.valorPremio = 30000;
	}
	
	public void cobrar(Jugador unJugador) {
		unJugador.aumentarEfectivo(this.valorPremio);
		Premio premioNulo = new PremioNulo();
		unJugador.setPremio(premioNulo);
	}
}
