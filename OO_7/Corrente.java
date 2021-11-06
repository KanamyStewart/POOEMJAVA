public class Corrente extends Correntista {

    private String historico;

    protected Corrente(
        String nome, 
        String cpf, 
        String dataNascimento, 
        String dataInicio,
        String historico
        ) {
        super(nome, cpf, dataNascimento, dataInicio);
        this.historico = historico;
    }
    
    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public String getHistorico() {
        return this.historico;
    }
}
