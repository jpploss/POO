package q3;

import java.util.HashSet;
import java.util.Set;

public class Universidade {
    private String nome;
    private Set<Curso> cursos = new HashSet<>();
    
    public Universidade(String nome) {
        this.nome = nome;
    }

    public Curso criaCurso(String nomeCurso) {
        Curso c = new Curso(nomeCurso);
        this.cursos.add(c);

        return c;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        String aux = "\n\nUniversidade: " + this.getNome() + "\n";

        for (Curso curso : this.cursos) {
            aux += curso.toString();
        }

        return aux;
    }
    
}
