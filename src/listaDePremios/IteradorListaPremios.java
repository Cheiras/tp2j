package listaDePremios;

public class IteradorListaPremios {
	NodoPremio nodoActual;
	
	public IteradorListaPremios(ListaDePremios lista) {
		nodoActual=lista.primero;
	}
	
	public void avanzar() {
		nodoActual=nodoActual.proximo;
	}
	
	public int obtenerPremio() {
		return this.nodoActual.obtenerPremio();
	}
}
