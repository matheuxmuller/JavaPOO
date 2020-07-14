package EXDia02;

public class Empregado extends Pessoa {
	
	private int codigoSetor;
	public float salarioBase;
	public double imposto;
	
	public Empregado (String nome, String tel, String ende, int codigo, float sal, double imp)
	{
		super (nome, tel, ende);
		this.codigoSetor = codigo;
		this.salarioBase = sal;
		this.imposto = imp;
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	public double calcularSalario () {
		double saldo = salarioBase-((salarioBase/100)*imposto);
		return saldo;
	}
	

}
