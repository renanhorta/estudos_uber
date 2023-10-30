package src;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Viagem {

  protected double tempo;
  protected double distancia;
  protected double custo;
  protected String inicio;
  protected String destino;
  protected Cliente cliente;
  protected Motorista motorista;

  Scanner sc = new Scanner(System.in);

  public Viagem(Cliente cliente, String inicio, String destino) {
    this.cliente = cliente;
    this.inicio = inicio;
    this.destino = destino;
  }

  public void setMotorista(Motorista motorista) {
    this.motorista = motorista;
  }

  public void ShowCorrida() {
    custo = this.getCusto();
    DecimalFormat formato = new DecimalFormat("0.00");
    String custo_em_real = formato.format(custo);
    System.out.println("A Corrida foi feita pelo(a) motorista" + this.motorista + " levando o(a) cliente" + this.cliente
        + " saindo de " + this.inicio + " indo para " + this.destino);
    System.out.println("O valor total da corrida foi de: " + custo_em_real + " reais");
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

  public double getCusto() {
    this.custo = (this.tempo + this.distancia) * 1.39;
    return this.custo;
  }
}
