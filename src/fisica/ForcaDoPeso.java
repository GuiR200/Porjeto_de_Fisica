package fisica;

public class ForcaDoPeso {
	public float massa;
	public byte gravidade;
	
	public float calcularAForcaDoPeso(float massa,float gravidade) {
		float ForcaDoPeso = this.massa * this.gravidade;
		
		return massa * gravidade;
	}
}
