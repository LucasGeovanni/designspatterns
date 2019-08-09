package dev.lucasgeovanni.pattern.observer;

public class ObserverMain {

	public static void main(String[] args) {
		
		new Processamento().gerarPagamento(new PagamentoBoleto());
		
		GeraNotaFiscal gerar = new GeraNotaFiscal()
				.dataAtual()
				.comObservacoes("Obs..")
				.valor(1950.00)
				.produto("Geladeira")
				.produto("fogão");
		
		gerar.adiconaRotina(new EnviarEmail());
		gerar.adiconaRotina(new EnviarSMS());
		
		String nota = gerar.notaFiscal();
		
		System.out.println(nota);
	}

}
