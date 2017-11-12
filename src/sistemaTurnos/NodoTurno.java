package sistemaTurnos;

import partida.Jugador;

public class NodoTurno {
	Turno turno;
	NodoTurno proximo;

	public NodoTurno(Jugador unJugador, boolean sacoDobles) {
		Turno unTurno = new Turno(unJugador, sacoDobles);
		this.turno = unTurno;
		this.proximo = null;
	}

	public boolean tiroDobles() {
		return turno.tiroDobles();
	}

	public Jugador obtenerJugador() {
		return this.turno.obtener_jugador_actual();
	}

	public void modificarTurnoActualDados(boolean resultadoDadosDobles) {
		this.turno.modificarTurnoActualDados(resultadoDadosDobles);
	}
}
