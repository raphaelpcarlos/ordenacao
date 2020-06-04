/*Classe para importar o arquivo atraves do paramentro da classe SelectArquivo
*
*/

package dados;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import temporizador.Tempotizador;

public class Dados {
	
	private ArrayList<String> dados;

	Tempotizador temporizadorDados = new Tempotizador();
	
	//Metodos getters and setters
	public ArrayList<String> getDados() {
		return dados;
	}

	public void setDados(ArrayList<String> dados) {
		this.dados = dados;
	}
	

	// Metodo para importar o arquivo
	public void impDados(Path path) throws IOException {

		temporizadorDados.iniciar();
		
		try {

			
			dados = (ArrayList<String>) Files.readAllLines(path);

		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "Arquivo invalido!");
		}

		temporizadorDados.finalizar();
	}
	
	//Metodo para retornar o tempo de importação do arquivo
	public long retornarTempoImportacao() {
		
		return temporizadorDados.getTempoFinal();
	}

}
