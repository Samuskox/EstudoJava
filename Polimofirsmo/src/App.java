
public class App {
    public static void main(String[] args){
        
        Corredores corredor1 = new Corredores();
        Clickers estalador1 = new Clickers();
        Baiacu baiacu = new Baiacu();

        Humanos humano1 = new Humanos("Ellie", 19);

        humano1.matarInfectado(corredor1);

        Infectados[] horda = {corredor1,estalador1,baiacu};

        for(Infectados x : horda){
            x.matarHumanos();
        }
    }
}
