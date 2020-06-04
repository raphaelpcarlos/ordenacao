package aplicacao;

import java.io.IOException;
import javax.swing.JOptionPane;

import metodoOrdenacao.InsertSort;
import metodoOrdenacao.Ordenacao;
import metodoPesquisa.Pesquisa;
import selectArq.SelectArquivo;

public class Aplicacao {
	public static void main(String[] args) throws Exception {

		SelectArquivo select = new SelectArquivo(JOptionPane.showInputDialog("informe o caminho do arquivo! "));
		
		Pesquisa pes = new Pesquisa();
		
		InsertSort ins = new InsertSort();
		
		pes.pesquisar(select.getDados().get(0));
		
		pes.pesquisar02(select.getDados().get(0), select.getDados().indexOf("teste 03"));
		
		
		
		System.out.println("Tempo de importação: " +select.retornarTempoImportacao() +
		"\nTempo de pesquisa: " +pes.retornarTempoPesquisa());
		
		ins.insertionSort(select.getDados());
		
	}

}

/*
C:\Users\Raphael\Desktop\Estudos Raphael\Faculdade\Programação de Soluções Computacionais - 2020 - Primeiro Semestre\Avaliacao02\avaliacao 02.1/NumerosOrdenarArquivo.txt
*/