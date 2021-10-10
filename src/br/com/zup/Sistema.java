package br.com.zup;

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
}
