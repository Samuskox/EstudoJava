package BeeCrowd;

import java.util.Scanner;

public class Media2 {
    public static void main(String [] args){
        Scanner x = new Scanner(System.in);
        float a = x.nextFloat();
        float b = x.nextFloat();
        float c = x.nextFloat();
        float d = x.nextFloat();

        float media = ((a*2)+(b*3)+(c*4)+(d*1))/10;

        if(media >= 7.0){
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno aprovado.");
        } else if (media < 7 && media >= 5){
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno em exame.");
            float e = x.nextFloat();
            System.out.printf("Nota do exame: %.1f\n", e);
            float media2 = (media+e)/2;
            if(media2 >= 5){
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f\n", media2);
            } else {
                System.out.println("Aluno reprovado.");
                System.out.printf("Media final: %.1f\n", media2);
            }
        } else {
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno reprovado.");
        }

        
    }
}
