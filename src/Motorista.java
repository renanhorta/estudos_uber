package src;

public class Motorista extends Usuario {
  private String cnh;
  public boolean corrida;

  public Motorista(String nome, String email, int idade, String cnh) {
    super(nome, email, idade);
    this.cnh = cnh;
  }

  public verificarMotorista()
  {
    if (this.idade >= 18 && this.cnh == "B")
    {
      System.out.printIn("O motorista pode dirigir");
    }

    else
    {
      System.out.printIn("O motorista não pode dirigir");
    }
  }

  public verificarCorrida()
  {
    if (this.corrida == true)
    {
      System.out.printIn("O motorista está em uma corrida");
    }
    else
    {
      System.out.printIn("O motorista está disponível");
    }
  }

  public começarCorrida(){
    this.corrida = true;
  }

  public terminarCorrida(){
    this.corrida = false;
  }
}
