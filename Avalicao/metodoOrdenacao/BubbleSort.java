package metodoOrdenacao;

import java.util.ArrayList;

public class BubbleSort extends Ordenacao {

	public void bubbleSort(ArrayList<String> dados) {

		dadosAux.addAll(dados);

		System.out.println("antigo" + dadosAux.toString());

		for (int j = 0; j < dadosAux.size(); j++) {
			
			for (int i = j+1; i < dadosAux.size(); i++) {

				if (dadosAux.get(i).compareTo(dadosAux.get(j)) < 0) {

					String aux = dadosAux.get(j);

					dadosAux.set(j, dadosAux.get(i));

					dadosAux.set(i, aux);

				}

			}
		}

		System.out.println("Buble Sort" + dadosAux.toString());
	}

}
