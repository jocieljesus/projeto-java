package heranca;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(int agencia, int numeroConta, String titularConta, double saldo, boolean isAtiva) {
        super(agencia, numeroConta, titularConta, saldo, isAtiva);
    }

    @Override
    public void depositar(double valor) {
        double rendimento = ( getSaldo() + valor ) * 0.01;
        super.depositar(valor  + rendimento);
    }
}
