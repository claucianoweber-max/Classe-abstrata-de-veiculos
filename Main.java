public class Main {
    public static void main(String[] args) {

        // Instanciando um objeto Carro
        Carro carro = new Carro("Toyota", "Corolla", 2022, 4);

        // Instanciando um objeto Moto
        Moto moto = new Moto("Honda", "CB 500", 2021, 500);

        // Exibindo as informações
        System.out.println(carro.informacoesVeiculo());
        System.out.println(moto.informacoesVeiculo());
    }
}
