package ifsp.edu.br;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class OperaçãoParalelas {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
		int t1 = (int) System.currentTimeMillis();
		int soma = numeros = numeros.stream()
							.reduce(Integer::intValue);
		
		System.out.print("Tempo ms" + t1);
		System.out.print(soma);
	}
}
