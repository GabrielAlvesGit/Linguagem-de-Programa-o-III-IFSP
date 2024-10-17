package ifsp.edu.br;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;

public class AdicaoVetores {
    public static void main(String[] args) {
        List<Integer> vetorA = Arrays.asList(1, 2, 3);
        List<Integer> vetorB = Arrays.asList(4, 5, 6);

        List<Integer> resultado = IntStream.range(0, vetorA.size())
        		.mapToObj(i -> vetorA.get(i) + vetorB.get(i))
                .toList();

        System.out.println("Resultado da adição: " + resultado); 
    }
}

