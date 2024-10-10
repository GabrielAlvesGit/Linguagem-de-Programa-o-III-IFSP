package ifsp.edu.br;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ContarElementos {
	public static void main(String[] args) {
		List<String> nomes = Arrays.asList("Ana", "Zenilda", "João", "Amelia", "Pedro");
		List<String> nomesComA = nomes.stream()
							.sorted(Comparator.naturalOrder())
							.collect(Collectors.toList());
		System.out.print(nomesComA);
	}
}
