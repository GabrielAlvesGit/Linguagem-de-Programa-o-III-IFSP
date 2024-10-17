package ifsp.edu.br;

import java.util.Arrays;
import java.util.List;

public class ContarElementos1 {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Ana","Bruno","Pedro", "Bruno", "Carlos", "Ana");
        long contagem = nomes.stream()
                             .distinct()
                             .count();
        System.out.println(contagem); 
    }
}