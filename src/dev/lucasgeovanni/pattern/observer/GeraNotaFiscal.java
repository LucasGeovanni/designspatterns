package dev.lucasgeovanni.pattern.observer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GeraNotaFiscal {

	private LocalDate data;

	private Double valor;

	private String observacao;

	private List<String> produtos = new ArrayList<>();

	private List<RotinaPagamento> rotinas = new ArrayList<>();

	public void adiconaRotina(RotinaPagamento rotina) {
		rotinas.add(rotina);
	}

	public GeraNotaFiscal dataAtual() {
		this.data = LocalDate.now();
		return this;
	}

	public GeraNotaFiscal valor(Double valor) {
		this.valor = valor;
		return this;
	}

	public GeraNotaFiscal comObservacoes(String observacao) {
		this.observacao = observacao;
		return this;
	}

	public GeraNotaFiscal produto(String produto) {
		produtos.add(produto);
		return this;
	}

	public String notaFiscal() {
		executaRotinas();
		return this.toString();
	}

	private void executaRotinas() {
		rotinas.forEach(RotinaPagamento::executa);
	}

	@Override
	public String toString() {
		return "geraNotaFiscal [data=" + data + ", valor=" + valor + ", observacao=" + observacao + ", produtos="
				+ produtos + "]";
	}

}
