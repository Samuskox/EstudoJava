package ArrayObjetos;
public class ArrayObjetos {
    public static void main(String[] args){
        //int[] number = new int[3];
        //char[] characters = new char[4];
        //String[] strings = new String[5];

        //Comida[] geladeira = new Comida[3];

        Comida comida1 = new Comida("Lasanha");
        Comida comida2 = new Comida("Bolinho de arroz");
        Comida comida3 = new Comida("maçã");

        Comida[] geladeira = {comida1, comida2, comida3};

        //geladeira[0] = comida1;
        //geladeira[1] = comida2;
       // geladeira[2] = comida3;

        System.out.println(geladeira[0].nome);
        System.out.println(geladeira[1].nome);
        System.out.println(geladeira[2].nome);
        
    }
}
