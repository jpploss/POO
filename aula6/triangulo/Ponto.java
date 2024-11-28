package triangulo;
public class Ponto {
    private double x;
    private double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double calculaDistancia(Ponto p) {
        double largura = this.getX() - p.getX();
        double altura = this.getY() - p.getY();

        return Math.sqrt((largura*largura) + (altura*altura));
    }
}
