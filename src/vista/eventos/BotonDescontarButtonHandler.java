package vista.eventos;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import partida.Partida;
import vista.ContenedorPrincipal;

public class BotonDescontarButtonHandler implements EventHandler<ActionEvent> {

	Partida partida;
	Stage ventana;
	ContenedorPrincipal contenedor;

	public BotonDescontarButtonHandler(Partida partida, Stage unStage, ContenedorPrincipal contenedor) {
		this.partida = partida;
		this.ventana = unStage;
		this.contenedor = contenedor;

	}

	@Override
	public void handle(ActionEvent actionEvent) {
		partida.jugadorActual().reducirEfectivo(10000);
		contenedor.update();
	}
}
