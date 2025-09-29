package sistemaFrete;

import java.util.List;
import java.util.ArrayList;

public class ServicoDeEntrega {
	private List<Fretavel> itens = new ArrayList<>(); // Lista de itens fretáveis

	public void addItem(Fretavel item) {
		itens.add(item);
	}

	public double calcularCustoTotal(double distanciaEmKm) {
		double total = 0;

		for (Fretavel item : itens) {
			total += item.calcularCustoFrete(distanciaEmKm);
		}
		return total;
	}

	public void limparItens() {
		itens.clear();
	}
}