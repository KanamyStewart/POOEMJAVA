public class Aves {
    protected String bico;
    protected String penas;


    protected Aves (String bico, String penas){
        this.bico = bico;
        this.penas = penas;
    }

    protected void setBico(String bico){
        this.bico = bico;
    }

    protected void setPenas(String penas){
        this.penas = penas;
    }

    protected String getBico(){
        return this.bico;
    }

    protected String getPenas(){
        return this.penas;
    }
}