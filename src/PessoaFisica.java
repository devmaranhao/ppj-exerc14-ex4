public class PessoaFisica extends Pessoa {

    private double salarioBruto;
    private int dependentes;
    private double gastosSaude;
    private double gastosEducacao;

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public int getDependentes() {
        return dependentes;
    }

    public void setDependentes(int dependentes) {
        this.dependentes = dependentes;
    }

    public double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    public double getGastosEducacao() {
        return gastosEducacao;
    }

    public void setGastosEducacao(double gastosEducacao) {
        this.gastosEducacao = gastosEducacao;
    }

    @Override
    protected double calcularIR() {
        double inss = salarioBruto * 0.11;
        double deducaoDependentes = dependentes * 100; // valor fictício
        double irParcial = (salarioBruto - deducaoDependentes - inss) * 0.11;
        return irParcial - (gastosSaude + gastosEducacao);
    }

    @Override
    protected double calcularOutrosImpostos() {
        return salarioBruto * 0.11; // INSS
    }
}