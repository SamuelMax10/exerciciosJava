package entities;

public class PessoaJuridica extends Contribuinte {
    private Integer numeroFuncionario;

    public PessoaJuridica() {

    }

    public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFuncionario) {
        super(nome, rendaAnual);
        this.numeroFuncionario = numeroFuncionario;
    }

    public Integer getNumeroFuncionario() {
        return numeroFuncionario;
    }

    public void setNumeroFuncionario(Integer numeroFuncionario) {
        this.numeroFuncionario = numeroFuncionario;
    }

    @Override
    public Double contribuinte() {
        double sum = 0.0;
        if (numeroFuncionario > 10) {
            sum += getRendaAnual() * 0.14;
        } else {
            sum += getRendaAnual() * 0.16;
        }
        return sum;
    }
}
