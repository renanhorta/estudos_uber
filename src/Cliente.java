package src;

import java.util.Scanner;

public class Cliente extends Usuario {
  private double saldo;

  Scanner sc = new Scanner(System.in);

  public Cliente(String nome, String email, int idade, double saldo) {
    super(nome, email, idade);
    this.saldo = saldo;
  }

  public setSaldo(){
    System.out.printf("Informe o valor a ser adicinado na conta:\n");
    
    double valor = sc.nextDouble(); 
    this.saldo = this.saldo + valor;
  }

  public getSaldo(){
    System.out.printIn("O valor da conta do cliente é de :" + this.saldo);
  }
}
