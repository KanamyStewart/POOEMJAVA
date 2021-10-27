public class Circulo extends Forma {
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    public void setRaio(double raio){
        this.raio = raio;
    }

    public double getRaio(){
        return this.raio;
    }

    public String getFigura(){
        return "Circulo";
    }

    public double getArea(){
        return this.raio * 4.80;
    }
}
