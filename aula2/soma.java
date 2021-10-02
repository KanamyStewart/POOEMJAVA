public class soma {
    public static void main(String[] args) {
        System.out.println("Soma de todos os números ímpares múltiplos de 7 entre 1 e 500:");
        for(int n=1; n<=500; n++){
            if(n%2 == 1){
                if (n%7 == 0)
                    System.out.println(n + " Número ímpar e múltiplo de 7");
            }
        }
    }
}