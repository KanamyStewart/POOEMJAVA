import java.util.ArrayList;

public class Padaria extends Estabelecimentos {

    private String horaFuncinamento;
    private ArrayList<Receita> receitas = new ArrayList<>();

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

    public void setHorarioFuncionamento(String horaFuncinamento){
        this.horaFuncinamento = horaFuncinamento;
    }

    public String getHorarioFuncionamento(){
        return this.horaFuncinamento;
    }

    public void setReceita(Receita receita){
        this.receitas.add(receita);
    }

    public ArrayList<Receita> getReceitas(){
        return this.receitas;
    }

    public String dadosPadaria(){
        return "Nome padaria: " + super.getNome()
        + ", Quantidade de receitas Receitas : " + this.getReceitas().size();
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Padaria)) {
            return false;
        }
        Padaria padaria = (Padaria) o;
        return this.getEndereco().getRua() == padaria.getEndereco().getRua()
            && this.getEndereco().getNumero() == padaria.getEndereco().getNumero()
            && this.getNome() == padaria.getNome();
    }
}