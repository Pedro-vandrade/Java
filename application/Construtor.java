package application;

import java.util.Scanner;

class Carro {
    String modelo;
    int ano;
    int velocidadeAtual;

    // Construtor padrão
    public Carro() {
        this.modelo = "Desconhecido";
        this.ano = 0;
        this.velocidadeAtual = 0;
    }

    // Construtor com modelo e ano
    public Carro(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0;
    }

    // Método para acelerar
    public void acelerar(int incremento) {
        velocidadeAtual += incremento;
        System.out.println(modelo + " acelerou! Velocidade atual: " + velocidadeAtual + " km/h");
    }

    // Método para frear
    public void frear(int decremento) {
        if (velocidadeAtual - decremento < 0) {
            velocidadeAtual = 0;
        } else {
            velocidadeAtual -= decremento;
        }
        System.out.println(modelo + " freou! Velocidade atual: " + velocidadeAtual + " km/h");
    }

    // Método para exibir informações
    public void mostrarInfo() {
        System.out.println("Modelo: " + modelo + " | Ano: " + ano + " | Velocidade: " + velocidadeAtual + " km/h");
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criando um carro com dados do usuário
        System.out.print("Digite o modelo do carro: ");
        String modelo = sc.nextLine();

        System.out.print("Digite o ano do carro: ");
        int ano = sc.nextInt();

        Carro carro = new Carro(modelo, ano);

        System.out.println("\n=== Carro Criado ===");
        carro.mostrarInfo();

        // Menu de opções
        int opcao;
        do {
            System.out.println("\nEscolha uma ação:");
            System.out.println("1 - Acelerar");
            System.out.println("2 - Frear");
            System.out.println("3 - Mostrar informações");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Quanto deseja acelerar (km/h)? ");
                    int acel = sc.nextInt();
                    carro.acelerar(acel);
                    break;

                case 2:
                    System.out.print("Quanto deseja frear (km/h)? ");
                    int freio = sc.nextInt();
                    carro.frear(freio);
                    break;

                case 3:
                    carro.mostrarInfo();
                    break;

                case 0:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}
