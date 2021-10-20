public class Cidade {
    public static void main(String[] args) {
        Chef chefUm = new Chef(1, "Joaquim Rocam", "123.456.489.10", "27/10/1948");
        Chef chefDois = new Chef(2, "Paola Carol cela", "987.235.265.32", "12/01/1988");
        Chef chefTres = new Chef(3, "Henrike Folgadaço", "123.888.541.21", "28/02/1970");

        Receita receitaUm = new Receita(1, 2, "Pãozinho frecu", "fazer e colocar no forno");
        Receita receitaDois = new Receita(2, 1, "Miojinho", "Joga na panela");
        Receita receitaTres = new Receita(3, 2, "Bolacha", "Abrir e comer");
        Receita receitaQuatro = new Receita(4, 2, "Hamburguer", "Joga na panela e deixa fritar");
        Receita receitaCinco = new Receita(5, 1, "Resquento de ontche", "Resquentar no microondas");
        Receita receitaSeis = new Receita(6, 1, "Feijão", "joga na panela com sal, linguiça e deixa cozinhar");
        Receita receitaSete = new Receita(7, 1, "Arroz", "joga na panela com sazon e deixa cozinhar");
        Receita receitaOito = new Receita(8, 1, "Macarrão", "Deixa cozinhar com molho de tomate e é só comer");
        Receita receitaNove = new Receita(9, 2, "Sardinha enlatada", "abre e da pro dog comer");

        Padaria padariaUm = new Padaria(1, "Padaria do macoin", "27/08/2002", 1, 1958, "89225-877", "Rua das amoras", "Garibaudi", "Dos sonhos");
        Padaria padariaDois = new Padaria(2, "Salgado sonho", "15/12/2020", 2, 258, "894555-211", "Rua Irnesto Gerivaldo ", "Perigoso", "Terra da bala");
        Padaria padariaTres = new Padaria(3, "Pão de barro", "21/02/1998", 3, 1454, "895221-333", "Rua macedo machado", "Catatumba", "Cidade dos mortos");

        chefUm.adicionarReceita(receitaUm);
        chefUm.adicionarReceita(receitaDois);
        chefUm.adicionarReceita(receitaTres);

        chefDois.adicionarReceita(receitaQuatro);
        chefDois.adicionarReceita(receitaCinco);
        chefDois.adicionarReceita(receitaSeis);

        chefTres.adicionarReceita(receitaSete);
        chefTres.adicionarReceita(receitaOito);
        chefTres.adicionarReceita(receitaNove);

        padariaUm.adicionarReceita(receitaCinco);
        padariaUm.adicionarReceita(receitaUm);
        padariaUm.adicionarReceita(receitaDois);
        padariaUm.adicionarReceita(receitaSete);
        padariaUm.adicionarReceita(receitaOito);

        padariaDois.adicionarReceita(receitaNove);
        padariaDois.adicionarReceita(receitaSete);
        padariaDois.adicionarReceita(receitaTres);
        padariaDois.adicionarReceita(receitaSeis);
        padariaDois.adicionarReceita(receitaOito);


        padariaTres.adicionarReceita(receitaUm);
        padariaTres.adicionarReceita(receitaNove);
        padariaTres.adicionarReceita(receitaSete);
        padariaTres.adicionarReceita(receitaCinco);
        padariaTres.adicionarReceita(receitaOito);

        System.out.println("\n Receitas da padaria 1: \n");
        for (Receita receita : padariaUm.receitas){
                System.out.println(receita.nome);
        }
        System.out.println("\n Receitas da padaria 2: \n");
        for (Receita receita : padariaDois.receitas) {
            System.out.println(receita.nome);
        }
        System.out.println("\n Receitas da padaria 3: \n");
        for (Receita receita : padariaTres.receitas) {
            System.out.println(receita.nome);
        }
        System.out.println("\n Receitas do Chef 1: \n");
        for (Receita receita : chefUm.receitas) {
            System.out.println(receita.nome);
        }
        System.out.println("\n Receitas do Chef 2: \n");
        for (Receita receita : chefDois.receitas) {
            System.out.println(receita.nome);
        }
        System.out.println("\n Receitas do Chef 3: \n");
        for (Receita receita : chefTres.receitas) {
            System.out.println(receita.nome);
        }

        System.out.println("\n Endereço da padaria 1: \n" 
        + padariaUm.endereco.rua + ", n° "
        + padariaUm.endereco.numero + ", Bairro "
        + padariaUm.endereco.bairro + ", Cidade "
        + padariaUm.endereco.cidade + ", CEP: "
        + padariaUm.endereco.cep);

        System.out.println("\n Endereço da padaria 2: \n" 
        + padariaDois.endereco.rua + ", n° "
        + padariaDois.endereco.numero + ", Bairro "
        + padariaDois.endereco.bairro + ", Cidade "
        + padariaDois.endereco.cidade + ", CEP: "
        + padariaDois.endereco.cep);

        System.out.println("\n Endereço da padaria 3: \n" 
        + padariaTres.endereco.rua + ", n° "
        + padariaTres.endereco.numero + ", Bairro "
        + padariaTres.endereco.bairro + ", Cidade "
        + padariaTres.endereco.cidade + ", CEP: "
        + padariaTres.endereco.cep);
    }
}
