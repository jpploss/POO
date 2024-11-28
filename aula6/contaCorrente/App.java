package contaCorrente;

public class App {
    public static void main(String[] args) {
        ContaCorrente contaJoao = new ContaCorrente("joao");
        contaJoao.deposita(1000.0);

        ContaCorrente contaPedro = new ContaCorrenteEspecial("pedro");
        contaPedro.deposita(1000.0);

        contaJoao.saque(1000.0);
        contaPedro.saque(1000.0);

        System.out.println("Saldo joao: " + contaJoao.getSaldo());
        System.out.println("Saldo pedro: " + contaPedro.getSaldo());
    }
}
