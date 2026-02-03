public class Main {
    public static void main(String[] args) {
        var pf = new PessoaFisica();
        pf.setSalarioBruto(5000);
        pf.setDependentes(2);
        pf.setGastosSaude(300);
        pf.setGastosEducacao(200);
        System.out.println(pf.calcularTotalImpostos());

        var pj = new PessoaJuridica();
        pj.setLucro(100000);
        System.out.println(pj.calcularTotalImpostos());
    }
}