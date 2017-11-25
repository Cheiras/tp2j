package partida.turno;

import excepciones.NumeroDobleEnDadosException;
import movimiento.Tirador;
import partida.jugador.Jugador;
import partida.tablero.Tablero;

public class Turno {

	private int valorTirada;
	private int intentosParaTirarDados = 2;

	public Turno(Jugador unJugador, Tirador tirador, Tablero tablero) {
		// Aca deberia preguntarse si quiere construir o pagar fianza y no se si algo
		// mas

		for (int i = 1; i <= intentosParaTirarDados; i++) {
			try {
				valorTirada = tirador.tirar();
				unJugador.avanzar(valorTirada);
				break;
			} catch (NumeroDobleEnDadosException excepcion) {
				// No se mueve
			}
		}
	}
}
