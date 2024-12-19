package simulado_q2;

import java.util.Random;

public class Pokemon implements PersonagemDeLuta<Pokemon> {
    
    private int vitalidadeInicial, dano1, dano2, vitalidadeAtual;

    public Pokemon(int vitalidade, int dano1, int dano2) {
        this.vitalidadeInicial = vitalidade;
        this.dano1 = dano1;
        this.dano2 = dano2;
        this.vitalidadeAtual = vitalidade;
    }

    public boolean atacar(Pokemon p) {
        Random r = new Random();
        int danoAtaque = (r.nextBoolean()) ? this.dano1 : this.dano2;
        
        p.vitalidadeAtual -= danoAtaque;

        return (p.vitalidadeAtual <= 0) ? true : false;    
    }

	public void regenera() {
        this.vitalidadeAtual = this.vitalidadeInicial;
    }

	public int getPontosVitalidade() {
        return this.vitalidadeAtual;
    }
}
