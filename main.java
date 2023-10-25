import src.Motorista;
import src.Viagem;
import src.Cliente;

public 

class main {
  public static void main(String[] args) {
    Motorista sergio = new Motorista("Sergio Solto", "sergio@email.com", "(21)98787-6789", 4.7, "B", "Uno");
    Motorista monique = new Motorista("Monique Azul", "monique@email.com", "(21)98787-6389", 4.9, "A", "XRE 300");

    Cliente renan = new Cliente("Salomao Carneiro", "renan@gmail.com", "(21)95454-1256", 4.7, 9.4);
    Cliente carla = new Cliente("Carla Lopez", "carla@gmail.com", "(21)95754-1256", 4.9, 19.4);

    sergio.showMotorista();
    monique.showMotorista();

    renan.showCliente();
    carla.showCliente();
    renan.getSaldo();

    Viagem viagem1 = new Viagem(carla, monique);
    viagem1.setDistancia();
    viagem1.setTempo();
    viagem1.getCusto();
  }
  
  
}

