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

        while(ler != 4){
            System.out.println("Digite uma opção: (0) Cadastrar veiculos " +
                    "(1) Ler veiculos (2) excluir veiculos (3) atualizar o veiculo " +
                    "(4) encerrar");
             ler = sc.nextInt();

            if(ler == 0){
                System.out.println("Deseja cadastrar quantos veiculos?");
                Integer quantidade = sc.nextInt();
                for(int i = 0; i<quantidade; i++){
                    System.out.println("carro ou Moto?");
                    String automovel = sc.next();
                    System.out.println("Marca: ");
                    String marca = sc.next();
                    System.out.println("Modelo: ");
                    String modelo = sc.next();
                    System.out.println("Ano: ");
                    Integer ano = sc.nextInt();

                    if(automovel == "carro"){
                        System.out.println("Quantidade de portas: ");
                        Integer qtdPortas = sc.nextInt();
                        System.out.println("Tipo de combustivel: ");
                        String tipoCombustivel = sc.next();

                       veiculos.add(i, new Carro(marca, modelo, ano, qtdPortas, tipoCombustivel, i));
                    } else if (automovel == "moto") {
                        System.out.println("Cilindradas: ");
                        Integer cilindradas = sc.nextInt();
                        System.out.println("Tipo de partida: ");
                        String tipoDePartida = sc.next();

                        veiculos.add(i, new Moto(i, marca, modelo, ano, cilindradas, tipoDePartida));
                    }

                }
            } else if(ler == 1){
                System.out.println("IMPRIMINDO DADOS: ");

                for(Veiculo veiculo: veiculos){
                    System.out.println(veiculo);
                }
            } else if (ler == 2) {

                System.out.println("Qual veiculo você deseja excluir?");
                Integer r = sc.nextInt();

                veiculos.remove(r);
            } else if (ler == 3) {
                System.out.println("---ATUALIZANDO VEICULO----");

                System.out.println("Qual veiculo deseja atualizar?");
                Integer i = sc.nextInt();
                System.out.println("É um carro ou uma moto?");
                String automovel = sc.next();

                System.out.println("Marca: ");
                String marca = sc.next();
                System.out.println("Modelo: ");
                String modelo = sc.next();
                System.out.println("Ano: ");
                Integer ano = sc.nextInt();

                if (automovel == "carro") {
                    System.out.println("Quantidade de portas: ");
                    Integer qtdPortas = sc.nextInt();
                    System.out.println("Tipo de combustivel: ");
                    String tipoCombustivel = sc.next();
                    veiculos.add(i, new Carro(marca, modelo, ano, qtdPortas, tipoCombustivel, i));
                } else if (automovel == "moto") {
                    System.out.println("Cilindradas: ");
                    Integer cilindradas = sc.nextInt();
                    System.out.println("Tipo de partida: ");
                    String tipoDePartida = sc.next();

                    veiculos.add(i, new Moto(i, marca, modelo, ano, cilindradas, tipoDePartida));
                }
            }
        }
        System.out.println("Sistema encerrado!");
    }

}