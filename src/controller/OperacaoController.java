package controller;

import br.edu.fateczl.fila.Fila;
import model.Cliente;

public class OperacaoController {

	public OperacaoController() {
	}
	
	public void caixa(Fila<Cliente> fila) {
		Cliente cliente = fila.remove();
		int quantidadePecas = cliente.QuantidadePecas;
		Float valorPecas = cliente.ValorPecas;
		Float valorTotal = quantidadePecas * valorPecas;
		System.out.println("Valor total da compra de " + cliente.Nome + ": " + valorTotal);
	}
      
}
