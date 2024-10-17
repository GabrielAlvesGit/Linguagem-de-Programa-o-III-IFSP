package ifsp.edu.br;

import java.util.Arrays;
import java.util.List;

public class ReduzirValores {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3);
        int produto = numeros.stream()
                             .reduce(1, (a, b) -> a * b);
        System.out.println(produto); // Saída: 6
    }
}
