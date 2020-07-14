package EXDia02;

public class Fornecedor extends Pessoa {
	
	public double valorCredito;
	public double valorDivida;
	
	public Fornecedor (String nome, String tel, String ende, double valorC, double valorD)
	{
		super (nome, tel, ende);
		this.valorCredito = valorC;
		this.valorDivida = valorD;
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	public double obterSaldo () {
		double saldo = valorCredito-valorDivida;
		return saldo;
	}
}
