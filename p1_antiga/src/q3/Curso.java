package q3;

import java.util.LinkedHashMap;
import java.util.Map;

public class Curso {
    private String nome;
    private LinkedHashMap<String, Disciplina> disciplinas = new LinkedHashMap<>();

    public Curso(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Disciplina criaDisciplina(String idDisciplina, String nomeDisciplina) {
        Disciplina d = new Disciplina(idDisciplina, nomeDisciplina);
        this.disciplinas.put(idDisciplina, d);

        return d;
    }

    public void estabelecePreReq(Disciplina d, String idPreReq) {
        d.addPreReq(this.disciplinas.get(idPreReq));
    }

    @Override
    public String toString() {
        String aux = "Curso: " + this.getNome() + "\nDisciplinas:\n";
        for (Map.Entry<String, Disciplina> id : this.disciplinas.entrySet())
            aux += id.getValue().toString();
        
        return aux;
    } 

}
