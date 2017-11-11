package movimiento;

import java.util.Random;

public class Dado {
	Random randomNum = new Random();
	private int caras;
	
	public Dado(int caras){
		this.caras = caras;
	}
	
	public int tirar(){
		int valor = randomNum.nextInt(caras) + 1;
		return valor;
	}
	
}
