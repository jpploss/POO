package q1;

import java.util.HashSet;
import java.util.Set;

public class Departamento implements UnidadeOrganizacional {
    private String nome;
    private Set<Setor> setores = new HashSet<>();

    public Departamento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void addSetor(Setor s) {
        this.setores.add(s);
    }

    public Set<Setor> getSetores() {
        return new HashSet<>(this.setores);
    }


    @Override
    public double getSalarioMedio() {
        double somaSalarios = 0.0;
        int numFuncionarios = 0;

        for(Setor s : this.setores) {
            int numFuncionariosSetor = s.getQtdFuncionarios();
            double mediaSalarioSetor = s.getSalarioMedio();

            somaSalarios += (numFuncionariosSetor*mediaSalarioSetor);
            numFuncionarios += numFuncionariosSetor;
        }

        return somaSalarios/numFuncionarios;
    }

    @Override
    public Set<Funcionario> getFuncionarios() {
        Set<Funcionario> funcionarios = new HashSet<>();

        for(Setor s : this.setores) {
            funcionarios.addAll(s.getFuncionarios());
        }

        return funcionarios;
    }

    @Override
    public String toString() {
        String aux = "Departamento: " + this.nome + "\n";
        for(Setor s : this.setores) {
            aux += "  " + s.toString();
        }

        return aux;
    }
    
}
