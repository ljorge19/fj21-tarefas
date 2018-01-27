package br.com.caelum.tarefas.modelo;

import java.util.Calendar;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.sun.istack.internal.NotNull;

public class Tarefa {
	private Long id;
	private String descricao;
	private boolean finalizado;
	private Calendar dataFinalizacao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	@NotEmpty(message="O campo descrição não pode estar vazio")
	@NotNull
	@Size(min=5, message="O campo descrição deve ter mais de 5 caracteres")
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isFinalizado() {
		return finalizado;
	}

	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}

	public Calendar getDataFinalizacao() {
		return dataFinalizacao;
	}

	public void setDataFinalizacao(Calendar dataFinalizacao) {
		this.dataFinalizacao = dataFinalizacao;
	}

}
