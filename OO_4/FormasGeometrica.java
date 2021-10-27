public class FormasGeometrica {
    public static void main(String[] args) {
    Forma a, b, c;
    a = new Quadrado(2, 3);
    b = new Triangulo(4, 5, 6);
    c = new Circulo(10);
    System.out.println("Figura em 'a':  " + a.getFigura());
    System.out.println("Figura em 'b':  " + b.getFigura());
    System.out.println("Figura em 'c':  " + c.getFigura());
  }
}
