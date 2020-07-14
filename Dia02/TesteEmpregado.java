package EXDia02;

public class TesteEmpregado {

	public static void main (String args[])
	{
		Empregado emp1 = new Empregado ("Joana D'arc", "97979-5555", "Rua Castelo de Pedra", 245566, 8000, 8.0);
		System.out.println(emp1.mostrarDados());
		System.out.println(emp1.calcularSalario());
	}
}
