package services;

import entities.Cliente;
import entities.Venda;
import entities.Vendedor;

import java.util.ArrayList;
import java.util.List;

public class ServicoVendas {

    private static final List<Venda> vendas = new ArrayList<>();

    public static void cadastrarVenda(Vendedor vendedor, Cliente cliente, Double valorDoPagamento) {
        Venda venda = new Venda(vendedor, cliente, valorDoPagamento);
        venda.setDataDeRegistro(venda.getData());
        vendas.add(venda);
    }

    public static List<Venda> getVendas() throws Exception {
        if (vendas.isEmpty()) {
            throw new Exception("Não encontramos nenhuma venda cadastrada!");
        }
        return vendas;
    }
}
