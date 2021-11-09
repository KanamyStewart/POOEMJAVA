import java.util.ArrayList;

public class Mercado extends Estabelecimentos{

    private String promocao;
    private ArrayList<Receita> receitas = new ArrayList<>();

    public Mercado(
        int id, 
        int numero, 
        String cep, 
        String rua, 
        String bairro,
        String cidade, 
        int idEstabelecimento,
        String tipo,
        String promocao,
        String nome,
        String dataAbertura
        ) {
        super(id, numero, cep, rua, bairro, cidade, idEstabelecimento, nome, dataAbertura);
        this.promocao = promocao;
    }

    public void setNomeMercado(String nomeMercado){
        this.promocao = nomeMercado;
    }

    public String getNomeMercado(){
        return this.promocao;
    }

    public void setReceita(Receita receita) {
        this.receitas.add(receita);
    }

    public ArrayList<Receita> getReceitas() {
        return this.receitas;
    }
    
}
