// Classe Moto herda de Veiculo
public class Moto extends Veiculo {
    // Atributo privado (encapsulado)
    private int cilindrada;

    // Construtor
    public Moto(String marca, String modelo, int ano, int cilindrada) {
        super(marca, modelo, ano);
        this.cilindrada = cilindrada;
    }

    // Métodos de acesso (get e set)
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    // Implementação do método abstrato
    @Override
    public String informacoesVeiculo() {
        return "=== Informações da Moto ===\n" +
               "Marca: " + marca + "\n" +
               "Modelo: " + modelo + "\n" +
               "Ano: " + getAno() + "\n" +
               "Cilindrada: " + cilindrada + " cc\n";
    }
}
