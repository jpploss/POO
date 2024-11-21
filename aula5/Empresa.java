import java.util.HashSet;

public class Empresa {
    private String nome;
    private java.util.Set<Departamento> departamentos = new HashSet<Departamento>();

    public Empresa(String nome)
    {
        this.nome = nome;
    }

    public String getNome() 
    {
        return this.nome;
    }

    public void addDepartamento(Departamento departamento)
    {
        this.departamentos.add(departamento);
    }

    public java.util.Set<Departamento> getDepartamentos() 
    {
        return this.departamentos;
    }

    @Override
    public String toString()
    {
        return this.nome;
    }
}
