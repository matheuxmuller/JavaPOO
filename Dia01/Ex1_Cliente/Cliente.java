package Ex1_Cliente;

public class Cliente {
	
	private String nomeCliente;
	private int idadeCliente;
	private int cpfCliente;
	
	public Cliente (String nome, int idade, int cpf)
	{
		nomeCliente = nome;
		idadeCliente = idade;
		cpfCliente = cpf;
	}
	
	public String dados ()
	{
		String perfil = nomeCliente+" "+idadeCliente+" "+cpfCliente;
		return perfil;
	}
}
