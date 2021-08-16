public class converterParaInt {
    public static int strParaInt(String valor1, int valor2) 
    {
       try {
           return Integer.valueOf(valor1); 
       } 
       catch (NumberFormatException e) {  
           return valor2;
       }
    }

    public static void main (String[] args) throws java.lang.Exception
{
    int valor1 = strParaInt("50.5", 58);
    int valor2 = strParaInt("99aaaa87.3", 60);

    System.out.println(valor1); 
    System.out.println(valor2); 
}
}
