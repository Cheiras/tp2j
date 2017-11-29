package partida.jugador;

import java.util.HashMap;

public class TablaConversion {

	private HashMap<Integer, Posicion> conversiones;
	
	public TablaConversion() {
		
		this.conversiones = new HashMap<Integer, Posicion>();
		this.conversiones.put(0,new Posicion(100,100));
		this.conversiones.put(1,new Posicion(110,100));
		this.conversiones.put(2,new Posicion(120,100));
		this.conversiones.put(3,new Posicion(130,100));
		this.conversiones.put(4,new Posicion(140,100));
		this.conversiones.put(5,new Posicion(150,100));
		this.conversiones.put(6,new Posicion(160,100));
		this.conversiones.put(7,new Posicion(170,100));
		this.conversiones.put(8,new Posicion(180,100));
		this.conversiones.put(9,new Posicion(190,100));
		this.conversiones.put(10,new Posicion(200,100));
		this.conversiones.put(11,new Posicion(210,100));
		this.conversiones.put(12,new Posicion(220,100));
		this.conversiones.put(13,new Posicion(230,100));
		this.conversiones.put(14,new Posicion(240,100));
		this.conversiones.put(15,new Posicion(250,100));
		this.conversiones.put(16,new Posicion(260,100));
		this.conversiones.put(17,new Posicion(270,100));
		this.conversiones.put(18,new Posicion(280,100));
		this.conversiones.put(19,new Posicion(290,100));
		this.conversiones.put(20,new Posicion(300,100));
	}
	
	public Posicion getPosicion(int indice) {
		return this.conversiones.get(indice);
	}
	
	
}
