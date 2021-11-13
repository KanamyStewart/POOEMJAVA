import java.util.ArrayList;

public class Chef extends Pessoa implements CalculoSalario{
    private String especialidae;
    private double salario;
    private ArrayList<Receita> receitas = new ArrayList<>();

    protected Chef(
        String nome, 
        String cpf, 
        String dataDeNascimento,
        String especialidade,
        double salario
        ) {
        super(nome, cpf, dataDeNascimento);
        this.especialidae = especialidade;
        this.salario = salario;
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

    public double getSalario(){
        return this.salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
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

    @Override
    public String carteira() {
        return "\nNome Chef: " + this.getNome() 
            + "\nCPF: " + this.getCpf() 
            + "\nData Nascimento: " + this.getDataDeNascimento()
            + "\nEspecialidade: " + this.getEspecialidade()
            + "\nSalario: " + this.getSalario()
            + "\nMédia salario anual: " + this.Calculo();
            
    }

    @Override
    public double Calculo() {
        return this.getSalario() * 12;
    }

}
