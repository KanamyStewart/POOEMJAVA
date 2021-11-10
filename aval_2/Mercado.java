import java.util.ArrayList;

public class Mercado extends Estabelecimentos{

    private String promocao;
    private ArrayList<Receita> receitas = new ArrayList<>();
    private Endereco endereco;

    public Mercado(
        int idEstabelecimento,
        String promocao,
        String nome,
        String dataAbertura,
        int id,
        int numero,
        String cep,
        String rua,
        String bairro,
        String cidade
    ) {
        super(idEstabelecimento, nome, dataAbertura, id,
        numero,
        cep,
        rua,
        bairro,
        cidade);
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
    
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    public Endereco getEndereco(){
        return this.endereco;
    }
}
