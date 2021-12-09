package model;

import java.sql.Date;
import java.util.ArrayList;

public class Alimentacao {
    private int id;
    private Date dataAlimentacao;
    private String detalhes;
    private ArrayList<Leao> leaos = new ArrayList<>();
    
    protected Alimentacao (
        int id,
        Date dataAlimentacao,
        String detalhes
        ){
            this.id = id;
            this.dataAlimentacao = dataAlimentacao;
            this.detalhes = detalhes;
        }

    public ArrayList<Leao> getLeaos() {
        return leaos;
    }

    public void setLeaos(ArrayList<Leao> leaos) {
        this.leaos = leaos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataAlimentacao() {
        return dataAlimentacao;
    }

    public void setDataAlimentacao(Date dataAlimentacao) {
        this.dataAlimentacao = dataAlimentacao;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    @Override
    public String toString() {
        return "Alimentacao []";
    }
}