package aplicacao;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
 
import javax.swing.JOptionPane;
import javax.xml.crypto.Data;

import metodoOrdenacao.BubbleSort;
import metodoOrdenacao.Colletions;
import metodoOrdenacao.InsertSort;
import metodoOrdenacao.Ordenacao;
import metodoOrdenacao.QuickSort;
import metodoPesquisa.Pesquisa;
import selectArq.SelectArquivo;

public class Aplicacao {
	public static void main(String[] args) throws Exception {

		
		
		SelectArquivo select = new SelectArquivo(JOptionPane.showInputDialog("informe o caminho do arquivo! "));
//		
//		
//		Pesquisa pes = new Pesquisa();
//
//		Colletions col = new Colletions();
//		
		InsertSort ins = new InsertSort();
//		
//		Ordenacao ordena = new Ordenacao();
//		
//		QuickSort qk = new QuickSort(); 
//	
//		BubbleSort bs = new BubbleSort();
//
//		pes.pesquisar(select.getDados().get(0));
//
//		pes.pesquisar02(select.getDados().get(0), select.getDados().indexOf("teste 03"));
//
//		System.out.println("Tempo de importação: " + select.retornarTempoImportacao() + "\nTempo de pesquisa: "
//				+ pes.retornarTempoPesquisa());

//		col.collection(select.getDados());
//		
		ins.insertionSort(select.getDados());
		
//		qk.qsor(select.getDados());
		
		
//		bs.bubbleSort(select.getDados());
		
//		String caminho = "C:\\Users\\Raphael\\Desktop\\Teste";
//		
//		String novoCam = caminho.concat("\\");
//		
//		String nomeArquivo = "teste04.txt";
//		
//		select.SalvarArquivo(qk.getDadosAux(), novoCam.concat(nomeArquivo));
		
		
		
	}

}

