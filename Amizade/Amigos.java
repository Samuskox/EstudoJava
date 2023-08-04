package Amizade;

public class Amigos {
    String nome;
    static int numeroDeAmigos;

    Amigos(String nome){
        this.nome = nome;
        numeroDeAmigos++;
    }

    static void QuantidadeDeAmgs(){
        System.out.println("Voçê tem "+numeroDeAmigos+" amiguinhis");
    }
}
