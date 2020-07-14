package EXDia02;

public class Vendedor extends Empregado {
	
	public float valorVendas;
	public double comissaoVendas;
	
	public Vendedor (String nome, String tel, String ende, int codigo, float sal, double imp, float vendas, double comis)
	{
		super (nome, tel, ende, codigo, sal, imp);
		this.valorVendas = vendas;
		this.comissaoVendas = comis;
	}

	public float getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(float valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissaoVendas() {
		return comissaoVendas;
	}

	public void setComissaoVendas(double comissaoVendas) {
		this.comissaoVendas = comissaoVendas;
	}
	
	public double calcularSalario () {
		double saldo = salarioBase - ((salarioBase/100)*imposto) + ((valorVendas/100)*comissaoVendas);
		return saldo;
	}

}
