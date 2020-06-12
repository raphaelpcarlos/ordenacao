package metodoOrdenacao;

import java.util.ArrayList;
import java.util.Collections;

import temporizador.Tempotizador;

public class ColletionsTest extends Ordenacao{
	
	Tempotizador tempotizadorColletios = new Tempotizador();
	

	// Metodo para retornar o tempo de ordenacao
	public long retornaTempoOrdenacaoCollectio() {

		return tempotizadorColletios.getTempoFinal();
	}

	//Pesquisa utilizando Collection
	public void collection(ArrayList<String> dados) {
		
		tempotizadorColletios.iniciar();
		
		dadosAux.addAll(dados);
		
		Collections.sort(dadosAux);
		
		tempotizadorColletios.finalizar();
		
	}
	
}
