package ifsp.edu.br;


import java.util.Optional;

public class TesteGetOptional3 {
	public static void main(String[] args) {
		Optional<String> optional = Optional.of("Texto Opcional");
		optional.ifPresent(value -> System.out.println(value));
	}
}

