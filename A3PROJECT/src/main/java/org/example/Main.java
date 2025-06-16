package org.example;

import org.example.entidades.Carro;
import org.example.entidades.Moto;
import org.example.entidades.Veiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer ler = 0;

        List<Veiculo> veiculos = new ArrayList<>();

        while (ler != 4) {
            System.out.println("Digite uma opção:  Cadastrar veiculos(0) " +
                    " Ler veiculos(1) excluir veiculos(2)  atualizar o veiculo(3) " +
                    "encerrar(4)");
            ler = sc.nextInt();
            sc.nextLine();

            if (ler == 0) {
                    System.out.println("carro ou moto?");
                    String automovel = sc.nextLine().trim().toLowerCase();

                    System.out.println("Marca: ");
                    String marca = sc.nextLine();

                    System.out.println("Modelo: ");
                    String modelo = sc.nextLine();

                    System.out.println("Ano: ");
                    Integer ano = sc.nextInt();
                    sc.nextLine();

                    if (automovel.equals("carro")) {
                        System.out.println("Quantidade de portas: ");
                        Integer qtdPortas = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Tipo de combustivel: ");
                        String tipoCombustivel = sc.nextLine();

                        veiculos.add(new Carro(marca, modelo, ano, qtdPortas, tipoCombustivel));

                    } else if (automovel.equals("moto")) {
                        System.out.println("Cilindradas: ");
                        Integer cilindradas = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Tipo de partida: ");
                        String tipoDePartida = sc.nextLine();

                        veiculos.add(new Moto(marca, modelo, ano, cilindradas, tipoDePartida));
                    }
            } else if (ler == 1) {
                System.out.println("IMPRIMINDO DADOS: ");
                if (veiculos.isEmpty()) {
                    System.out.println("Lista vazia");
                } else {
                    for (int i = 0; i < veiculos.size(); i++) {
                        System.out.println("index " + i + " " + veiculos.get(i));
                    }
                }

            } else if (ler == 2) {
                System.out.println("Qual veiculo você deseja excluir? (índice)");
                Integer r = sc.nextInt();
                sc.nextLine();

                if (r >= 0 && r < veiculos.size()) {
                    veiculos.remove((int) r);
                    System.out.println("Veículo removido com sucesso.");
                } else {
                    System.out.println("Índice inválido.");
                }

            } else if (ler == 3) {
                System.out.println("---ATUALIZANDO VEICULO----");

                System.out.println("Qual veículo deseja atualizar? (índice)");
                Integer i = sc.nextInt();
                sc.nextLine();

                if (i < 0 || i >= veiculos.size()) {
                    System.out.println("Índice inválido.");
                    continue;
                }

                System.out.println("Marca: ");
                String marca = sc.nextLine();

                System.out.println("Modelo: ");
                String modelo = sc.nextLine();

                System.out.println("Ano: ");
                Integer ano = sc.nextInt();
                sc.nextLine();

                Veiculo veiculoAtual = veiculos.get(i);

                if (veiculoAtual instanceof Carro) {
                    System.out.println("Quantidade de portas: ");
                    Integer qtdPortas = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Tipo de combustivel: ");
                    String tipoCombustivel = sc.nextLine();

                    veiculos.set(i, new Carro(marca, modelo, ano, qtdPortas, tipoCombustivel));
                } else if (veiculoAtual instanceof Moto) {
                    System.out.println("Cilindradas: ");
                    Integer cilindradas = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Tipo de partida: ");
                    String tipoDePartida = sc.nextLine();

                    veiculos.set(i, new Moto(marca, modelo, ano, cilindradas, tipoDePartida));
                }
            }
        }
        System.out.println("Sistema encerrado!");
    }

}