import java.util.ArrayList;

public class Padaria {
    int id;
    String nome;
    String dataAbertura;
    Endereco endereco;
    ArrayList<Receita> receitas = new ArrayList<>();

    public Padaria(
        int id,
        String nome,
        String dataAbertura,
        int idEnd,
        int numero,
        String cep,
        String rua,
        String bairro,
        String cidade
    ){
        this.id = id;
        this.nome = nome;
        this.dataAbertura = dataAbertura;
        this.endereco = new Endereco(
            id, 
            numero, 
            cep, 
            rua, 
            bairro, 
            cidade);
    }

    public void adicionarReceita(Receita receita){
        this.receitas.add(receita);
    }
    
}