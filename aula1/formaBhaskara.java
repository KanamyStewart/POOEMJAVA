public class formaBhaskara {
 
    public static void main(String[] args) {
 
        int a, b, c;
        double delta, x1, x2;
 
        a = 10;
        b = 25;
        c = 13;
 
        delta = (b * b) + (-4 * (a * c));
 
        System.out.println("Delta: " + delta);
 
        if (delta >= 0) {
 
            x1 = ((-(b) + Math.sqrt(delta)) / 2 * a);
            x2 = ((-(b) - Math.sqrt(delta)) / 2 * a);
 
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
 
        } else {
            System.out.println("Delta não possui raiz!");
            System.exit(0);
        }
    }
 
}