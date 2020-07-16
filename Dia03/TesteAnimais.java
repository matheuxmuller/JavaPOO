package EXDia03;

public class TesteAnimais {
	
	public static void main (String args[])
	{
		Cachorro jake = new Cachorro ();
		Cavalo lila = new Cavalo ();
		Preguica mimo = new Preguica ();
		
		jake.setNome("Jake");
		jake.setIdade(10);
		System.out.println(jake.getNome());
		System.out.println(jake.getIdade());
		jake.movimentoAnimal();
		jake.emitirSom();
		System.out.println();
		
		lila.setNome("Lila");
		lila.setIdade(22);
		System.out.println(lila.getNome());
		System.out.println(lila.getIdade());
		lila.movimentoAnimal();
		lila.emitirSom();
		System.out.println();
		
		mimo.setNome("Mimo");
		mimo.setIdade(7);
		System.out.println(mimo.getNome());
		System.out.println(mimo.getIdade());
		mimo.movimentoAnimal();
		mimo.emitirSom();
	}
}
