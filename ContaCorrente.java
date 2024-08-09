public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(Cliente cliente, double limite) {
        super(cliente);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && (getSaldo() + limite) >= valor) {
            double novoSaldo = getSaldo() - valor;
            if (novoSaldo >= 0) {
                // Atualiza saldo
                depositar(-valor);
            }
        }
    }
}
