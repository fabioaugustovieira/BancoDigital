public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00");
        Cliente cliente2 = new Cliente("Maria Oliveira", "987.654.321-00");

        ContaCorrente contaCorrente = new ContaCorrente(cliente1, 500.0);
        ContaPoupanca contaPoupanca = new ContaPoupanca(cliente2);

        contaCorrente.depositar(1000.0);
        contaPoupanca.depositar(500.0);

        Banco banco = new Banco();
        banco.adicionarConta(contaCorrente);
        banco.adicionarConta(contaPoupanca);

        banco.transferir(contaCorrente.getNumero(), contaPoupanca.getNumero(), 200.0);

        System.out.println(contaCorrente);
        System.out.println(contaPoupanca);
    }
}
