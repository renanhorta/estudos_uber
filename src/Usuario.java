package src;

public class Usuario {
  protected String nome;
  protected String email;
  protected String tel;
  protected double nota;

  public Usuario(String nome, String email, String tel ,double nota) {
    this.nome = nome;
    this.email = email;
    this.tel = tel;
    this.nota = nota;
  }

  // aqui precisa do this pra retornar?

  public String getNome() {
    return nome;
  }

  public String getEmail() {
    return email;
  }
  public String getTel() {
    return tel;
  }

  public double getIdade() {
    return nota;
  }

}
