//Método para realizar a pesquisa.

package metodoPesquisa;

import javax.swing.JOptionPane;
import dados.Dados;
import temporizador.Tempotizador;


public class Pesquisa extends Pesquisas{
	private Dados dados;

	Tempotizador temporizadorPesquisa = new Tempotizador();

	// metodos getters and Setters
	public Dados getDados() {
		return dados;
	}

	public void setDados(Dados dados) {
		this.dados = dados;
	}

	// Metodo para pesquisar
	public void pesquisar(String dados) throws Exception {

		try {

			temporizadorPesquisa.iniciar();

			JOptionPane.showMessageDialog(null, "Informação encontrada no arquivo= " + dados);

		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "Elemento não encontrtado no arquivo");
		}

		temporizadorPesquisa.finalizar();
	}

	// Metodo para retornar o tempo de pesquisa
	public long retornarTempoPesquisa() {

		return temporizadorPesquisa.getTempoFinal();
	}

	// Metodo para pesquisar
	public void pesquisar02(String dados, int b) {

		try {

			JOptionPane.showMessageDialog(null,
					"Informação encontrada no arquivo= " + dados + "\nNa posição: " + (b + 1));

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Elemento não encontrtado no arquivo");
		}
	}
}
