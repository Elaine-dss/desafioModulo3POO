package br.com.zup.entitie;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Venda {

    private Vendedor vendedor;
    private Cliente cliente;
    private Double valorDoPagamento;
    private String codigoDaVenda;
    private final Date data = new Date();
    private String dataDeRegistro;

    public Venda() {}

    public Venda(Vendedor vendedor, Cliente cliente, Double valorDoPagamento, String codigoDaVenda) {
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.valorDoPagamento = valorDoPagamento;
        this.codigoDaVenda = codigoDaVenda;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Double getValorDoPagamento() {
        return valorDoPagamento;
    }

    public void setValorDoPagamento(Double valorDoPagamento) {
        this.valorDoPagamento = valorDoPagamento;
    }

    public String getData() {
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy - HH:mm");
        return dataFormatada.format(data);
    }

    public String getCodigoDaVenda() { return codigoDaVenda; }

    public String getDataDeRegistro() {
        return dataDeRegistro;
    }

    public void setDataDeRegistro(String dataDeRegistro) {
        this.dataDeRegistro = dataDeRegistro;
    }

    @Override
    public String toString() {
        return "\n " + "\nDados da venda:"
                + "\n----------------------------------------------------"
                + "\n|"
                + "\n|  Valor: R$ " + valorDoPagamento
                + "\n|  Data de Registro: " + getDataDeRegistro()
                + "\n|  Código da venda: " + codigoDaVenda
                + "\n|"
                + "\n|  Dados do cliente:"
                + getCliente()
                + "\n|  Dados do vendedor responsável:"
                + getVendedor()
                + "\n----------------------------------------------------";
    }
}