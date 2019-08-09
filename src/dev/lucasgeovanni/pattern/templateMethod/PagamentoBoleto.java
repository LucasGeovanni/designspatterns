package dev.lucasgeovanni.pattern.templateMethod;

public class PagamentoBoleto extends PagamentoTemplate {

	@Override
	public void imprimir() {
		System.out.println("Processando Pagamento via Boleto");
	}

}
