package Stream.EstudoTeorico;

import java.util.function.Function;

public interface IntDesafio {

    Function<Integer, String> binaria = 
      n -> Integer.toBinaryString(n);

    Function<String, String> stringReverse = 
      n -> new StringBuilder(n).reverse().toString();

    Function<String, Integer> binariaReverse = 
      n -> Integer.parseInt(n, 2);
}
