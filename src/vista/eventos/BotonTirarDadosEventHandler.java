package vista.eventos;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import partida.Partida;
import vista.ContenedorPrincipal;
import vista.VentanaDeAlerta;

public class BotonTirarDadosEventHandler implements EventHandler<ActionEvent> {

	Stage stage;// no se usa?
	Partida partida;
	private ContenedorPrincipal contenedor;

	public BotonTirarDadosEventHandler(Stage stage, Partida partida, ContenedorPrincipal contenedorPrincipal) {
		this.stage = stage;
		this.partida = partida;
		this.contenedor = contenedorPrincipal;

	}

	@Override
	public void handle(ActionEvent actionEvent) {
		if (partida.yaSeTiraronDados()){
			VentanaDeAlerta alerta=new VentanaDeAlerta("Error","Ya tiraste dados");
			alerta.display();
		}
		else {
			partida.tirarDados();
			contenedor.update();
		}

	}
}
