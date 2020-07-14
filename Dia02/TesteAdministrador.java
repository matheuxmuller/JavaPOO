package EXDia02;

public class TesteAdministrador {
	
	public static void main (String args [])
	{
		Administrador adm1 = new Administrador ("Matheus", "98999-1858", "Rua Mariazinha", 246955, 9000, 15, 900);
		System.out.println(adm1.mostrarDados());
		System.out.println(adm1.calcularSalario());
	}

}
