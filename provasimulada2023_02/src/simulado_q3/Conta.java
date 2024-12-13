package simulado_q3;

public class Conta {
    private String nomeCliente;
    private double saldo;

    public Conta(String nomeCliente, double saldoInicial) {
        this.nomeCliente = nomeCliente;
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getNomeCliente() {
        return this.nomeCliente;
    }

    @Override
    public String toString() {
        return this.getNomeCliente();
    }
}
