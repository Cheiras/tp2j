package sistemaTurnos;

import partida.Jugador;

public class IteradorListaCircular {
	NodoJugador nodoActual;

	public IteradorListaCircular(ListaCircularJugadores lista) {
		this.nodoActual = lista.primero;
	}

	public Jugador obtenerJugador() {
		return this.nodoActual.obtenerJugador();
	}

	public void iteradorAvanzar() {
		this.nodoActual = this.nodoActual.proximo;
	}

	public void iteradorEliminarActual() {
		this.nodoActual.anterior.proximo = this.nodoActual.proximo;
		this.nodoActual.proximo.anterior = this.nodoActual.anterior;
		this.nodoActual = this.nodoActual.anterior;
	}

}
