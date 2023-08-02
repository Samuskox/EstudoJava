import java.util.Scanner;

public class Enquanto {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        String nome = "";

        System.out.println("TIPO ASSIM, Fala teu nome ai");
        nome = scanner.nextLine();

        while(nome.isBlank()){
            System.out.println("MANO TIPO ASSIM VOCÊ NÃO FALOU TEU NOME NÃO, TIPO ASSIM QUE BLUPILL");
            nome = scanner.nextLine();
        }

        System.out.println("que cringe, tipo assim seu nome é "+nome);

        scanner.close();
    }
}
