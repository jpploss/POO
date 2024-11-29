package venda;

public class Livro extends Produto {
    private String autor;

    public Livro(String nome, float preco, String autor) {
        super(nome, preco);
        this.autor = autor;
    }    

    public String getautor() {
        return autor;
    }
    public void setautor(String autor) {
        this.autor = autor;
    }
}
