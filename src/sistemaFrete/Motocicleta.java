package sistemaFrete;

public class Motocicleta extends Veiculo implements Fretavel{
	
	public Motocicleta(int placa, int ano) {
		super(placa, ano); //Chama o construtuor inteiro de uma vez
	}
	
	@Override
	public double calcularCustoFrete(double distanciaEmKm) {
		return (distanciaEmKm * 0.45);
	}

}
