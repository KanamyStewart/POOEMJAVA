import java.util.ArrayList;

public class Chef {
    int id;
    String nome;
    String cpf;
    String dataNascimento;
    ArrayList<Receita> receitas = new ArrayList<>();

    public Chef(
        int id,
        String nome,
        String cpf,
        String dataNascimento
    ){
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public void adicionarReceita(Receita receita){
        this.receitas.add(receita);
    }
}
