package venda;

public abstract class Produto {
    String nome;
    float preco;

    public Produto(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return ("Nome: " + this.nome + ". Preço: " + this.preco);
    }

    
}
