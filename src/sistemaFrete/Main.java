package sistemaFrete;

public class Main {

	public static void main(String[] args) {
		
		ServicoDeEntrega entrega = new ServicoDeEntrega();
		
		//Primeira entrega
		entrega.addItem(new Funcionario());
		entrega.addItem(new Carro(4321, 2025));
		double totalEntrega1 = entrega.calcularCustoTotal(10);
		System.out.println("O custo total da entrega 1 é: R$" + totalEntrega1);
		
		entrega.limparItens();
		
		//Segunda entrega
		entrega.addItem(new Autonomo());
		entrega.addItem(new Motocicleta(1010, 2020));
		double totalEntrega2 = entrega.calcularCustoTotal(25);
		System.out.println("O custo total da entrega 2 é: R$" + totalEntrega2);

	}

}