package ifsp.edu.br;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OperacoesParalelas {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
		int soma = numeros.parallelStream()
							.mapToInt(Integer::intValue)
							.sum();
		System.out.print(soma);
	}
}
