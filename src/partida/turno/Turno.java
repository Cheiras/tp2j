package partida.turno;

import excepciones.NumeroDobleEnDadosException;
import movimiento.Tirador;
import partida.jugador.Jugador;
import partida.tablero.Tablero;

public class Turno {

	private int valorTirada;
	private int intentosParaTirarDados;
	Tirador tirador;
	Jugador jugador;
	private boolean listoParaTerminar; 

	public Turno(Jugador unJugador, Tirador unTirador, Tablero tablero) {
	 intentosParaTirarDados=2;
	 listoParaTerminar=false;
	 jugador=unJugador;
	 tirador=unTirador;
	}
	public void tirarDados() {
		
		if (listoParaTerminar || (intentosParaTirarDados == 0)){
			return; // no puede volver a tirar dados
		}
		try {
			valorTirada=tirador.tirar();
			jugador.avanzar(valorTirada);
			listoParaTerminar=true;
			
		}
		catch(NumeroDobleEnDadosException exception) {
			intentosParaTirarDados--;
		}
		
	}
	public boolean estaListoParaTerminar() {
		return listoParaTerminar;
	}
}
