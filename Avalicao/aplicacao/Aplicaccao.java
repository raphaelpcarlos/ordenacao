package aplicacao;

import java.awt.HeadlessException;
import java.io.IOException;

import javax.swing.JOptionPane;

import selectArq.SelectArquivo;

public class Aplicaccao {
	
	public static void main(String[] args) throws HeadlessException, IOException {
		
		
		SelectArquivo select = new SelectArquivo(JOptionPane.showInputDialog("informe o caminho do arquivo! "));
		
		
		Object[] opcoes = {"Consultar", "Ordenar", "informações" };
		
		 int escolha = JOptionPane.showOptionDialog(null, "Importar arquivo", "escolha", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, opcoes, "Consultar");
		
		switch (escolha) {
		
		case 0:
			
			

		
		}
		
	}


}
