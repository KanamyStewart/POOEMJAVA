public class Estabelecimentos {
    private int idEstabelecimento;
    private String nome;
    private String dataAbertura;
    private Endereco endereco;

    public Estabelecimentos(
    int idEstabelecimento,
    String nome,
    String dataAbertura,
    int id,
    int numero,
    String cep,
    String rua,
    String bairro,
    String cidade

    ) {
        this.idEstabelecimento = idEstabelecimento;
        this.nome = nome;
        this.dataAbertura = dataAbertura;
        this.endereco = new Endereco(
            id,
            numero,
            cep,
            rua,
            bairro,
            cidade
        );

        endereco.setEndeco(this);

    }

    public void setIdEstabelecimento(int idEstabelecimento){
        this.idEstabelecimento = idEstabelecimento;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setDataAbertura(String dataAbertura){
        this.dataAbertura = dataAbertura;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    public int getIdEstabelecimento(){
        return this.idEstabelecimento;
    }

    public String getNome(){
        return this.nome;
    }
    
    public String getDataAbertura(){
        return this.dataAbertura;
    }

    public Endereco getEndereco(){
        return this.endereco;
    }
}
