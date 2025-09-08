package Stream.EstudoTeorico;

import java.util.Arrays;
import java.util.List;

public class Map {
  public static void main(String[] args) {
    
    List<String> nomes = Arrays.asList("Lucas", "Fabiana", "Guilherme", "Mauro");
   
    //stream() - Builda.     map() - operação.      forEach() - termina.
    nomes.stream()
      .map(Utilitarios.maiuscula)
      .map(Utilitarios.primeiraLetra)
      .forEach(Utilitarios.print);
  }
}
