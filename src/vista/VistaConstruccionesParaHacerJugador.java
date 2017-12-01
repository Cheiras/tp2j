package vista;

import partida.jugador.Jugador;
import vista.eventos.BotonConstruirEventHandler;
public class VistaConstruccionesParaHacerJugador extends VistaPropiedadesJugador {

	public VistaConstruccionesParaHacerJugador(Jugador unJugador,ContenedorPrincipal contenedor) {
		super(unJugador,contenedor);
		this.aplicarHandler();
	}
	
	public void aplicarHandler() {
		int numPropiedades=this.propiedadesDelJugador.size();
		for(int posicion=0;posicion<numPropiedades;posicion++) {
			BotonConstruirEventHandler handler=new BotonConstruirEventHandler(this.propiedadesDelJugador.get(posicion),this.ventana,this.contenedorPrincipal);
			this.botonesPropiedad.get(posicion).setOnAction(handler);
		}
	}
	
}
