package venda;

public class Jogo extends Produto {
    private int idadeMin;

    public Jogo(String nome, float preco, int idadeMin) {
        super(nome, preco);
        this.idadeMin = idadeMin;
    }

    public int getIdadeMin() {
        return idadeMin;
    }
    public void setIdadeMin(int idadeMin) {
        this.idadeMin = idadeMin;
    }
}
