import java.util.Objects;

public class Correntista extends Pessoa {
    private String dataInicio;
    
    protected Correntista(
        String nome, 
        String cpf, 
        String dataNascimento,
        String dataInicio) {
        super(nome, cpf, dataNascimento);
        this.dataInicio = dataInicio;
    }
    
    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataInicio() {
        return this.dataInicio;
    }
}
