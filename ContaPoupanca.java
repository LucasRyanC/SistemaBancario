public class ContaPoupanca extends Conta {
    public ContaPoupanca(String titular, double saldo) {
        super(titular, saldo);
    }

    public void renderJuros() {
        this.saldo = this.saldo + (this.saldo * 0.05);
    }

    @Override
    public void sacar(double valor) {
        this.saldo = this.saldo - valor - 2.0;
    }

}
