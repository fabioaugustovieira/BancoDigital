import java.util.HashMap;
import java.util.Map;

public class Banco {
    private Map<Integer, Conta> contas = new HashMap<>();

    public void adicionarConta(Conta conta) {
        contas.put(conta.getNumero(), conta);
    }

    public Conta buscarConta(int numero) {
        return contas.get(numero);
    }

    public void transferir(int numeroOrigem, int numeroDestino, double valor) {
        Conta origem = buscarConta(numeroOrigem);
        Conta destino = buscarConta(numeroDestino);

        if (origem != null && destino != null) {
            origem.sacar(valor);
            destino.depositar(valor);
        }
    }
}
