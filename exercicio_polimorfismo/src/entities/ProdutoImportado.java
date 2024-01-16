package entities;

public class ProdutoImportado extends Produto {
    private Double taxaPersonalizada;

    public ProdutoImportado() {
        super();
    }

    public ProdutoImportado(String nome, Double preco, Double taxaPersonalizada) {
        super(nome, preco);
        this.taxaPersonalizada = taxaPersonalizada;
    }

    public Double getTaxaPersonalizada() {
        return taxaPersonalizada;
    }

    public void setTaxaPersonalizada(Double taxaPersonalizada) {
        this.taxaPersonalizada = taxaPersonalizada;
    }

    @Override
    public String etiquetaPreco() {
        return getNome()
                + " R$"
                + String.format("%.2f", precoTotal())
                + " (Taxa personalizada: R$"
                + String.format("%.2f)", taxaPersonalizada);
    }

    public Double precoTotal() {
        return getPreco() + taxaPersonalizada;
    }
}
