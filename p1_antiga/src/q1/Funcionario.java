package q1;

public class Funcionario {
    private String nome;
    private double salario;
    private Setor setor;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return this.nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Setor getSetor() {
        return this.setor;
    }

    public void setSetor(Setor s) {
        this.setor = s;
    }

    @Override
    public String toString() {
        return this.nome + "\n";
    }
}
