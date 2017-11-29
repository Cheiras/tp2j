package partida.jugador;

import java.util.HashMap;

public class TablaConversion {

	private HashMap<Integer, Posicion> conversiones;
	
	public TablaConversion() {
		
		this.conversiones = new HashMap<Integer, Posicion>();
		
		this.conversiones.put(0,new Posicion(100,100));
		this.conversiones.put(1,new Posicion(100,0));
		this.conversiones.put(2,new Posicion(100,-100));
		this.conversiones.put(3,new Posicion(100,-200));
		this.conversiones.put(4,new Posicion(100,-300));
		
		this.conversiones.put(5,new Posicion(100,-420));
		
		this.conversiones.put(6,new Posicion(-40,-420));
		this.conversiones.put(7,new Posicion(-170,-420));
		this.conversiones.put(8,new Posicion(-300,-420));
		this.conversiones.put(9,new Posicion(-435,-420));
		
		this.conversiones.put(10,new Posicion(-580,-420));
		
		this.conversiones.put(11,new Posicion(-580,-300));
		this.conversiones.put(12,new Posicion(-580,-200));
		this.conversiones.put(13,new Posicion(-580,-100));
		this.conversiones.put(14,new Posicion(-580,0));
		
		this.conversiones.put(15,new Posicion(-580,100));
		
		this.conversiones.put(16,new Posicion(-435,100));
		this.conversiones.put(17,new Posicion(-300,100));
		
		this.conversiones.put(18,new Posicion(-170,100));
		this.conversiones.put(19,new Posicion(-40,100));
	}
	
	public Posicion getPosicion(int indice) {
		return this.conversiones.get(indice);
	}
	
	
}
