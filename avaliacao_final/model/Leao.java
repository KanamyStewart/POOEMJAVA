package model;

import java.sql.Date;

public class Leao extends Animal {
    private int id;
    private Date dataAlimentacao;
    private String detalhes;
    private String descricao;
    private String visitantes;
    Alimentacao alimentacao;
    Jaula jaula;

    protected Leao (
        int id,
        String nome,
        int alimentacao,
        int visitantes,
        int jaulaId
    ) {
        super(id, nome);
    }

    protected Leao (
        int id,
        String nome,
        int visitantes,
        Alimentacao alimentacao,
        Jaula jaula
    ) {
        super(id, nome);
        this.alimentacao = new Alimentacao(id, dataAlimentacao, detalhes);
        this.jaula = new Jaula(id, descricao);
    }

    @Override
    public String toString() {
        return "Leao [alimentacao=" + alimentacao + ", dataAlimentacao=" + dataAlimentacao + ", descricao=" + descricao
                + ", detalhes=" + detalhes + ", id=" + id + ", jaula=" + jaula + ", visitantes=" + visitantes + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVisitantes() {
        return visitantes;
    }

    public void setVisitantes(String visitantes) {
        this.visitantes = visitantes;
    }

    public Alimentacao getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(Alimentacao alimentacao) {
        this.alimentacao = alimentacao;
    }

    public Jaula getJaula() {
        return jaula;
    }

    public void setJaula(Jaula jaula) {
        this.jaula = jaula;
    }
    
}
