package sistemaFrete;

public class Carro extends Veiculo implements Fretavel{
	
	public Carro(int placa, int ano) {
		super(placa,ano);
	}
	
	@Override
	public double calcularCustoFrete(double distanciaEmKm) {
		return (distanciaEmKm * 0.45);
				
	}

}