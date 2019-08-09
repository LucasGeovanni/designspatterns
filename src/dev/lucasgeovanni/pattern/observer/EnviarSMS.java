package dev.lucasgeovanni.pattern.observer;

public class EnviarSMS implements RotinaPagamento {

	@Override
	public void executa() {
		System.out.println("Enviando SMS para 9999-99999...");
	}

}
