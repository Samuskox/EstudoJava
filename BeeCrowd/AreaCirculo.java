package BeeCrowd;

import java.util.Scanner;
//import java.text.DecimalFormat;


public class AreaCirculo{
    static Double Calculo(Double raio){
        Double pi = Math.PI;
        Double Circle = pi * (raio * raio);
        return Circle;
}
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        //DecimalFormat formato = new DecimalFormat();

        Double raio = x.nextDouble();

        Double Circulo = Calculo(raio);

        System.out.printf("A=%.4f\n", Circulo);
        x.close();
    }
}

