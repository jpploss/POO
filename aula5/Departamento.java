public class Departamento {
    private String nome;
    private java.util.Set<Funcionario> funcionarios = new java.util.HashSet<Funcionario>();

    public Departamento(String nome)
    {
        this.nome = nome;
    }

    public void addFuncionario(Funcionario funcionario)
    {
        this.funcionarios.add(funcionario);
    }

    public String getNome()
    {
        return this.nome;
    }

    public float getMediaSalarial()
    {
        float somaSalarios = 0;
        int qtdFuncionarios = this.funcionarios.size();

        if(qtdFuncionarios == 0)
        {
            System.out.println("Departamento sem funcionários.");
            return 0;
        }

        for(Funcionario f: this.funcionarios)
        {
            somaSalarios += f.getSalario();
        }
        return (somaSalarios / qtdFuncionarios);
    }

    public java.util.Set<Funcionario> getFuncionarios()
    {
        return this.funcionarios;
    }
}