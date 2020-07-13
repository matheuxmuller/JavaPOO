package Ex2_Aviao;

public class Aviao {
	
	public String modeloAviao;
	public String companhiaAviao;
	public int numeroVoo;
	
	public Aviao (String comp, int num, String mod)
	{
		companhiaAviao = comp;
		numeroVoo = num;
		modeloAviao = mod;
	}
	public String embarque()
	{
		String embarque1 = "O voo da companhia "+companhiaAviao+" número "+numeroVoo+" seguirá na aeronave de modelo "+modeloAviao;
		return embarque1;
	}
}
