package aplicacao;

import javax.swing.JOptionPane;
import metodoOrdenacao.BubbleSort;
import metodoOrdenacao.ColletionsTest;
import metodoOrdenacao.InsertSort;
import metodoOrdenacao.QuickSort;
import metodoPesquisa.Pesquisa;
import selectArq.SelectArquivo;

public class Aplicaccao {

	public static void main(String[] args) throws Exception, IndexOutOfBoundsException, NumberFormatException {

		SelectArquivo select = new SelectArquivo(JOptionPane.showInputDialog("informe o caminho do arquivo! "));

		BubbleSort bs = new BubbleSort();

		ColletionsTest cs = new ColletionsTest();

		Pesquisa pesquisa = new Pesquisa();

		InsertSort is = new InsertSort();

		QuickSort qs = new QuickSort();

		// Menu para escolher as opções

		int escolha;

		do {

			Object[] opcoes = { "Consultar", "Ordenar", "informações", "Sair" };

			escolha = JOptionPane.showOptionDialog(null, "Importar arquivo", "escolha",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, opcoes, "Consultar");

			switch (escolha) {

			// tela de consulta dos dados do arquivo
			case 0:

				int escolha1;

				do {

					Object[] opcoes1 = { "Consultar pela posição", "Consultar pelo nome", "Sair" };

					escolha1 = JOptionPane.showOptionDialog(null, "Importar arquivo", "escolha",
							JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, opcoes1, "Consultar");

					switch (escolha1) {

					// Consulta pela posição
					case 0:

						int index = Integer
								.parseInt(JOptionPane.showInputDialog(null, "Informa o valor para buscar no arquivo"));

						pesquisa.pesquisar(select.getDados().get(index - 1), index);

						break;

					// Consulta pelo nome
					case 1:

						String nomeArquivo = JOptionPane.showInputDialog(null,
								"Informa o nome  para buscar no arquivo");

						pesquisa.pesquisar(select.getDados(), nomeArquivo);

						break;

					}

				} while (escolha1 != 2);

				break;

			// Tela de ordenção os dados do arquivo
			case 1:

				int escolha3;

				do {

					Object[] opcoes3 = { "Bubble Sort", "Colletions", "insert Sort", "Quick Sort", "Sair" };

					escolha3 = JOptionPane.showOptionDialog(null, "Importar arquivo", "escolha",
							JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, opcoes3, "Consultar");

					switch (escolha3) {

					// Metodos bubble sorte
					case 0:

						bs.bubbleSort(select.getDados());

						select.SalvarArquivo(bs.getDadosAux());

						break;
					// Metodos colletions
					case 1:

						cs.collection(select.getDados());

						select.SalvarArquivo(cs.getDadosAux());

						break;
					// Metodos Insert Sort
					case 2:

						is.insertionSort(select.getDados());

						select.SalvarArquivo(is.getDadosAux());

						break;

					// Metodo quick Sort
					case 3:

						qs.qsor(select.getDados());

						select.SalvarArquivo(qs.getDadosAux());

						break;

					}

				} while (escolha3 != 4);

				break;

			case 2:

				JOptionPane.showMessageDialog(null,
						"Tempo de ordenação do Bubble Sort: " + qs.retornaTempoOrdenacaoQuickSort()+" Ms"
								+ "\nTempo de ordenação do Colletions: " + cs.retornaTempoOrdenacaoCollectio()+" Ms"
								+ "\nTempo de ordenação do insert Sort: " + is.retornaTempoOrdenacaoInsertSort()+" Ms"
								+ "\nTempo de ordenação do Quick sort: " + qs.retornaTempoOrdenacaoQuickSort()+" Ms"
								+ "\n\nTotal de linhas lidas: " + (select.getDados().size()),
						"Relatório", JOptionPane.INFORMATION_MESSAGE);

				int valida = JOptionPane.showConfirmDialog(null, "Deseja salvar as informações?", "Relatório",
						JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

				if (valida != 1) {

					select.SalvarArquivo("Tempo de ordenação do Bubble Sort: " + qs.retornaTempoOrdenacaoQuickSort()+" Ms"
							+ "\nTempo de ordenação do Colletions: " + cs.retornaTempoOrdenacaoCollectio()+" Ms"
							+ "\nTempo de ordenação do insert Sort: " + is.retornaTempoOrdenacaoInsertSort()+" Ms"
							+ "\nTempo de ordenação do Quick sort: " + qs.retornaTempoOrdenacaoQuickSort()+" Ms"
							+ "\nTotal de linhas lidas: " + (select.getDados().size()));
				}

				break;

			case 3:

				JOptionPane.showMessageDialog(null, "Sair!");
				break;

			}

		} while (escolha != 3);

	}

}
