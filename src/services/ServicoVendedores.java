package services;

import entities.Vendedor;

import java.util.ArrayList;
import java.util.List;

public class ServicoVendedores {

    private static final List<Vendedor> vendedores = new ArrayList<>();

    public static void cadastrarVendedor(String nome, String cpf, String email) {
        Vendedor vendedor = new Vendedor(nome, cpf, email);
        vendedores.add(vendedor);
    }

    public static List<Vendedor> getVendedores() throws Exception {
        if (vendedores.isEmpty()){
            throw new Exception("Não encontramos nenhum vendedor cadastrado!");
        }
        return vendedores;
    }
}