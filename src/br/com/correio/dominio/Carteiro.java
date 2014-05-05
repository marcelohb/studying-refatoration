package br.com.correio.dominio;

import java.util.List;
import java.util.Random;

public class Carteiro {

	private Boolean trabalhar;
	private String nome;
	private List<Central> centralCartas;
	
	public Carteiro(String nome) {
		this.nome = nome;
	}
	
	public void iniciarTrabalho() {
		this.trabalhar = true;
	}
	
	public void registrarCarta(Central central) {
		this.centralCartas.add(central);
	}
	
	public void entregar() {
		for (Central central : this.centralCartas) {
			central.entregar(1);
		}
	}
	
}
