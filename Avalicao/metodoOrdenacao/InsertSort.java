package metodoOrdenacao;

import java.util.ArrayList;

public class InsertSort extends Ordenacao {

	private ArrayList<String> dadosAux = new ArrayList<String>();

	public ArrayList<String> getDadosAux() {
		return dadosAux;
	}

	public void setDadosAux(ArrayList<String> dadosAux) {
		this.dadosAux = dadosAux;
	}

	//Metodo insert Sort
	public void insertionSort(ArrayList<String> dados) {

		for (int i = 1; i < dados.size(); i++) {

			String aux = dados.get(i);
			
			int j = i;

			//utilizar o equals
			while ( (j > 0) && aux.compareTo(dados.get(j) ) > 0  ) {
				
				
				dadosAux.add(dados.get(j-1)) ;
				
				j-=1;
				
			}
			
			dadosAux.add(aux);
			

		}
		
		System.out.println(dadosAux.toString());

	}
	
//Deu bom

}
