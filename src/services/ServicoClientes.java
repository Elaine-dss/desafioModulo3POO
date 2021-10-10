package services;

import entities.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ServicoClientes {

    private static final List<Cliente> clientes = new ArrayList<>();

    public static void cadastrarCliente(String nome, String cpf, String email) {
        Cliente cliente = new Cliente(nome, cpf, email);
        clientes.add(cliente);
    }

    public static List<Cliente> getClientes() throws Exception {

        if (clientes.isEmpty()) {
            throw new Exception("Não encontramos nenhum cliente cadastrado!");
        }

        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.println("|                Lista de clientes                 |");
        System.out.println("----------------------------------------------------");

        return clientes;
    }

    public static Cliente pesquisarCpfCliente(String cpf) throws Exception {
        for (Cliente cliente : clientes) {
            if (cpf.equalsIgnoreCase(cliente.getCpf())) {
                return cliente;
            }
        }
        throw new Exception("CPF não encontrado!");
    }

    public static void validarEmailCliente(String email) throws Exception {
        if (!email.contains("@")) {
            throw new Exception("Email inválido! insira o @");
        }
    }
}