package vista.eventos;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class OpcionAcercaDeEventHandler implements EventHandler<ActionEvent> {

	@Override
	public void handle(ActionEvent actionEvent) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Instrucciones.");
		alert.setHeaderText("Instrucciones.");
		String mensaje = "1) A través de vender, comprar y alquilar propiedades, convertirse en el jugador más rico y, a la vez, conducir al resto a la bancarrota."
				+ "\n2) Antes de comenzar el juego, todos los participantes recibirán del 100.000 pesos."
				+ "\nEl primer jugador lanza los dados y mueve su ficha alrededor del tablero, en la dirección de la flecha, el número de espacios indicado por el total de ambos dados.  Los turnos corren en el sentido de las agujas del reloj alrededor de la mesa; cada jugador arroja los dados y avanza su ficha el número indicado de casillas, aprovechando las opciones que le da el resultado de su tirada. La ficha se quedará en esa casilla hasta que se produzca una nueva tirada.  Una o varias fichas pueden permanecer simultáneamente en la misma casilla.  Si un jugador obtiene un doble, tiene el derecho a tirar de nuevo.";
		alert.setContentText(mensaje);
		alert.show();
	}
}
