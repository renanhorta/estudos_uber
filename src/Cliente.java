package src;

import java.util.Scanner;

public class Cliente extends Usuario {
  private double saldo;

  Scanner sc = new Scanner(System.in);

  public Cliente(String nome, String email, String tel, double nota, double saldo) {
    super(nome, email, tel, nota);
    this.saldo = saldo;
  }

  public void showCliente() {
    System.out.println("O(a) Cliente: " + this.nome + " tem o email" + this.email + " e " + this.tel
        + " de telefone de contato " + " e tem a nota " + this.nota);
  }

  public void setSaldo() {
    System.out.printf("Informe o valor a ser adicinado na conta:\n");

    double valor = sc.nextDouble();
    this.saldo = this.saldo + valor;
  }

  public void getSaldo() {
    System.out.println("O valor da conta do cliente é de :" + this.saldo);
  }
}
