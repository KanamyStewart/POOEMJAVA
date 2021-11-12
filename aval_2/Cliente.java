import java.util.ArrayList;

public class Cliente extends Pessoa {

    private String telefone;
    private ArrayList<Receita> receitas = new ArrayList<>();

    protected Cliente(
        String nome, 
        String cpf, 
        String dataDeNascimento,
        String telefone
        ) {
        super(nome, cpf, dataDeNascimento);
        this.telefone = telefone;
    }

    public String getTelefone(){
        return this.telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public void setReceita(Receita receita) {
        this.receitas.add(receita);
    }

    public ArrayList<Receita> getReceitas() {
        return this.receitas;
    }
    
    @Override
    public String carteira(){
        String ret = super.carteira() 
        + "\n Telefone: " + this.getTelefone();

        for (Receita receita : this.receitas){
            ret += "\n " + receita.getNomeReceita();
        };

        return ret;
    }
}
