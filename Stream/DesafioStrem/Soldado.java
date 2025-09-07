package Stream.DesafioStrem;

import java.time.LocalDate;

public class Soldado {

  final private String nome;
  private String organizacaoMilitar;
  final private LocalDate dataAntiguidade;

  public Soldado(String nome, String organizacaoMilitar, LocalDate dataAntiguidade) {
    this.nome = nome;
    this.organizacaoMilitar = organizacaoMilitar;
    this.dataAntiguidade = dataAntiguidade;
  }

  public String escala(){
    var naoServico = dataAntiguidade.getYear() >= 2022 && dataAntiguidade.getYear() <= 2023;
    var servicoMissao = dataAntiguidade.getYear() >= 2023 && dataAntiguidade.getYear() <= 2025;
    
    if(naoServico){
      return "O SD " + nome + " está fora da escala!";
    } else if (servicoMissao) {
      return "O SD " + nome + " está de serviço e missão!";
    } else {
      return "O SD " + nome + " é Antigão pohaa!!";
    }
  }

  //Getters 
  public String getNome(){
    return nome;
  }

  public String getOrganizacaoMilitar(){
    return organizacaoMilitar;
  }

  public LocalDate getDataAntiguidade(){
    return dataAntiguidade;
  }
}

// Escala de Serviço
// 1. Se o militar for do ano de 2022 a 2023, não realiza serviço
// 2. Se o militar for do ano de 2023 a 2025, realiza serviço e missão
// 3. Se o militar for de 2022 para trás, é antigo demias para qualquer serviço.