package vista.eventos;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import partida.Partida;

public class BotonTirarDadosEventHandler implements EventHandler<ActionEvent> {

    Stage stage;//no se usa?
    Partida partida;
    
    public BotonTirarDadosEventHandler(Stage stage, Partida partida) { 
        this.stage = stage;
        this.partida = partida;
               
    }

    @Override
    public void handle(ActionEvent actionEvent) {

        	partida.tirarDados();

    }
}
