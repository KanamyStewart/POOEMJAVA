package model;

import java.sql.Date;
import java.util.ArrayList;

public class Treinamento {
    private int id;
    private Date dataTreinamento;
    private String detalhes;
    private ArrayList<Golfinho> golfinhos = new ArrayList<>();

    protected Treinamento (
        int id,
        Date dataTreinamento,
        String detalhes
    ) {
        this.id = id;
        this.dataTreinamento = dataTreinamento;
        this.detalhes = detalhes;
    }

    public ArrayList<Golfinho> getGolfinhos() {
        return golfinhos;
    }

    public void setGolfinhos(ArrayList<Golfinho> golfinhos) {
        this.golfinhos = golfinhos;
    }

    @Override
    public String toString() {
        return "Treinamento [dataTreinamento=" + dataTreinamento + ", detalhes=" + detalhes + ", golfinhos=" + golfinhos
                + ", id=" + id + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataTreinamento() {
        return dataTreinamento;
    }

    public void setDataTreinamento(Date dataTreinamento) {
        this.dataTreinamento = dataTreinamento;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    public void addGolfinho(Golfinho golfinho) {
        this.golfinhos.add(golfinho);
    }

}
