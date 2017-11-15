package casilleros;

public class Casillero {
	
	private Casillero proximoCasillero;
	
	public Casillero(Casillero siguienteCasillero) {
		proximoCasillero =  siguienteCasillero;
	}
	
	public Casillero proximo() {
		return proximoCasillero;
	}
	public void accionar() {
		return ;
	}
	
}
