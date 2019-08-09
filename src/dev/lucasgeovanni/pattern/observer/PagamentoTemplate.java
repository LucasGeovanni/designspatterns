package dev.lucasgeovanni.pattern.observer;

public abstract class PagamentoTemplate implements ProcessaPagamento {

	@Override
	public void processar() {
		imprimir();	
	}

	public abstract void imprimir();

}
