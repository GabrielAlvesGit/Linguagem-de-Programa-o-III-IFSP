package ifsp.edu.br;

import java.util.Arrays;
import java.util.List;

class FiltrarPares {
	public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> pares = numeros.stream()
                                      .filter(n -> n % 2 == 0)
                                      .toList();
        System.out.println(pares); // Saída: [2, 4, 6]
    }
}
