package view;

import br.edu.fateczl.fila.Fila;
import controller.OperacaoController;
import model.Cliente;

public class Principal {

	public static void main(String[] args) {
		Fila<Cliente> fila = new Fila<>();
		OperacaoController opController = new OperacaoController();

		for (int i = 0; i < 20; i++) {
			String nomeCliente = "Cliente" + (i + 1);
			int quantidadePecas = (int) (Math.random() * 31) + 20;
			Float valorPecas = ((float) (Math.random() * 96) + 5);
			Cliente cliente = new Cliente(nomeCliente, quantidadePecas, valorPecas);
			fila.insert(cliente);
			opController.caixa(fila);
		}

	}

}
