public class Main {
    public static void main(String[] args) {
        Cliente diogo = new Cliente();
        diogo.setNome("Diogo");

        Conta cc = new ContaCorrente(diogo);
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca(diogo);

        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
