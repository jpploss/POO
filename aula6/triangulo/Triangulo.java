package triangulo;
public class Triangulo {
    private Ponto p1, p2, p3;

    public Triangulo(Ponto p1, Ponto p2, Ponto p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public double calculaPerimetro() {
        return p1.calculaDistancia(p2) + p1.calculaDistancia(p3) + p2.calculaDistancia(p3);
    }
}
