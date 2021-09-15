package fisica;

public class VelocidadeMedia {
	public float imtervaloDeDeslocamento;
	public byte intervaloDeTempo;
	
	public float calcularAVelocidadeMedia(float imtervaloDeDeslocamento, float intervaloDeTempo) {
		float VelocidadeMedia = this.imtervaloDeDeslocamento / this.intervaloDeTempo;
		
		return imtervaloDeDeslocamento / intervaloDeTempo;
	}

}
