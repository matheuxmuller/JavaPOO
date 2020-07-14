package EXDia02;

public class TesteFornecedor {
	
	public static void main (String args [])
	{
		Fornecedor forn1 = new Fornecedor ("Luisa", "99999-9999", "Rua casa do cacete", 9000.0, 8500.0);
		System.out.println (forn1.mostrarDados());		
		System.out.println (forn1.obterSaldo());
	}
}
