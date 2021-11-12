import java.util.ArrayList;

public class Receita {
    private int id;
    private String nomeReceita;
    private String numEtapas;
    private Double valor;
    private Chef chef;
    private ArrayList<Mercado> mercados = new ArrayList<>();
    private ArrayList<Padaria> padarias = new ArrayList<>();
    private ArrayList<Cliente> clientes = new ArrayList<>();

    protected Receita(
        int id,
        String nomeReceita,
        String numEtapas,
        Double valor,
        Chef chef
        ) {
        this.id = id;
        this.nomeReceita = nomeReceita;
        this.numEtapas = numEtapas;
        this.valor = valor;
        this.chef = chef;

        chef.setReceita(this);
    }

    public void setId(int id){
        this.id = id;
    }

    public void setNomeReceita(String nomeReceita){
        this.nomeReceita = nomeReceita;
    }

    public void setNumEtapas(String numEtapas){
        this.numEtapas = numEtapas;
    }

    public void setValor(Double valor){
        this.valor = valor;
    }

    public int getId(){
        return this.id;
    }

    public String getNomeReceita(){
        return this.nomeReceita;
    }

    public String getNumEtapas(){
        return this.numEtapas;
    }

    public Double getValor(){
        return this.valor;
    }
    
    public void setMercado(Mercado mercado){
        this.mercados.add(mercado);
    }
    
    public ArrayList<Mercado> getMercado(){
        return this.mercados;
    }

    public void setPadaria(Padaria padaria){
        this.padarias.add(padaria);
    }
    
    public ArrayList<Padaria> getPadarias(){
        return this.padarias;
    }

    public void setCliente(Cliente cliente){
        this.clientes.add(cliente);
        cliente.setReceita(this);
    }
    
    public ArrayList<Cliente> getClientes(){
        return this.clientes;
    }

    public void setChef(Chef chef){
        this.chef = chef;
    }

    public Chef getChef(){
        return this.chef;
    }

    public String dadosReceita(){
        return "Receita: " + this.getNomeReceita()
        + ", Valor: " + this.getValor();
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Receita)){
            return false;
        }
        Receita receita = (Receita) o;
        return this.getChef().getCpf() == receita.getChef().getCpf()
            && this.getChef().getNome() == receita.getChef().getCpf()
            && this.getNomeReceita() == receita.getNomeReceita();
    }
}
