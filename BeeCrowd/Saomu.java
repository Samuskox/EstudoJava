package BeeCrowd;

import java.util.Scanner;

public class Saomu {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a = x.nextInt();
        int b = x.nextInt();

        int i = 1;
        int Multiplo = a;
        boolean juninhoZedaMangaKRL = false;

        while(Multiplo < b){
            Multiplo = a * i;
            i++;
            if(Multiplo == b){
                juninhoZedaMangaKRL = true;
                break;
            }
            System.out.println("Multiplo: "+ Multiplo);
        }

        if(juninhoZedaMangaKRL == true ){
            System.out.println("Sao Multiplos");
        }else {
            System.out.println("Nao sao Multiplos");
        }





      
    }
}
