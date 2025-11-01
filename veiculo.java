// Classe abstrata base para todos os veículos
public abstract class Veiculo {
    // Atributos públicos
    public String marca;
    public String modelo;
    // Atributo privado (encapsulamento)
    private int ano;

    // Construtor
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Método abstrato (será implementado nas subclasses)
    public abstract String informacoesVeiculo();

    // Métodos de acesso (getters e setters)
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
