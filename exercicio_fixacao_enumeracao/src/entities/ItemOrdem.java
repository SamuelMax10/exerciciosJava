package entities;

public class ItemOrdem {
    private Integer quantidade;
    private Double preco;
    private Produto produto;


    public ItemOrdem() {

    }

    public ItemOrdem(Integer quantidade, Double preco, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
        this.preco=preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Double subTotal() {
        return quantidade * produto.getPreco();
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        return produto.getNome()
                + ", R$"
                + String.format("%.2f",preco)
                + ", Quantidade: "
                + getQuantidade()
                + ", Subtotal: R$"
                + String.format("%.2f", subTotal());

    }
}
