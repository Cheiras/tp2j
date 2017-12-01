package vista.eventos;


import caible.especiales.Carcel;
import excepciones.MontoInsuficienteException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import partida.Partida;
import vista.ContenedorPrincipal;
import vista.VentanaDeAlerta;

public class BotonPagarFianzaEventHandler implements EventHandler<ActionEvent> {

	Partida partida;
	Stage ventana;
	ContenedorPrincipal contenedor;

	
	public BotonPagarFianzaEventHandler(Partida partida, Stage unStage,ContenedorPrincipal contenedor) {
		this.partida = partida;
		this.ventana=unStage;
		this.contenedor=contenedor;

	}
	
	@Override
	public void handle(ActionEvent actionEvent) {
		try {
			((Carcel)this.partida.getCaibleActual()).pagarFianza(this.partida.jugadorActual());
		}
		catch(MontoInsuficienteException e) {
			VentanaDeAlerta alerta=new VentanaDeAlerta("Error","Monto Insuficiente para pagar la fianza");
			alerta.display();
		}
		catch(RuntimeException e) {
			VentanaDeAlerta alerta=new VentanaDeAlerta("Error","No necesitas pagar fianza");
			alerta.display();
		}
		
		contenedor.update();
	}
}
