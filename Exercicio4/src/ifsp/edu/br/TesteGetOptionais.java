package ifsp.edu.br;

import java.util.Optional;

public class TesteGetOptionais {
	public static void main(String[] args) {
		Optional<String> opcional = Optional.ofNullable(null);
		opcional.ifPresentOrElse(
				values -> System.out.println("Valor encontrado" + values),
				() -> System.out.println("Valor não encontrado")
	  );
	}
}
