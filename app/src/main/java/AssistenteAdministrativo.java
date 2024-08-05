public class AssistenteAdministrativo extends Funcionario {
    private double horasExtras;

    public AssistenteAdministrativo(String nomeCompleto, String cpf, String telefone, String email, String endereco,
            double valeTransporte, double planoSaude, double previdencia, double valeAlimentacao, double salarioBase,
            double horasExtras) {
        super(nomeCompleto, cpf, telefone, email, endereco, valeTransporte, planoSaude, previdencia, valeAlimentacao,
                salarioBase);
        setHorasExtras(horasExtras);
    }
    
    @Override
    public double getAdicionais() {
        return super.getAdicionais() + getSalarioBase() / 220 * 1.5 * getHorasExtras();
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }

    public double getRendimentoHorasExtras() {
        return getSalarioBase() / 220 * 1.5 * getHorasExtras();
    }

    @Override
    public String toString() {
        return super.toString()
        + String.format("Qtd de horas extras: %.2f\n", getHorasExtras())
        + String.format("Rendimento horas extras: %.2f\n", getRendimentoHorasExtras())
    ;
    }

}
