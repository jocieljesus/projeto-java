package heranca;

public class ContaCorrente extends Conta{

    public ContaCorrente(int agencia, int numeroConta, String titularConta, double saldo, boolean isAtiva) {
        super(agencia, numeroConta, titularConta, saldo, isAtiva);
    }

    @Override
    public void sacar(double valor) {
        double taxaSaque = valor * 0.005;
        super.sacar(valor+taxaSaque);
    }
}
