package vista.eventos;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import caible.propiedades.Propiedad;
import javafx.stage.Stage;

public class BotonVenderPropiedadEventHandler implements EventHandler<ActionEvent> {
	Propiedad unaPropiedad;
	Stage ventana;
	
	public BotonVenderPropiedadEventHandler(Propiedad unaPropiedad,Stage unStage) {
		this.unaPropiedad=unaPropiedad;
		this.ventana=unStage;
	}
	
	@Override
	public void handle(ActionEvent actionEvent) {
		unaPropiedad.vendete();
		ventana.close();
	}
}
