package simulado_q3;

import java.util.HashSet;
import java.util.Set;

public class Agencia {
    private String nomeAgencia;
    private Set<Conta> contas = new HashSet<Conta>();

    public Agencia(String nome) {
        this.nomeAgencia = nome;
    }

    public void adicionaConta(Conta c) {
        this.contas.add(c);
    }

    public String getNomeAgencia() {
        return this.nomeAgencia;
    }

    public double getSaldoMedio() {
        double sumSaldos = 0.0;
        for(Conta c : this.contas) {
            sumSaldos += c.getSaldo();
        }

        return sumSaldos/this.contas.size();
    }

    @Override
    public String toString() {
        return "Agência: " +
                this.nomeAgencia +
                ", saldo médio: " +
                this.getSaldoMedio();
    }

}
