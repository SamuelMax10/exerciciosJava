package entities;

public class ItemOrdem {
    private Integer quantidade;
    private Double preco;

    public ItemOrdem() {

    }

    public ItemOrdem(Integer quantidade, Double preco) {
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    public Double subTotal(){
        return quantidade*preco;
    }
}