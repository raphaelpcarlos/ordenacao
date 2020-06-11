//Classe para informar o caminho do arquivo

package selectArq;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

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

	// Metodo para Salvar o arquivo
	public void SalvarArquivo(ArrayList<String> lista, String caminho) throws IOException {

		File arquivo = new File(caminho);

		PrintWriter writer = new PrintWriter(arquivo);

		int i = 1;

		for (String dados : lista) {

			writer.println("Linha " + i + ": " + dados);
			i++;
		}
		writer.close();
	}

}
