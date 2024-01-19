package entities;

public class PessoaFisica extends Contribuinte {
    private Double despesaSaude;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String nome, Double rendaAnual, Double despesaSaude) {
        super(nome, rendaAnual);
        this.despesaSaude = despesaSaude;
    }

    public Double getDespesaSaude() {
        return despesaSaude;
    }

    public void setDespesaSaude(Double despesaSaude) {
        this.despesaSaude = despesaSaude;
    }

    @Override
    public Double contribuinte() {
        double sum = 0.0;
        if (getRendaAnual() < 20000) {
            sum += (getRendaAnual() * 0.15) - despesaSaude * 0.50;
        } else {
            sum += (getRendaAnual() * 0.25) - despesaSaude * 0.50;
        }
        return sum;
    }
}
