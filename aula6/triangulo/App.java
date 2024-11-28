package triangulo;
public class App {
    public static void main(String[] args) {
        if(args.length != 6) {
            System.out.println("Parâmetros não informados");
            return;
        }

        Ponto[] pontos = new Ponto[3];
        int j = 0;
        for(int i = 0; i < 6; i+=2) {
            pontos[j] = new Ponto(Double.parseDouble(args[i+1]), Double.parseDouble(args[i]));
            j++;
        }
        Triangulo triangulo = new Triangulo(pontos[0], pontos[1], pontos[2]);
        
        System.out.println("Perímetro = " + triangulo.calculaPerimetro());
    }
}
