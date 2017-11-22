package caible.propiedades.barrios;

public class BuenosAiresSur extends BarrioNormal{

	public BuenosAiresSur(String nombre, int precio, int posicion, int precioAlquiler,
			int precioAlquilerConUnaCasa, int precioAlquilerConDosCasas, int precioAlquilerConHotel,
			int precioConstruirCasa, int precioConstruirHotel) {
		super(nombre, precio, posicion, precioAlquiler, precioAlquilerConUnaCasa, precioAlquilerConDosCasas,
				precioAlquilerConHotel, precioConstruirCasa, precioConstruirHotel);
		this.duplaBarrioNormal = "Buenos Aires Norte";
		
	}

}
