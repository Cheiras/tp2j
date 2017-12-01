package vista;
import partida.jugador.Jugador;
import vista.eventos.BotonVenderUnaConstruccionEventHandler;

public class VistaConstruccionesAVenderJugador extends VistaPropiedadesJugador {

	public VistaConstruccionesAVenderJugador(Jugador unJugador,ContenedorPrincipal contenedor) {
		super(unJugador,contenedor);
		this.aplicarHandler();
	}
	
	public void aplicarHandler() {
		int numPropiedades=this.propiedadesDelJugador.size();
		for(int posicion=0;posicion<numPropiedades;posicion++) {
			BotonVenderUnaConstruccionEventHandler handler=new BotonVenderUnaConstruccionEventHandler(this.propiedadesDelJugador.get(posicion),this.ventana,this.contenedorPrincipal);
			this.botonesPropiedad.get(posicion).setOnAction(handler);
		}
	}
	
}
