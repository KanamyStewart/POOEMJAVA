public class Estabelecimentos extends Endereco {
    private int idEstabelecimento;
    private String nome;
    private String dataAbertura;

    public Estabelecimentos(
    int id, 
    int numero, 
    String cep, 
    String rua, 
    String bairro, 
    String cidade,
    int idEstabelecimento,
    String nome,
    String dataAbertura
    ) {
        super(id, numero, cep, rua, bairro, cidade);
        this.idEstabelecimento = idEstabelecimento;
        this.nome = nome;
        this.dataAbertura = dataAbertura;
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


    public int getIdEstabelecimento(){
        return this.idEstabelecimento;
    }

    public String getNome(){
        return this.nome;
    }
    
    public String getDataAbertura(){
        return this.dataAbertura;
    }
}
