package dev.lucasgeovanni.pattern.strategy;

public class StrategyMain {

	public static void main(String[] args) {
		
		ProcessaPagamento pg1 = new PagamentoCartao();
		ProcessaPagamento pg2 = new PagamentoBoleto();

		new Processamento().gerarPagamento(pg1);
		new Processamento().gerarPagamento(pg2);

	}

}
