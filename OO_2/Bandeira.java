public class Bandeira {
    String corPrincipal;
    String descricaoElementos;
    Cidade cidade;
    
    public Bandeira(
        String corPrincipal,
        String descricaoElementos,
        Cidade cidade
    ){
        this.corPrincipal = corPrincipal;
        this.descricaoElementos = descricaoElementos;
        this.cidade = cidade;
    }
}