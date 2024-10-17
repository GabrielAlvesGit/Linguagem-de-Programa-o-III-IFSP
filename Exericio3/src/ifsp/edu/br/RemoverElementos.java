package ifsp.edu.br;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoverElementos {
	public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(List.of("Ana", "Bruno", "Carlos"));
        nomes.removeIf(nome -> nome.startsWith("B"));
        
        System.out.println(nomes); // Saída: [Ana, Carlos]
    }
}
