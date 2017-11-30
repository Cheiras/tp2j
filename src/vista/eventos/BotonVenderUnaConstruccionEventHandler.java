package vista.eventos;

import caible.propiedades.Propiedad;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import vista.ContenedorPrincipal;
import vista.VentanaDeAlerta;

public class BotonVenderUnaConstruccionEventHandler implements EventHandler <ActionEvent>  {
	Propiedad unaPropiedad;
	Stage ventana;
	ContenedorPrincipal contenedor;
	
	public BotonVenderUnaConstruccionEventHandler(Propiedad unaPropiedad,Stage unStage,ContenedorPrincipal contenedor) {
		this.unaPropiedad=unaPropiedad;
		this.ventana=unStage;
		this.contenedor=contenedor;
	}
	@Override
	public void handle(ActionEvent actionEvent) {
		try {
		unaPropiedad.venderConstruccion();
		}
		catch(RuntimeException e) {
			VentanaDeAlerta alerta=new VentanaDeAlerta("Requisitos insuficientes","No se puede realizar la venta");
			alerta.display();
		}
		ventana.close();
		contenedor.update();
	}
}
