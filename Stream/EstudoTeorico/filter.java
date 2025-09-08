package Stream.EstudoTeorico;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;


public class filter {
  public static void main(String[] args) {

  Aluno a1 = new Aluno("Lucas", 3.7);
  Aluno a2 = new Aluno("Marcos", 9.7);
  Aluno a3 = new Aluno("Nascimento", 6.3);
  Aluno a4 = new Aluno("Thiago", 6.0);
  Aluno a5 = new Aluno("Leticya", 5.7);

  List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);

  Predicate<Aluno> notaAprovado = 
    a -> a.nota >= 6.5;
    
  Predicate<Aluno> reprovado = 
    notaAprovado.negate();
    
  Function<Aluno, String> saudacao = 
    a -> "Parabéns " + a.nome + " voce esta aprovado!!!";

  Function<Aluno, String> burro = 
    a -> "Infelizmente " + a.nome + " voce reprovou!!";


  alunos.stream()
    .filter(a -> a.nota >= 6.5)
    .map(saudacao)
    .forEach(System.out::println);

  alunos.stream()
    .filter(reprovado)
    .map(burro)
    .forEach(System.out::println);
  }
}
