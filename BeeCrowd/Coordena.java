package BeeCrowd;

import java.util.Scanner;

public class Coordena {
    public static void main(String[]args){
        Scanner x = new Scanner(System.in);

        float a = x.nextFloat();
        float b = x.nextFloat();

        if(a == 0 && b ==0){
            System.out.println("Origem");
        } else if(a > 0 && b>0 ){
            System.out.println("Q1");
        }else if(a < 0 && b>0 ){
            System.out.println("Q2");
        }else if(a < 0 && b<0 ){
            System.out.println("Q3");
        }else if(a > 0 && b<0 ){
            System.out.println("Q4");
        }else if(a == 0 && b != 0 ){
            System.out.println("Eixo Y");
        }else if(a != 0 && b == 0 ){
            System.out.println("Eixo X");
        }
    }
}
