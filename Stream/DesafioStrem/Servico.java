package Stream.DesafioStrem;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Servico {
  public static void main(String[] args) {

    Soldado s1 = 
      new Soldado(
        "Marcos", 
        "CDS", 
        LocalDate.of(2022, 1, 8)
    );

    Soldado s2 = 
      new Soldado(
        "Felipe", 
        "CDS", 
        LocalDate.of(2025, 11, 28)
    );

    Soldado s3 = 
      new Soldado(
        "Joaquin", 
        "CDS", 
        LocalDate.of(2023, 7, 21)
    );

    Soldado s4 = 
      new Soldado(
        "Marquin", 
        "CDS", 
        LocalDate.of(2020, 7, 21)
    );

    Soldado s5 = 
      new Soldado(
        "Malkai", 
        "CDS", 
        LocalDate.of(2021, 7, 21)
    );

    List<Soldado> militares = Arrays.asList(s1, s2, s3, s4, s5);

    militares.stream()
      .map(s -> s.escala())
      .forEach(System.out::println);
  }
}

//Escala Serviço
//1. Se o Militar for do ano de 2022 a 2023, não pega Serviço
//2. Se o Militar for do ano de 2023 até 2025, pega serviço e missão
//3. Se o Militar for de 2022 para baixo pega chefe de guarnição

