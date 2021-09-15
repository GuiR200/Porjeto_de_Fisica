package fisica;

public class ForcaElastica {
	
	public float forca;
	public byte equilibrio;
	
    public float calcularAForcaElastica(float forca, float equilibrio) {
    	float ForcaElastica = this.forca / this.equilibrio;
    	
    	return forca / equilibrio; 
    }
}
