package dev.lucasgeovanni.pattern.observer;

public class PagamentoCartao extends PagamentoTemplate {

	@Override
	public void imprimir() {
		System.out.println("Processando Pagamento via Cartão");				
	}

	

}
