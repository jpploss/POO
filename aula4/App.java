public class App {
    public static void main(String[] args) {

        Pessoa jp = new Pessoa("João Paulo");
        Pessoa poliana = new Pessoa("Poliana");
        Pessoa jussimar = new Pessoa("Jussimar");
        Pessoa edu = new Pessoa("Eduardo");


        jp.setMae(poliana);
        jp.setPai(jussimar);
        edu.setPai(jp);
        // jussimar.setPai(jp); // laço na genealogia

        System.out.println(edu.getParentes());
    }
}
