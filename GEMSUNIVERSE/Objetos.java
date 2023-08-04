package GEMSUNIVERSE;


public class Objetos {
    public static void main(String[] args){
        Gems perola = new Gems("Pérola", "Branca", 500);
        Gems Diamante = new Gems("Diamante", "Rosa", 100000);
        Gems Ruby = new Gems("Ruby", "Vermelho", 2500);
        HomeWorld homeWorld = new HomeWorld();


       // perola.Color = "White";
        //perola.Pedra = "Pérola";

        homeWorld.Viajar(Ruby);
        homeWorld.Viajar(perola);

        //System.out.println(perola);

        perola.fusao();
        //perola.poder();

        Diamante.fusao();
        //Diamante.poder();
    }
}

