package casilleros.barrios;

import partida.Jugador;
import partida.Partida;

public class Barrio {
	private String nombre;
	private int precio;
	private Jugador duenio;
	private int precioAlquiler;
	private int precioAlquilerConUnaCasa;
	private int precioAlquilerConDosCasas;
	private int precioAlquilerConHotel;
	
	private int precioConstruirCasa;
	private int precioConstruirHotel;
	
	public Barrio(String nombre, int precio, Jugador duenio, int precioAlquiler, int precioAlquilerConUnaCasa, int precioAlquilerConDosCasas, int precioAlquilerConHotel, int precioConstruirCasa, int precioConstruirHotel){
		this.nombre = nombre;
		this.precio = precio;
		this.duenio = duenio;
		this.precioAlquiler = precioAlquiler;
		this.precioAlquilerConUnaCasa = precioAlquilerConUnaCasa;
		this.precioAlquilerConDosCasas = precioAlquilerConDosCasas;
		this.precioAlquilerConHotel = precioAlquilerConHotel;
		this.precioConstruirCasa = precioConstruirCasa;
		this.precioConstruirHotel = precioConstruirHotel;
		
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public Jugador getDuenio() {
		return duenio;
	}

	public int getAlquiler() {
		return precioAlquiler;
	}

	public int getPrecioAlquiler() {
		return precioAlquiler;
	}

	public int getPrecioAlquilerConUnaCasa() {
		return precioAlquilerConUnaCasa;
	}

	public int getPrecioAlquilerConDosCasas() {
		return precioAlquilerConDosCasas;
	}

	public int getPrecioAlquilerConHotel() {
		return precioAlquilerConHotel;
	}

	public int getPrecioConstruirCasa() {
		return precioConstruirCasa;
	}

	public int getPrecioConstruirHotel() {
		return precioConstruirHotel;
	}

	public void comprar(){
		
	}
	
	public void cobrarAlquiler(){
		
	}
	
	public void construirCasa(){
		
	}
	
	public void construirHotel(){
		
	}
	


}
