package vista.eventos;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import partida.Partida;
import vista.ContenedorPrincipal;

public class BotonComprarCasilleroActualEventHandler implements EventHandler<ActionEvent> {

    Stage stage;//no se usa?
    Partida partida;
	private ContenedorPrincipal contenedor;
    
    public BotonComprarCasilleroActualEventHandler(Stage stage, Partida partida, ContenedorPrincipal contenedorPrincipal) { 
        this.stage = stage;
        this.partida = partida;
        this.contenedor = contenedorPrincipal;
               
    }

    @Override
    public void handle(ActionEvent actionEvent) {

        	partida.comprarCasilleroActual();
        	contenedor.setPanelDerecha();

    }
}
