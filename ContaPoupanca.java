public class ContaPoupanca extends Conta {
    private static final double TAXA_JUROS = 0.02;

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && getSaldo() >= valor) {
            // Atualiza saldo
            depositar(-valor);
        }
    }

    public void aplicarJuros() {
        double novoSaldo = getSaldo() * (1 + TAXA_JUROS);
        depositar(novoSaldo - getSaldo());
    }
}
