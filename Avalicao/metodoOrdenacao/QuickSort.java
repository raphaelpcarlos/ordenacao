package metodoOrdenacao;

import java.util.ArrayList;

import temporizador.Tempotizador;

public class QuickSort extends Ordenacao {

	Tempotizador temporizadorQuickSort = new Tempotizador();

	// Metodo para retornar o tempo de ordenacao
	public long retornaTempoOrdenacaoQuickSort() {

		return temporizadorQuickSort.getTempoFinal();
	}

	public void qsor(ArrayList<String> dados) {

		temporizadorQuickSort.iniciar();

		dadosAux.addAll(dados);

		quicksort(getDadosAux(), 0, dados.size() - 1);

		temporizadorQuickSort.finalizar();

	}

	private void quicksort(ArrayList<String> dados, int p, int r) {

		if (p < r) {

			int q = partition(dados, p, r);
			if (q == r) {
				q--;
			}
			quicksort(dados, p, q);
			quicksort(dados, q + 1, r);
		}
	}

	private int partition(ArrayList<String> list, int p, int r) {
		String pivot = list.get(p);
		int lo = p;
		int hi = r;

		while (true) {
			while (list.get(hi).compareTo(pivot) >= 0 && lo < hi) {
				hi--;
			}
			while (list.get(lo).compareTo(pivot) < 0 && lo < hi) {
				lo++;
			}
			if (lo < hi) {

				String t = list.get(lo);

				list.set(lo, list.get(hi));

				list.set(hi, t);

			} else

				return hi;
		}
	}
}
