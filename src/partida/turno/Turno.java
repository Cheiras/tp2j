package partida.turno;

import excepciones.NumeroDobleEnDadosException;
import movimiento.Tirador;
import partida.Partida;
import partida.jugador.Jugador;
import partida.tablero.Tablero;

public class Turno {

	private int intentosParaTirarDados;
	Tirador tirador;
	Jugador jugador;
	private boolean listoParaTerminar; 

	public Turno(Jugador unJugador, Tirador unTirador, Tablero tablero) {
	 intentosParaTirarDados=2;
	 listoParaTerminar=false;
	 jugador = unJugador;
	 tirador=unTirador;
	}
	public void tirarDados(Partida partida) {
		try {
			int valorTirada = tirador.tirar();
			this.jugador.avanzar(valorTirada);
			partida.getCaibleActual().accionar(this.jugador);
			listoParaTerminar=true;
			
		}
		catch(NumeroDobleEnDadosException exception) {
			intentosParaTirarDados--;
			if (intentosParaTirarDados == 0) {
				listoParaTerminar=true;
			}
		}
		
	}
	public boolean estaListoParaTerminar() {
		return listoParaTerminar;
	}
	public Jugador getJugador() {
		return jugador;
	}
}
