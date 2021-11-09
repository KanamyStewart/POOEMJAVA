import java.util.ArrayList;

public class Receita extends Chef {
    private int id;
    private String nomeReceita;
    private String numEtapas;
    private Double valor;
    private ArrayList<Mercado> mercados = new ArrayList<>();
    private ArrayList<Padaria> padarias = new ArrayList<>();
    private ArrayList<Cliente> clientes = new ArrayList<>();

    protected Receita(
        String nome, 
        String cpf, 
        String dataDeNascimento, 
        String especialidade,
        int id,
        String nomeReceita,
        String numEtapas,
        Double valor
        ) {
        super(nome, cpf, dataDeNascimento, especialidade);
        this.id = id;
        this.nomeReceita = nomeReceita;
        this.numEtapas = numEtapas;
        this.valor = valor;
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
    
    public void setChef(Mercado mercado){
        this.mercados.add(mercado);
    }
    
    public ArrayList<Mercado> getChefs(){
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
    }
    
    public ArrayList<Cliente> getClientes(){
        return this.clientes;
    }
}
