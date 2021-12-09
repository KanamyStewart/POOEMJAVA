package model;

import java.sql.Date;

public class Golfinho extends Animal {
    private Treinamento treinamento;
    private Jaula jaula;

    public Golfinho(
        int id, 
        String nome, 
        Date dataTreinamento, 
        String detalhes,
        String descricao) {
        super(id, nome);
        treinamento = new Treinamento(id, dataTreinamento, detalhes);
        jaula = new Jaula(id, descricao);
    }

    public Golfinho(
        int id,
        String nome,
        int treinamento,
        int jaulaId
    ) {
        super(id, nome);
    }
    
    public Treinamento getTreinamento() {
        return treinamento;
    }

    public void setTreinamento(Treinamento treinamento) {
        this.treinamento = treinamento;
    }

    public Jaula getJaula() {
        return jaula;
    }

    public void setJaula(Jaula jaula) {
        this.jaula = jaula;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Golfinho []";
    }
    
}
