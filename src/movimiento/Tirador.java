package movimiento;

import excepciones.NumeroDobleEnDadosException;

public class Tirador {
	
	private Dado dado1;
	private Dado dado2;
	private int valorTiradaDado1;
	private int valorTiradaDado2;

	public Tirador(Dado dado1, Dado dado2){
		this.dado1 = dado1;
		this.dado2 = dado2;
	}
	
	public int tirar(){
		valorTiradaDado1 = dado1.tirar();
		valorTiradaDado2 = dado2.tirar();
		if (this.dadosMismoValor()) {
			throw new NumeroDobleEnDadosException("Sacaste el mismo numero en los dos dados");
		}
		return valorTiradaDado1 + valorTiradaDado2;
	}
	
	public boolean dadosMismoValor(){
		return (valorTiradaDado1 == valorTiradaDado2);
	}
	
	
	/*Unicamente usado para los tests.*/
	public int getValorDado1(){
		return valorTiradaDado1;
	}
	
	public int getValorDado2(){
		return valorTiradaDado2;
	}
}
