package vista.eventos;

import excepciones.CaibleNoComprableException;
import excepciones.ComprarAntesDeTirarDadosException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import partida.Partida;
import vista.ContenedorPrincipal;
import vista.VentanaDeAlerta;

public class BotonComprarCasilleroActualEventHandler implements EventHandler<ActionEvent> {

	Stage stage;// no se usa?
	Partida partida;
	private ContenedorPrincipal contenedor;

	public BotonComprarCasilleroActualEventHandler(Stage stage, Partida partida,
			ContenedorPrincipal contenedorPrincipal) {
		this.stage = stage;
		this.partida = partida;
		this.contenedor = contenedorPrincipal;

	}

	@Override
	public void handle(ActionEvent actionEvent) {
		try {
			partida.comprarCasilleroActual();
			contenedor.setPanelDerecha();

		} catch (CaibleNoComprableException e) {
			VentanaDeAlerta alerta = new VentanaDeAlerta("Error", "No se puede comprar este casillero");
			alerta.display();
		} catch (ComprarAntesDeTirarDadosException e) {
			VentanaDeAlerta alerta = new VentanaDeAlerta("Error", "No se puede comprar un casillero antes de tirar dados");
			alerta.display();
		}
	}
}