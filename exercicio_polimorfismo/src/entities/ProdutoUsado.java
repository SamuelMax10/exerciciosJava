package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto{

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date dataFabricacao;

    public ProdutoUsado(){
        super();
    }

    public ProdutoUsado(String nome, Double preco, Date dataFabricacao) {
        super(nome, preco);
        this.dataFabricacao = dataFabricacao;
    }
    @Override
    public String etiquetaPreco() {
        return getNome()
                +" (usado) R$"
                +String.format("%.2f",getPreco())
                +" (Data de fabricação: "
                +sdf.format(dataFabricacao)
                +")";
    }

}
