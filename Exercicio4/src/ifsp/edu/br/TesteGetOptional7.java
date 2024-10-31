package ifsp.edu.br;

import java.util.Optional;

public class TesteGetOptional7 {
	public static void main(String[] args) {
		Optional<String> opcional = Optional.ofNullable(null);
		Optional<String> outroOptional = Optional.of("Valor alterado");
		Optional<String> resultado = opcional.or(() -> outroOptional);
		System.out.println(resultado.get());
	}
}
