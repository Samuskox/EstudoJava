package Encapsulacao;

public class Estrada {
    public static void main(String [] args){
        Carro carro1 = new Carro("Chevrolet", "Camaro", 2021);
        //Carro carro2 = new Carro("Ford", "Mustang", 2023);

        //carro2.copy(carro1);
        //System.out.println();
        Carro carro2 = new Carro(carro1);
        //carro1.setMarca("SIm");
        System.out.println(carro1.toString());
        System.out.println(carro2.toString());
    }


}
