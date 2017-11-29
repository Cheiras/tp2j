package vista.eventos;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import partida.Partida;

public class BotonComprarCasilleroActualEventHandler implements EventHandler<ActionEvent> {

    Stage stage;//no se usa?
    Partida partida;
    
    public BotonComprarCasilleroActualEventHandler(Stage stage, Partida partida) { 
        this.stage = stage;
        this.partida = partida;
               
    }

    @Override
    public void handle(ActionEvent actionEvent) {

        	partida.comprarCasilleroActual();

    }
}
