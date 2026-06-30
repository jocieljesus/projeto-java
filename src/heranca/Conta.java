package heranca;

public class Conta {

    private int agencia;
    private int numeroConta;
    private String titularConta;
    private double saldo;
    private boolean isAtiva;

    public Conta(int agencia, int numeroConta, String titularConta, double saldo, boolean isAtiva) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.titularConta = titularConta;
        this.saldo = saldo;
        this.isAtiva = isAtiva;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public boolean isAtiva() {
        return isAtiva;
    }

    public void setAtiva(boolean ativa) {
        isAtiva = ativa;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getTitularConta() {
        return titularConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        if (valor <= saldo) {
            this.saldo -= valor;
        } else {
            System.out.printf("Saldo insuficiente. O seu saldo atual é de:  %.2f", this.saldo);
        }
    }
}
