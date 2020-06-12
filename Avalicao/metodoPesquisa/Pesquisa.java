//M�todo para realizar a pesquisa.

package metodoPesquisa;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import dados.Dados;
import temporizador.Tempotizador;

public class Pesquisa {

	Tempotizador temporizadorPesquisaNome = new Tempotizador();

	Tempotizador temporizadorPesquisaIndice = new Tempotizador();

	Tempotizador temporizadorPesquisaLinear = new Tempotizador();

	Dados informacao = new Dados();

	// Metodo para pesquisar pelo nome
	public void pesquisar(ArrayList<String> informacao, String dados)
			throws Exception, IndexOutOfBoundsException, NumberFormatException {

		if (informacao.contains(dados)) {

			JOptionPane.showMessageDialog(null, "Arquivo encontrado na posi��o: " + (informacao.indexOf(dados) + 1)
					+ "\n\nTempo da pesquisa: " + temporizadorPesquisaIndice.getTempoFinal()+"Ms");

		} else {
			JOptionPane.showMessageDialog(null, "Arquivo N�O encontrado: ");

		}

		temporizadorPesquisaNome.finalizar();
	}

	// Metodo para retornar o tempo de pesquisa
	public long retornarTempoPesquisa() {

		return temporizadorPesquisaIndice.getTempoFinal();

	}

	// Metodo para pesquisar passando o indice
	public void pesquisar(String info, int b) throws Exception, IndexOutOfBoundsException, NumberFormatException {

		try {

			temporizadorPesquisaIndice.iniciar();

			JOptionPane.showMessageDialog(null, "Informa��o encontrada no arquivo: " + info + "\nNa posi��o: " + (b));

		} catch (IndexOutOfBoundsException e) {

			JOptionPane.showMessageDialog(null, "Elemento n�o encontrtado no arquivo");

		}

		temporizadorPesquisaIndice.finalizar();

	}
}
