package GEMSUNIVERSE;

public class Gems {
    String Pedra;
    String Color;
    Integer idade;

    void fusao(Gems pedra2){
        if((this.Pedra == "Ruby") && (pedra2.Pedra == "Safira")){
            System.out.println("Essa "+this.Pedra+" se fundiu com a "+pedra2.Pedra+" e formou a Garnet");
        } else {
            System.out.println("Essa "+this.Pedra+" se fundiu com a "+pedra2.Pedra);
        }
        
    }

    void poder(){
        System.out.println("Essa "+this.Pedra+" utilizou a arma dela");
    }

    Gems(String Pedra, String Color, Integer idade){
        this.Pedra = Pedra;
        this.Color = Color;
        this.idade = idade;
    }

    public String toString(){
        String myString = Pedra+"\n"+Color+"\n"+idade;
        return myString;
    }
}
