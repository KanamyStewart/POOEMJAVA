package model;

public class Jaula {
    private int id;
    private String descricao;

    protected Jaula (
        int id,
        String descricao
    ) {
        this.id = id;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Jaula [descricao=" + descricao + ", id=" + id + "]";
    }
}
