//Método utilizando o InsertSort

package metodoOrdenacao;

import java.util.ArrayList;
import temporizador.Tempotizador;

public class InsertSort extends Ordenacao {

	Tempotizador temporizadorInsertSort = new Tempotizador();

	// Metodo para retornar o tempo de ordenacao
	public long retornaTempoOrdenacaoInsertSort() {

		return temporizadorInsertSort.getTempoFinal();
	}

	// Metodos insertSort
	public void insertionSort(ArrayList<String> dados) {

		// Iniciar o temporizador
		temporizadorInsertSort.iniciar();

		dadosAux.addAll(dados);

		int i, j;

		String aux;

		for (j = 1; j < dadosAux.size(); j++) {

			aux = dadosAux.get(j);

			i = j - 1;

			while (i >= 0) {
				if (aux.compareTo(dadosAux.get(i)) > 0) {
					break;
				}
				dadosAux.set((i + 1), dadosAux.get(i));
				i--;
			}
			dadosAux.set((i + 1), aux);

		}

		// finalizar o temporizador
		temporizadorInsertSort.finalizar();

		System.out.println("antigo" +dados.toString());
		
		System.out.println(dadosAux.toString());

		System.out.println("Tempo insert sort: " + retornaTempoOrdenacaoInsertSort());

	}
}
