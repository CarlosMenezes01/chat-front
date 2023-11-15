package edu.ifam.dra.chatfront.model;

import java.util.Date;


import jakarta.validation.constraints.NotBlank;

public class Mensagem {
	private Long id;
	
	private final Date dataHora;
	@NotBlank
	private String conteudo;
	private Contato emissor;
	private Contato receptor;
	
	public Mensagem() {
		super();
		this.dataHora = new Date();
		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	public Contato getEmissor() {
		return emissor;
	}
	public void setEmissor(Contato emissor) {
		this.emissor = emissor;
	}
	public Contato getReceptor() {
		return receptor;
	}
	public void setReceptor(Contato receptor) {
		this.receptor = receptor;
	}
	public Date getDataHora() {
		return dataHora;
	}
	
	
	
}
