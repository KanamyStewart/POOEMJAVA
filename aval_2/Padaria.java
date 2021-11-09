import java.util.ArrayList;

public class Padaria extends Estabelecimentos {

    private String horaFuncinamento;
    private ArrayList<Receita> receitas = new ArrayList<>();

    public Padaria(
        int id, 
        int numero, 
        String cep, 
        String rua, 
        String bairro, 
        String cidade, 
        int idEstabelecimento,
        String tipo,
        String horaFuncinamento,
        String nome,
        String dataAbertura
        ) {
        super(id, numero, cep, rua, bairro, cidade, idEstabelecimento, nome, dataAbertura);
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

}