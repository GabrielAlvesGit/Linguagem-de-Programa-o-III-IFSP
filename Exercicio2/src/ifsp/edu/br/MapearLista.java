package ifsp.edu.br;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapearLista {
	public static void main(String[] args) {
		List<String> nomes = Arrays.asList("Ana","João", "Amelia", "Pedro");
		List<String> nomesComA = nomes.stream()
							.map(String::toUpperCase)
							.collect(Collectors.toList());
		System.out.print(nomesComA);;
	}
	
}
