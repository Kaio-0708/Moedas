package Principal;

import Arquivo.GeradorDeArquivo;
import Calculo.CalculoDeConversao;
import Modelo.ConsultaConversor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Principal {
    public static  void main (String[] args){
        System.out.println("Seja bem-vindo ao Conversor de Moeda!\n");
        Scanner scanner = new Scanner(System.in);
        List<ConsultaConversor> historicoConversoes = new ArrayList<>();
        GeradorDeArquivo geradorDeArquivo = new GeradorDeArquivo();

        boolean continuar = true;

        while (continuar) {
            int opcaoMoedaOrigem = -1;
            while (opcaoMoedaOrigem < 0 || opcaoMoedaOrigem > 6) {
                String menu = """
                        **********************
                        Qual moeda você possui?
                         
                        1) USD - Dólar
                        2) ARS - Peso Argentino 
                        3) BRL - Real 
                        4) EUR - Euro
                        5) COP - Peso Colombiano
                        6) GBP - Libra Esterlina
                         
                        0) Sair
                         **********************
                           """;
                System.out.println(menu);
                System.out.println("Qual a sua opção? \n");
                opcaoMoedaOrigem = scanner.nextInt();
                scanner.nextLine();

                if (opcaoMoedaOrigem < 0 || opcaoMoedaOrigem > 6) {
                    System.out.println("Digite um número válido");
                }
            }
            if (opcaoMoedaOrigem == 0) break;

            String[] moedas = {
                    "USD", "ARS", "BRL", "EUR", "COP", "GBP"
            };
            String moedaOrigem = moedas[opcaoMoedaOrigem - 1];

            int opcaoMoedaDestino = -1;
            while (opcaoMoedaDestino < 0 || opcaoMoedaDestino > 6 || opcaoMoedaOrigem == opcaoMoedaDestino) {

                String menu2 = """
                                
                        Para qual moeda você gostaria de converter?
                         
                        1) USD - Dólar
                        2) ARS - Peso Argentino 
                        3) BRL - Real 
                        4) EUR - Euro
                        5) COP - Peso Colombiano
                        6) GBP - Libra Esterlina
                                   
                        0) Sair
                        **********************
                        Qual a sua opção?\s
                         """;
                System.out.println(menu2);
                opcaoMoedaDestino = scanner.nextInt();
                scanner.nextLine();

                if (opcaoMoedaDestino < 0 || opcaoMoedaDestino > 6) {
                    System.out.println("Digite um número válido");
                }
                if (opcaoMoedaOrigem == opcaoMoedaDestino){
                    System.out.println("A moeda de origem é igual à moeda de destino. Escolha outra moeda");
                }
            }
            if (opcaoMoedaDestino == 0) {
                break;
            }

            String moedaDestino = moedas[opcaoMoedaDestino - 1];

            String menu3 = """
                    **********************
                    Qual o valor a ser convertido?
                             """;

            System.out.println(menu3);
            double valor = scanner.nextDouble();
            scanner.nextLine();

            try {
                double valorConvertido = CalculoDeConversao.converterMoeda(moedaOrigem, moedaDestino, valor);
                System.out.printf("O valor convertido é: %.2f %s%n", valorConvertido, moedaDestino);
                Map<String, Object> registro = CalculoDeConversao.criarRegistroConversao(moedaOrigem, moedaDestino, valor, valorConvertido);
                geradorDeArquivo.salvaJson("conversao_" + moedaOrigem + "_para_" + moedaDestino, registro);
                historicoConversoes.add(new ConsultaConversor(moedaOrigem, moedaDestino, valor, valorConvertido));
            } catch (IOException | InterruptedException e) {
                System.out.println("Erro ao realizar a conversão: " + e.getMessage());
            }

            int opcao = -1;
            while (opcao < 0 || opcao > 2) {
                String menu4 = """
                        **********************
                        O que deseja fazer agora?
                                    
                        1- Converter outra moeda
                        2- Mostrar moedas convertidas 
                                    
                        0- Sair
                        **********************  
                                """;
                System.out.println(menu4);
                opcao = scanner.nextInt();
                scanner.nextLine();

                if (opcao < 0 || opcao > 2) {
                    System.out.println("Digite um número válido");
                }
            }

            if(opcao == 2){
                System.out.println("*********************");
                System.out.println("Conversões realizadas: \n");
                for(ConsultaConversor consulta : historicoConversoes){
                    System.out.println("De: " + consulta.moedaOrigem() + " para " + consulta.moedaDestino());
                    System.out.println(" o valor inicial " + consulta.valor() + " " + consulta.moedaOrigem() +
                            ", o valor convertido " + consulta.taxaConversao() +  " " + consulta.moedaDestino());
                }
                break;
            }

            if (opcao == 0) {
                continuar = false;
            }
        }
        scanner.close();

    }
}