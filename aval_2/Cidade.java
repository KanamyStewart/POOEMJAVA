import java.util.Scanner;


public class Cidade {

    public static void main(String[] args) {
        
        /*Chef chefOne = new Chef("Vitor Yuri Rezende", "692.544.186-09", "24/07/1990", "Churrasqueiro", 10874.54);
        Chef chefTwo = new Chef("Jorge Igor Nicolas Lopes", "713.479.523-30", "04/06/1984", "Cozinheiro", 9231.12);
        Chef chefTree = new Chef("Marlene Teresinha Gomes", "578.685.928-26", "16/04/1944", "Confeiteira", 3521.00);
        
        Cliente clientOne = new Cliente("Stella Fernanda Débora Rocha", "169.634.454-94", "23/06/1979", "(43) 98448-8136");
        Cliente clientTwo = new Cliente("Renan Pedro Henrique Lopes", "210.762.348-10", "11/08/1961", "(85) 98117-7170");
        Cliente clientTree = new Cliente("Miguel Victor Carvalho", "549.165.172-96", "05/04/1968", "(47) 99667-2829");
        
        Receita receitaOne = new Receita(1, "Pão de alho", "1", 27.87, chefOne);
        Receita receitaTwo = new Receita(2, "Maminha na mostarda", "2", 87.65, chefOne);
        Receita receitaTree = new Receita(3, "Cupim na brasa", "5", 54.87, chefOne);
        Receita receitaFor = new Receita(4, "Picanha no alho", "1", 210.63, chefOne);
        Receita receitaFive = new Receita(5, "Macarrão ao molho branco", "8", 54.14, chefTwo);
        Receita receitaSix = new Receita(6, "Arroz com Feijão", "4", 14.98, chefTwo);
        Receita receitaSeven = new Receita(7, "Ovinho frito", "3", 99.54, chefTwo);
        Receita receitaEight = new Receita(8, "Bolo de morango", "14", 120.54, chefTree);
        Receita receitaNine = new Receita(9, "Torta de Jujuba", "5", 135.14, chefTree);
        Receita receitaTen = new Receita(10, "Trota de limão", "10", 27.87, chefTree);
        
        Mercado mercadoOne = new Mercado(1, "Promoção de frutas e verduras", "Mercado do zé", "28/10/2020", 1, 993, "96226558", "Rua Bejamin Franklyn", "Cruzeiro", "Nova York");
        mercadoOne.setReceita(receitaOne);
        mercadoOne.setReceita(receitaFor);
        mercadoOne.setReceita(receitaTen);
        mercadoOne.setReceita(receitaFive);
        mercadoOne.setReceita(receitaNine);
        
        Padaria padariaOne = new Padaria(1, "Das 06:00 às 21:00","Padaria doce mel", "14/10/2021", 1, 993, "96226558", "Rua Bejamin Franklyn", "Cruzeiro", "Nova York");
        padariaOne.setReceita(receitaTwo);
        padariaOne.setReceita(receitaTree);
        padariaOne.setReceita(receitaSix);
        padariaOne.setReceita(receitaEight);
        padariaOne.setReceita(receitaSeven); */
        
        Scanner scanner = new Scanner(System.in);
        int menu = 0;
        do {
            System.out.println("Digite a opção desejada: ");
            System.out.println("1. SELECT CHEF");
            System.out.println("2. INSERT CHEF");
            System.out.println("3. UPDATE CHEF");
            System.out.println("4. DELETE CHEF");
            System.out.println("5. SELECT CLIENTE");
            System.out.println("6. INSERT CLIENTE");
            System.out.println("7. UPDATE CLIENTE");
            System.out.println("8. DELETE CLIENTE");
            try{
                menu = scanner.nextInt();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            switch (menu) {
                case 1:
                    try {
                        Chef.printChef(
                            Chef.getChefs()
                        );
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        Chef.insertChef(
                            Chef.getChefInsert(scanner)
                        );
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        Chef.updateChef(
                            Chef.getChefUpdate(scanner)
                        );
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        Chef.deleteChef(
                            Chef.getChef(scanner)
                        );
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    try {
                        Cliente.printCliente(
                            Cliente.getClientes()
                        );
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6:
                    try {
                        Cliente.insertCliente(
                            Cliente.getClienteInsert(scanner)
                        );
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 7:
                    try {
                        Cliente.updateCliente(
                            Cliente.getClienteUpdate(scanner)
                        );
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 8:
                    try {
                        Cliente.deleteCliente(
                            Cliente.getCliente(scanner)
                        );
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Operação inválida.");
                    break;
            }
        } while (menu != 0);
        scanner.close();

    }
}