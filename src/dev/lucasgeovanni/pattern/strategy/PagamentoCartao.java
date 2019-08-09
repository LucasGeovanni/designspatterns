package dev.lucasgeovanni.pattern.strategy;

public class PagamentoCartao implements ProcessaPagamento {

	@Override
	public void processar() {
		System.out.println("Processando Pagamento via Cartão");		
	}

}
