package vista.eventos;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import caible.propiedades.Propiedad;
import javafx.stage.Stage;
import vista.VentanaDeAlerta;
import vista.ContenedorPrincipal;

public class BotonVenderPropiedadEventHandler implements EventHandler<ActionEvent> {
	Propiedad unaPropiedad;
	Stage ventana;
	ContenedorPrincipal contenedor;
	
	public BotonVenderPropiedadEventHandler(Propiedad unaPropiedad,Stage unStage,ContenedorPrincipal contenedor) {
		this.unaPropiedad=unaPropiedad;
		this.ventana=unStage;
		this.contenedor=contenedor;
	}
	
	@Override
	public void handle(ActionEvent actionEvent) {
		try {
		unaPropiedad.vendete();
		}
		catch(RuntimeException e) {
			VentanaDeAlerta alerta=new VentanaDeAlerta("Error","No se puede vender la propiedad");
			alerta.display();
		}
		ventana.close();
		contenedor.update();
	}
}
