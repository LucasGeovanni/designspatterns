package dev.lucasgeovanni.pattern.strategy;

public class PagamentoBoleto implements ProcessaPagamento {

	@Override
	public void processar() {
		System.out.println("Processando Pagamento via Boleto");		
	}

}
