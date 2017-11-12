package casilleros.avanceYRetrocesoDinamico;

import partida.Jugador;

public class AvanceDinamico {
	
	private void avanzarJugadorUnaCantidadDeCasilleros(Jugador unJugador, int unaCantidad) {
		for (int i=0; i < unaCantidad;i++) {
			unJugador.avanzarCasillero();
		}
	}
	
	public void ejecutarDesdeJugador(Jugador unJugador) {
		if (unJugador.numeroTotalSacadoEnDados() <= 6){
			int cantidadDeCasillerosQueDeberaAvanzar=unJugador.numeroTotalSacadoEnDados()-2;
			avanzarJugadorUnaCantidadDeCasilleros(unJugador, cantidadDeCasillerosQueDeberaAvanzar);
		}
		else if (unJugador.numeroTotalSacadoEnDados() <= 6){
			int cantidadDeCasillerosQueDeberaAvanzar= unJugador.getEfectivo() * unJugador.numeroTotalSacadoEnDados()  % 100 ;
			avanzarJugadorUnaCantidadDeCasilleros(unJugador, cantidadDeCasillerosQueDeberaAvanzar);
		}
		else{
			int cantidadDeCasillerosQueDeberaAvanzar=unJugador.numeroTotalSacadoEnDados()  - unJugador.cantidadDePropiedadesASuNombre() ;
			avanzarJugadorUnaCantidadDeCasilleros(unJugador, cantidadDeCasillerosQueDeberaAvanzar);
		}
	}

}