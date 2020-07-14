package EXDia02;

public class TesteVendedor {
	
	public static void main (String args [])
	{
		Vendedor vend1 = new Vendedor ("Matheus", "98999-1858", "Rua Mariazinha", 246955, 1500, 12, 8000, 5);
		System.out.println(vend1.mostrarDados());
		System.out.println(vend1.calcularSalario());
	}

}
