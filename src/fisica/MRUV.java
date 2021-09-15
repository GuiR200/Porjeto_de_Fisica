package fisica;

public class MRUV {
	public float aceleracao;
	public float tempo;
	public byte velocidadeInicial;
	
	public float calcularOMRUV(float aceleracao, float tempo, float velocidadeInicial) {
		float MRUV = this.aceleracao * this.tempo + this.velocidadeInicial;
		
		return aceleracao * tempo + velocidadeInicial;
	}

}
