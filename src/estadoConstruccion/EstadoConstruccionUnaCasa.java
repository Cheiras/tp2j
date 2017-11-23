package estadoConstruccion;
import caible.propiedades.barrios.BarrioNormal;
import partida.jugador.Jugador;

public class EstadoConstruccionUnaCasa extends EstadoConstruccion{

	public EstadoConstruccionUnaCasa(BarrioNormal unBarrio) {
		this.costoRenta=unBarrio.getPrecioAlquilerConUnaCasa();
	}

	@Override
	public EstadoConstruccion construir(Jugador duenio, BarrioNormal unBarrio) {
		// TODO Auto-generated method stub
		this.habilitadoAConstruir(duenio, unBarrio);
		EstadoConstruccion segundaCasaConstruida=new EstadoConstruccionSegundaCasa(unBarrio);
		cobrarCostoConstruccion(duenio,unBarrio.getPrecioConstruirCasa());
		return segundaCasaConstruida;
	}
	
}
