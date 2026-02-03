public abstract class Pessoa {

    // Template Method
    public final double calcularTotalImpostos() {
        double total = calcularIR();
        total += calcularOutrosImpostos();
        return total;
    }

    protected abstract double calcularIR();
    protected abstract double calcularOutrosImpostos();

}