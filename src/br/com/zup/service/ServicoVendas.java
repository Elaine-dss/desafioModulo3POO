package br.com.zup.service;

import br.com.zup.entitie.Cliente;
import br.com.zup.entitie.Venda;
import br.com.zup.entitie.Vendedor;

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

    public static List<Venda> pesquisarComprasDoClientes(String cpf) throws Exception {

        Cliente cliente = ServicoClientes.pesquisarCpfCliente(cpf);

        List<Venda> comprasDoCliente = new ArrayList<>();

        for (Venda referenciaVenda : vendas) {
            if (cpf.equalsIgnoreCase(referenciaVenda.getCliente().getCpf())) {
                comprasDoCliente.add(referenciaVenda);
            }
        }
        if (!comprasDoCliente.isEmpty()) {
            return comprasDoCliente;
        }
        throw new Exception((cliente.getNome() + " ainda não realizou nenhuma compra!"));
    }

    public static List<Venda> pesquisarVendasDoVendedor(String cpf) throws Exception {

        Vendedor vendedor = ServicoVendedores.pesquisarCpfVendedor(cpf);

        List<Venda> vendasDoVendedor = new ArrayList<>();

        for (Venda referenciaVenda : vendas) {
            if (cpf.equalsIgnoreCase(referenciaVenda.getVendedor().getCpf())) {
                vendasDoVendedor.add(referenciaVenda);
            }
        }
        if (!vendasDoVendedor.isEmpty()) {
            return vendasDoVendedor;
        }
        throw new Exception((vendedor.getNome() + " ainda não realizou nenhuma venda!"));
    }
}