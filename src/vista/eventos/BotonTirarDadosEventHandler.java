package vista.eventos;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import movimiento.Tirador;

public class BotonTirarDadosEventHandler implements EventHandler<ActionEvent> {

    Stage stage;
   // Scene proximaEscena;
    Tirador tirador;

    public BotonTirarDadosEventHandler(Stage stage, Tirador tirador) {
        this.stage = stage;
        this.tirador = tirador;
    }

    @Override
    public void handle(ActionEvent actionEvent) {

        try {
        	this.tirador.tirar();
        }catch(RuntimeException e) {
        	this.handle(actionEvent);
        }
        ///stage.setScene(proximaEscena);
        
    }
}
