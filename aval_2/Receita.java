import java.util.ArrayList;

public class Receita {
    int id;
    int numEtapas;
    String nome;
    String etapas;
    Chef chef;
    ArrayList<Padaria> padarias = new ArrayList<>();

    public Receita(
        int id,
        int numEtapas,
        String nome,
        String etapas
    ){
        this.id = id;
        this.numEtapas = numEtapas;
        this.nome = nome;
        this.etapas = etapas;
    }

    public void adicionarPadaria(Padaria padaria){
        this.padarias.add(padaria);
        padaria.adicionarReceita(this);
    }
}
