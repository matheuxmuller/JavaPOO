package EXDia02;

public class Pessoa {
	private String nome;
	private String telefone;
	private String endereco;
	
	public Pessoa (String nome, String tel, String ende)
	{
		this.nome = nome;
		this.telefone = tel;
		this.endereco = ende;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String mostrarDados () {
		String dados = nome+ " " + telefone + " " + endereco;
		return dados;
	}
}
