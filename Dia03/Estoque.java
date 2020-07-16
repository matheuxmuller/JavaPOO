package EXDia03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Estoque {
	public static void main(String[] args) 
	{
		Collection <String> lojaCD = new <String> ArrayList ();
		lojaCD.add("Chromatica");
		lojaCD.add("Bday");
		lojaCD.add("Good Girl Gone Bad");
		System.out.println("Produtos disponíveis: "+lojaCD);
		
		lojaCD.remove("Bday");
		System.out.println("Produtos atualizados: "+lojaCD);
		
		Collection <String> sebo = Arrays.asList ("MDNA");
		lojaCD.addAll(sebo);
		System.out.println("Novos produtos em liquidação: "+lojaCD);
		
		for (String lojaLivro: lojaCD)
		{
			System.out.println("Todos os produtos: "+lojaLivro);
		}
	}
}
