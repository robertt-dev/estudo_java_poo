package Stream.EstudoTeorico;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;


public class CriandoStreams {

  public static void main(String[] args) {

    Consumer<String> imprimi = System.out::println;

    List<String> nomesTeste = Arrays.asList("Ana", "Pedro", "Duda", "Ricardo");

    //Strem.of() - stream de 1 elemento, que é a lista.
    Stream.of(nomesTeste);
    
    //.strem() - stream de cada elemento dentro da lista.
    nomesTeste.stream().forEach(imprimi);
  }
}
