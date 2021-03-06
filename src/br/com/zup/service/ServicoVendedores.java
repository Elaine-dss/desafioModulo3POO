package br.com.zup.service;

import br.com.zup.entitie.Vendedor;

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

        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.println("|                Lista de vendedores               |");
        System.out.println("----------------------------------------------------");

        return vendedores;
    }

    public static Vendedor pesquisarCpfVendedor(String cpf) throws Exception {
        for (Vendedor vendedor : vendedores) {
            if (cpf.equalsIgnoreCase(vendedor.getCpf())) {
                return vendedor;
            }
        }
        throw new Exception("CPF não encontrado!");
    }

    public static void removerVendedor(String cpf) {
        vendedores.removeIf(vendedor -> cpf.equalsIgnoreCase(vendedor.getCpf()));
        System.out.println("Vendedor removido com sucesso!");
    }

    public static void verificarDuplicidadeCpfVendedor(String cpf) throws Exception {
        for (Vendedor vendedor : vendedores) {
            if (cpf.equalsIgnoreCase(vendedor.getCpf())) {
                throw new Exception("CPF já cadastrado no sistema!");
            }
        }
    }

    public static void verificarDuplicidadeEmailVendedor(String email) throws Exception {
        for (Vendedor vendedor : vendedores) {
            if (email.equalsIgnoreCase(vendedor.getEmail())) {
                throw new Exception("Email já cadastrado no sistema!");
            }
        }
    }
}