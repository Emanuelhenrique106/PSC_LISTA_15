package Estruturas;
import java.util.ArrayList;
import java.util.List;
public class TestePOOCompleto {

		
   public static void main(String[] args) {
		    // Instâncias
		  Filme filme = new Filme("Matrix", 1999, 136, "Irmãs Wachowski");
	 Musica musica = new Musica("Imagine", 1971, 3.1, "John Lennon");

	 // POO___TESTE_1)---   Polimorfismo com classe abstrata
	 
  List<ItemMidia> itens = new ArrayList<>();
	itens.add(filme);
	 itens.add(musica);
	 
	 

		 System.out.println("== Teste 1: reproduzir() via ItemMidia = Polimorfismo ==");
		for (ItemMidia item : itens) {
	 item.reproduzir();
		        }

	 //  POO___TESTE_2)---  Polimorfismo com interface Avaliavel
		
	  System.out.println("\n== Teste 2: receberAvaliacao() via Avaliavel ==");
	    Avaliavel aval = filme;      // referência da interface apontando para Filme
		    aval.receberAvaliacao(9);

		        aval = musica;              
		        aval.receberAvaliacao(10);

		  // POO___TESTE_3)---  Encapsulamento - validação do setter de duracao
		        
	 System.out.println("\n== Teste 3: validação do setter de duração ==");
	  System.out.println("Duração atual do filme: " + filme.getDuracao());
	   filme.setDuracao(-50); // tentativa inválida
		 System.out.println("Duração após tentativa inválida: " + filme.getDuracao());

		        // também podemos setar um valor válido
		        filme.setDuracao(140.5);
		        System.out.println("Duração após definir valor válido: " + filme.getDuracao());
		    }
		
	}


