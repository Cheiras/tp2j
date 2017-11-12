package sistemaTurnos;

import partida.Jugador;

public class ManejadorDeTurnos {
	ListaCircularJugadores ordenDeTurnosDeJugadores;
	IteradorListaCircular jugadorActual;
	ColaTurnos secuenciaDeTurnos;

	public ManejadorDeTurnos(Jugador jugador1, Jugador jugador2, Jugador jugador3) {
		this.ordenDeTurnosDeJugadores.agregarNodo(jugador1);
		this.ordenDeTurnosDeJugadores.agregarNodo(jugador2);
		this.ordenDeTurnosDeJugadores.agregarNodo(jugador3);
		this.jugadorActual = new IteradorListaCircular(ordenDeTurnosDeJugadores);
		this.secuenciaDeTurnos.encolar(jugadorActual.obtenerJugador(), false);
	}

}
