package q1;

import java.util.HashSet;
import java.util.Set;

public class Empresa {
    private String nome;
    private Set<Departamento> departamentos = new HashSet<>();

    public Empresa(String nome) {
        this.nome = nome;
    }

    public void addDepartamento(Departamento d) {
        this.departamentos.add(d);
    }

    @Override
    public String toString() {
        String aux = "Empresa: " + this.nome + "\n";
        for(Departamento d : this.departamentos) {
            aux += " " + d.toString();
        }

        return aux;
    }
}
