package Stream.EstudoTeorico;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public interface Utilitarios {

  Consumer<String> print = System.out::println;
  UnaryOperator<String> maiuscula = n -> n.toUpperCase();
  UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
  UnaryOperator<String> grito = n -> n + "!!!";
}
