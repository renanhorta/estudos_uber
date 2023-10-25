package src;

import java.util.Scanner;

public class Viagem {

  protected double tempo;
  protected double distancia;
  protected double custo;
  protected Cliente cliente;
  protected Motorista motorista;

  Scanner sc = new Scanner(System.in);

  public Viagem(Cliente cliente, Motorista motorista) {
    this.cliente = cliente;
    this.motorista = motorista;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public Motorista getMotorista() {
    return motorista;
  }

  public void setDistancia() {

    System.out.printf("Informe a distância total da viagem: \n");

    this.distancia = sc.nextDouble();

  }

  public void setTempo() {
    System.out.printf("Informe o tempo total da viagem: \n");

    this.tempo = sc.nextDouble();
  }

  public void getCusto() {
    this.custo = ( this.tempo + this.distancia) * 1.39;
    
    System.out.println("O valor total da corrida foi de: " + this.custo + " reais");
  }
}
