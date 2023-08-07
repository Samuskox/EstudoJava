package BeeCrowd;

import java.util.Scanner;

public class AreaTUDO {
    public static void main(String [] args){
        Scanner x = new Scanner(System.in);
        double a = x.nextDouble();
        double b = x.nextDouble();
        double c = x.nextDouble();

        double pi = 3.14159;

        double raiz = Math.sqrt(3);

        double TRIANGULO = (a*b)/2;
        double CIRCULO =  pi*(c*c);
        double TRAPEZIO =  ((a + b)*c)/2;
        double QUADRADO =  b*b;
        double RETANGULO = a*b;

        System.out.printf("TRIANGULO: %.3f\n", TRIANGULO);
        System.out.printf("CIRCULO: %.3f\n", CIRCULO);
        System.out.printf("TRAPEZIO: %.3f\n", TRAPEZIO);
        System.out.printf("QUADRADO: %.3f\n", QUADRADO);
        System.out.printf("RETANGULO: %.3f\n", RETANGULO);
    }
}
