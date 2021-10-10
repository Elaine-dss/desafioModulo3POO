package br.com.zup;

import entities.Cliente;
import entities.Vendedor;
import services.ServicoClientes;
import services.ServicoVendas;
import services.ServicoVendedores;

import java.util.Scanner;

public class Sistema {

    public static Scanner capturarDados(String msg) {
        System.out.print(msg);
        return new Scanner(System.in);
    }

    public static void exibirMenu() {
        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.println("|                  MENU PRINCIPAL                  |");
        System.out.println("----------------------------------------------------");
        System.out.println("|  Digite 1 para cadastrar uma vendendor           |");
        System.out.println("|  Digite 2 para cadastrar um cliente              |");
        System.out.println("|  Digite 3 para cadastrar uma venda               |");
        System.out.println("|  Digite 4 para listar vendas cadastradas         |");
        System.out.println("|  Digite 5 para listar vendedores cadastradas     |");
        System.out.println("|  Digite 6 para listar clientes cadastradas       |");
        System.out.println("|  Digite 7 para pesquisar compras de um cliente   |");
        System.out.println("|  Digite 8 para pesquisar vendas de um vendendor  |");
        System.out.println("|  Digite 9 para sair                              |");
        System.out.println("----------------------------------------------------");
    }

    public static void cadastrarVendedor() throws Exception {
        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.println("|  Informe os dados do vendedor:");
        System.out.println("----------------------------------------------------");
        String nome = capturarDados("|  Nome: ").nextLine();
        String cpf = capturarDados("|  CPF: ").nextLine();
        String email = capturarDados("|  Email: ").nextLine();
        System.out.println("----------------------------------------------------");
        System.out.println("Vendedor cadastrado com sucesso!");
        ServicoVendedores.cadastrarVendedor(nome,cpf,email);
    }

    public static void cadastrarCliente() throws Exception {
        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.println("|  Informe os dados do cliente:");
        System.out.println("----------------------------------------------------");
        String nome = capturarDados("|  Nome: ").nextLine();
        String cpf = capturarDados("|  CPF: ").nextLine();
        String email = capturarDados("|  Email: ").nextLine();
        System.out.println("----------------------------------------------------");
        System.out.println("Cliente cadastrado com sucesso!");
        ServicoClientes.cadastrarCliente(nome, cpf, email);
    }

    public static void cadastrarVenda() throws Exception {
        String cpfVendedor = capturarDados("Informe o cpf do vendedor responsável: ").nextLine();
        Vendedor vendedor = ServicoVendedores.pesquisarCpfVendedor(cpfVendedor);
        String cpfCliente = capturarDados("Informe o cpf do cliente: ").nextLine();
        Cliente cliente = ServicoClientes.pesquisarCpfCliente(cpfCliente);
        Double valorASerPago = capturarDados("Informe o valor da venda: R$ ").nextDouble();
        ServicoVendas.cadastrarVenda(vendedor, cliente, valorASerPago);
        System.out.println("Cadastro realizado com sucesso!");
    }

    public static void executar() {
        boolean finalizar = false;

        while (!finalizar) {
            try {
                exibirMenu();
                int opcaoDesejada = capturarDados("Digite um número referente a opção desejada: ").nextInt();

                if (opcaoDesejada == 1) {
                    cadastrarVendedor();
                }
                if (opcaoDesejada == 2) {
                    cadastrarCliente();
                }
                if (opcaoDesejada == 3) {
                    cadastrarVenda();
                }
                if (opcaoDesejada == 4) {
                    System.out.println(ServicoVendas.getVendas());
                    System.out.println("Fim de exibição!");
                }
                if (opcaoDesejada == 5) {
                    System.out.println(ServicoVendedores.getVendedores());
                    System.out.println("----------------------------------------------------");
                    System.out.println("Fim de exibição!");
                }
                if (opcaoDesejada == 6) {
                    System.out.println(ServicoClientes.getClientes());
                    System.out.println("----------------------------------------------------");
                    System.out.println("Fim de exibição!");
                }
                if (opcaoDesejada == 7) {
                    String cpf = capturarDados("Digite o cpf do cliente desejado: ").nextLine();
                }
                if (opcaoDesejada == 8) {
                    String cpf = capturarDados("Digite o cpf do vendedor desejado: ").nextLine();
                }
                if (opcaoDesejada == 9) {
                    finalizar = true;
                    System.out.println("Programa finalizado!");
                }
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }
        }
    }
}