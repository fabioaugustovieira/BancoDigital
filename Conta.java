public abstract class Conta {
    private static int numeroSequencial = 1;
    private int numero;
    private Cliente cliente;
    private double saldo;

    public Conta(Cliente cliente) {
        this.numero = numeroSequencial++;
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    public abstract void sacar(double valor);

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "Conta{" +
               "numero=" + numero +
               ", cliente=" + cliente.getNome() +
               ", saldo=" + saldo +
               '}';
    }
}
