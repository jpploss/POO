package contaCorrente;

public class ContaCorrente {
    private double saldo;
    private String usuario;

    public ContaCorrente(String nome) {
        this.usuario = nome;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public double getTaxa() {
        return 1.005;
    }

    public void deposita(double valorDeposito) {
        this.saldo += valorDeposito;
    }

    public void saque(double valorSaque) {
        this.saldo -= (this.getTaxa()*valorSaque);
    }

    public double getSaldo() {
        return this.saldo;
    }
}
