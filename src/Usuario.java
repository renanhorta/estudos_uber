package src;

public class Usuario {
  private String nome;
  private String email;
  private int idade;

  public Usuario(String nome, String email, int idade) {
    this.nome = nome;
    this.email = email;
    this.idade = idade;
  }

  // aqui precisa do this pra retornar?

  public String getNome() {
    return nome;
  }

  public String getEmail() {
    return email;
  }

  public int getIdade() {
    return idade;
  }

}
