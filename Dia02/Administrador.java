package EXDia02;

public class Administrador extends Empregado {
	public float ajudaDeCusto;
	
	public Administrador (String nome, String tel, String ende, int codigo, float sal, double imp, float ajuda)
	{
		super (nome, tel, ende, codigo, sal, imp);
		this.ajudaDeCusto = ajuda;
	}

	public float getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(float ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	public double calcularSalario () {
		double saldo = salarioBase-((salarioBase/100)*imposto)+ajudaDeCusto;
		return saldo;
	}

}
