package RoladaDado;

import java.util.Random;

public class RoladaDado {

    Random aleatorio = new Random();
    int number = 0;

    RoladaDado(){
        
        roll();
    }

    void roll(){
        number = aleatorio.nextInt(6)+1;
        System.out.println("O numero tirado foi: "+number);
    }
}
