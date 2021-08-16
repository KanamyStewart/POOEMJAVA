public class calculoSalario {
    public static void main(String[] args) {
        
        double salario1 = 2250.0;
        double salario2 = 3320.2;
        double salario3 = 4330.3;
        double salario4 = 1256.9;
        double salario5 = 15000.0;
     
        double impostoDeRendaTirado =0.0;
        double salarioLiquido =0.0;
     
        if (salario1>=1903.99 &&  salario1<=2826.65) {
     
          impostoDeRendaTirado = 0.705;
          salarioLiquido = (salario1 * impostoDeRendaTirado);
          System.out.println("O salário 1 irá pagar 7,5% de imposto, ficando no valor liquido de R$" + salarioLiquido);   
        }
        if (salario2 >=2826.66 && salario2 <=3751.05) {
            impostoDeRendaTirado = 0.150;
            salarioLiquido = (salario2 * impostoDeRendaTirado);
            System.out.println("O salário 2 irá pagar 15% de imposto, ficando no valor liquido de R$" + salarioLiquido);   
        }
        if (salario3 >=3751.06 && salario3 <=4664.68) {
            impostoDeRendaTirado = 0.225 ;
            salarioLiquido = (salario3 * impostoDeRendaTirado);
            System.out.println("O salário 3 irá pagar 22,5% de imposto, ficando no valor liquido de R$" + salarioLiquido);  
        }
        if (salario5>4664.68) {
            impostoDeRendaTirado = 0.275;
            salarioLiquido = (salario5 * impostoDeRendaTirado);
            System.out.println("O salário 5 irá pagar 27,5% de imposto, ficando no valor liquido de R$" + salarioLiquido);
        }
        if (salario4<1900.0) {
            impostoDeRendaTirado =1;
            System.out.println("O salário líquido 4 é isento do imposto de renda, recebendo, o salario total"
                    + "no valor de R$" + salario4 + "!");
     
        }else {
         System.out.println("Impossivel calcualar IR!");
     
      }
    }
}
