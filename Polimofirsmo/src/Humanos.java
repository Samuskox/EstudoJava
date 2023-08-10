public class Humanos {
    String nome;
    int idade;
    String facção;
    Humanos(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void matarInfectado( Infectados zumbi){
        System.out.println(this.nome+" está matando um "+zumbi.tipo);
    }
}
