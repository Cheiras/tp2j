package caible.propiedades.barrios;

import partida.jugador.Jugador;

public class CordobaSur extends BarrioNormal {

	public CordobaSur(String nombre, int precio, Jugador duenio, int posicion, int precioAlquiler,
			int precioAlquilerConUnaCasa, int precioAlquilerConDosCasas, int precioAlquilerConHotel,
			int precioConstruirCasa, int precioConstruirHotel) {
		super(nombre, precio, duenio, posicion, precioAlquiler, precioAlquilerConUnaCasa, precioAlquilerConDosCasas,
				precioAlquilerConHotel, precioConstruirCasa, precioConstruirHotel);
	}

}
