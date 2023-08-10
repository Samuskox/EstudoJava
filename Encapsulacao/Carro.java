package Encapsulacao;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setAno(ano);
    }

    public Carro(Carro carro){
        this.copy(carro);
    }

    public String toString(){
        String stringue = marca+" "+modelo+" "+ano;
        return stringue;
    }

    public String getmarca(){
        return marca;
    }
    public String getmodelo(){
        return modelo;
    }
    public int getano(){
        return ano;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setAno(int Ano){
        this.ano = Ano;
    }

    public void copy(Carro x){
        this.setModelo(x.getmodelo());
        this.setMarca(x.getmarca());
        this.setAno(x.getano());
    }
}
