public class Funcionario {
    private String nome;
    private float salario;
    private Departamento departamentoDeOrigem;

    public Funcionario(String nome, float salario)
    {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() 
    {
        return this.nome;
    }

    public float getSalario() 
    {
        return this.salario;
    }

    public void setDepartamentoOrigemFuncionario(Departamento d)
    {
        this.departamentoDeOrigem = d;
    }

    public Departamento getDepartamentoOrigemFuncionario()
    {
        return this.departamentoDeOrigem;
    }

    @Override
    public String toString() 
    {
        return this.getNome();
    }
}
