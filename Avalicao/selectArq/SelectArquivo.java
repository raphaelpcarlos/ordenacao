//Classe para informar o caminho do arquivo

package selectArq;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import dados.Dados;

public class SelectArquivo extends Dados {

	private String caminho;

	// Metodo Construtor
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

	public void selecinarArquivo() throws IOException {


		Path path = Paths.get(this.caminho);

		impDados(path);
	}

}
