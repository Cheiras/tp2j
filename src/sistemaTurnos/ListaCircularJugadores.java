package sistemaTurnos;
import partida.Jugador;
public class ListaCircularJugadores {
	NodoJugador primero;
	NodoJugador ultimo;
	int jugadores_restantes;
	
	public ListaCircularJugadores() {
		primero=null;
		jugadores_restantes=0;
	}
	
	public boolean estaVacia() {
		return this.jugadores_restantes==0;
	}
	
	public void agregarNodo(Jugador jugador) {
		NodoJugador nuevoNodo=new NodoJugador(jugador);
		if(this.estaVacia()) {
			this.primero=nuevoNodo;
			this.ultimo=nuevoNodo;
		}
		else {
		nuevoNodo.anterior=this.ultimo;
		nuevoNodo.anterior.proximo=nuevoNodo;
		nuevoNodo.proximo=this.primero;
		this.primero.anterior=nuevoNodo;
		this.ultimo=nuevoNodo;
		}
		jugadores_restantes++;
	}
	

}
