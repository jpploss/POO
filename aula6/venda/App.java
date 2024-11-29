package venda;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Set<Produto> produtos = new HashSet<>();

        Produto xadrez = new Jogo("xadrez", 20f, 12);
        produtos.add(xadrez);
        Produto dama = new Jogo("dama", 20f, 12);
        produtos.add(dama);
        Produto uno = new Jogo("uno", 20f, 8);
        produtos.add(uno);
        Produto biblia = new Livro("biblia", 50f, "Deus");
        produtos.add(biblia);
        Produto narnia = new Livro("narnia", 20f,"C. S. L.");
        produtos.add(narnia);


        for(Produto p : produtos) {
            System.out.println(p);
        }
    }
}
