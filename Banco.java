public class Banco {
    public static void main(String[] args) {
        Conta contaLucas = new Conta("Lucas Ryan", 1500.50);
        ContaPoupanca contaMy = new ContaPoupanca("Myllena Assunção", 500.50);

        contaLucas.transferir(300.0, contaMy);
        contaMy.renderJuros();
        contaLucas.sacar(100.0);
        contaMy.sacar(100.0);

        
        System.out.println("--- RELATÓRIO BANCÁRIO ---");

        System.out.println("\nCliente: " + contaLucas.getTitular());
        System.out.println("Tipo: Conta Corrente");
        System.out.println("Saldo final: " + contaLucas.getSaldo());

        System.out.println("\nCliente: " + contaMy.getTitular());
        System.out.println("Tipo: Conta Poupança");
        System.out.println("Saldo final: " + contaMy.getSaldo());
        
        
        System.out.println("\n-------------------------");
    }
}
