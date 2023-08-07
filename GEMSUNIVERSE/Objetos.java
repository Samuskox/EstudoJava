package GEMSUNIVERSE;


public class Objetos {
    public static void main(String[] args){
        Gems perola = new Gems("Pérola", "Branca", 500);
        Gems Diamante = new Gems("Diamante", "Rosa", 100000);
        Gems Ruby = new Gems("Ruby", "Vermelho", 2500);
        Gems Safira = new Gems("Safira", "Azul", 3000);

        Humanos humano1 = new Humanos("Steven", 14);

        humano1.Pique(Safira, Ruby);


        HomeWorld homeWorld = new HomeWorld();
        System.out.println(perola.toString());

       // perola.Color = "White";
        //perola.Pedra = "Pérola";

        homeWorld.Viajar(Ruby);
        homeWorld.Viajar(perola);

        //System.out.println(perola);

        perola.fusao(Diamante);
        //perola.poder();

        Diamante.fusao(Ruby);
        //Diamante.poder();

        Ruby.fusao(Safira);
    }
}

