public class Pessoa
{
    private String nome;
    private Pessoa pai;
    private Pessoa mae;

    public Pessoa(String nome)
    {
        this.nome=nome;
    }
    public Pessoa(String nome, Pessoa pai, Pessoa mae)
    {
        this.nome=nome;
        this.pai=pai;
        this.mae=mae;
    }

    public String getNome()
    {
        return this.nome;
    }
    public void setNome(String nome)
    {
        this.nome=nome;
    }
    public Pessoa getPai() {
        return pai;
    }
    public void setPai(Pessoa pai) {
        this.pai = pai;
    }

    public Pessoa getMae() {
        return mae;
    }
    public void setMae(Pessoa mae) {
        this.mae = mae;
    }

    public java.util.Set<Pessoa> getAvós()
    {
        java.util.Set<Pessoa> avós = new java.util.HashSet<Pessoa>();
        if (this.mae!=null && this.getAvóMaterna()!=null) avós.add(this.getAvóMaterna());
        if (this.pai!=null && this.getAvóPaterna()!=null) avós.add(this.getAvóPaterna());
        if (this.pai!=null && this.getAvôPaterno()!=null) avós.add(this.getAvôPaterno());
        if (this.mae!=null && this.getAvôMaterno()!=null) avós.add(this.getAvôMaterno());
        return avós;
    }

    private void fillParentes(java.util.Set<Pessoa> parentes)
    {
        if(parentes.contains(this)) { // tratamento para laço na genealogia
            System.out.println("Laço na genealogia!");
            System.exit(1);
            // return;
        }
        
        parentes.add(this);
        if(this.mae != null) this.mae.fillParentes(parentes);
        if(this.pai != null) this.pai.fillParentes(parentes);
    }

    public java.util.Set<Pessoa> getParentes()
    {
        // java.util.LinkedList<Pessoa> parentes = new java.util.LinkedList<Pessoa>();
        java.util.Set<Pessoa> parentes = new java.util.HashSet<Pessoa>();

        if(this.mae != null) this.mae.fillParentes(parentes);
        if(this.pai != null) this.pai.fillParentes(parentes);

        return parentes;
    }

    public Pessoa getAvóPaterna()
    {
       return this.getPai().getMae();
    }
    public Pessoa getAvôPaterno()
    {
       return this.getPai().getPai();
    }
    public Pessoa getAvóMaterna()
    {
       return this.getMae().getMae();
    }
    public Pessoa getAvôMaterno()
    {
       return this.getMae().getPai();
    }

    public String toString()
    {
        return this.getNome();
    }

}