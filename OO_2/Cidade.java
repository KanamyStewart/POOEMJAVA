import java.util.ArrayList;

public class Cidade {
    String nome;
    String regiao;
    String vegetacaoPredominante;
    Double metroQuadrado;
    Bandeira bandeira;
    ArrayList<Pessoa> pessoas = new ArrayList<>();

    public Cidade(
        String nome,
        String regiao,
        String vegetacaoPredominante,
        String corPrincipal,
        String descricaoElementos,
        Double metroQuadrado
    ){
        this.nome = nome;
        this.regiao = regiao;
        this.vegetacaoPredominante = vegetacaoPredominante;
        this.metroQuadrado = metroQuadrado;
        this.bandeira = new Bandeira(
            corPrincipal,
            descricaoElementos,
            this
        );
    }

    public void adicionarPessoa(Pessoa pessoa) {
        this.pessoas.add(pessoa);
    }

    public void adicionarPessoa(
        String nome,
        String cpf,
        String data
    ) {
        this.adicionarPessoa(new Pessoa(nome, cpf, data));
    }
}
