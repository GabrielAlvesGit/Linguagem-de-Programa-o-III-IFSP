package ifsp.edu.br;

import java.util.Arrays;
import java.util.List;

public class ReduzirLista {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
		int soma = numeros.stream().reduce(0, Integer::sum);
		System.out.print(soma);
	}
}
