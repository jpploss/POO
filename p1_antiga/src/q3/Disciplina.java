package q3;

import java.util.LinkedList;
import java.util.List;

public class Disciplina {
    private String id, nome;
    private List<Disciplina> preReq = new LinkedList<>();

    public Disciplina(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void addPreReq(Disciplina d) {
        this.preReq.add(d);
    }

    public List<Disciplina> getPreReq() {
        return new LinkedList<>(this.preReq);
    }

    @Override
    public String toString() {
        String aux = this.nome + ", ";

        if(this.preReq.isEmpty()) aux += "sem pré-requisitos\n";
        else {
            aux += "pré-requisitos: ";

            int i = this.preReq.size() - 1;
            for(Disciplina d : this.preReq) {
                aux += d.getNome();
                if(i > 0) aux += ", ";
                if(i == 0) aux += "\n";
                i--;
            }
        }

        return aux;
    }

}
