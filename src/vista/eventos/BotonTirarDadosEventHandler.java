package vista.eventos;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import movimiento.Tirador;
import partida.jugador.Jugador;

public class BotonTirarDadosEventHandler implements EventHandler<ActionEvent> {

    Stage stage;
    Jugador jugadorActual;
    Tirador tirador;

    public BotonTirarDadosEventHandler(Stage stage, Tirador tirador,Jugador unJugador) {
        this.stage = stage;
        this.tirador = tirador;
        this.jugadorActual = unJugador;
        
    }

    @Override
    public void handle(ActionEvent actionEvent) {

        try {
        	int numeroObtenido = this.tirador.tirar();
            jugadorActual.avanzar(numeroObtenido);
        }catch(RuntimeException e) {
        	this.handle(actionEvent);
        }

        
        ///stage.setScene(proximaEscena);
        
    }
}
