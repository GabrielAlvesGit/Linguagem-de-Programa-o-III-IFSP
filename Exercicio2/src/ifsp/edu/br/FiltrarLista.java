package ifsp.edu.br;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiltrarLista {
	public static void main(String[] args) {
			List<String> nomes = Arrays.asList("Ana","João", "Amelia", "Pedro");
			List<String> nomesComA = nomes.stream()
								.filter(nome -> nome.startsWith("A"))
								.collect(Collectors.toList());
			System.out.print(nomesComA);;
	}	
}
