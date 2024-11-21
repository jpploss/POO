public class FuncionarioTempoParcial extends Funcionario {
    private float horasSemanais;

    public FuncionarioTempoParcial(String nome, float salario)
    {
        super(nome, salario);
    }

    public void setNumeroHorasSemanais(float horas)
    {
        this.horasSemanais = horas;
    }

    public float getHorasSemanais()
    {
        return this.horasSemanais;
    }
}
