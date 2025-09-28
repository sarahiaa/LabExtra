package sistemaFrete;

public class Funcionario extends Entregador implements Fretavel{
	@Override
	public double calcularCustoFrete(double distanciaEmKm) {
		return 5.00;
	}
	
}
