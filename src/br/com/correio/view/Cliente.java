package br.com.correio.view;

import br.com.correio.dominio.Central;

public class Cliente {

	private int cartasRecebidas;
	private Central central;
	
	public void receberCarta() {
		central.entregar(1);
	}
	
}
