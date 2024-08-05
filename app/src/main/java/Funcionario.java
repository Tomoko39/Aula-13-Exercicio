public class Funcionario {
    //dados pessoais
    protected String nomeCompleto;
    protected String cpf;
    protected String telefone;
    protected String email;
    protected String endereco;

    // descontos
    protected double valeTransporte;
    protected double planoSaude;
    protected double previdencia;

    // adicionais
    protected double valeAlimentacao;

    protected double salarioBase;

    public Funcionario(String nomeCompleto, String cpf, String telefone, String email, String endereco,
            double valeTransporte, double planoSaude, double previdencia, double valeAlimentacao, double salarioBase) {
        setNomeCompleto(nomeCompleto);
        setCpf(cpf);
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.valeTransporte = valeTransporte;
        this.planoSaude = planoSaude;
        this.previdencia = previdencia;
        this.valeAlimentacao = valeAlimentacao;
        this.salarioBase = salarioBase;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf != null && !cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")) {
            throw new IllegalArgumentException("CPF invalido");
        }
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getValeTransporte() {
        return valeTransporte;
    }

    public void setValeTransporte(double valeTransporte) {
        this.valeTransporte = valeTransporte;
    }

    public double getPlanoSaude() {
        return planoSaude;
    }

    public void setPlanoSaude(double planoSaude) {
        this.planoSaude = planoSaude;
    }

    public double getPrevidencia() {
        return previdencia;
    }

    public void setPrevidencia(double previdencia) {
        this.previdencia = previdencia;
    }

    public double getValeAlimentacao() {
        return valeAlimentacao;
    }

    public void setValeAlimentacao(double valeAlimentacao) {
        this.valeAlimentacao = valeAlimentacao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    protected double getDescontos() {
        return getValeTransporte() + getPlanoSaude() + getPrevidencia();
    }

    protected double getAdicionais() {
        return getValeAlimentacao();
    }

    protected double getSalarioBruto() {
        return getSalarioBase() + getAdicionais();
        //metodo sobrescrito: prioridade para a versao da filha
        //apenas chama a versao da mae se nao existir uma versao na filha
    }

    protected double getSalarioLiquido() {
        return getSalarioBruto() - getDescontos();
    }

    @Override
    public String toString() {
        return String.format("Nome: %s \n", getNomeCompleto()) 
        + String.format("CPF: %s \n", getCpf())
        + String.format("Telefone: %s \n", getTelefone()) 
        + String.format("Email: %s \n", getEmail())  
        + String.format("Endereco: %s \n", getEndereco()) 
        + String.format("Vale transporte: %.2f \n", getValeTransporte()) 
        + String.format("Plano de saude: %.2f \n", getPlanoSaude())
        + String.format("Previdencia: %.2f \n", getPrevidencia())
        + String.format("Vale alimentacao: %.2f \n", getValeAlimentacao())
        + String.format("Salario base: %.2f \n", getSalarioBase())
        + String.format("Adicionais: %.2f \n", getAdicionais())
        + String.format("Descontos: %.2f \n", getDescontos())
        + String.format("Salario bruto: %.2f \n", getSalarioBruto())
        + String.format("Salario liquido: %.2f \n", getSalarioLiquido());
    }
}
