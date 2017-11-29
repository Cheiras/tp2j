package vista.eventos;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import partida.Partida;
import vista.ContenedorPrincipal;

public class BotonTerminarTurnoEventHandler implements EventHandler<ActionEvent> {

    Stage stage;
    Partida partida;
    ContenedorPrincipal contenedor;
    
    public BotonTerminarTurnoEventHandler(Stage stage, Partida partida, ContenedorPrincipal contenedorPrincipal) { 
        this.stage = stage;
        this.partida = partida;
        this.contenedor = contenedorPrincipal;
               
    }

    @Override
    public void handle(ActionEvent actionEvent) {

        	partida.terminarTurno();
        	contenedor.setPanelDerecha();

    }
}
