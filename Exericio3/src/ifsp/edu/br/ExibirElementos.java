package ifsp.edu.br;

import java.util.Arrays;
import java.util.List;

public class ExibirElementos {
    public static void main(String[] args) {
        List<String> cores = Arrays.asList("Vermelho", "Verde", "Azul");
        
        cores.stream().forEach(cor -> System.out.println(cor));
    }
}