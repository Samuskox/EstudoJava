package BeeCrowd;

import java.util.Scanner;

public class Sfera {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);

        double raio = x.nextDouble();
        double pi = 3.14159;
        double volume = (4.0/3)*pi*(raio*raio*raio);

        System.out.printf("VOLUME = %.3f\n", volume);
    }
}
