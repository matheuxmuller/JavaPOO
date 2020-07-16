package EXDia03;

public abstract class Animal {
	
	public String nome;
	public int idade;
	
	abstract public void emitirSom ();
	abstract public void movimentoAnimal ();
	
	public Animal (String nome, int idade)
	{
		this.nome = nome;
		this.idade = idade;
	}
	public Animal ()
	{
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}

