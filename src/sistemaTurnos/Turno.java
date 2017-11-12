package sistemaTurnos;

import partida.Jugador;

public class Turno {
	private Jugador jugador_Actual;
	private boolean jugador_ya_saco_dobles;

	public Turno(Jugador jugador_act, boolean saco_dobles) {
		this.jugador_Actual = jugador_act;
		this.jugador_ya_saco_dobles = saco_dobles;
	}

	public Jugador obtener_jugador_actual() {
		return this.jugador_Actual;
	}

	public boolean tiroDobles() {
		return this.jugador_ya_saco_dobles;
	}

	public void modificarTurnoActualDados(boolean resultadoDadosDobles) {
		this.jugador_ya_saco_dobles = resultadoDadosDobles;
	}
}
