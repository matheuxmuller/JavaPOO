package Ex4_Funcionario;

public class Funcionario {
	
	private String nomeFunc;
	private int codigoFunc;
	private String atividadeFunc;
	
	public Funcionario (String nome, int code, String atv)
	{
		nomeFunc = nome;
		codigoFunc = code;
		atividadeFunc = atv;
	}
	public String dados()
	{
		String cracha = "Colaborador(a/e) "+nomeFunc+", cujo c�digo funcional � "+codigoFunc+" ocupa o cargo de "+atividadeFunc;
		return cracha;
	}

}
