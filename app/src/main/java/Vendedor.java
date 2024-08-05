public class Vendedor extends Funcionario {
    private double vendasBrutas;
    private double taxaComissao;

    public Vendedor(String nomeCompleto, String cpf, String telefone, String email, String endereco,
            double valeTransporte, double planoSaude, double previdencia, double valeAlimentacao, double salarioBase,
            double vendasBrutas, double taxaComissao) {
        super(nomeCompleto, cpf, telefone, email, endereco, valeTransporte, planoSaude, previdencia, valeAlimentacao,
                salarioBase);
        setVendasBrutas(vendasBrutas);
        setTaxaComissao(taxaComissao);
    }

    public double getComissao() {
        return getVendasBrutas() * getTaxaComissao();
    }

    @Override
    public double getAdicionais() {
        return super.getAdicionais() + getComissao();
    }

    public double getVendasBrutas() {
        return vendasBrutas;
    }
    public void setVendasBrutas(double vendasBrutas) {
        if (vendasBrutas < 0) {
            throw new IllegalArgumentException("Valor invalido para vendas brutas");
        }
        this.vendasBrutas = vendasBrutas;
    }
    public double getTaxaComissao() {
        return taxaComissao;
    }
    public void setTaxaComissao(double taxaComissao) {
        if (taxaComissao < 0 || taxaComissao > 1) {
            throw new IllegalArgumentException("Taxa fora da faixa [0,1]");
        }
        this.taxaComissao = taxaComissao;
    }

    @Override
    public String toString() {
        return super.toString()
            + String.format("Vendas brutas: %.2f\n", getVendasBrutas())
            + String.format("Taxa de comissao: %.2f\n", getTaxaComissao())
            + String.format("Comissao: %.2f\n", getComissao())
        ;
    }
}
