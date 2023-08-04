package GEMSUNIVERSE;


public class Objetos {
    public static void main(String[] args){
        Gems perola = new Gems("Pérola", "Branco", 500);
        Gems Diamante = new Gems("Diamante", "Rosa", 100000);

       // perola.Color = "White";
        //perola.Pedra = "Pérola";

        perola.fusao();
        perola.poder();

        Diamante.fusao();
        Diamante.poder();
    }
}

