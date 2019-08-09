package dev.lucasgeovanni.pattern.builder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GeraNotaFiscal {

	private LocalDate data;

	private Double valor;

	private String observacao;

	private List<String> produtos = new ArrayList<>();

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
		return this.toString();
	}

	@Override
	public String toString() {
		return "geraNotaFiscal [data=" + data + ", valor=" + valor + ", observacao=" + observacao + ", produtos="
				+ produtos + "]";
	}

}
