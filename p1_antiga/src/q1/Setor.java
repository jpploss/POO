package q1;

import java.util.HashSet;
import java.util.Set;

public class Setor implements UnidadeOrganizacional {
    private String nome;
    private Set<Funcionario> funcionarios = new HashSet<>();

    public Setor(String nome) {
        this.nome = nome;
    }

    public void transfereFuncionario(Funcionario f) {
        Setor antigoSetor = f.getSetor();
        if(antigoSetor != null) { 
            // se o funcionário já estiver em um setor, é necessário removê-lo deste antes
            antigoSetor.removeFuncionario(f);
        }
        f.setSetor(this);
        this.funcionarios.add(f);
    }

    public void removeFuncionario(Funcionario f) {
        f.setSetor(null);
        this.funcionarios.remove(f);
    }

    public String getNome() {
        return this.nome;
    }

    public int getQtdFuncionarios() {
        return this.funcionarios.size();
    }

    @Override
    public Set<Funcionario> getFuncionarios() {
        return new HashSet<>(this.funcionarios);
    }

    @Override
    public double getSalarioMedio() {
        double somaSalarios = 0;
        
        for(Funcionario f : this.funcionarios) {
            somaSalarios += f.getSalario();
        }
        
        return somaSalarios / this.funcionarios.size();
    }
    
    @Override
    public String toString() {
        String aux = "Setor: " + this.nome + "\n";
        for(Funcionario f : this.funcionarios) {
            aux += "   " + f.toString();
        }

        return aux;
    }
}
