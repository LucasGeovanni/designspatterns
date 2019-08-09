package dev.lucasgeovanni.pattern.observer;

public class PagamentoBoleto extends PagamentoTemplate {

	@Override
	public void imprimir() {
		System.out.println("Processando Pagamento via Boleto");
	}

}
