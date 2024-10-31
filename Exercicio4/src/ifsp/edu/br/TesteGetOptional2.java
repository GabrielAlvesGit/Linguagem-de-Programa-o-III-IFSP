package ifsp.edu.br;

import java.util.Optional;

public class TesteGetOptional2 {
	public static void main(String[] args) {
		Optional<String> optional = Optional.ofNullable(null);
		String valor = optional.orElse("Teste");
		System.out.println(valor);
	}
}
