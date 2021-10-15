public class AtributosCidade {
    String nome;
    String regiao;
    String vegetacaoPredominante;
    Double metroQuadrado;
    Bandeira bandeira;

    public AtributosCidade(
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
}
