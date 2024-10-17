package ifsp.edu.br;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class NormalizacaoVetor {
    public static void main(String[] args) {
        List<Double> vetor = Arrays.asList( 2.0, 4.0);

        double norma = Math.sqrt(vetor.stream()
                                       .mapToDouble(v -> v * v)
                                       .sum());

        List<Double> vetorNormalizado = vetor.stream()
                                             .map(v -> v / norma)
                                             .toList();

        System.out.println("Vetor normalizado: " + vetorNormalizado); // Saída: [0.6, 0.8]
    }
}
