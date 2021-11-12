import java.util.ArrayList;

public class Mercado extends Estabelecimentos{

    private String promocao;
    private ArrayList<Receita> receitas = new ArrayList<>();

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
    
    public String dadosMercado(){
        return "Nome mercado: " + super.getNome()
        + ", Quantidade de receitas Receitas : " + this.getReceitas().size();
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Mercado)) {
            return false;
        }
        Mercado mercado = (Mercado) o;
        return this.getEndereco().getRua() == mercado.getEndereco().getRua()
            && this.getEndereco().getNumero() == mercado.getEndereco().getNumero()
            && this.getNome() == mercado.getNome();
    }
}
