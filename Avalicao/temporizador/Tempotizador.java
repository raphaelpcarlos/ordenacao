//Classe para calcular o inicio e o fim entre os metodos

package temporizador;

public class Tempotizador {

	private long iniciar;
	private long finalizar;
	private long tempoFinal;

	public long getIniciar() {
		return iniciar;
	}

	public void setIniciar(long iniciar) {
		this.iniciar = iniciar;
	}

	public long getFinalizar() {
		return finalizar;
	}

	public void setFinalizar(long finalizar) {
		this.finalizar = finalizar;
	}

	public long getTempoFinal() {
		return tempoFinal;
	}

	public void setTempoFinal(long tempoFinal) {
		this.tempoFinal = tempoFinal;
	}

	// Metodo para iniciar a contagem
	public void iniciar() {

		iniciar = System.currentTimeMillis();
	}

	// Metodo para finalizar a contagem
	public void finalizar() {

		finalizar = System.currentTimeMillis();

		// Calcular o tempo
		this.tempoFinal = (this.finalizar - this.iniciar);
	}

}
