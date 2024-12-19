package q2;

import java.util.Random;

public class JogoPedraPapelTesouraImpl implements JogoPedraPapelTesoura {
    Jogada jogador1, jogador2;
    int vencedor;

    public JogoPedraPapelTesouraImpl() {
        Jogada[] j = Jogada.values();
        Random r = new Random();
        this.jogador1 = j[r.nextInt(3)];
        this.jogador2 = j[r.nextInt(3)];
    }

    @Override
    public boolean haVencedor() {
        if(this.jogador1 == Jogada.TESOURA) {
            if(this.jogador2 == Jogada.PAPEL) this.vencedor = 1;
            else if(this.jogador2 == Jogada.PEDRA) this.vencedor = 2;
        } 
        else if(this.jogador1 == Jogada.PAPEL) {
            if(this.jogador2 == Jogada.TESOURA) this.vencedor = 2;
            else if(this.jogador2 == Jogada.PEDRA)  this.vencedor = 1;
        }
        else {
            if(this.jogador2 == Jogada.TESOURA) this.vencedor = 1;
            else if(this.jogador2 == Jogada.PAPEL) this.vencedor = 2;
        }

        return (this.vencedor != 0) ? true : false;
    }

    @Override
    public Jogada jogadaJogador1() {
        return jogador1;
    }

    @Override
    public Jogada jogadaJogador2() {
        return jogador2;
    }

    @Override
    public int getJogadorVencedor() {
        return this.vencedor;
    }
    
}
