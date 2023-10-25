package src;

public class Motorista extends Usuario {
  protected String cnh;
  protected String carro;
  public boolean corrida;

  public Motorista(String nome, String email, String tel,double nota, String cnh, String carro) {
    super(nome, email, tel,nota);
    this.cnh = cnh;
    this.carro = carro;
    this.corrida = false;
  }

  public void showMotorista(){
    System.out.println("O(a) motorista: " + this.nome + " tem a habilitação " + this.cnh + " com o carro " + this.carro+ " e tem a nota " + this.nota);
    System.out.println("Com o email de cadastro: " + this.email + " e o telefone " + this.tel);
  }

  public void verificarMotorista()
  {
    if (this.cnh == "B")
    {
      System.out.println("O motorista pode dirigir");
    }

    else
    {
      System.out.println("O motorista não pode dirigir");
    }
  }

  public void verificarCorrida()
  {
    if (this.corrida == true)
    {
      System.out.println("O motorista está em uma corrida");
    }
    else
    {
      System.out.println("O motorista está disponível");
    }
  }

  public void comecarCorrida(){
    this.corrida = true;
  }
  
  public void terminarCorrida(){
    this.corrida = false;
  }
}
