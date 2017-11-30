package vista.eventos;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import partida.Partida;
import vista.ContenedorPrincipal;
import vista.VistaConstruccionesAVenderJugador;

public class BotonOpcionVenderConstruccionEventHandler  implements EventHandler <ActionEvent>{

    Stage stage;
    Partida partida;
	private ContenedorPrincipal contenedor;
	
	public BotonOpcionVenderConstruccionEventHandler(Stage stage, Partida partida, ContenedorPrincipal contenedorPrincipal) {
        this.stage = stage;
        this.partida = partida;
        this.contenedor = contenedorPrincipal;
	}
	@Override
	public void handle(ActionEvent actionEvent) {
		VistaConstruccionesAVenderJugador ventanaPropiedades=new VistaConstruccionesAVenderJugador(partida.jugadorActual(),this.contenedor);
		ventanaPropiedades.display();
	}
}
