public class PessoaJuridica extends Pessoa {

    private double lucro;

    public double getLucro() {
        return lucro;
    }

    public void setLucro(double lucro) {
        this.lucro = lucro;
    }

    @Override
    protected double calcularIR() {
        double irParcial = lucro * 0.15;
        double excedente = irParcial - 20000;
        return irParcial + (excedente > 0 ? excedente * 0.10 : 0);
    }

    @Override
    protected double calcularOutrosImpostos() {
        double csll = lucro * 0.09;
        double icms = lucro * 0.05;
        return csll + icms;
    }
}