package contaCorrente;

public class ContaCorrenteEspecial extends ContaCorrente {
    public ContaCorrenteEspecial(String nome) {
        super(nome);
    }

    @Override
    public double getTaxa() {
        return 1.001;
    }
}
