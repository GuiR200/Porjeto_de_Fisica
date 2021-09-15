package fisica;

public class ForcaCentripeta {
	public float massa;
	public float resutado1;
	public byte velocidade;

	public float calcularAPotencia(float base, float expoente) {

		return (float) Math.pow(base, expoente);
	}

	public float calcularAForcaCentriprta(float massa, float raio, float velocidade) {
		float NumeroFinal = this.massa * this.resutado1 / this.velocidade;

		return massa * resutado1 / velocidade;
	}
}
