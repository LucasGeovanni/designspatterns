package dev.lucasgeovanni.pattern.builder;

public abstract class PagamentoTemplate implements ProcessaPagamento {

	@Override
	public void processar() {
		imprimir();	
	}

	public abstract void imprimir();

}
