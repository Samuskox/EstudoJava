package BeeCrowd;

import java.util.Scanner;

public class AAAAAAA {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
            int a = x.nextInt();
        int segundosTotal = a;

        int segundos = 0;
        int horas = 0;
        int minutos = 0;

            for(int i=0;i<a;i++){
                if(segundos == 60){
                    minutos++;
                    segundos = 0;
                }

                if(minutos == 60){
                    horas++;
                    minutos = 0;
                }

                segundos++;
            }

            System.out.println(horas+":"+minutos+":"+segundos);
    }
}
