# Classe de Gerenciamento de Veículos

## → Descrição
Está Classe foi desenvolvido sobre Programação Orientada a Objetos em Java.  
Demonstrar o uso de herança, classes abstratas e métodos de acesso, através de um Classe simples de gerenciamento de veículos.

---

## → Estrutura do Projeto
- `Veiculo.java` — Classe abstrata base com atributos comuns e métodos de acesso.
- `Carro.java` — Classe derivada que representa carros.
- `Moto.java` — Classe derivada que representa motos.
- `Main.java` — Classe principal responsável pela execução do programa.
 ---
→ public class Main {
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


---

## → Conceitos Aplicados
→ Classe Abstrata : `Veiculo` serve de modelo para as subclasses.
- **Herança**: `Carro` e `Moto` herdam de `Veiculo`.
- **Encapsulamento**: O atributo `ano` (em `Veiculo`) e `cilindrada` (em `Moto`) são privados.
- **Sobrescrita de Método**: O método `informacoesVeiculo()` é implementado de forma diferente em cada subclasse.
- **Polimorfismo**: Cada tipo de veículo apresenta comportamento próprio no método sobrescrito.

---

## → Como Executar
1.  repositório veículo.
2.  Compile os arquivos Java.
3.  Execute o programa em Vscode ou similar.

## → Exemplo de Saída
=== Informações do Carro ===
Marca: Toyota
Modelo: Corolla
Ano: 2022
Número de Portas: 4

=== Informações da Moto ===
Marca: Honda
Modelo: CB 500
Ano: 2021
Cilindrada: 500 cc

