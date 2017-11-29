package vista.eventos;
import caible.propiedades.Propiedad;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import partida.Partida;
import partida.jugador.Jugador;
import vista.ContenedorPrincipal;
import vista.VistaPropiedadesAVenderJugador;
public class BotonVenderEventHandler implements EventHandler <ActionEvent> {
    Stage stage;
    Partida partida;
	private ContenedorPrincipal contenedor;
	
	public BotonVenderEventHandler (Stage stage, Partida partida, ContenedorPrincipal contenedorPrincipal) {
        this.stage = stage;
        this.partida = partida;
        this.contenedor = contenedorPrincipal;
	}
	
	@Override
	public void handle(ActionEvent actionEvent) {
		VistaPropiedadesAVenderJugador ventanaPropiedades=new VistaPropiedadesAVenderJugador(partida.jugadorActual());
		ventanaPropiedades.display();
	}
}
