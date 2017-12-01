package vista.eventos;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
public class BotonCerrarVentanaEventHandler implements EventHandler <ActionEvent> {

	Stage stage;
	
	public BotonCerrarVentanaEventHandler(Stage stage) {
		this.stage=stage;
	}
	
	@Override
	public void handle(ActionEvent actionEvent) {
		stage.close();
	}
}
