public class Quadrado extends Forma {
    private double[] lados = new double[2];

    public Quadrado(double base, double altura){
        this.lados[0] = base;
        this.lados[1] = altura;
    }

    public double[] getLados(){
        return this.lados;
    }

    public void setLados(double[] lados){
        this.lados[0] = lados[0];
        this.lados[1] = lados[1];
    }

    public String getFigura(){
        return "Quadrado";
    }

    public double getArea(){
        return this.lados[0] * this.lados[1];
    }
}
