package vista.eventos;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import partida.Partida;
import vista.ContenedorPrincipal;
import vista.VentanaDeAlerta;
import vista.VistaConstruccionesParaHacerJugador;

public class BotonConstruirHandler implements EventHandler<ActionEvent> {
	

    Stage stage;//no se usa?
    Partida partida;
	private ContenedorPrincipal contenedor;
    
    public BotonConstruirHandler(Stage stage, Partida partida, ContenedorPrincipal contenedorPrincipal) { 
        this.stage = stage;
        this.partida = partida;
        this.contenedor = contenedorPrincipal;
               
    }

    @Override
    public void handle(ActionEvent actionEvent) {
    	if (!partida.yaSeTiraronDados()) {
    		VistaConstruccionesParaHacerJugador ventanaPropiedades=new VistaConstruccionesParaHacerJugador(partida.jugadorActual(),this.contenedor);
        	ventanaPropiedades.display();
    	}
    	else {
    		VentanaDeAlerta alerta=new VentanaDeAlerta("Error","No podes construir despues de haber tirado dados");
    		alerta.display();
    	}
    }
}
