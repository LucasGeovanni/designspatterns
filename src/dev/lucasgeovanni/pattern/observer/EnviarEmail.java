package dev.lucasgeovanni.pattern.observer;

public class EnviarEmail implements RotinaPagamento {

	@Override
	public void executa() {
		System.out.println("Enviando e-mail...");		
	}

	
}
