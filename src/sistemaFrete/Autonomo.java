package sistemaFrete;

public class Autonomo extends Entregador implements Fretavel{
	
	@Override
	public double calcularCustoFrete(double distanciaEmKm) {
		return (distanciaEmKm * 0.95 );
	}

}