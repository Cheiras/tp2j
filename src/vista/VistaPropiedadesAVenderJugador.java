package vista;
import partida.jugador.Jugador;
import vista.eventos.BotonVenderPropiedadEventHandler;
public class VistaPropiedadesAVenderJugador extends VistaPropiedadesJugador {

	public VistaPropiedadesAVenderJugador(Jugador unJugador,ContenedorPrincipal contenedor) {
		super(unJugador,contenedor);
		this.aplicarHandler();
	}
	
	public void aplicarHandler() {
		int numPropiedades=this.propiedadesDelJugador.size();
		for(int posicion=0;posicion<numPropiedades;posicion++) {
			BotonVenderPropiedadEventHandler handler=new BotonVenderPropiedadEventHandler(this.propiedadesDelJugador.get(posicion),this.ventana,this.contenedorPrincipal);
			this.botonesPropiedad.get(posicion).setOnAction(handler);
		}
	}
}
