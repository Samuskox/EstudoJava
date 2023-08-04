
import java.util.Random;

import javax.swing.JOptionPane;

public class Brincadeira2 {
    public static void main(String[] args){
        Random random = new Random();
        

        String name = JOptionPane.showInputDialog("Digite seu nome");
        JOptionPane.showMessageDialog(null,"Olá"+name);
        int codigo = 0;
        do{
            if(codigo == -1){
                JOptionPane.showMessageDialog(null,"Digite novamente o sabor de pizza");
            }
        String sabor = JOptionPane.showInputDialog(null, "\n Digite o sabor de pizza que você queira:\n 1 - Mussarela\n 2 - Calabresa\n 3 - Peperonni\n 4 - Atum");
        //sabor = sabor.toLowerCase();
        System.out.println(sabor);

        
        if(sabor.toLowerCase().equals("mussarela")){
            codigo = 1;
        } else if(sabor.toLowerCase().equals("calabresa")){
            codigo = 2;
        } else if(sabor.toLowerCase().equals("peperonni")){
            codigo = 3;
        } else if(sabor.toLowerCase().equals("atum")){
            codigo = 4;
        } else {
            codigo = -1;
        } 
        }while(codigo == -1);

        int probabilidade = random.nextInt(3)+1;

        
        switch(probabilidade){
            case 1:
                JOptionPane.showMessageDialog(null, "Você "+name+" deixou a pizza cair ", "Perdeu Playboy", 3);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Você "+name+" se depara com um alien perto da sua pizza ", "Sinais do Outro Lado", 4);
            break;
            case 3:
                JOptionPane.showMessageDialog(null, "Você "+name+" entrou em uma jornada para resgatar sua pizza perdida ", "StolenLike-Possess", 2);
            break;
            default:
                JOptionPane.showMessageDialog(null, "aconteceu", "Ridin' around town", 4);
                }
    }
}
