import java.util.Random;

public class NumAleatorios {
    public static void main(String[] args){
        Random random = new Random();

        //int x = random.nextInt(7);
        double y = random.nextDouble(5);
        boolean z = random.nextBoolean();
        System.out.println(z);
    }
}
