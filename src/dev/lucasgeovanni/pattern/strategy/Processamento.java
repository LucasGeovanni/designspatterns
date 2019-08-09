package dev.lucasgeovanni.pattern.strategy;

public class Processamento {	
	
	public void gerarPagamento(ProcessaPagamento processa) {
		processa.processar();
	}
	
}
