import java.util.Random;

public class IF {
    public static void main(String[] args){
        Random random = new Random();
        int idade = random.nextInt(70)+1;

        System.out.println("Você tem "+idade);

        if(idade >= 18){
            System.out.println("Você já pode ser preso, se deixar o sabonete cair já sabe...");
        } else if (idade <= 10){
            System.out.println("ALGUEM CHAMA OS PAIS DESSA CRIANÇA");
        } else
        {
            System.out.println("vai pra feben pititico");
        }
    }
}
