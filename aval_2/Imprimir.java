import java.util.ArrayList;

public abstract class Imprimir {
    public void printList(ArrayList<?> objects) {
        for (Object object:  objects) {
            System.out.println(object + " ");
        }
        System.out.println();
    }
}
