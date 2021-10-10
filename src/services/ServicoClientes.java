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
        return clientes;
    }
}