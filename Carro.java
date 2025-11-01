// Classe Carro herda de Veiculo
public class Carro extends Veiculo {
    // Atributo específico
    public int numeroPortas;

    // Construtor
    public Carro(String marca, String modelo, int ano, int numeroPortas) {
        super(marca, modelo, ano); // Chama o construtor da superclasse
        this.numeroPortas = numeroPortas;
    }

    // Implementação do método abstrato
    @Override
    public String informacoesVeiculo() {
        return "=== Informações do Carro ===\n" +
               "Marca: " + marca + "\n" +
               "Modelo: " + modelo + "\n" +
               "Ano: " + getAno() + "\n" +
               "Número de Portas: " + numeroPortas + "\n";
    }
}
