package dev.lucasgeovanni.pattern.builder;

public class BuilderMain {

	public static void main(String[] args) {
		
		new Processamento().gerarPagamento(new PagamentoBoleto());
		
		GeraNotaFiscal gerar = new GeraNotaFiscal()
				.dataAtual()
				.comObservacoes("Obs..")
				.valor(1950.00)
				.produto("Geladeira")
				.produto("fogão");
				
		String nota = gerar.notaFiscal();
		
		System.out.println(nota);

	}

}
