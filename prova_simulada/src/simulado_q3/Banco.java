package simulado_q3;

import java.util.HashSet;
import java.util.Set;

public class Banco {
    private String nome;
    private Set<Agencia> agencias = new HashSet<Agencia>();
    
    public Banco(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    public Agencia criaAgencia(String nomeAgencia) {
        Agencia a = new Agencia(nomeAgencia);
        this.agencias.add(a);
        return a;
    }

    public void adicionaAgencia(Agencia a) {
        this.agencias.add(a);
    }

    @Override
    public String toString() {
        String s = "Nome do Banco: " +
                this.nome +
                "\n";
        for(Agencia a : this.agencias) {
            s += (a.toString() + "\n");
        }
        return s;
    }

}
