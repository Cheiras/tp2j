package vista.eventos;

import caible.propiedades.Propiedad;
import caible.propiedades.barrios.Barrio;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import vista.ContenedorPrincipal;
import vista.VentanaDeAlerta;

public class BotonConstruirEventHandler  implements EventHandler<ActionEvent> {

	Propiedad unaPropiedad;
	Stage ventana;
	ContenedorPrincipal contenedor;
	
	public BotonConstruirEventHandler(Propiedad unaPropiedad,Stage unStage,ContenedorPrincipal contenedor) {
		this.unaPropiedad=unaPropiedad;
		this.ventana=unStage;
		this.contenedor=contenedor;
	}
	
	@Override
	public void handle(ActionEvent actionEvent) {
		try {
		((Barrio)unaPropiedad).construir();
		}
		catch(RuntimeException e) {
			VentanaDeAlerta alerta=new VentanaDeAlerta("Error","No se puede construir en la propiedad");
			alerta.display();
		}
		ventana.close();
		contenedor.update();
	}
}
