package GEMSUNIVERSE;

public class Gems {
    String Pedra;
    String Color;
    Integer idade;
    int Hierarquia;

    void fusao(){
        System.out.println("Essa "+this.Pedra+" se fundiu com uma gem");
    }

    void poder(){
        System.out.println("Essa "+this.Pedra+" utilizou a arma dela");
    }

    Gems(String Pedra, String Color, Integer idade){
        this.Pedra = Pedra;
        this.Color = Color;
        this.idade = idade;
    }
}
