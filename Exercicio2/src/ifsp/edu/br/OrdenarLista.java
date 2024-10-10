package ifsp.edu.br;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OrdenarLista {
	public static void main(String[] args) {
		List<String> nomes = Arrays.asList("Ana","João", "Amelia", "Pedro");
		List<String> nomesComA = nomes.stream()
							.sorted()
							.collect(Collectors.toList());
		System.out.print(nomesComA);
	}
}
