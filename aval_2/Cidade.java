public class Cidade {

    public static void main(String[] args) {

        Chef chefOne = new Chef("Vitor Yuri Rezende", "692.544.186-09", "24/07/1990", "Churrasqueiro");
        Chef chefTwo = new Chef("Jorge Igor Nicolas Lopes", "713.479.523-30", "04/06/1984", "Cozinheiro");
        Chef chefTree = new Chef("Marlene Teresinha Gomes", "578.685.928-26", "16/04/1944", "Confeiteira");
        
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
        padariaOne.setReceita(receitaSeven);

        System.out.println(chefOne.carteira());
        
    }
}