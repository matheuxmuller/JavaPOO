package EXDia02;

public class TesteOperario {
	
	public static void main (String args [])
	{
		Operario op1 = new Operario ("Matheus", "98999-1858", "Rua Mariazinha", 246955, 1500, 12, 8000, 5);
		System.out.println(op1.mostrarDados());
		System.out.println(op1.calcularSalario());
	}

}
