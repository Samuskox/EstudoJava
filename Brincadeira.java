import javax.swing.JOptionPane;

public class Brincadeira {
    public static void main(String[]args){
        String nome = JOptionPane.showInputDialog("Você é um milionário, qual é o seu nome?");
        JOptionPane.showMessageDialog(null,"Aqui está top 5 coisas que não funcionam em um controle de Xbox.", nome, 2);
        JOptionPane.showMessageDialog(null, "1 - Submarino \n 2 - "+nome , "top 5 ", 1);
    }
}
