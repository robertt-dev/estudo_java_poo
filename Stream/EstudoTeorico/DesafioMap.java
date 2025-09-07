package Stream.EstudoTeorico;

import java.util.Arrays;
import java.util.List;

public class DesafioMap {
  public static void main(String[] args) {
    
    List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

    nums.stream()
      .map(IntDesafio.binaria)
      .map(IntDesafio.stringReverse)
      .map(IntDesafio.binariaReverse)
      .forEach(System.out::println);
  }
}


//1. Número para String binária... 6 => "110"
//2. Reverter a String "110" => "011" 
//3. Converter de volta para inteiro "011" => 3