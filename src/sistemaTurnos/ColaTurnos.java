package sistemaTurnos;
import partida.Jugador;
public class ColaTurnos {
	NodoTurno primero;
	NodoTurno ultimo;
	int cantidad;
	
	public ColaTurnos() {
		primero=null;
		ultimo=null;
		cantidad=0;
	}
	
	public boolean estaVacia() {
		return(cantidad==0);
	}
	
	public void encolar(Jugador unJugador,Boolean sacoDoble) {
		NodoTurno turno=new NodoTurno(unJugador,sacoDoble);
		if(this.estaVacia()) {
			this.primero=turno;
			this.ultimo=turno;
		}
		else {
			ultimo.proximo=turno;
			ultimo=turno;
		}
		this.cantidad++;
	}
	
	public void desencolar() {
		if(this.estaVacia()) {
			return ;
		}
		NodoTurno nuevoNodoPrimero=this.primero.proximo;
		this.primero=nuevoNodoPrimero;
		if(this.cantidad==1) {
			this.ultimo=null;
		}
		this.cantidad--;
	}
	
	public int obtenerCantidad() {
		return this.cantidad;
	}
	
	public void generarNuevoTurno(IteradorListaCircular jugadorActual) {
		if(this.ultimo.tiroDobles()) {
			if(this.primero.obtenerJugador()!=this.ultimo.obtenerJugador()) {
				jugadorActual.iteradorAvanzar();
			}
		}
		this.encolar(jugadorActual.obtenerJugador(),false);
	}
	
	public void modificarTurnoActualDados(boolean resultadoDadoDobles) {
		this.ultimo.modificarTurnoActualDados(resultadoDadoDobles);
	}
}
