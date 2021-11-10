import java.util.ArrayList;

public class Padaria extends Estabelecimentos {

    private String horaFuncinamento;
    private ArrayList<Receita> receitas = new ArrayList<>();
    private Endereco endereco;

    public Padaria(
        int idEstabelecimento,
        String horaFuncinamento,
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
        this.horaFuncinamento = horaFuncinamento;

    }

    public void setNome(String horaFuncinamento){
        this.horaFuncinamento = horaFuncinamento;
    }

    public String getNome(){
        return this.horaFuncinamento;
    }

    public void setReceita(Receita receita){
        this.receitas.add(receita);
    }

    public ArrayList<Receita> getReceitas(){
        return this.receitas;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    public Endereco getEndereco(){
        return this.endereco;
    }


}