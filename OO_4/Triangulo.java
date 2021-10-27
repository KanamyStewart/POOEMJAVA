public class Triangulo extends Forma {
    private double[] lados = new double[3];
    
    public Triangulo(double ladoA, double ladoB, double ladoC){
        this.lados[0] = ladoA;
        this.lados[1] = ladoB;
        this.lados[2] = ladoC;
    }

    public double[] getLados(){
        return this.lados;
    }

    public void setLados(double[] lados){
        this.lados[0] = lados[0];
        this.lados[1] = lados[1];
        this.lados[2] = lados[2];
    }

    public String getFigura(){
        return "Triângulo";
    }

    public double getArea(){
        return this.lados[0] * this.lados[1] * this.lados[2];
    }
}