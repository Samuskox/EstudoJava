import java.util.Scanner;
public class input {
    public static void main(String[] args){

        String rosa = " Rosa";
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Qual é o seu nome?");
        String nome = Scanner.nextLine();
        System.out.println("Qual é o seu numero da sorte?");
        int numero = Scanner.nextInt();
        System.out.printf("Seja bem vindo "+nome+rosa+ ", o numero da sorte hoje será "+numero);

        Scanner.nextLine();
        System.out.println("\tQual seu jogo favorito?");
        String jogo = Scanner.nextLine();
        System.out.println("O jogo favorito do(a) "+nome+rosa+" é " +jogo+ "");
        
    }
}
