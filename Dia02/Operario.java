package EXDia02;

public class Operario extends Empregado {
	
	public float valorProducao;
	public double comissao;
	
	public Operario (String nome, String tel, String ende, int codigo, float sal, double imp, float valor, double comi)
	{
		super (nome, tel, ende, codigo, sal, imp);
		this.valorProducao = valor;
		this.comissao = comi;
	}

	public float getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(float valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	public double calcularSalario () {
		double saldo = salarioBase-((salarioBase/100)*imposto)+((valorProducao/100)*comissao);
		return saldo;
	}

}
