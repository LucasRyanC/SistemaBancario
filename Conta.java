public class Conta {
    private String titular;
    protected double saldo;

    public Conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return this.titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    public void sacar(double valor) {
        if (valor > this.saldo) {
            throw new IllegalArgumentException("Erro: Saldo insuficiente para este saque.");
        }
        this.saldo = this.saldo - valor;
    }

    public void transferir(double valor, Conta contaDestino) {
        this.saldo = this.saldo - valor;

        contaDestino.saldo = contaDestino.saldo + valor;
    }
}
