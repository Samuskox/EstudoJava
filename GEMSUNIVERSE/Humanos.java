package GEMSUNIVERSE;

public class Humanos extends Gems{
    String nome;

    Humanos(String nome, Integer idade){
        super(nome, nome, idade);
        this.nome = nome;
    }   

    public void Pique(Gems gem1, Gems gem2){
        System.out.println(this.nome+" está brincando de Pique Steven com a "+gem1.Pedra+" e com a "+gem2.Pedra);
    }
}
