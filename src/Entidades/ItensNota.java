package Entidades;

public class ItensNota {
    private Integer quantidade;
    private Double preco;

    private Produto produto;

    public ItensNota(Integer quantidade, Double preco, Produto produto) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public Double getPreco() {
        return preco;
    }

    public Double subtotal(){
        return quantidade * preco;
    }

    @Override
    public String toString() {
        return "\nProduto: " + produto.getNome() + " Quantidade: " + quantidade + " Preço: R$ " + preco + " Valor: " + subtotal();
    }
}
