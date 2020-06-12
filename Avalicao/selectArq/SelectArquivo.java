//Classe para informar o caminho do arquivo

package selectArq;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import dados.Dados;

public class SelectArquivo extends Dados {

	private String caminho;

	// Metodo Construtor sem parametro
	public SelectArquivo() {
	}

	// Metodo Construtor passando parametro
	public SelectArquivo(String caminho) throws IOException {
		this.caminho = caminho;
		selecinarArquivo();
	}

	public String getCaminho() {
		return caminho;
	}

	public void setCaminho(String caminho) {
		this.caminho = caminho;
	}

	// Metodo para receber o arquivo
	public void selecinarArquivo() throws IOException {

		Path path = Paths.get(this.caminho);

		// chamada do metodo impDados da Classe Dados
		impDados(path);

	}

	// Metodo para Salvar o arquivo passando uma array Lista
	public void SalvarArquivo(ArrayList<String> lista) throws IOException {

		try {

			String caminho = JOptionPane.showInputDialog("informe o caminho para salvar o arquivo: ");

			String nomeArquivo = JOptionPane.showInputDialog("informe o nome do arquivo: ");

			File arquivo = new File(caminho.concat("\\").concat(nomeArquivo).concat(".txt"));

			PrintWriter writer = new PrintWriter(arquivo);

			int i = 1;

			for (String dados : lista) {

				writer.println("Linha " + i + ": " + dados);
				i++;
			}
			writer.close();

		} catch (FileNotFoundException e) {

			JOptionPane.showMessageDialog(null, "O sistema não pode encontrar o caminho especificado", "Erro",
					JOptionPane.ERROR_MESSAGE);
		}

	}

	// Sobrecarga do metodo SalvarArquivo para salvar o tempo de execução
	public void SalvarArquivo(String lista) throws IOException, FileNotFoundException {

		try {

			String caminho = JOptionPane.showInputDialog("informe o caminho para salvar o arquivo: ");

			String nomeArquivo = JOptionPane.showInputDialog("informe o nome do arquivo: ");

			File arquivo = new File(caminho.concat("\\").concat(nomeArquivo).concat(".txt"));

			PrintWriter writer = new PrintWriter(arquivo);

			writer.println(lista);

			writer.close();

		} catch (FileNotFoundException e) {

			JOptionPane.showMessageDialog(null, "O sistema não pode encontrar o caminho especificado", "Erro",
					JOptionPane.ERROR_MESSAGE);
		}

	}

}
