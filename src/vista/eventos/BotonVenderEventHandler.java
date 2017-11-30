package vista.eventos;

import caible.propiedades.Propiedad;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import partida.Partida;
import vista.ContenedorPrincipal;
import vista.VistaDosOpciones;
import javafx.scene.control.Button;
import vista.eventos.BotonOpcionVenderPropiedadEventHandler;
import vista.eventos.BotonOpcionVenderConstruccionEventHandler;

public class BotonVenderEventHandler  implements EventHandler <ActionEvent>{

    Stage stage;
    Partida partida;
	ContenedorPrincipal contenedor;
	

	public BotonVenderEventHandler(Stage stage,Partida partida,ContenedorPrincipal contenedor) {
        this.stage = stage;
        this.partida = partida;
        this.contenedor = contenedor;
	}
	
	@Override
	public void handle(ActionEvent actionEvent) {
		Button boton1=new Button("Propiedades");
		boton1.setMaxWidth(100);
		BotonOpcionVenderPropiedadEventHandler handlerPropiedades=new BotonOpcionVenderPropiedadEventHandler(this.stage,this.partida,this.contenedor);
		boton1.setOnAction(handlerPropiedades);
		Button boton2=new Button("Construcciones");
		boton2.setMaxWidth(100);
		BotonOpcionVenderConstruccionEventHandler handlerConstrucciones=new BotonOpcionVenderConstruccionEventHandler(this.stage,this.partida,this.contenedor);
		boton2.setOnAction(handlerConstrucciones);
		VistaDosOpciones dosOpciones=new VistaDosOpciones(this.stage,this.contenedor,this.partida,"¿Que desea vender?",boton1,boton2);
		dosOpciones.display();
	}
}
