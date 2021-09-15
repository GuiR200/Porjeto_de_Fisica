package fisica;

public class MRU {
	
	public float tempo;
	public float sentidoInicial;
	public byte sentidoFinal;
	
	public float calcularOMRU(float tempo, float senteidoInicial, float sentidofinal) {
		float MRU = this.tempo * this.sentidoInicial / this.sentidoFinal;
		
		return tempo * sentidoInicial / sentidoFinal;
	}

}
