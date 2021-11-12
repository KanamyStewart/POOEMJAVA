import java.util.ArrayList;

public class Chef extends Pessoa {
    private String especialidae;
    private ArrayList<Receita> receitas = new ArrayList<>();

    protected Chef(
        String nome, 
        String cpf, 
        String dataDeNascimento,
        String especialidade
        ) {
        super(nome, cpf, dataDeNascimento);
        this.especialidae = especialidade;
    }

    public void setEspecialidade(String especialidade){
        this.especialidae = especialidade;
    }

    public String getEspecialidade(){
        return this.especialidae;
    }

    public void setReceita(Receita receita){
        this.receitas.add(receita);
    }

    public ArrayList<Receita> getReceitas(){
        return this.receitas;
    }

    
    public String carteira(){
        String ret = super.carteira()
        + "\nEspecialidade: " + this.getEspecialidade()
        + "\nQuantidade de receitas: " + this.receitas.size();

        for (Receita receita : this.receitas){
            ret += "\n " + receita.dadosReceita();
        };

        return ret;
    }

    @Override
    public boolean equals(Object o){
        if (o == this)
            return true;
        if (!(o instanceof Chef)){
            return false;
        }
        Chef chef = (Chef) o;
        return this.getCpf() == chef.getCpf()
            && this.getReceitas() == chef.getReceitas()
            && this.getNome() == chef.getNome();
    }

}
